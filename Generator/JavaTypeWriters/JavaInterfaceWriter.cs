using System.CodeDom.Compiler;
using System.Reflection;
using Newtonsoft.Json;

namespace Generator.JavaTypeWriters;

internal class JavaInterfaceWriter : IJavaTypeWriter
{
    private readonly JavaWriter phpWriter;

    public JavaInterfaceWriter(JavaWriter phpWriter)
    {
        this.phpWriter = phpWriter;
    }

    public bool CanWrite(Type type) => type.IsInterface;

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
package {Constants.Namespace}.{Constants.GenerationFolderPath};

{Constants.StandardImports}

""");
        writer.WriteLine($"public interface {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        writer.Indent--;
        writer.WriteLine("}");
    }
}