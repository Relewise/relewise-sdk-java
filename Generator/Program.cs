using Generator;
using Relewise.Client;
using Relewise.Client.Requests;
using Relewise.Client.Responses;
using System.Reflection;

if (args.Length is not 1)
{
    throw new ArgumentException("There needs to be parsed exactly one parameter to this program which is the path to where the class files should be generated.");
}

string basePath = args[0];
if (basePath.EndsWith("/"))
{
    basePath = basePath[..^1];
}

var assembly = Assembly.GetAssembly(typeof(ClientBase));
if (assembly is null)
{
    throw new ArgumentException("Could not load Relewise Client assembly.");
}

var javaWriter = new JavaWriter(assembly, basePath);

javaWriter.WriteTypes(assembly
    .GetTypes()
    .Where(type => type.IsSubclassOf(typeof(LicensedRequest))));

javaWriter.WriteTypes(assembly
    .GetTypes()
    .Where(type => type.IsSubclassOf(typeof(TimedResponse))));

//var javaClientWriter = new JavaClientWriter(phpWriter);

//javaClientWriter.GenerateClientClass(typeof(Tracker), new[] { "Track" });
//javaClientWriter.GenerateClientClass(typeof(Searcher), new[] { "Search", "Predict", "Batch" });
//javaClientWriter.GenerateClientClass(typeof(Recommender), new[] { "Recommend" });
//javaClientWriter.GenerateClientClass(typeof(SearchAdministrator), new[] { "Delete", "Save", "Load" });

if (javaWriter.MissingTypeDefinitions.Count > 0)
{
    Console.WriteLine("We are missing these types from generation as they were not supported with the current implementation.");
    foreach (var typeDefinition in javaWriter.MissingTypeDefinitions)
    {
        Console.WriteLine($"- {javaWriter.TypeName(typeDefinition)}");
    }
}
else
{
    Console.WriteLine("All types referenced or otherwise traversed were successfully generated.");
}