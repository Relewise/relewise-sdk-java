using Generator.Extensions;
using System.Reflection;
using System.Text.RegularExpressions;

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

    public string ResolveType(Type type, Type? parentType = null) => type.Name switch
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
        "DateTime" => "LocalDateTime",
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
        var name = type.Name;

        Type? typeToPrependToName = type.DeclaringType;
        while (typeToPrependToName is not null)
        {
            name = typeToPrependToName.Name + name;

            typeToPrependToName = typeToPrependToName.DeclaringType;
        }

        return Regex.Replace(name, @"`\d+", "");
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
        // We use `RemoveNullable` in the following section because Java does not support to annotate generic type arguments.
        switch (type.GenericTypeArguments.Length)
        {
            case 1:
                return $"{ResolveType(type.GenericTypeArguments.Single()).RemoveNullable()}{GetOrAddTypeDefinition(type)}";
            case 2:
                return $"{ResolveType(type.GenericTypeArguments.First()).RemoveNullable()}{ResolveType(type.GenericTypeArguments.Last()).RemoveNullable()}{GetOrAddTypeDefinition(type)}";
        }

        if (type.GetGenericArguments() is not [var genericTypeArgumentDefinition])
        {
            return GetOrAddTypeDefinition(type);
        }

        if (genericTypeArgumentDefinition.GetGenericParameterConstraints() is not [var genericTypeArgumentConstraint])
        {
            return GetOrAddTypeDefinition(type);
        }

        GetOrAddTypeDefinition(genericTypeArgumentConstraint);
        if (AddDerivedTypeDefinitions(genericTypeArgumentConstraint) is { } concreteTypeName)
        {
            return $"{concreteTypeName}{GetOrAddTypeDefinition(type)}";
        }

        return GetOrAddTypeDefinition(type);
    }

    private string? AddDerivedTypeDefinitions(Type type)
    {
        if (!type.IsAbstract)
        {
            return null;
        }
        var derivedTypes = assembly
            .GetTypes()
            .Where(derivingType => derivingType != type && derivingType.IsAssignableTo(type) && !derivingType.IsGenericType)
            .Distinct()
            .ToArray();
        if (derivedTypes.Length is 0)
        {
            return null;
        }
        // We do the extra work of generating classes for all the types that implement the 'genericTypeArgumentConstraint'
        foreach (var derivedType in derivedTypes.Skip(1))
        {
            GetOrAddTypeDefinition(derivedType);
        }
        return ResolveType(derivedTypes.First());
    }
}