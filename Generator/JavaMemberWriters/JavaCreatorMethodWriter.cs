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

        var coveringTypeMappableConstructor = type
            .GetConstructors() // All 
            .FirstOrDefault(c => c.GetParameters().Count() == c.GetParameters().DistinctBy(parameter => parameter.ParameterType).Count() // There are no parameters with the same type.
                              && c.GetParameters().Count() == propertyInformations.Length // There are as many parameters as there are properties.
                              && c.GetParameters()
                                    .All(parameter => propertyInformations
                                        .Any(property =>
                                            (property.info.PropertyType == parameter.ParameterType
                                             && new NullabilityInfoContext().Create(property.info).WriteState is NullabilityState.Nullable
                                             == new NullabilityInfoContext().Create(parameter).WriteState is NullabilityState.Nullable) // If the type matches then the nullability annotation also has to.
                                            || EqualCollectionElementType(property.info.PropertyType, parameter.ParameterType) // if they only match on their collection element type then we are more relaxed as method params can be empty.
                                        )
                                    ) // There is a property type that matches each parameter type.
            );

        var allConstructorParametersIntersectionWithMappableNamesAndTypes = type
            .GetConstructors()
            .Where(c => c.GetParameters().Length > 0)
            .MinBy(c => c.GetParameters().Length);

        if (coveringTypeMappableConstructor != null)
        {
            string[] defaultParameters = coveringTypeMappableConstructor.GetParameters().Where(parameter => parameter.HasDefaultValue).Select(parameter => parameter.Name).ToArray()!;

            WriteConstructor(writer, type, typeName, propertyInformations, coveringTypeMappableConstructor, Array.Empty<string>(), ignoreNameEquivalence: true);
            if (defaultParameters.Any())
            {
                WriteConstructor(writer, type, typeName, propertyInformations, coveringTypeMappableConstructor, defaultParameters);
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
                    && (property.Name.ToCamelCase() == parameter.Name || ignoreNameEquivalence)
                    && (property.PropertyType == parameter.ParameterType || EqualCollectionElementType(property.PropertyType, parameter.ParameterType)))
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
        writer.WriteLine($"{typeName} result = new {typeName}();");
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
                if (property!.PropertyType.IsGenericType && property!.PropertyType.GetGenericTypeDefinition() == typeof(List<>) && parameter.ParameterType.IsArray)
                {
                    writer.WriteLine($"result.{propertyName} = new ArrayList<>(Arrays.asList({parameter.Name}));");
                }
                else if (property!.PropertyType.IsArray && parameter.ParameterType.IsGenericType && parameter.ParameterType.GetGenericTypeDefinition() == typeof(List<>))
                {
                    writer.WriteLine($"result.{propertyName} = {parameter.Name}.asArray();");
                }
                else
                {
                    writer.WriteLine($"result.{propertyName} = {parameter.Name};");
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
                writer.WriteLine($"result.{propertyName}{DefaultValueSetter(parameter)};");
            }
        }
        writer.WriteLine("return result;");
        writer.Indent--;
        writer.WriteLine("}");
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
                $"{(parameters[^1] == parameter ? javaWriter.BetterTypedParameterTypeName(javaWriter.TypeName(parameter), parameter.ParameterType) : javaWriter.TypeName(parameter))} {parameter.Name}"
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
}