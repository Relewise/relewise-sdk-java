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

    public void Write(IndentedTextWriter writer, (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformation)
    {
        foreach ((PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName) in propertyInformation)
        {
            writer.WriteLine($"public {propertyTypeName} get{propertyName}()");
            writer.WriteLine("{");
            writer.Indent++;
            writer.WriteLine($"return this.{lowerCaseName};");
            writer.Indent--;
            writer.WriteLine("}");
        }
    }
}