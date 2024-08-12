using System.CodeDom.Compiler;
using System.Reflection;
using System.Reflection.Metadata.Ecma335;
using Generator.Extensions;
using Generator.JavaMemberWriters;
using Generator.JavaTypeWriters;

namespace Generator;

public class JavaWriter
{
    private readonly List<IJavaTypeWriter> javaTypeWriters;
    private readonly JavaTypeResolver javaTypeResolver;

    public HashSet<Type> MissingTypeDefinitions { get; set; } = new();
    public Assembly Assembly { get; }
    public string BasePath { get; }
    public XmlDocumentation XmlDocumentation { get; }
    public JavaCreatorMethodWriter CreatorMethodWriter { get; }
    public JavaPropertyGetterMethodsWriter PropertyGetterMethodsWriter { get; }
    public JavaPropertySetterMethodsWriter PropertySetterMethodsWriter { get; }
    public JavaStaticReadonlyPropertiesWriter StaticReadonlyPropertiesWriter { get; }
    public JavaFieldWriter SettablePropertiesWriter { get; }

    public JavaWriter(Assembly assembly, string basePath, XmlDocumentation xmlDocumentation)
    {
        javaTypeWriters = new List<IJavaTypeWriter>() { new JavaEnumWriter(this), new JavaInterfaceWriter(this), new JavaClassWriter(this) };
        javaTypeResolver = new JavaTypeResolver(assembly);
        Assembly = assembly;
        BasePath = basePath;
        XmlDocumentation = xmlDocumentation;
        CreatorMethodWriter = new JavaCreatorMethodWriter(this);
        PropertyGetterMethodsWriter = new JavaPropertyGetterMethodsWriter(this);
        PropertySetterMethodsWriter = new JavaPropertySetterMethodsWriter(this);
        StaticReadonlyPropertiesWriter = new JavaStaticReadonlyPropertiesWriter(this);
        SettablePropertiesWriter = new JavaFieldWriter(this);
    }

    public void WriteTypes(IEnumerable<Type> types)
    {
        foreach (var type in types)
        {
            javaTypeResolver.TypesToGenerate.Enqueue(type);
        }

        while (javaTypeResolver.TypesToGenerate.Count > 0)
        {
            var type = javaTypeResolver.TypesToGenerate.Dequeue();

            if (type == typeof(object) || type == typeof(ValueType) || type == typeof(Enum))
                continue;

            var potentialNullableTypeName = TypeName(type);
            string typeName = potentialNullableTypeName.RemoveNullable();

            typeName = typeName.RemoveNullable();

            if (javaTypeResolver.IsWritten(typeName)) continue;

            if (type.IsGenericTypeDefinition || type.IsGenericTypeParameter || typeName.Contains("d__"))
            {
                continue;
            }

            using var streamWriter = File.CreateText($"{BasePath}/{Constants.GenerationFolderPath}/{typeName}.java");
            using var writer = new IndentedTextWriter(streamWriter);

            var javaTypeWriter = javaTypeWriters.FirstOrDefault(writer => writer.CanWrite(type));
            if (javaTypeWriter is null)
            {
                MissingTypeDefinitions.Add(type);
            }
            else
            {
                javaTypeWriter.Write(writer, type, typeName);
                javaTypeResolver.HasWritten(typeName);
            }
        }
    }

    public string TypeName(Type type) => javaTypeResolver.ResolveType(type);

    public string TypeName(PropertyInfo property)
    {
        var typeName = TypeName(property.PropertyType);
        return PrependNullableIfApplicable(typeName, new NullabilityInfoContext().Create(property));
    }

    public string TypeName(ParameterInfo property)
    {
        var typeName = TypeName(property.ParameterType);
        return PrependNullableIfApplicable(typeName, new NullabilityInfoContext().Create(property));
    }

    private static string PrependNullableIfApplicable(string typeName, NullabilityInfo nullabilityInfo)
    {
        if (!typeName.StartsWith("@Nullable")
            && typeName != "Object"
            && nullabilityInfo.WriteState is NullabilityState.Nullable)
        {
            return $"@Nullable {typeName}";
        }
        return typeName;
    }

    public string BetterTypedParameterTypeName(Type parameterType, NullabilityInfo nullabilityInfo)
    {
        if (nullabilityInfo.WriteState is NullabilityState.Nullable)
        {
            parameterType = nullabilityInfo.Type;
        }
        return parameterType.IsGenericType && parameterType.GetGenericTypeDefinition() == typeof(List<>) &&
              parameterType.GenericTypeArguments is [var elementType]
                ? TypeName(elementType) + "..."
                : parameterType.IsArray
                    ? TypeName(parameterType.GetElementType()!) + "..."
                    : TypeName(parameterType);
    }

    public string ValueSetter(Type toType, string toName, Type fromType, string fromName) => (toType, fromType) switch
    {
        { fromType: { IsArray: true }, toType: { IsGenericType: true } generic } when generic.GetGenericTypeDefinition() == typeof(List<>) => $"{toName} = new ArrayList<>(Arrays.asList({fromName}));",
        _ => $"{toName} = {fromName}"
    };
}
