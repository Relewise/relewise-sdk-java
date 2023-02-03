using System.Reflection;
using Generator.Extensions;

namespace Generator;

public class JavaTypeResolver
{
    private readonly Assembly assembly;
    private Dictionary<Type, string> typeDefintions { get; } = new();

    public HashSet<string> GeneratedFileNames { get; } = new();
    public Queue<Type> TypesToGenerate { get; } = new();

    public JavaTypeResolver(Assembly assembly)
    {
        this.assembly = assembly;
    }

    public string ResolveType(Type type) => type.Name switch
    {
        "String" => "String",
        "Guid" => "UUID",
        "Int32" => "Integer",
        "Int64" => "Long",
        "UInt16" => "Integer", // This could potentially have been a short, but Java doesn't have unsigned shorts.
        "Byte" => "Short",
        "Single" => "Float",
        "Double" => "Double",
        "Decimal" => "Double", // Java doesn't support primitive types larger than 8 bytes so this is a cut-off
        "Boolean" => "Boolean",
        "Object" => "Object",
        "DateTimeOffset" => "OffsetDateTime",
        var value when value.StartsWith("Nullable") => $"@Nullable {ResolveType(type.GetGenericArguments()[0])}",
        var value when value.StartsWith("List") || value.StartsWith("Dictionary") || value.StartsWith("KeyValuePair") || value.EndsWith("[]") => AddCollectionTypeDefinition(type),
        _ when type.IsGenericType => GetGenericTypeDefinition(type),
        _ => GetOrAddTypeDefinition(type)
    };

    public bool IsWritten(string typeName) => GeneratedFileNames.Contains(typeName);
    public void HasWritten(string typeName) => GeneratedFileNames.Add(typeName);

    private string GetOrAddTypeDefinition(Type type)
    {
        if (typeDefintions.TryGetValue(type, out var value))
        {
            return value;
        }

        var typeName = GetTypeName(type);
        typeDefintions.Add(type, typeName);
        TypesToGenerate.Enqueue(type);
        AddDerivedTypeDefinitions(type);
        return typeName;
    }

    private static string GetTypeName(Type type)
    {
        return type.Name.Replace("`1", "").Replace("`2", "");
    }

    public string GenericTypeName(Type type)
    {
        if (type.GetGenericArguments().Length is 1)
        {
            return $"{GetTypeName(type)}<{type.GetGenericArguments()[0].Name}>";
        }
        if (type.GetGenericArguments().Length is 2)
        {
            return $"{GetTypeName(type)}<{type.GetGenericArguments()[0].Name}, {type.GetGenericArguments()[1].Name}>";
        }
        return GetTypeName(type);
    }

    private string AddCollectionTypeDefinition(Type type)
    {
        if (type.IsArray && type.GetElementType() is { } elementType)
        {
            return $"{ResolveType(elementType)}[]";
        }
        if (type.IsGenericType)
        {
            if (type.GetGenericTypeDefinition() == typeof(List<>))
            {
                return $"ArrayList<{ResolveType(type.GetGenericArguments()[0])}>";
            }
            if (type.GetGenericTypeDefinition() == typeof(Dictionary<,>))
            {
                return $"HashMap<{ResolveType(type.GetGenericArguments()[0])}, {ResolveType(type.GetGenericArguments()[1])}>";
            }
            if (type.GetGenericTypeDefinition() == typeof(KeyValuePair<,>))
            {
                return $"AbstractMap.SimpleEntry<{ResolveType(type.GetGenericArguments()[0])}, {ResolveType(type.GetGenericArguments()[1])}>";
            }
        }
        return "Object[]";
    }

    private string GetGenericTypeDefinition(Type type)
    {
        if (type.IsGenericTypeDefinition)
        {
            switch (type.GenericTypeArguments.Length)
            {
                case 1:
                    return $"{GetOrAddTypeDefinition(type)}<{type.GenericTypeArguments.Single()}>";
                case 2:
                    return $"{GetOrAddTypeDefinition(type)}<{type.GenericTypeArguments.First().Name}, {type.GenericTypeArguments.Last().Name}>";
            }
        }

        // We use `RemoveNullable` in the following section because Java does not support to annotate generic type arguments.
        switch (type.GenericTypeArguments.Length)
        {
            case 1:
                return $"{GetOrAddTypeDefinition(type)}<{ResolveType(type.GenericTypeArguments.Single()).RemoveNullable()}>";
            case 2:
                return $"{GetOrAddTypeDefinition(type)}<{ResolveType(type.GenericTypeArguments.First()).RemoveNullable()}, {ResolveType(type.GenericTypeArguments.Last()).RemoveNullable()}>";
        }

        if (type.GenericTypeArguments is not [var genericTypeArgumentDefinition])
        {
            return GetOrAddTypeDefinition(type);
        }

        return $"{GetOrAddTypeDefinition(type)}<{genericTypeArgumentDefinition.Name.RemoveNullable()}>";
    }
    private void AddDerivedTypeDefinitions(Type type)
    {
        if (!type.IsAbstract && !type.IsInterface)
        {
            return;
        }
        var derivedTypes = assembly
            .GetTypes()
            .Where(derivingType => derivingType != type && derivingType.IsAssignableTo(type) && !derivingType.IsGenericType)
            .Distinct()
            .ToArray();
        if (derivedTypes.Length is 0)
        {
            return;
        }
        foreach (var derivedType in derivedTypes)
        {
            GetOrAddTypeDefinition(derivedType);
        }
    }
}