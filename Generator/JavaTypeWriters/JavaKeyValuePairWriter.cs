using Generator.Extensions;
using MessagePack;
using Newtonsoft.Json;
using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator.JavaTypeWriters;

public class JavaKeyValuePairWriter : IJavaTypeWriter
{
    private readonly JavaWriter javaWriter;

    public JavaKeyValuePairWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public bool CanWrite(Type type) => type.IsGenericType && type.GetGenericTypeDefinition() == typeof(KeyValuePair<,>);

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
package {Constants.Namespace}.{Constants.GenerationFolderPath};

{Constants.StandardImports}
    
""");
        writer.WriteLine("@JsonIgnoreProperties(ignoreUnknown = true)");

        writer.WriteLine($"public {(type.IsAbstract ? "abstract " : "")}class {typeName}");
        writer.WriteLine("{");
        writer.Indent++;

        var gettablePropertyInfo = type
            .GetProperties()
            .Where(info => info.MemberType is MemberTypes.Property
                           && info.GetIndexParameters().Length is 0
                           && info.GetMethod is { IsAbstract: false }
                           && !Attribute.IsDefined(info, typeof(JsonIgnoreAttribute))
                           && info.GetAccessors(false).All(ax => !ax.IsAbstract && ax.IsPublic)
                           && info.Name != "Custom") // It is a special requirement that we should ignore the property Custom from all classes.
            .ToArray();

        var gettableProperties = gettablePropertyInfo
            .Select(MapPropertyInfo)
            .ToArray();

        javaWriter.SettablePropertiesWriter.Write(writer, type, gettableProperties);
        javaWriter.CreatorMethodWriter.Write(writer, type, typeName, gettableProperties);
        javaWriter.PropertyGetterMethodsWriter.Write(writer, type, gettableProperties);
        javaWriter.PropertySetterMethodsWriter.Write(writer, type, typeName, gettableProperties, gettableProperties.Select(p => p.propertyName).ToArray());

        writer.Indent--;
        writer.WriteLine("}");
    }

    private (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName) MapPropertyInfo(PropertyInfo info)
    {
        return (info, propertyTypeName: javaWriter.TypeName(info), propertyName: info.Name, lowerCaseName: info.Name.ToCamelCase());
    }
}