# Publish
These are notes that can be necessary for the future in order to publish.

The publishing itself is automated, but as with all software, when you don't touch it for a long time, things might still break due to external factors.

## GitHub action for publishing
There is a GitHub workflow that reacts to a new release being made on GitHub. Before making the new release, you need to update the POM file to match the new version. The POM file is located at `src/pom.xml`, and in there you need to update the version tag. The new version should follow Semantic versioning. An example could be `1.3.0`. After you have bumped the POM file version, you are ready to make the release. The release should be tagged with a new tag that has the letter `v` prepended. An example could be `v1.3.0`, and the name of the release should be the same as the release version.

## Central Maven Repository credentials
The previously mentioned workflow runs the tests and generates the Java Doc just like a normal CI/CD run. After this, it signs the artifacts and publishes them to Maven. There are many repositories to choose from when publishing to Maven, but we have picked the most used, which is `Maven Central Repository` by Sonatype. In the workflow file that publishes, you can see that it uses 2 secrets that are specific to publishing to the Nexus called `JRELEASER_NEXUS2_USERNAME ` and `JRELEASER_NEXUS2_PASSWORD `. These can be regenerated or revoked by visiting [https://central.sonatype.com/account](https://central.sonatype.com/account). The login for that platform is associated with the email `hello@relewise.com`.

## Nexus Repository Manager
Sometimes the publish will fail; the cause for this can be many. A classic error you could get in the output of the workflow could look like this:
```log
[INFO]   [nexus2] Closing staging repository comrelewiseclient-1013
[INFO]   [nexus2] This operation may take some time. Please wait.
[INFO]   [nexus2] Attempt 1 of 61
[INFO]   [nexus2] Attempt 2 of 61
[INFO]   [nexus2] Attempt 3 of 61
[INFO]   [nexus2] Attempt 4 of 61
[INFO]   [nexus2] Attempt 5 of 61
[INFO]   [nexus2] Attempt 6 of 61
[INFO]   [nexus2] Attempt 7 of 61
[INFO]   [nexus2] Attempt 8 of 61
[INFO]   [nexus2] Attempt 9 of 61
[INFO]   [nexus2] Attempt 10 of 61
[INFO]   [nexus2] Attempt 11 of 61
[INFO] Writing output properties to target/jreleaser/output.properties
Error:  JReleaser failed after 02:14 m
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  03:03 min
[INFO] Finished at: 2025-04-10T11:50:45Z
[INFO] ------------------------------------------------------------------------
Error:  Failed to execute goal org.jreleaser:jreleaser-maven-plugin:1.4.0:deploy (default-cli) on project relewise-sdk: Execution default-cli of goal org.jreleaser:jreleaser-maven-plugin:1.4.0:deploy failed: Unexpected error: Could not close staging repository comrelewiseclient-1013: repository comrelewiseclient-1013 is not in expected state(s). Expected one of [CLOSED], actual is OPEN -> [Help 1]
Error:  
Error:  To see the full stack trace of the errors, re-run Maven with the -e switch.
Error:  Re-run Maven using the -X switch to enable full debug logging.
Error:  
Error:  For more information about the errors and possible solutions, please read the following articles:
Error:  [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginExecutionException
```

This simply states that it had instructed the nexus to close the staging repository. It then tried to check if it had actually closed it 11 times, but in the end, it gave up. To find more details about why this happens, we could check the `Nexus Repository Manager`. You can find it at https://s01.oss.sonatype.org/ using the same credentials as for the `Maven Central Repository`.

Here, we can open the Staging Repositories tab to see the current open staging repositories. The repositories that were not successful in releasing will be listed here. When selecting one of them, we can see what activities have been started for it. Often you will see that it was successful in the `open` action, but not in the `close` action. If you expand the `close` action you might see a list of sub-actions like this:

- 🔎 **Evaluating rules:** Central Sync Requirements
- 🔎 **Evaluating rule:** Sources Validation  
  - ✅ **Passed:** Sources Validation
- 🔎 **Evaluating rule:** POM Validation  
  - ✅ **Passed:** POM Validation
- 🔎 **Evaluating rule:** Javadoc Validation  
  - ✅ **Passed:** Javadoc Validation
- 🔎 **Evaluating rule:** Profile target matcher  
  - ✅ **Passed:** Profile target matcher
- 🔎 **Evaluating rule:** SBOM Report  
  - ✅ **Passed:** SBOM Report
- 🔎 **Evaluating rule:** Checksum Validation  
  - ✅ **Passed:** Checksum Validation
- 🔎 **Evaluating rule:** Archives must not contain insecure paths  
  - ✅ **Passed:** Archives must not contain insecure paths
- 🔎 **Evaluating rule:** Signature Validation  
  - ❌ **Failed:** Signature Validation
- ❌ **1 rule failed:** Central Sync Requirements
- ❌ **Close failed**

In this case it failed the signature validation because it could not find a key with our id in any of its registered key servers. This could be because the encryption key had expired. We will show how to fix this in the next section.

## Signing the artifacts
The signing of the artifacts before they are pushed to the Nexus repository is also done for us as a part of the workflow, but the workflow needs some information about what cryptographic key to use for the signing. These three parts are also parsed to the workflow through secrets. They are called `JRELEASER_GPG_PASSPHRASE`, `JRELEASER_GPG_SECRET_KEY`, and `JRELEASER_GPG_PUBLIC_KEY`.

If the cryptographic key has expired then we need to create a new. If GPG is not installed locally on Windows, install [Gpg4win](https://gpg4win.org/download.html) first. After installing it, open PowerShell or Git Bash and verify that `gpg` is available:

```bash
gpg --version
```

Run this command to create a new key:

```bash
gpg --full-generate-key
```

Use these values when prompted:

- Type: `RSA and RSA`
- Key size: `3072` or `4096`
- Expiry: for example `2y`
- Name: `Relewise`
- Email: `hello@relewise.com`

During the generation it prompts you for a pass phrase, please use some long random string for this. That pass phrase is our `JRELEASER_GPG_PASSPHRASE`, so please save that.

Once it completes it will print out the ID/fringerprint for your key. An example could be:

```log
public and secret key created and signed.

pub   rsa3072 2025-04-10 [SC] [expires: 2026-04-10]
      E496E2704059B23C82962B146FF7820B61B50335
uid                      Relewise (Java SDK) <hello@relewise.com>
sub   rsa3072 2025-04-10 [E] [expires: 2026-04-10]
```

You can also list the secret keys afterwards to find the new fingerprint:

```bash
gpg --list-secret-keys --keyid-format LONG
```

Export the public key to a file:

```bash
gpg --armor --output public-key.asc --export E496E2704059B23C82962B146FF7820B61B50335
```

Export the secret key to a file (this prompts for the passphrase):

```bash
gpg --armor --output private-key.asc --export-secret-keys E496E2704059B23C82962B146FF7820B61B50335
```

Update the GitHub repository secrets:

- `JRELEASER_GPG_PASSPHRASE`: the passphrase used when creating the key.
- `JRELEASER_GPG_SECRET_KEY`: the full contents of `private-key.asc`, including the `BEGIN PGP PRIVATE KEY BLOCK` and `END PGP PRIVATE KEY BLOCK` lines.
- `JRELEASER_GPG_PUBLIC_KEY`: the full contents of `public-key.asc`, including the `BEGIN PGP PUBLIC KEY BLOCK` and `END PGP PUBLIC KEY BLOCK` lines.

Finally, publish the public key. The most reliable way on Windows is to upload `public-key.asc` manually at [https://keys.openpgp.org/upload](https://keys.openpgp.org/upload). After uploading, complete the email verification sent to `hello@relewise.com`; otherwise the key may not be discoverable by email.
