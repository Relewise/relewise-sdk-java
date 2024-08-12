using Generator.Extensions;
using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator.JavaMemberWriters;

public class JavaPropertyGetterMethodsWriter
{
    private readonly JavaWriter javaWriter;

    public JavaPropertyGetterMethodsWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type classType, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformation)
    {
        foreach (var (propertyInfo, propertyTypeName, propertyName, lowerCaseName) in propertyInformation)
        {
            writer.WriteCommentBlock(
                javaWriter.XmlDocumentation.GetSummary(classType, propertyName),
                propertyInfo.GetCustomAttribute(typeof(ObsoleteAttribute)) is ObsoleteAttribute { } obsolete ? $"@deprecated {obsolete.Message}" : null
            );

            if (lowerCaseName == "default")
            {
                writer.WriteLine("@JsonProperty(\"default\")");
            }

            writer.WriteLine($"public {propertyTypeName} get{propertyName}()");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"return this.{lowerCaseName.AsFieldName()};");
            writer.Indent--;
            writer.WriteLine("}");
        }
    }
}