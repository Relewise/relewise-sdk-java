using Generator.Extensions;
using Relewise.Client.Requests;
using System.CodeDom.Compiler;

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
                        parameterName: info.GetParameters().First().Name!,
                        returnType: info.ReturnType))
                : new[]
                {
                (
                    methodName: info.Name.ToCamelCase(),
                    parameterType: javaWriter.TypeName(info.GetParameters().First().ParameterType),
                    parameterName: info.GetParameters().First().Name!,
                    returnType: info.ReturnType)
                })
            .ToArray();


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
            if (method.returnType == typeof(void))
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
}