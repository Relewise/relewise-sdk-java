# relewise-sdk-java [![relewise-sdk](https://maven-badges.herokuapp.com/maven-central/com.relewise.client/relewise-sdk/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.relewise.client/relewise-sdk) [![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE) [![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/Relewise/relewise-sdk-php/pulls)

Java SDK for Relewise. Find detailed usage examples on our [docs site](https://docs.relewise.com/docs/examples/java/).

## Authentication

API-key authentication remains available through the existing client constructors:

```java
var tracker = new Tracker(datasetId, apiKey, "https://api.relewise.com");
```

### OAuth client credentials (server-side only)

Backend applications can authenticate with OAuth 2.0 Client Credentials instead of an API key. Keep the client secret on the server and never include it in browser or other client-side code. OAuth requires the dataset's HTTPS server URL; credentials, query strings, and fragments are not allowed in that URL.

```java
var credentials = new OAuthClientCredentials(oauthClientId, oauthClientSecret);
var tracker = new Tracker(datasetId, credentials, relewiseServerUrl);
```

Create the Relewise client once and reuse it for subsequent requests. Each client instance owns an in-memory token provider which acquires a token on the first request, shares it between concurrent requests, renews it shortly before expiry, and retries an API request once if the server reports `Bearer error="invalid_token"`. Creating a new client creates a new token cache and can cause another token request.

The same credentials type can be passed to `Searcher`, `Recommender`, and `SearchAdministrator`.

## Installation

Install via Maven.

```XML
<dependency>
    <groupId>com.relewise.client</groupId>
    <artifactId>relewise-sdk</artifactId>
    <version>1.8.0</version>
</dependency>
```

## Contributing
Pull requests are always welcome.
Please fork this repository and make a PR when you are ready with your contribution.

Otherwise you are welcome to open an Issue in our issue tracker.

## License
relewise-sdk-java is licensed under the MIT license

## Local Development
Check [DEVELOPMENT.md](./DEVELOPMENT.md) for details on running this project locally for development.

The opt-in OAuth integration test uses `DATASET_ID`, `OAUTH_CLIENT_ID`, `OAUTH_CLIENT_SECRET`, and optionally `SERVER_URL` from the environment. It is skipped when the OAuth variables are absent.

## Publish
Check [PUBLISH.md](./PUBLISH.md) for details about the release workflow and how to troubleshoot it.
