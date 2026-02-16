---
name: update-sdk
description: Regenerate relewise-sdk-java from the Generator project with a strict git and PR flow. Use when asked to update generated Java SDK code. Require a Trello card URL, run clean-main preflight checks, create a timestamped chore branch, run generation and validation, then push and open a PR with the Trello URL as the first line.
---

# Update SDK (Java)

## Goal
Regenerate SDK code in `src/src/main/java/com/relewise/client` from `Generator`, validate the result, and deliver a reviewed PR to `main`.

## Required Input
Require a Trello card URL before running SDK update work.

If the request does not include a Trello URL:
- Ask for it.
- Do not continue until it is provided.

## Preflight Git Safety
Run from repository root.

1. Require a clean worktree:
```powershell
git status --porcelain
```
Abort when any output exists.

2. Ensure `origin` exists:
```powershell
git remote get-url origin
```
Abort on failure.

3. Fetch refs:
```powershell
git fetch origin --prune
```
Abort on failure.

4. Switch to `main`:
```powershell
git switch main
```
Abort if switch is not safe.

5. Fast-forward `main`:
```powershell
git pull --ff-only origin main
```
Abort if not fast-forward.

Do not continue when any preflight step fails.

## Branch Creation
Use a timestamped branch:

```powershell
$stamp = Get-Date -Format 'yyyyMMdd-HHmm'
$branchName = "chore/update-sdk-$stamp"
```

Abort if branch exists:

```powershell
git show-ref --verify --quiet "refs/heads/$branchName"
git ls-remote --exit-code --heads origin $branchName
```

Create and switch:

```powershell
git switch -c $branchName
```

## SDK Regeneration
Regenerate SDK code:

```powershell
./generate.ps1
```

Alternative on non-Windows:
```bash
./generate.sh
```

## Expected Changes Check
Inspect changed files and ensure the update is coherent.

Expected change locations:
- `src/src/main/java/com/relewise/client/model/*` generated model files
- generated client surfaces in `src/src/main/java/com/relewise/client/*`
- generator changes only when intentionally included

If unrelated files changed unexpectedly, stop and investigate.

## Validation (Required)
Run from repository root:

1. Package:
```powershell
mvn --batch-mode -DskipTests package --file src/pom.xml
```

2. Resource/version metadata:
```powershell
mvn resources:resources --file src/pom.xml
```

3. Tests:
```powershell
mvn --batch-mode test --file src/pom.xml
```

Integration-heavy tests depend on `DATASET_ID` and `API_KEY`.

When credentials are unavailable, run a credential-independent subset and report integration-heavy coverage as not run:

```powershell
mvn --batch-mode -Dtest=ClientConstructionTest,DateTimeSerializationTest test --file src/pom.xml
```

## Acceptance Criteria
Treat update as successful only when:
- generation succeeds (`generate.ps1` or `generate.sh`)
- package/resources commands succeed
- test command(s) pass for available credentials
- changed files are expected and reviewable

## Commit, Push, and Pull Request
1. Commit SDK update changes:
```powershell
git add .
git commit -m "chore(java): update sdk generation ($stamp)"
```

2. Push branch:
```powershell
git push -u origin $branchName
```

3. Create PR to `main`.

Preferred flow with GitHub CLI:
```powershell
$prBodyPath = ".\\update-sdk-pr-body.md"
$prBodyTemplate = @'
__TRELLO_CARD_URL__


## Summary
- Regenerated Java SDK code via Generator
- Updated generated models/client surfaces

## Validation
- `./generate.ps1`: <result>
- `mvn --batch-mode -DskipTests package --file src/pom.xml`: <result>
- `mvn resources:resources --file src/pom.xml`: <result>
- `mvn --batch-mode test --file src/pom.xml`: <result or not run>
- `mvn --batch-mode -Dtest=ClientConstructionTest,DateTimeSerializationTest test --file src/pom.xml`: <result or not run>

## Notes
- <known issues or limitations>
'@
$prBody = $prBodyTemplate -replace '__TRELLO_CARD_URL__', $TrelloCardUrl
Set-Content -Path $prBodyPath -Value $prBody -Encoding utf8

$prUrl = gh pr create --base main --head $branchName --title "chore(java): update sdk generation ($stamp)" --body-file $prBodyPath
if ($LASTEXITCODE -ne 0) { throw 'gh pr create failed.' }
Write-Host "PR URL: $prUrl"
```

Manual fallback:
```powershell
git push -u origin $branchName
Write-Host "Create PR: https://github.com/Relewise/relewise-sdk-java/compare/main...$branchName?expand=1"
Write-Host "PR title: chore(java): update sdk generation ($stamp)"
Write-Host "PR body file: $prBodyPath"
```

Keep the Trello URL as the first line of the PR description.
Write the PR body file as UTF-8 to avoid symbol corruption in GitHub-rendered text.

## Output Expectations
Provide a final summary with:
- Trello URL used
- branch name
- changed file groups
- validation command results
- pushed branch URL
- PR URL, or exact manual fallback instructions
