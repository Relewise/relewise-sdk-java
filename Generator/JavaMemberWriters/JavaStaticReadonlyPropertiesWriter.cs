using System.CodeDom.Compiler;
using System.Globalization;
using System.Reflection;
using static System.Text.Json.JsonSerializer;

namespace Generator.JavaMemberWriters;

public class JavaStaticReadonlyPropertiesWriter
{
    private readonly JavaWriter javaWriter;

    public JavaStaticReadonlyPropertiesWriter(JavaWriter javaWriter)
    {
        this.javaWriter = javaWriter;
    }

    public void Write(IndentedTextWriter writer, Type classType, (PropertyInfo type, string propertyTypeName, string propertyName, string lowerCaseName)[] propertyInformation)
    {
        foreach (var (info, propertyTypeName, _, lowerCaseName) in propertyInformation)
        {
            var getAccessorResult = info.GetAccessors()[0].Invoke(null, BindingFlags.GetProperty, null, null, CultureInfo.InvariantCulture);
            if (getAccessorResult != null)
            {
                throw new NotImplementedException($"We have not implemented support for static readonly properties that return other values than 'null' and the result of the property '{classType.Name}.{lowerCaseName}' was '{Serialize(getAccessorResult)}'.");
            }
            writer.WriteLine($"public static final {propertyTypeName} {lowerCaseName.ToUpper()} = null;");
        }
    }
}