# Development

This document describes the process for running this application on your local computer.

## Getting started

This project uses .NET to automatically generate the models used in the Java client.

To run the generator you need to have .NET 10 or newer installed on your machine. [Download .NET 10](https://dotnet.microsoft.com/en-us/download/dotnet/10.0)

Then to generate the models and clients of the SDK run `generate.ps1` if you're on Windows, else run `generate.sh`.
## Development experience
For the best experience with developing on the SDK we recommend to use a dedicated Java IDE.

## Automated API updates

The Generate API Version workflow requires `api-version` (for example `1.320.0`)
and `trello-card-url`. The API release workflow supplies the published version.
A separate readiness job retries an exact NuGet restore for at most 60 minutes,
with a 65-minute job timeout, before entering the shared integration dataset queue.
Generation restores and verifies the same exact version again on its own runner.
There is no fallback to an older or newer package. Local generation scripts retain
their existing default of using the latest available package.

If readiness times out, investigate NuGet publication and rerun the failed workflow
with the same inputs once the package is available. There is no automatic retry
beyond that deadline; the next API release is not required to recover this run.
Merge support for `api-version` before enabling that input in the API dispatcher.

Offline workflow regression tests (no API calls or SDK generation):

```sh
bash .github/test_restore_generator.sh
pwsh -NoProfile -File .github/test_generated_changes.ps1
```

Java generation checks for actual generated source changes before bumping the
Maven version. If the generated Java sources are unchanged, version updates,
Maven builds, integration tests, and pull request creation are skipped. Previously
the workflow bumped `src/pom.xml` first and then inspected all of `src`, so the
version bump itself always counted as a change and could produce version-only PRs.

The restore helper targets Ubuntu CI and uses Bash, GNU timeout, and Python 3.
Each restore attempt is limited to 120 seconds, with up to five additional seconds
for forced termination. Offline regression tests run in a separate CI workflow.
