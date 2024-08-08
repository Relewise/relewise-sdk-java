using Generator.Extensions;
using Newtonsoft.Json;
using System.CodeDom.Compiler;
using System.Globalization;
using System.Reflection;

namespace Generator.JavaMemberWriters;

public class JavaCreatorMethodWriter
{
    private readonly JavaWriter javaWriter;

    private HashSet<string> WrittenCreator = new HashSet<string>();

    public JavaCreatorMethodWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type type, string typeName, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformations)
    {
        if (type.IsAbstract || type.IsInterface) return;

        WrittenCreator.Clear();

        var allConstructors = type // We only want to generate constructors that aren't obsoleted.
            .GetConstructors()
            .Where(c => !Attribute.IsDefined(c, typeof(ObsoleteAttribute)))
            .ToArray();

        var coveringUniqueTypeMappableConstructorParameters = allConstructors
            .FirstOrDefault(c => c.GetParameters().Length == c.GetParameters().DistinctBy(parameter => parameter.ParameterType).Count() // There are no parameters with the same type.
                                 && c.GetParameters().Length == propertyInformations.Length // There are as many parameters as there are properties.
                                 && c.GetParameters()
                                     .All(parameter => propertyInformations
                                         .Any(property => ParameterIsPersuadableIntoPropertyType(property.info, parameter))
                                     ) // There is a property type that matches each parameter type.
            );

        var coveringTypeAndNameMappableConstructorParameters = allConstructors
            .Where(c => c.GetParameters()
                    .All(parameter => propertyInformations
                        .Count(property =>
                            ContainedWithinEitherOne(property.propertyName, parameter.Name)
                            && ParameterIsPersuadableIntoPropertyType(property.info, parameter)) == 1
                    ) // There is exactly 1 property type that matches each parameter type and name
            )
            .MaxBy(c => c.GetParameters().Length); // We take the largest constructor to be more deterministic.

        var allConstructorParametersIntersectionWithMappableNamesAndTypes = type
            .GetConstructors()
            .Where(c => c.GetParameters().Length > 0)
            .MinBy(c => c.GetParameters().Length);

        if (coveringUniqueTypeMappableConstructorParameters != null)
        {
            string[] defaultParameters = coveringUniqueTypeMappableConstructorParameters.GetParameters().Where(parameter => parameter.HasDefaultValue).Select(parameter => parameter.Name).ToArray()!;

            WriteConstructor(writer, type, typeName, propertyInformations, coveringUniqueTypeMappableConstructorParameters, Array.Empty<string>(), ignoreNameEquivalence: true);
            if (defaultParameters.Any())
            {
                WriteConstructor(writer, type, typeName, propertyInformations, coveringUniqueTypeMappableConstructorParameters, defaultParameters);
            }
        }
        else if (coveringTypeAndNameMappableConstructorParameters != null)
        {
            string[] defaultParameters = coveringTypeAndNameMappableConstructorParameters.GetParameters().Where(parameter => parameter.HasDefaultValue).Select(parameter => parameter.Name).ToArray()!;

            WriteConstructor(writer, type, typeName, propertyInformations, coveringTypeAndNameMappableConstructorParameters, Array.Empty<string>(), ignoreNameEquivalence: true);
            if (defaultParameters.Any())
            {
                WriteConstructor(writer, type, typeName, propertyInformations, coveringTypeAndNameMappableConstructorParameters, defaultParameters);
            }
        }
        else if (allConstructorParametersIntersectionWithMappableNamesAndTypes != null)
        {
            string[] defaultParameters = allConstructorParametersIntersectionWithMappableNamesAndTypes.GetParameters().Where(parameter => parameter.HasDefaultValue).Select(parameter => parameter.Name).ToArray()!;

            WriteConstructor(writer, type, typeName, propertyInformations, allConstructorParametersIntersectionWithMappableNamesAndTypes, Array.Empty<string>(), ignoreNameEquivalence: true);
            if (defaultParameters.Any())
            {
                WriteConstructor(writer, type, typeName, propertyInformations, allConstructorParametersIntersectionWithMappableNamesAndTypes, defaultParameters);
            }
        }
        else
        {
            writer.WriteLine($"public static {typeName} create()");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"return new {typeName}();");
            writer.Indent--;
            writer.WriteLine("}");
        }

        var allDefaultParameters = type.GetProperties().Where(property =>
                (property.GetIndexParameters().Length is 0
                 && property.GetMethod is { IsAbstract: false }
                 && property.SetMethod is { IsAbstract: false }
                 && !Attribute.IsDefined(property, typeof(JsonIgnoreAttribute))
                 && property.GetAccessors(false).All(ax => !ax.IsAbstract && ax.IsPublic))
                && type.GetConstructors().SelectMany(c => c.GetParameters())
                    .Any(p => p.Name == property.Name.ToCamelCase() && (p.ParameterType == property.PropertyType || EqualCollectionElementType(p.ParameterType, property.PropertyType)) && p.HasDefaultValue)
            ).Select(property => type.GetConstructors().SelectMany(c => c.GetParameters())
                .First(p => p.Name == property.Name.ToCamelCase() && p.HasDefaultValue))
            .ToArray();

        if (!WrittenCreator.Contains(""))
        {
            writer.WriteLine($"public {typeName}()");
            writer.WriteLine("{");
            writer.Indent++;
            WriteCreatorMethodBody(writer, "this", type, Array.Empty<ParameterInfo>(), allDefaultParameters);
            writer.Indent--;
            writer.WriteLine("}");
        }
    }

    private void WriteConstructor(IndentedTextWriter writer, Type returnType, string typeName, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformations, ConstructorInfo constructorInfo, string[] includedNullableParameters, bool ignoreNameEquivalence = false)
    {
        var parameters = constructorInfo.GetParameters()
            .Where(parameter => returnType.GetProperties()
                .Any(property => 
                    (property.GetIndexParameters().Length is 0
                           && property.GetMethod is { IsAbstract: false }
                           && property.SetMethod is { IsAbstract: false }
                           && !Attribute.IsDefined(property, typeof(JsonIgnoreAttribute))
                           && property.GetAccessors(false).All(ax => !ax.IsAbstract && ax.IsPublic))
                    && (ContainedWithinEitherOne(property.Name, parameter.Name) || ignoreNameEquivalence)
                    && (ParameterIsPersuadableIntoPropertyType(property, parameter) || EqualCollectionElementType(property.PropertyType, parameter.ParameterType)))
                && (!parameter.HasDefaultValue || includedNullableParameters.Contains(parameter.Name))).ToArray();

        var nonIncludedDefaultParameters = constructorInfo.GetParameters().Where(parameter => parameter.HasDefaultValue && !includedNullableParameters.Contains(parameter.Name)).ToArray();

        var signature = string.Join(',', parameters.Select(p => javaWriter.TypeName(p.ParameterType)));
        if (WrittenCreator.Contains(signature))
        {
            return;
        }
        WrittenCreator.Add(signature);

        writer.WriteLine($"public static {typeName} create({ParameterList(parameters)})");
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine($"return new {typeName}({string.Join(", ", parameters.Select(p => p.Name))});");
        writer.Indent--;
        writer.WriteLine("}");

        writer.WriteLine($"public {typeName}({ParameterList(parameters)})");
        writer.WriteLine("{");
        writer.Indent++;
        WriteCreatorMethodBody(writer, "this", returnType, parameters, nonIncludedDefaultParameters);
        writer.Indent--;
        writer.WriteLine("}");
    }

    private void WriteCreatorMethodBody(IndentedTextWriter writer, string variable, Type returnType, ParameterInfo[] parameters, ParameterInfo[] nonIncludedDefaultParameters)
    {
        foreach (var parameter in parameters)
        {
            string? propertyName;
            var property = returnType.GetProperties().FirstOrDefault(property => property.Name.ToCamelCase() == parameter.Name);
            propertyName = property?.Name.ToCamelCase();
            if (propertyName is null)
            {
                property = returnType.GetProperties().FirstOrDefault(property => property.PropertyType == parameter.ParameterType || EqualCollectionElementType(property.PropertyType, parameter.ParameterType));
                propertyName = property?.Name.ToCamelCase();
            }
            if (propertyName is not null)
            {
                if (property!.PropertyType.IsGenericType && property!.PropertyType.GetGenericTypeDefinition() == typeof(List<>) && (parameter.ParameterType.IsArray
                    || (parameter == parameters.Last() && javaWriter.BetterTypedParameterTypeName(parameter.ParameterType, new NullabilityInfoContext().Create(parameter)).Contains("..."))))
                {
                    writer.WriteLine($"{variable}.{propertyName} = new ArrayList<>(Arrays.asList({parameter.Name}));");
                }
                else if (property!.PropertyType.IsArray && parameter.ParameterType.IsGenericType && parameter.ParameterType.GetGenericTypeDefinition() == typeof(List<>))
                {
                    writer.WriteLine($"{variable}.{propertyName} = {parameter.Name}.asArray();");
                }
                else
                {
                    writer.WriteLine($"{variable}.{propertyName} = {parameter.Name};");
                }
            }
        }
        foreach (var parameter in nonIncludedDefaultParameters)
        {
            string? propertyName;
            var property = returnType.GetProperties().FirstOrDefault(property => property.Name.ToCamelCase() == parameter.Name);
            propertyName = property?.Name.ToCamelCase();
            if (propertyName is null)
            {
                property = returnType.GetProperties().FirstOrDefault(property => property.PropertyType == parameter.ParameterType || EqualCollectionElementType(property.PropertyType, parameter.ParameterType));
                propertyName = property?.Name.ToCamelCase();
            }
            if (propertyName is not null)
            {
                writer.WriteLine($"{variable}.{propertyName}{DefaultValueSetter(parameter)};");
            }
        }
    }

    private string DefaultValueSetter(ParameterInfo parameter)
    {
        return parameter.HasDefaultValue && parameter.DefaultValue is null ? " = null" : parameter.DefaultValue is { } defaultValue && (defaultValue.GetType().IsValueType || defaultValue is string) ? $" = {LiteralValueExpression(defaultValue)}" : "";
    }

    private string LiteralValueExpression(object obj)
    {
        return obj switch
        {
            int number => $"{number}",
            double number => $"{number.ToString(CultureInfo.InvariantCulture)}d",
            float number => $"{number.ToString(CultureInfo.InvariantCulture)}f",
            string stringLiteral => $"\"{stringLiteral}\"",
            _ when obj.GetType().IsEnum => $"{javaWriter.TypeName(obj.GetType())}.{obj}",
            _ => System.Text.Json.JsonSerializer.Serialize(obj)
        };
    }

    private string ParameterList(ParameterInfo[] parameters)
    {
        return string.Join(", ",
            parameters.Select(parameter =>
                $"{(parameters[^1] == parameter ? javaWriter.BetterTypedParameterTypeName(parameter.ParameterType, new NullabilityInfoContext().Create(parameter)) : javaWriter.TypeName(parameter))} {parameter.Name}"
            )
        );
    }

    private static bool EqualCollectionElementType(Type type1, Type type2)
    {
        return ListTypeArgumentMatchesArrayElementType(type1, type2)
            || ListTypeArgumentMatchesArrayElementType(type2, type1);
    }

    private static bool ListTypeArgumentMatchesArrayElementType(Type type1, Type type2)
    {
        return type1.IsGenericType
               && type1.GetGenericTypeDefinition() == typeof(List<>)
               && type2.IsArray
               && type1.GenericTypeArguments[0] == type2.GetElementType();
    }

    private static bool ParameterIsPersuadableIntoPropertyType(PropertyInfo property, ParameterInfo parameter)
    {
        if (EqualCollectionElementType(property.PropertyType, parameter.ParameterType))
        {
            return true;
        }

        Type propertyType = property.PropertyType.IsConstructedGenericType && property.PropertyType.GetGenericTypeDefinition() == typeof(Nullable<>) ? property.PropertyType.GetGenericArguments()[0] : property.PropertyType;
        Type parameterType = parameter.ParameterType.IsConstructedGenericType && parameter.ParameterType.GetGenericTypeDefinition() == typeof(Nullable<>) ? parameter.ParameterType.GetGenericArguments()[0] : parameter.ParameterType;

        var propertyNullabilityContext = new NullabilityInfoContext().Create(property);
        var parameterNullabilityContext = new NullabilityInfoContext().Create(parameter);

        bool propertyIsNullable = property.PropertyType != propertyType || propertyNullabilityContext.WriteState is NullabilityState.Nullable;
        bool parameterIsNullable = parameter.ParameterType != parameterType || parameterNullabilityContext.WriteState is NullabilityState.Nullable;

        if (propertyType != parameterType)
        {
            return false;
        }

        if (propertyIsNullable)
        {
            return true;
        }

        if (!propertyIsNullable && !parameterIsNullable)
        {
            return true;
        }

        return false;
    }

    private static bool ContainedWithinEitherOne(string? first, string? second)
    {
        if (first is null || second is null)
        {
            return false;
        }

        return first.Contains(second, StringComparison.OrdinalIgnoreCase)
               || second.Contains(first, StringComparison.OrdinalIgnoreCase);
    }
}