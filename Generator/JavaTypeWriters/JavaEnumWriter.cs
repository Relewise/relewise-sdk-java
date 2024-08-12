using System.CodeDom.Compiler;
using System.Reflection;
using Generator.Extensions;

namespace Generator.JavaTypeWriters;

internal class JavaEnumWriter : IJavaTypeWriter
{
    private readonly JavaWriter javaWriter;

    public JavaEnumWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public bool CanWrite(Type type) => type.IsEnum;

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