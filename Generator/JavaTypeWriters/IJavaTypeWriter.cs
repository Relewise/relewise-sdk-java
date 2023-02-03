using System.CodeDom.Compiler;

namespace Generator.JavaTypeWriters;

public interface IJavaTypeWriter
{
    public bool CanWrite(Type type);
    public void Write(IndentedTextWriter writer, Type type, string typeName);
}