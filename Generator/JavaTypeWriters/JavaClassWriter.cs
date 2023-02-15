using Generator.Extensions;
using MessagePack;
using Newtonsoft.Json;
using Relewise.Client.Responses;
using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator.JavaTypeWriters;

public class JavaClassWriter : IJavaTypeWriter
{
    private readonly JavaWriter javaWriter;

    public JavaClassWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public bool CanWrite(Type type) => type.IsClass;

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
package {Constants.Namespace}.{Constants.GenerationFolderPath};

{Constants.StandardImports}
    
""");

        if (type.IsAbstract || type.IsInterface)
        {
            var attributes = System.Attribute.GetCustomAttributes(type);
            if (attributes.Any(a => a is MessagePackObjectAttribute))
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
        }
        else
        {
            writer.WriteLine("@JsonTypeInfo(");
            writer.Indent++;
            writer.WriteLine("use = JsonTypeInfo.Id.NAME,");
            writer.WriteLine("include = JsonTypeInfo.As.EXISTING_PROPERTY,");
            writer.WriteLine("property = \"$type\",");
            writer.WriteLine($"defaultImpl = {typeName}.class)");
            writer.Indent--;
        }

        writer.WriteLine($"public {(type.IsAbstract ? "abstract " : "")}class {typeName}{(type.BaseType != typeof(object) && type.BaseType is { } baseType ? $" extends {javaWriter.TypeName(baseType).RemoveNullable()}" : "")}{(type.GetInterfaces() is { Length: > 0 } interfaces ? " implements " + string.Join(", ", interfaces.Select(i => javaWriter.TypeName(i))) : "")}");
        writer.WriteLine("{");
        writer.Indent++;
        if (type.BaseType != typeof(object) && type.BaseType is { IsAbstract: true } || type.IsAbstract)
        {
            writer.WriteLine($"public String $type = \"{type.FullName}, {type.Assembly.FullName!.Split(",")[0]}\";");
        }

        var gettablePropertyInfo = type
            .GetProperties()
            .Where(info => info.MemberType is MemberTypes.Property
                           && info.GetIndexParameters().Length is 0
                           && info.GetMethod is { IsAbstract: false }
                           && !Attribute.IsDefined(info, typeof(JsonIgnoreAttribute))
                           && info.GetAccessors(false).All(ax => !ax.IsAbstract && ax.IsPublic)
                           && info.Name != "Custom") // It is a special requirement that we should ignore the property Custom from all classes.
            .ToArray();
        var settablePropertyInfo = gettablePropertyInfo
            .Where(info => info.SetMethod is { IsAbstract: false })
            .ToArray();


        var settableProperties = settablePropertyInfo
            .Select(MapPropertyInfo)
            .ToArray();
        var ownedProperties = settablePropertyInfo
            .Where(info => info.DeclaringType == type 
                        && info.DeclaringType?.IsAbstract == type.IsAbstract)
            .Select(MapPropertyInfo)
            .ToArray();
        var staticGetterProperties = gettablePropertyInfo
            .Where(info => info.GetAccessors(nonPublic: false).Any(x => x.IsStatic)
                        && info.SetMethod is null)
            .Select(MapPropertyInfo)
            .ToArray();

        javaWriter.SettablePropertiesWriter.Write(writer, ownedProperties);
        javaWriter.StaticReadonlyPropertiesWriter.Write(writer, type, staticGetterProperties);

        javaWriter.CreatorMethodWriter.Write(writer, type, typeName, ownedProperties);
        javaWriter.PropertySetterMethodsWriter.Write(writer, type, typeName, settableProperties, ownedProperties.Select(p => p.propertyName).ToArray());

        writer.Indent--;
        writer.WriteLine("}");
    }

    private (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName) MapPropertyInfo(PropertyInfo info)
    {
        return (info, propertyTypeName: javaWriter.TypeName(info), propertyName: info.Name, lowerCaseName: info.Name.ToCamelCase());
    }
}