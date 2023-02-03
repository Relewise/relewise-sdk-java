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
    public JavaCreatorMethodWriter CreatorMethodWriter { get; }
    public JavaPropertySetterMethodsWriter PropertySetterMethodsWriter { get; }
    public JavaStaticReadonlyPropertiesWriter StaticReadonlyPropertiesWriter { get; }
    public JavaFieldWriter SettablePropertiesWriter { get; }

    public JavaWriter(Assembly assembly, string basePath)
    {
        javaTypeWriters = new List<IJavaTypeWriter>() { new JavaClassWriter(this), new JavaEnumWriter(this), new JavaInterfaceWriter(this) /*, new JavaKeyValuePairWriter(this)*/ };
        javaTypeResolver = new JavaTypeResolver(assembly);
        Assembly = assembly;
        BasePath = basePath;
        CreatorMethodWriter = new JavaCreatorMethodWriter(this);
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

            string typeName = "";
            var fileTypeName = "";
            if (type.IsGenericType)
            {
                typeName = GenericTypeName(type.GetGenericTypeDefinition());
                fileTypeName = TypeName(type.GetGenericTypeDefinition());
            }
            else
            {
                typeName = TypeName(type);
                fileTypeName = typeName;
;
            }

            typeName = typeName.RemoveNullable();

            if (javaTypeResolver.IsWritten(fileTypeName)) continue;

            if ((type.IsGenericTypeParameter || typeName.Contains("d__")))
            {
                continue;
            }

            using var streamWriter = File.CreateText($"{BasePath}/{Constants.GenerationFolderPath}/{FileName(fileTypeName)}.java");
            using var writer = new IndentedTextWriter(streamWriter);

            var phpTypeWriter = javaTypeWriters.FirstOrDefault(writer => writer.CanWrite(type));
            if (phpTypeWriter is null)
            {
                MissingTypeDefinitions.Add(type);
            }
            else
            {
                phpTypeWriter.Write(writer, type, typeName);
                javaTypeResolver.HasWritten(fileTypeName);
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

    public string GenericTypeName(Type type) => javaTypeResolver.GenericTypeName(type);

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

    public string BetterTypedParameterTypeName(string parameterTypeName, Type propertyType)
    {
        return parameterTypeName[^3..] is "[]"
            ? propertyType.IsGenericType && propertyType.GetGenericTypeDefinition() == typeof(List<>) &&
              propertyType.GenericTypeArguments is [var elementType]
                ? TypeName(elementType) + "..."
                : propertyType.IsArray
                    ? TypeName(propertyType.GetElementType()!) + "..."
                    : "Object..."
            : parameterTypeName;
    }

    private string FileName(string typeName) => typeName.Replace("<", "").Replace(">", "");

    public string ValueSetter(Type toType, string toName, Type fromType, string fromName) => (toType, fromType) switch
    {
        { fromType: { IsArray: true }, toType: { IsGenericType: true } generic } when generic.GetGenericTypeDefinition() == typeof(List<>) => $"{toName} = new ArrayList<>(Arrays.asList({fromName}));",
        _ => $"{toName} = {fromName};"
    };
}
