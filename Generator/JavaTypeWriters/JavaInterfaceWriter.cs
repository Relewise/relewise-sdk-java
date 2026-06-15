using System.CodeDom.Compiler;
using System.Reflection;
using Generator.Extensions;
using MessagePack;
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

        var attributes = System.Attribute.GetCustomAttributes(type);
        if (attributes.Any(a => a is UnionAttribute))
        {
            writer.WriteLine("@JsonTypeInfo(");
            writer.Indent++;
            writer.WriteLine("use = JsonTypeInfo.Id.NAME,");
            writer.WriteLine("include = JsonTypeInfo.As.EXISTING_PROPERTY,");
            writer.WriteLine("property = \"$type\")");
            writer.Indent--;
            writer.WriteLine("@JsonSubTypes({");
            writer.Indent++;
            foreach (var attribute in attributes)
            {
                if (attribute is not UnionAttribute unionAttribute) continue;
                writer.WriteLine($"@JsonSubTypes.Type(value = {javaWriter.TypeName(unionAttribute.SubType)}.class, name = \"{unionAttribute.SubType.FullName}, {unionAttribute.SubType.Assembly.FullName!.Split(",")[0]}\"),");
            }
            writer.Indent--;
            writer.WriteLine("})");
        }

        writer.WriteLine($"public interface {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        writer.Indent--;
        writer.WriteLine("}");
    }
}
