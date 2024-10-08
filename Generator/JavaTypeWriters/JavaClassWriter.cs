﻿using Generator.Extensions;
using MessagePack;
using Newtonsoft.Json;
using Relewise.Client.Responses;
using System;
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

    public bool CanWrite(Type type) => IsClass(type) || IsAnyStruct(type);

    private bool IsClass(Type type) => type.IsClass;

    private bool IsReadonlyStruct(Type type) => type.IsValueType && type.GetProperties().All(p => !p.CanWrite);

    private bool IsAnyStruct(Type type) => type.IsValueType;

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

        if (type.IsMaybeBaseClassOfSomethingPolymorphic())
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
        else if (type.IsConcreteTypeOfSomethingPolymorphic())
        {
            writer.WriteLine("@JsonTypeInfo(");
            writer.Indent++;
            writer.WriteLine("use = JsonTypeInfo.Id.NAME,");
            writer.WriteLine("include = JsonTypeInfo.As.EXISTING_PROPERTY,");
            writer.WriteLine("property = \"$type\",");
            writer.WriteLine($"defaultImpl = {typeName}.class)");
            writer.Indent--;
        }
        writer.WriteLine("@JsonIgnoreProperties(ignoreUnknown = true)");

        string? baseTypeName = null;
        if (type.BaseType is { } baseType && baseType != typeof(ValueType) && baseType != typeof(object))
        {
            baseTypeName = javaWriter.TypeName(baseType).RemoveNullable();
        }

        writer.WriteLine($"public {(type.IsAbstract ? "abstract " : "")}class {typeName}{(baseTypeName is not null ? $" extends {baseTypeName}" : "")}{(type.GetInterfaces() is { Length: > 0 } interfaces ? " implements " + string.Join(", ", interfaces.Select(i => javaWriter.TypeName(i))) : "")}");
        writer.WriteLine("{");
        writer.Indent++;
        if (type.IsMaybeBaseClassOfSomethingPolymorphic())
        {
            // We do this to ensure that it is the first property always if any of its descendants use it.
            writer.WriteLine("public String $type = \"\";");
        }
        else if (type.IsConcreteTypeOfSomethingPolymorphic())
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

        var gettableProperties = gettablePropertyInfo
            .Select(MapPropertyInfo)
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

        if (IsReadonlyStruct(type))
        {
            javaWriter.SettablePropertiesWriter.Write(writer, type, gettableProperties);
            javaWriter.StaticReadonlyPropertiesWriter.Write(writer, type, staticGetterProperties);

            javaWriter.CreatorMethodWriter.Write(writer, type, typeName, gettableProperties);
            javaWriter.PropertyGetterMethodsWriter.Write(writer, type, gettableProperties);
            javaWriter.PropertySetterMethodsWriter.Write(writer, type, typeName, gettableProperties, gettableProperties.Select(p => p.propertyName).ToArray());
        }
        else if (IsClass(type) || IsAnyStruct(type))
        {
            javaWriter.SettablePropertiesWriter.Write(writer, type, ownedProperties);
            javaWriter.StaticReadonlyPropertiesWriter.Write(writer, type, staticGetterProperties);

            javaWriter.CreatorMethodWriter.Write(writer, type, typeName, settableProperties);
            javaWriter.PropertyGetterMethodsWriter.Write(writer, type, ownedProperties);
            javaWriter.PropertySetterMethodsWriter.Write(writer, type, typeName, settableProperties, ownedProperties.Select(p => p.propertyName).ToArray());
        }

        writer.Indent--;
        writer.WriteLine("}");
    }

    private (PropertyInfo info, string propertyTypeName, string propertyName, string lowerCaseName) MapPropertyInfo(PropertyInfo info)
    {
        return (info, propertyTypeName: javaWriter.TypeName(info), propertyName: info.Name, lowerCaseName: info.Name.ToCamelCase());
    }
}