using System.CodeDom.Compiler;
using System.Reflection;
using Generator.Extensions;
using Newtonsoft.Json;

namespace Generator.JavaTypeWriters;

internal class JavaInterfaceWriter : IJavaTypeWriter
{
    private readonly JavaWriter javaWriter;

    public JavaInterfaceWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public bool CanWrite(Type type) => type.IsInterface;

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
package {Constants.Namespace}.{Constants.GenerationFolderPath};

{Constants.StandardImports}

""");
        var deprecationComment = type.GetCustomAttribute(typeof(ObsoleteAttribute)) is ObsoleteAttribute { } obsolete ? $"@deprecated {obsolete.Message}" : null;

        writer.WriteCommentBlock(
            javaWriter.XmlDocumentation.GetSummary(type),
            deprecationComment
        );

        writer.WriteLine($"public interface {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        writer.Indent--;
        writer.WriteLine("}");
    }
}