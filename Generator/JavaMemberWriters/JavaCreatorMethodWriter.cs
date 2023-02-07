using Generator.Extensions;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Globalization;
using System.Reflection;
using System.Reflection.Metadata;

namespace Generator.JavaMemberWriters;

public class JavaCreatorMethodWriter
{
    private readonly JavaWriter javaWriter;

    public JavaCreatorMethodWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type type, string typeName, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformations)
    {
        if (type.IsAbstract || type.IsInterface) return;

        var coveringTypeMappableConstructorParameters = type
            .GetConstructors() // All 
            .FirstOrDefault(c => c.GetParameters().Count()== c.GetParameters().DistinctBy(parameter => parameter.ParameterType).Count() // There are no parameters with the same type.
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
            )
            ?.GetParameters()
            .ToArray();

        var allConstructorParametersIntersectionWithMappableNamesAndTypes = type
            .GetConstructors()
            .Where(c => c.GetParameters().Length > 0)
            .MinBy(c => c.GetParameters().Length)
            ?.GetParameters()
            .Where(parameter => type
                .GetConstructors()
                .Where(c => c.GetParameters().Length > 0)
                .All(c => c.GetParameters().Any(cParameter => 
                    cParameter.Name == parameter.Name
                    && cParameter.ParameterType == parameter.ParameterType))
                && type.GetProperties().Any(property =>
                    property.Name.ToCamelCase() == parameter.Name
                    && (
                        property.PropertyType == parameter.ParameterType
                        || EqualCollectionElementType(property.PropertyType, parameter.ParameterType)
                    ))
            )
            .ToArray();
        
        if (coveringTypeMappableConstructorParameters?.Length > 0)
        {
            writer.WriteLine($"public static {typeName} create({ParameterList(coveringTypeMappableConstructorParameters)})");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"{typeName} result = new {typeName}();");

            foreach (var parameter in coveringTypeMappableConstructorParameters)
            {
                var property = propertyInformations
                    .Single(property => property.info.PropertyType == parameter.ParameterType || EqualCollectionElementType(property.info.PropertyType, parameter.ParameterType));

                writer.WriteLine(javaWriter.ValueSetter(property.info.PropertyType, $"result.{property.propertyName.ToCamelCase()}", parameter.ParameterType, parameter.Name!));
            }
        }
        else if (allConstructorParametersIntersectionWithMappableNamesAndTypes?.Length > 0)
        {
            writer.WriteLine($"public static {typeName} create({ParameterList(allConstructorParametersIntersectionWithMappableNamesAndTypes)})");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"{typeName} result = new {typeName}();");

            foreach (var parameter in allConstructorParametersIntersectionWithMappableNamesAndTypes)
            {
                var property = type.GetProperties()
                    .Single(property => property.Name.ToCamelCase() == parameter.Name);

                writer.WriteLine(javaWriter.ValueSetter(property.PropertyType, $"result.{property.Name.ToCamelCase()}", parameter.ParameterType, parameter.Name!));
            }
        }
        else
        {
            writer.WriteLine($"public static {typeName} create()");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"{typeName} result = new {typeName}();");
        }

        var coveredParameterNames = coveringTypeMappableConstructorParameters?.Length > 0
            ? coveringTypeMappableConstructorParameters.Select(parameter => parameter.Name)
            : allConstructorParametersIntersectionWithMappableNamesAndTypes?.Length > 0
                ? allConstructorParametersIntersectionWithMappableNamesAndTypes.Select(parameter => parameter.Name)
                : new List<string>();

        var extraDefaultSetParameters = type.GetConstructors()
            .SelectMany(constructor => constructor.GetParameters())
            .Where(parameter => !coveredParameterNames.Contains(parameter.Name)
                                && parameter.DefaultValue is { } defaultValue && (defaultValue.GetType().IsValueType)
                                && type.GetProperties().Any(property =>
                                    property.Name.ToCamelCase() == parameter.Name
                                    && (
                                        property.PropertyType == parameter.ParameterType
                                        || EqualCollectionElementType(property.PropertyType, parameter.ParameterType)
                                    )
                                )
            )
            .DistinctBy(parameter => parameter.Name)
            .ToArray();

        foreach (var parameter in extraDefaultSetParameters)
        {
            var propertyName = type
                .GetProperties()
                .Single(property =>
                    property.Name.ToCamelCase() == parameter.Name
                    && (
                        property.PropertyType == parameter.ParameterType
                        || EqualCollectionElementType(property.PropertyType, parameter.ParameterType)
                    )
            ).Name.ToCamelCase();

            writer.WriteLine($"result.{propertyName}{DefaultValueSetter(parameter)};");
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