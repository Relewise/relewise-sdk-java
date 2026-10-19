"""Exercise the actual workflow change check against a temporary Git repository."""
import os
from pathlib import Path
import shutil
import subprocess
import tempfile
import unittest

WORKFLOW = Path(__file__).parent / "workflows/generate-api-version.yml"
SOURCE = "src/src/main/java/com/relewise/client/model/Example.java"


@unittest.skipUnless(shutil.which("git") and shutil.which("pwsh"), "git and pwsh required")
class GeneratedChangesTests(unittest.TestCase):
    def setUp(self):
        self.temp = tempfile.TemporaryDirectory()
        self.addCleanup(self.temp.cleanup)
        self.root = Path(self.temp.name)
        self.git("init", "-q")
        self.git("config", "user.email", "test@example.invalid")
        self.git("config", "user.name", "Workflow test")
        self.write(SOURCE, "original")
        self.write("src/pom.xml", "1.15.0")
        self.write("Generator/Generator.csproj", "*")
        self.git("add", ".")
        self.git("commit", "-qm", "baseline")

    def git(self, *args):
        return subprocess.run(["git", *args], cwd=self.root, check=True, capture_output=True)

    def write(self, name, content):
        path = self.root / name
        path.parent.mkdir(parents=True, exist_ok=True)
        path.write_text(content)

    def check(self):
        workflow = WORKFLOW.read_text()
        step = workflow.split("      - name: Check generated changes\n", 1)[1].split("      - name:", 1)[0]
        script = step.split("        run: |\n", 1)[1]
        script = "\n".join(line[10:] for line in script.splitlines())
        self.write("check.ps1", script)
        env = dict(os.environ, API_VERSION="1.320.0", GITHUB_OUTPUT=str(self.root / "output"),
                   GITHUB_STEP_SUMMARY=str(self.root / "summary"))
        subprocess.run(["pwsh", "-NoProfile", "-File", str(self.root / "check.ps1")],
                       cwd=self.root, env=env, check=True, capture_output=True)
        return (self.root / "output").read_text().strip()

    def test_unchanged_generated_sources_skip(self):
        self.assertEqual("has_changes=false", self.check())

    def test_version_only_and_generator_pin_do_not_trigger_pr(self):
        self.write("src/pom.xml", "1.16.0")
        self.write("Generator/Generator.csproj", "[1.320.0]")
        self.assertEqual("has_changes=false", self.check())

    def test_changed_generated_source_triggers_pr(self):
        self.write(SOURCE, "new context value")
        self.assertEqual("has_changes=true", self.check())

    def test_new_generated_source_triggers_pr(self):
        self.write("src/src/main/java/com/relewise/client/model/ContextValue.java", "new type")
        self.assertEqual("has_changes=true", self.check())

    def test_deleted_generated_source_triggers_pr(self):
        (self.root / SOURCE).unlink()
        self.assertEqual("has_changes=true", self.check())

    def test_check_precedes_bump_and_guards_followup_work(self):
        workflow = WORKFLOW.read_text()
        self.assertLess(workflow.index("name: Generate Java classes"), workflow.index("name: Check generated changes"))
        self.assertLess(workflow.index("name: Check generated changes"), workflow.index("name: Update Maven package version"))
        for name in ["Set up JDK 17", "Resolve next Maven package version", "Update Maven package version", "Build",
                     "Load version into generated .properties file", "Seed integration fixtures", "Test", "Create pull request"]:
            self.assertIn(f"      - name: {name}\n        if: steps.changes.outputs.has_changes == 'true'\n", workflow)
        self.assertIn("git add -A src\n", workflow)
        self.assertNotIn("git add -A Generator", workflow)


if __name__ == "__main__":
    unittest.main()
