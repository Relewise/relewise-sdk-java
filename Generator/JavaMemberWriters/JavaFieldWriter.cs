using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator.JavaMemberWriters;

public class JavaFieldWriter
{
    private readonly JavaWriter javaWriter;

    public JavaFieldWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, (PropertyInfo type, string propertyTypeName, string propertyName, string lowerCaseName)[] ownedProperties)
    {
        foreach (var (_, propertyTypeName, _, lowerCaseName) in ownedProperties)
        {
            writer.WriteLine($"public {propertyTypeName} {lowerCaseName};");
        }
    }
}