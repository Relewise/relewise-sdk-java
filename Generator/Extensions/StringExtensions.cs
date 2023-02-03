namespace Generator.Extensions;

public static class StringExtensions
{
    public static string ToCamelCase(this string value) => char.ToLower(value[0]) + value[1..];

    public static string SingularIfPossible(this string value)
    {
        if (value[^3..] == "ies")
        {
            return $"{value[..^3]}y";
        }

        if (value[^1] == 's')
        {
            return value[..^1];
        }

        return value;
    }

    public static string RemoveNullable(this string value) => value.Length > 10 ? value[..10] is "@Nullable " ? value[10..] : value : value;
}