using System.CodeDom.Compiler;

namespace Generator.JavaTypeWriters;

internal class JavaEnumWriter : IJavaTypeWriter
{
    private readonly JavaWriter phpWriter;

    public JavaEnumWriter(JavaWriter phpWriter)
    {
        this.phpWriter = phpWriter;
    }

    public bool CanWrite(Type type) => type.IsEnum;

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
package {Constants.Namespace}.{Constants.GenerationFolderPath};

{Constants.StandardImports}

""");
        writer.WriteLine($"public enum {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        foreach (var enumMember in type.GetMembers().Where(propertyInfo => propertyInfo.DeclaringType is { IsEnum: true } && propertyInfo.Name is not "__value" and not "value__"))
        {
            writer.WriteLine($"{enumMember.Name} {{");
            writer.Indent++;
            writer.WriteLine("public String toString() {");
            writer.Indent++;
            writer.WriteLine($"return \"{enumMember.Name}\";");
            writer.Indent--;
            writer.WriteLine("}");
            writer.Indent--;
            writer.WriteLine("},");
        }
        writer.Indent--;
        writer.WriteLine("}");
    }
}