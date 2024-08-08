namespace Generator.Extensions;

public static class TypeExtensions
{
    public static bool IsConcreteTypeOfSomethingPolymorphic(this Type type) => ((type.BaseType is not null && type.BaseType != typeof(object)) || type.GetInterfaces().Length > 0) && !type.IsAbstract;
    public static bool IsMaybeBaseClassOfSomethingPolymorphic(this Type type) => type.IsAbstract || type.IsInterface;
}