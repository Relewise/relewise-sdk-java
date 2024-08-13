using Generator.Extensions;
using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator.JavaMemberWriters;

public class JavaPropertySetterMethodsWriter
{
    private readonly JavaWriter javaWriter;

    public JavaPropertySetterMethodsWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type returnType, string returnTypeName, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformations, string[] ownedProperties)
    {
        foreach (var (info, propertyTypeName, propertyName, lowerCaseName) in propertyInformations)
        {
            var deprecationComment = info.GetCustomAttribute(typeof(ObsoleteAttribute)) is ObsoleteAttribute { } obsolete ? $"@deprecated {obsolete.Message}" : null;
            var propertyType = info.PropertyType;
            if (propertyType.IsGenericType && propertyType.GetGenericTypeDefinition() == typeof(Dictionary<,>) && propertyType.GenericTypeArguments is [var keyType, var valueType])
            {
                writer.WriteCommentBlock(
                    javaWriter.XmlDocumentation.GetSummary(returnType, propertyName),
                    deprecationComment
                );
                writer.WriteLine($"public {returnTypeName} addTo{propertyName}({javaWriter.TypeName(keyType)} key, {javaWriter.TypeName(valueType)} value)");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"if (this.{lowerCaseName} == null)");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"this.{lowerCaseName} = new HashMap<>();");
                writer.Indent--;
                writer.WriteLine("}");
                writer.WriteLine($"this.{lowerCaseName}.put(key, value);");
                writer.WriteLine("return this;");
                writer.Indent--;
                writer.WriteLine("}");
            }

            writer.WriteCommentBlock(
                javaWriter.XmlDocumentation.GetSummary(returnType, propertyName),
                deprecationComment
            );
            var parameterType = javaWriter.BetterTypedParameterTypeName(info, new NullabilityInfoContext().Create(info));
            if (!ownedProperties.Any(p => p.ToLower() == lowerCaseName.ToLower()))
            {
                writer.WriteLine("@Override");
            }
            writer.WriteLine($"public {returnTypeName} set{propertyName}({parameterType} {lowerCaseName.AsFieldName()})");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"this.{javaWriter.ValueSetter(propertyType, lowerCaseName.AsFieldName(), propertyType is { IsGenericType: true } genericType && genericType.GetGenericTypeDefinition() == typeof(List<>) ? (genericType.GenericTypeArguments[0]).MakeArrayType() : propertyType, lowerCaseName.AsFieldName())};");
            writer.WriteLine("return this;");
            writer.Indent--;
            writer.WriteLine("}");

            if (propertyType.IsArray && !returnType.GenericTypeArguments.Contains(propertyType.GetElementType()))
            {
                writer.WriteCommentBlock(
                    javaWriter.XmlDocumentation.GetSummary(returnType, propertyName),
                    deprecationComment
                );
                var elementType = propertyType.GetElementType()!;
                writer.WriteLine($"public {returnTypeName} addTo{propertyName}({javaWriter.TypeName(elementType)} {lowerCaseName.SingularIfPossible().AsFieldName()})");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"if (this.{lowerCaseName.AsFieldName()} == null)");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"this.{lowerCaseName.AsFieldName()} = new {javaWriter.TypeName(elementType)}[] {{ {lowerCaseName.SingularIfPossible().AsFieldName()} }};");
                writer.Indent--;
                writer.WriteLine("}");
                writer.WriteLine("else");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"ArrayList<{javaWriter.TypeName(elementType)}> existingList = new ArrayList<>(Arrays.asList(this.{lowerCaseName}));");
                writer.WriteLine($"existingList.add({lowerCaseName.SingularIfPossible().AsFieldName()});");
                writer.WriteLine($"this.{lowerCaseName.AsFieldName()} = existingList.toArray({NewUpper(javaWriter.TypeName(elementType))}[0]);");
                writer.Indent--;
                writer.WriteLine("}");
                writer.WriteLine("return this;");

                writer.Indent--;
                writer.WriteLine("}");
            }
            else if (propertyType.IsGenericType && propertyType.GetGenericTypeDefinition() == typeof(List<>) && !propertyType.GenericTypeArguments[0].IsGenericTypeParameter)
            {
                writer.WriteCommentBlock(
                    javaWriter.XmlDocumentation.GetSummary(returnType, propertyName),
                    deprecationComment
                );
                writer.WriteLine($"public {returnTypeName} addTo{propertyName}({javaWriter.TypeName(propertyType.GenericTypeArguments[0])} {lowerCaseName.AsFieldName()})");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"if (this.{lowerCaseName.AsFieldName()} == null)");
                writer.WriteLine("{");
                writer.Indent++;
                writer.WriteLine($"this.{lowerCaseName.AsFieldName()} = new ArrayList<>();");
                writer.Indent--;
                writer.WriteLine("}");
                writer.WriteLine($"this.{lowerCaseName.AsFieldName()}.add({lowerCaseName.AsFieldName()});");
                writer.WriteLine("return this;");

                writer.Indent--;
                writer.WriteLine("}");
            }
        }
    }

    private string NewUpper(string typeName) => typeName switch
    {
        _ when typeName.EndsWith("[]") => $"new {typeName[..^2]}[0]",
        _ => $"new {typeName}",
    };
}