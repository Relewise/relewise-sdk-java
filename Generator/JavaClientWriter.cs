using Generator.Extensions;
using Newtonsoft.Json;
using Relewise.Client.Requests;
using System.CodeDom.Compiler;
using System.Reflection;

namespace Generator;

public class JavaClientWriter
{
    private readonly JavaWriter javaWriter;

    public JavaClientWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void GenerateClientClass(Type clientType, string[] clientMethodNames)
    {
        using var streamWriter = File.CreateText($"{javaWriter.BasePath}/{clientType.Name}.java");
        using var writer = new IndentedTextWriter(streamWriter);

        var clientMethods = clientType
            .GetMethods()
            .Where(info => info.DeclaringType == clientType
                           && clientMethodNames.Contains(info.Name)
                           && info.GetParameters().Length is 1
                           && !info.GetParameters().First().ParameterType.IsGenericType
                           && !info.GetParameters().First().ParameterType.IsArray
                           && info.GetParameters().First().ParameterType.IsClass
                           && info.GetParameters().First().ParameterType.IsAssignableTo(typeof(LicensedRequest))
            )
            .SelectMany(info => info.GetParameters().First().ParameterType.IsAbstract
                ? javaWriter.Assembly
                    .GetTypes()
                    .Where(derivingType => !derivingType.IsGenericType && derivingType.IsAssignableTo(info.GetParameters().First().ParameterType))
                    .Select(derivedType => (
                        methodName: info.Name.ToCamelCase(),
                        parameterType: javaWriter.TypeName(derivedType),
                        parameterClrType: derivedType,
                        parameterName: info.GetParameters().First().Name!,
                        returnType: info.ReturnType))
                : new[]
                {
                (
                    methodName: info.Name.ToCamelCase(),
                    parameterType: javaWriter.TypeName(info.GetParameters().First().ParameterType),
                    parameterClrType: info.GetParameters().First().ParameterType,
                    parameterName: info.GetParameters().First().Name!,
                    returnType: info.ReturnType)
                })
            .ToArray();

        var requiresBatchingImports = clientMethods.Any(method =>
            (method.parameterClrType.GetProperty("Requests")
             ?? method.parameterClrType.GetProperty("Items")) is { } property
            && GetCollectionElementType(property.PropertyType) is not null);


        int timeout = 5;
        if (clientType.GetConstructor(new[] { typeof(Guid), typeof(string), typeof(int) }) is { } constructor
            && constructor.GetParameters().Last() is { HasDefaultValue: true } requestTimeoutInSecondsParameter)
        {
            timeout = (int)requestTimeoutInSecondsParameter.DefaultValue!;
        }


        writer.WriteLine($"""
package {Constants.Namespace};

import {Constants.Namespace}.{Constants.GenerationFolderPath}.*;
import {Constants.Namespace}.infrastructure.*;
import java.io.IOException;
{(requiresBatchingImports ? "import java.util.*;\n" : "")}
""");

        writer.WriteLine($"public class {clientType.Name} extends RelewiseClient");
        writer.WriteLine("{");
        writer.Indent++;
        writer.WriteLine($"public {clientType.Name}(String datasetId, String apiKey, String serverUrl) {{ super(datasetId, apiKey, serverUrl, {timeout}); }}");
        writer.WriteLine($"public {clientType.Name}(String datasetId, String apiKey, String serverUrl, int timeout) {{ super(datasetId, apiKey, serverUrl, timeout); }}");

        foreach (var method in clientMethods.DistinctBy(method => method.parameterType))
        {
            writer.WriteLine("");
            writer.WriteLine($"public {(method.returnType == typeof(void) ? "void" : javaWriter.TypeName(method.returnType))} {method.methodName}({method.parameterType} {method.parameterName}) throws IOException, InterruptedException, ClientException {{");
            writer.Indent++;
            var collectionProperty = method.parameterClrType.GetProperty("Requests")
                ?? method.parameterClrType.GetProperty("Items");

            if (collectionProperty is not null && GetCollectionElementType(collectionProperty.PropertyType) is { } collectionElementType)
            {
                WriteBatchedMethod(writer, method.parameterClrType, method.parameterType, method.parameterName, method.returnType, collectionProperty, collectionElementType);
            }
            else if (method.returnType == typeof(void))
            {
                writer.WriteLine($"makeRequestAndValidate(\"{method.parameterType}\", {method.parameterName}, {javaWriter.TypeName(method.returnType)}.class);");
            }
            else
            {
                writer.WriteLine($"return makeRequestAndValidate(\"{method.parameterType}\", {method.parameterName}, {javaWriter.TypeName(method.returnType)}.class);");
            }
            writer.Indent--;
            writer.WriteLine("}");
        }
        writer.Indent--;
        writer.WriteLine("}");
    }

    private void WriteBatchedMethod(
        IndentedTextWriter writer,
        Type parameterClrType,
        string parameterType,
        string parameterName,
        Type returnType,
        PropertyInfo collectionProperty,
        Type collectionElementType)
    {
        var collectionGetter = $"{parameterName}.get{collectionProperty.Name}()";
        var emptyCheck = collectionProperty.PropertyType.IsArray
            ? $"{collectionGetter}.length == 0"
            : $"{collectionGetter}.isEmpty()";

        writer.WriteLine($"if ({collectionGetter} == null || {emptyCheck}) {{");
        writer.Indent++;
        writer.WriteLine(returnType == typeof(void) ? "return;" : "return null;");
        writer.Indent--;
        writer.WriteLine("}");

        if (returnType != typeof(void))
        {
            writer.WriteLine($"{javaWriter.TypeName(returnType)} aggregatedResponse = null;");
        }

        writer.WriteLine($"for (var batch : createBatches({collectionGetter})) {{");
        writer.Indent++;
        writer.WriteLine($"var chunkedRequest = new {parameterType}();");
        foreach (var property in GetCopyableProperties(parameterClrType, collectionProperty))
        {
            writer.WriteLine($"chunkedRequest.set{property.Name}({CopyPropertyValue(parameterName, property)});");
        }
        writer.WriteLine($"chunkedRequest.set{collectionProperty.Name}(batch.toArray(new {javaWriter.TypeName(collectionElementType)}[0]));");

        if (returnType == typeof(void))
        {
            writer.WriteLine($"makeRequestAndValidate(\"{parameterType}\", chunkedRequest, Void.class);");
        }
        else
        {
            writer.WriteLine($"var chunkResponse = makeRequestAndValidate(\"{parameterType}\", chunkedRequest, {javaWriter.TypeName(returnType)}.class);");
            writer.WriteLine("if (chunkResponse == null) {");
            writer.Indent++;
            writer.WriteLine("continue;");
            writer.Indent--;
            writer.WriteLine("}");
            writer.WriteLine("if (aggregatedResponse == null) {");
            writer.Indent++;
            writer.WriteLine("aggregatedResponse = chunkResponse;");
            writer.Indent--;
            writer.WriteLine("}");
            writer.WriteLine("else {");
            writer.Indent++;
            WriteResponseAggregation(writer, returnType);
            writer.Indent--;
            writer.WriteLine("}");
        }

        writer.Indent--;
        writer.WriteLine("}");

        if (returnType != typeof(void))
        {
            writer.WriteLine("return aggregatedResponse;");
        }
    }

    private void WriteResponseAggregation(IndentedTextWriter writer, Type returnType)
    {
        var responsesProperty = returnType.GetProperty("Responses");
        if (responsesProperty is null || GetCollectionElementType(responsesProperty.PropertyType) is not { } responseElementType)
        {
            return;
        }

        var responseElementTypeName = javaWriter.TypeName(responseElementType);
        writer.WriteLine("if (chunkResponse.getResponses() != null) {");
        writer.Indent++;
        writer.WriteLine("var responses = aggregatedResponse.getResponses() == null");
        writer.Indent++;
        writer.WriteLine($"? new ArrayList<{responseElementTypeName}>()");
        writer.WriteLine(": new ArrayList<>(Arrays.asList(aggregatedResponse.getResponses()));");
        writer.Indent--;
        writer.WriteLine("responses.addAll(Arrays.asList(chunkResponse.getResponses()));");
        writer.WriteLine($"aggregatedResponse.setResponses(responses.toArray(new {responseElementTypeName}[0]));");
        writer.Indent--;
        writer.WriteLine("}");
    }

    private string CopyPropertyValue(string parameterName, PropertyInfo property)
    {
        var getter = $"{parameterName}.get{property.Name}()";
        return property.PropertyType.IsGenericType
               && property.PropertyType.GetGenericTypeDefinition() == typeof(List<>)
               && property.PropertyType.GenericTypeArguments is [var elementType]
            ? $"{getter} == null ? null : {getter}.toArray(new {javaWriter.TypeName(elementType)}[0])"
            : getter;
    }

    private static PropertyInfo[] GetCopyableProperties(Type parameterType, PropertyInfo collectionProperty) => parameterType
        .GetProperties()
        .Where(info => info.Name != collectionProperty.Name
                       && info.MemberType is MemberTypes.Property
                       && info.GetIndexParameters().Length is 0
                       && info.GetMethod is { IsAbstract: false, IsPublic: true, IsStatic: false }
                       && info.SetMethod is { IsAbstract: false, IsPublic: true, IsStatic: false }
                       && !Attribute.IsDefined(info, typeof(JsonIgnoreAttribute))
                       && info.Name != "Custom")
        .ToArray();

    private static Type? GetCollectionElementType(Type type) => type.IsArray
        ? type.GetElementType()
        : type.IsGenericType && type.GetGenericTypeDefinition() == typeof(List<>)
            ? type.GenericTypeArguments[0]
            : null;
}
