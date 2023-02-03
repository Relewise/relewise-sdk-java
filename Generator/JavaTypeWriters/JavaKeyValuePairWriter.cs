using System.CodeDom.Compiler;

namespace Generator.JavaTypeWriters;

internal class JavaKeyValuePairWriter : IJavaTypeWriter
{
    private readonly JavaWriter phpWriter;

    public JavaKeyValuePairWriter(JavaWriter phpWriter)
    {
        this.phpWriter = phpWriter;
    }

    public bool CanWrite(Type type) => type.IsGenericType && type.GetGenericTypeDefinition() == typeof(KeyValuePair<,>);

    public void Write(IndentedTextWriter writer, Type type, string typeName)
    {
        writer.WriteLine($"""
<?php declare(strict_types=1);

namespace {Constants.Namespace};

use DateTime;

""");
        writer.WriteLine($"class {typeName}");
        writer.WriteLine("{");
        writer.Indent++;

        writer.WriteLine($"public {phpWriter.TypeName(type.GenericTypeArguments[0])} $key;");
        writer.WriteLine($"public {phpWriter.TypeName(type.GenericTypeArguments[1])} $value;");

        writer.WriteLine($"function __construct({phpWriter.TypeName(type.GenericTypeArguments[0])} $key, {phpWriter.TypeName(type.GenericTypeArguments[1])} $value)");
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine("$this->key = $key;");
        writer.WriteLine("$this->value = $value;");
        writer.Indent--;
        writer.WriteLine("}");

        writer.WriteLine($"public static function create({phpWriter.TypeName(type.GenericTypeArguments[0])} $key, {phpWriter.TypeName(type.GenericTypeArguments[1])} $value) : {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine($"return new {typeName}($key, $value);");
        writer.Indent--;
        writer.WriteLine("}");

        writer.WriteLine($"public static function hydrate(array $arr) : {typeName}");
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine($"return {typeName}::create($arr[\"key\"], $arr[\"value\"]);");
        writer.Indent--;
        writer.WriteLine("}");

        writer.Indent--;
        writer.WriteLine("}");
    }
}