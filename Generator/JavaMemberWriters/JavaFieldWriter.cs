using System.CodeDom.Compiler;
using System.Reflection;
using Generator.Extensions;

namespace Generator.JavaMemberWriters;

public class JavaFieldWriter
{
    private readonly JavaWriter javaWriter;

    public JavaFieldWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type classType, (PropertyInfo type, string propertyTypeName, string propertyName, string lowerCaseName)[] ownedProperties)
    {
        foreach (var (propertyInfo, propertyTypeName, propertyName, lowerCaseName) in ownedProperties)
        {
            writer.WriteCommentBlock(
                javaWriter.XmlDocumentation.GetSummary(classType, propertyName),
                propertyInfo.GetCustomAttribute(typeof(ObsoleteAttribute)) is ObsoleteAttribute { } obsolete ? $"@deprecated {obsolete.Message}" : null
            );

            writer.WriteLine($"public {propertyTypeName} {lowerCaseName.AsFieldName()};");
        }
    }
}