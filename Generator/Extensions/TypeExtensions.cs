namespace Generator.Extensions;

public static class TypeExtensions
{
    public static bool IsConcreteTypeOfSomethingPolymorphic(this Type type) => ((type.BaseType != typeof(object) && type.BaseType is not null) || type.GetInterfaces().Length > 0) && !type.IsAbstract;
    public static bool IsMaybeBaseClassOfSomethingPolymorphic(this Type type) => type.IsAbstract || type.IsInterface;
}