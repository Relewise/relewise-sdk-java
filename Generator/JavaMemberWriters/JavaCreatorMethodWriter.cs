using Generator.Extensions;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Reflection;
using System.Reflection.Metadata;
using System.Security.Cryptography;

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

        if (coveringTypeMappableConstructor != null)
        {
            WriteConstructor(writer, typeName, propertyInformations, coveringTypeMappableConstructor, Array.Empty<string>());
        }

        foreach (var constructor in type.GetConstructors().Where(c => c.GetParameters().Length > 0))
        {
            string[] defaultParameters = constructor.GetParameters().Where(parameter => parameter.HasDefaultValue).Select(parameter => parameter.Name).ToArray()!;

            WriteConstructor(writer, typeName, propertyInformations, constructor, defaultParameters);
            if (defaultParameters.Any())
            {
                WriteConstructor(writer, typeName, propertyInformations, constructor, Array.Empty<string>());
            }
        }
    }

    private IEnumerable<IEnumerable<string>> GetPermuationsWithExcludingEachElementOption(List<string> list)
    {
        if (list.Count is 1)
        {
            yield return new List<string>() { };
            yield return new List<string>() { list.Single() };
        }
        else
        {
            foreach (var permutation in GetPermuationsWithExcludingEachElementOption(list.Skip(1).ToList()))
            {
                yield return permutation.Concat(new List<string>() { list.First() });
                yield return permutation;
            }
        }
    }

    private void WriteConstructor(IndentedTextWriter writer, string typeName, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformations, ConstructorInfo constructorInfo, string[] includedNullableParameters)
    {
        var parameters = constructorInfo.GetParameters().Where(parameter => !parameter.HasDefaultValue || includedNullableParameters.Contains(parameter.Name)).ToArray();
        var nonIncludedDefaultParameters = constructorInfo.GetParameters().Where(parameter => parameter.HasDefaultValue && !includedNullableParameters.Contains(parameter.Name)).ToArray();

        var methodHead = $"public static {typeName} create({ParameterList(parameters)})";
        if (WrittenCreator.Contains(methodHead))
        {
            return;
        }
        WrittenCreator.Add(methodHead);

        writer.WriteLine(methodHead);
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine($"{typeName} result = new {typeName}();");
        foreach (var parameter in parameters)
        {
            string? propertyName;
            var property = propertyInformations.FirstOrDefault(property => property.lowerCaseName == parameter.Name);
            propertyName = property.lowerCaseName;
            if (propertyName is null)
            {
                property = propertyInformations.FirstOrDefault(property => property.info.PropertyType == parameter.ParameterType || EqualCollectionElementType(property.info.PropertyType, parameter.ParameterType));
                propertyName = property.lowerCaseName;
            }
            if (propertyName is not null)
            {
                if (property.info.PropertyType.IsGenericType && property.info.PropertyType.GetGenericTypeDefinition() == typeof(List<>) && parameter.ParameterType.IsArray)
                {
                    writer.WriteLine($"result.{propertyName} = new ArrayList<>(Arrays.asList({parameter.Name}));");
                }
                else if (property.info.PropertyType.IsArray && parameter.ParameterType.IsGenericType && parameter.ParameterType.GetGenericTypeDefinition() == typeof(List<>))
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
            var property = propertyInformations.FirstOrDefault(property => property.lowerCaseName == parameter.Name);
            propertyName = property.lowerCaseName;
            if (propertyName is null)
            {
                property = propertyInformations.FirstOrDefault(property => property.info.PropertyType == parameter.ParameterType);
                propertyName = property.lowerCaseName;
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
            double number => $"{number.ToString(CultureInfo.InvariantCulture)}",
            float number => $"{number.ToString(CultureInfo.InvariantCulture)}",
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