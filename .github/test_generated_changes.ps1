#requires -Version 7.0
# Exercise the actual workflow change check against isolated Git repositories.
$ErrorActionPreference = 'Stop'
Set-StrictMode -Version Latest

$workflow = (Get-Content (Join-Path $PSScriptRoot 'workflows/generate-api-version.yml') -Raw).Replace("`r`n", "`n")
$source = 'src/src/main/java/com/relewise/client/model/Example.java'
$step = [regex]::Match($workflow, '(?ms)^      - name: Check generated changes\n(?<step>.*?)(?=^      - name:|\z)')
if (-not $step.Success) { throw 'Could not find the workflow generated-changes step.' }
$run = [regex]::Match($step.Groups['step'].Value, '(?ms)^        run: \|\n(?<script>.*)')
if (-not $run.Success) { throw 'Could not extract the workflow PowerShell script.' }
$checkScript = [regex]::Replace($run.Groups['script'].Value, '(?m)^          ', '')
$pwsh = (Get-Command pwsh -ErrorAction Stop).Source
$null = Get-Command git -ErrorAction Stop

function Invoke-TestGit {
    param([string]$Root, [string[]]$Arguments)
    $output = & git -C $Root @Arguments 2>&1
    if ($LASTEXITCODE -ne 0) { throw "Git failed: $output" }
}

function Write-TestFile {
    param([string]$Root, [string]$Name, [string]$Content)
    $path = Join-Path $Root $Name
    $null = New-Item -ItemType Directory -Path (Split-Path $path) -Force
    Set-Content -LiteralPath $path -Value $Content
}

function Invoke-ChangeCheck {
    param([string]$Root)
    $scriptPath = Join-Path $Root 'check.ps1'
    Set-Content -LiteralPath $scriptPath -Value $checkScript
    $start = [System.Diagnostics.ProcessStartInfo]::new($pwsh)
    $start.WorkingDirectory = $Root
    $start.UseShellExecute = $false
    $start.RedirectStandardOutput = $true
    $start.RedirectStandardError = $true
    foreach ($argument in @('-NoProfile', '-File', $scriptPath)) { $start.ArgumentList.Add($argument) }
    $start.Environment['API_VERSION'] = '1.320.0'
    $start.Environment['GITHUB_OUTPUT'] = Join-Path $Root 'output'
    $start.Environment['GITHUB_STEP_SUMMARY'] = Join-Path $Root 'summary'
    $process = [System.Diagnostics.Process]::new()
    $process.StartInfo = $start
    try {
        $null = $process.Start()
        $stdout = $process.StandardOutput.ReadToEndAsync()
        $stderr = $process.StandardError.ReadToEndAsync()
        if (-not $process.WaitForExit(30000)) {
            $process.Kill($true)
            $process.WaitForExit()
            throw 'Workflow change check exceeded 30 seconds.'
        }
        if ($process.ExitCode -ne 0) {
            throw "Workflow change check failed: $($stdout.GetAwaiter().GetResult()) $($stderr.GetAwaiter().GetResult())"
        }
    } finally {
        $process.Dispose()
    }
    return (Get-Content -LiteralPath (Join-Path $Root 'output') -Raw).Trim()
}

$cases = @(
    @{ Name = 'Unchanged generated sources skip'; Expected = 'false'; Mutate = {} }
    @{ Name = 'Maven version and generator pin alone skip'; Expected = 'false'; Mutate = {
        param($root)
        Write-TestFile $root 'src/pom.xml' '1.16.0'
        Write-TestFile $root 'Generator/Generator.csproj' '[1.320.0]'
    } }
    @{ Name = 'Modified generated source triggers update'; Expected = 'true'; Mutate = {
        param($root)
        Write-TestFile $root $source 'new context value'
    } }
    @{ Name = 'Added generated source triggers update'; Expected = 'true'; Mutate = {
        param($root)
        Write-TestFile $root 'src/src/main/java/com/relewise/client/model/ContextValue.java' 'new type'
    } }
    @{ Name = 'Deleted generated source triggers update'; Expected = 'true'; Mutate = {
        param($root)
        Remove-Item -LiteralPath (Join-Path $root $source)
    } }
)

$tempParent = [System.IO.Path]::GetFullPath([System.IO.Path]::GetTempPath())
foreach ($case in $cases) {
    $directoryName = 'relewise-java-generated-changes-' + [guid]::NewGuid().ToString('N')
    $root = Join-Path $tempParent $directoryName
    $null = New-Item -ItemType Directory -Path $root
    try {
        Invoke-TestGit $root @('init', '-q')
        Invoke-TestGit $root @('config', 'user.email', 'test@example.invalid')
        Invoke-TestGit $root @('config', 'user.name', 'Workflow test')
        Write-TestFile $root $source 'original'
        Write-TestFile $root 'src/pom.xml' '1.15.0'
        Write-TestFile $root 'Generator/Generator.csproj' '*'
        Invoke-TestGit $root @('add', '.')
        Invoke-TestGit $root @('-c', 'commit.gpgsign=false', 'commit', '-qm', 'baseline')
        & $case.Mutate $root
        $actual = Invoke-ChangeCheck $root
        $expected = 'has_changes=' + $case.Expected
        if ($actual -cne $expected) { throw "$($case.Name): expected '$expected', got '$actual'." }
        Write-Host "PASS: $($case.Name)"
    } finally {
        # Only remove the exact temporary directory created by this test.
        $resolved = (Resolve-Path -LiteralPath $root).ProviderPath
        $expectedRoot = [System.IO.Path]::GetFullPath((Join-Path $tempParent $directoryName))
        if ($resolved -ne $expectedRoot -or (Split-Path $resolved -Leaf) -ne $directoryName) {
            throw "Refusing to remove unexpected temporary path: $resolved"
        }
        Remove-Item -LiteralPath $resolved -Recurse -Force
    }
}

$generateIndex = $workflow.IndexOf('name: Generate Java classes')
$checkIndex = $workflow.IndexOf('name: Check generated changes')
$bumpIndex = $workflow.IndexOf('name: Update Maven package version')
if ($generateIndex -lt 0 -or $checkIndex -le $generateIndex -or $bumpIndex -le $checkIndex) {
    throw 'Generation must precede the change check, which must precede the Maven version bump.'
}
foreach ($name in @('Set up JDK 17', 'Resolve next Maven package version', 'Update Maven package version', 'Build',
        'Load version into generated .properties file', 'Seed integration fixtures', 'Test', 'Create pull request')) {
    $required = "      - name: $name`n        if: steps.changes.outputs.has_changes == 'true'`n"
    if (-not $workflow.Contains($required)) { throw "Missing generated-change guard on '$name'." }
}
if (-not $workflow.Contains("git add -A src`n") -or $workflow.Contains('git add -A Generator')) {
    throw 'The update commit must stage SDK changes, not generator pin changes.'
}
Write-Host 'PASS: Change check precedes version bump and guards follow-up work'
Write-Host 'All 6 generated-change regression tests passed.'
