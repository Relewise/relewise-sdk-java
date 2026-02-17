using System.CodeDom.Compiler;
using System.Reflection;
using Generator.Extensions;
using Generator.JavaMemberWriters;
using Generator.JavaTypeWriters;

namespace Generator;

public class JavaWriter
{
    private readonly List<IJavaTypeWriter> _javaTypeWriters;
    private readonly JavaTypeResolver _javaTypeResolver;

    public HashSet<Type> MissingTypeDefinitions { get; set; } = new();
    public Assembly Assembly { get; }
    public string BasePath { get; }
    private string ModelsPath { get; }
    public XmlDocumentation XmlDocumentation { get; }
    public JavaCreatorMethodWriter CreatorMethodWriter { get; }
    public JavaPropertyGetterMethodsWriter PropertyGetterMethodsWriter { get; }
    public JavaPropertySetterMethodsWriter PropertySetterMethodsWriter { get; }
    public JavaStaticReadonlyPropertiesWriter StaticReadonlyPropertiesWriter { get; }
    public JavaFieldWriter SettablePropertiesWriter { get; }

    public void ClearFolder()
    {
        if (Directory.Exists(ModelsPath))
            new DirectoryInfo(ModelsPath).Delete(true);

        Directory.CreateDirectory(ModelsPath);
    }

    public JavaWriter(Assembly assembly, string basePath, XmlDocumentation xmlDocumentation)
    {
        _javaTypeWriters =
        [
            new JavaKeyValuePairWriter(this), 
            new JavaEnumWriter(this), 
            new JavaInterfaceWriter(this),
            new JavaClassWriter(this)
        ];
        _javaTypeResolver = new JavaTypeResolver(assembly);
        Assembly = assembly;
        BasePath = basePath;
        ModelsPath = $"{BasePath}/{Constants.GenerationFolderPath}/";
        XmlDocumentation = xmlDocumentation;
        CreatorMethodWriter = new JavaCreatorMethodWriter(this);
        PropertyGetterMethodsWriter = new JavaPropertyGetterMethodsWriter(this);
        PropertySetterMethodsWriter = new JavaPropertySetterMethodsWriter(this);
        StaticReadonlyPropertiesWriter = new JavaStaticReadonlyPropertiesWriter(this);
        SettablePropertiesWriter = new JavaFieldWriter(this);
    }

    public void WriteTypes(IEnumerable<Type> types)
    {
        foreach (Type type in types)
        {
            _javaTypeResolver.TypesToGenerate.Enqueue(type);
        }

        while (_javaTypeResolver.TypesToGenerate.Count > 0)
        {
            Type type = _javaTypeResolver.TypesToGenerate.Dequeue();

            if (type == typeof(object) || type == typeof(ValueType) || type == typeof(Enum))
                continue;

            string potentialNullableTypeName = TypeName(type);
            string typeName = potentialNullableTypeName.RemoveNullable();

            if (_javaTypeResolver.IsWritten(typeName)) continue;

            if (type.IsGenericTypeDefinition || type.IsGenericTypeParameter || typeName.Contains("d__"))
            {
                continue;
            }

            DiscoverReferencedTypesFromSignatures(type);

            using var streamWriter = File.CreateText($"{ModelsPath}{typeName}.java");
            using var writer = new IndentedTextWriter(streamWriter);

            IJavaTypeWriter? javaTypeWriter = _javaTypeWriters.FirstOrDefault(w => w.CanWrite(type));
            if (javaTypeWriter is null)
            {
                MissingTypeDefinitions.Add(type);
            }
            else
            {
                javaTypeWriter.Write(writer, type, typeName);
                _javaTypeResolver.HasWritten(typeName);
            }
        }
    }

    private void DiscoverReferencedTypesFromSignatures(Type type)
    {
        const BindingFlags flags = BindingFlags.Public | BindingFlags.Instance | BindingFlags.Static | BindingFlags.DeclaredOnly;

        foreach (var constructor in type.GetConstructors(flags))
        {
            foreach (var parameter in constructor.GetParameters())
            {
                DiscoverReferencedType(parameter.ParameterType);
            }
        }

        foreach (var method in type.GetMethods(flags))
        {
            // Keep property/event accessors out of traversal, but include conversion operators.
            if (method.IsSpecialName && method.Name is not "op_Implicit" and not "op_Explicit")
            {
                continue;
            }
            if (method.IsGenericMethodDefinition || method.ContainsGenericParameters)
            {
                continue;
            }

            DiscoverReferencedType(method.ReturnType);

            foreach (var parameter in method.GetParameters())
            {
                DiscoverReferencedType(parameter.ParameterType);
            }
        }
    }

    private void DiscoverReferencedType(Type type)
    {
        if (type == typeof(void))
        {
            return;
        }
        if (type.ContainsGenericParameters)
        {
            return;
        }

        if (type.IsByRef || type.IsPointer)
        {
            if (type.GetElementType() is { } elementType)
            {
                DiscoverReferencedType(elementType);
            }
            return;
        }

        if (type.IsArray)
        {
            if (type.GetElementType() is { } elementType)
            {
                DiscoverReferencedType(elementType);
            }
            return;
        }

        if (type.IsGenericType || type.IsGenericTypeDefinition)
        {
            foreach (var genericArgument in type.GetGenericArguments())
            {
                if (genericArgument.IsGenericParameter)
                {
                    foreach (var constraint in genericArgument.GetGenericParameterConstraints())
                    {
                        DiscoverReferencedType(constraint);
                    }
                }
                else
                {
                    DiscoverReferencedType(genericArgument);
                }
            }
        }

        if (type.IsGenericParameter)
        {
            foreach (var constraint in type.GetGenericParameterConstraints())
            {
                DiscoverReferencedType(constraint);
            }
            return;
        }

        if (type.IsGenericTypeDefinition || type.Assembly != Assembly)
        {
            return;
        }

        TypeName(type);
    }

    public string TypeName(Type type) => _javaTypeResolver.ResolveType(type);

    public string TypeName(PropertyInfo property)
    {
        string typeName = TypeName(property.PropertyType);
        return PrependNullableIfApplicable(typeName, new NullabilityInfoContext().Create(property));
    }

    public string TypeName(ParameterInfo property)
    {
        string typeName = TypeName(property.ParameterType);
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

    public string BetterTypedParameterTypeName(ParameterInfo parameter)
    {
        Type parameterType = parameter.ParameterType;
        var nullabilityInfo = new NullabilityInfoContext().Create(parameter);

        if (nullabilityInfo.WriteState is NullabilityState.Nullable)
        {
            parameterType = nullabilityInfo.Type;
        }
        return parameterType.IsGenericType && parameterType.GetGenericTypeDefinition() == typeof(List<>) &&
              parameterType.GenericTypeArguments is [var elementType]
                ? TypeName(elementType) + "..."
                : parameterType.IsArray
                    ? TypeName(parameterType.GetElementType()!) + "..."
                    : PrependNullableIfApplicable(TypeName(parameterType), nullabilityInfo);
    }

    public string BetterTypedParameterTypeName(PropertyInfo property, NullabilityInfo nullabilityInfo)
    {
        Type parameterType = property.PropertyType;

        return parameterType.IsGenericType && parameterType.GetGenericTypeDefinition() == typeof(List<>) &&
               parameterType.GenericTypeArguments is [var elementType]
            ? TypeName(elementType) + "..."
            : parameterType.IsArray
                ? TypeName(parameterType.GetElementType()!) + "..."
                : TypeName(property);
    }

    public string ValueSetter(Type toType, string toName, Type fromType, string fromName) => (toType, fromType) switch
    {
        { fromType: { IsArray: true }, toType: { IsGenericType: true } generic } when generic.GetGenericTypeDefinition() == typeof(List<>) => $"{toName} = new ArrayList<>(Arrays.asList({fromName}));",
        _ => $"{toName} = {fromName}"
    };
}
