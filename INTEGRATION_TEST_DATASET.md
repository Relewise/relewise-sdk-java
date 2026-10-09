# Java SDK integration dataset

CI, API-version generation, and release publishing run integration tests against the dedicated dataset selected by `DATASET_ID` and `API_KEY`. Integration fixtures use stable `java-sdk-` IDs and retain their products, categories, content, users, and activity between runs, like the JavaScript SDK integration tests. Ordinary tracking tests update their existing fixtures. Administrative actions are scoped to their own fixtures.

Run the seed before the ordinary Maven test suite:

```powershell
mvn --batch-mode -Dtest=IntegrationSeed test --file src/pom.xml
mvn --batch-mode test --file src/pom.xml
```

`IntegrationSeed` is invoked explicitly and is not discovered by the ordinary test suite. It creates or updates the search, facet, and filter products and tracks a view for the persistent search user. Only seeding waits for initial indexing, through public search requests with a five-minute deadline. The compact-product creation test is the exception: it uses disposable random IDs, waits for its new product to be searchable, verifies the returned properties, and deletes only that product and category.

Before switching to a dedicated dataset:

- Create a `default` search index with `en-US` and `da-dk` enabled. Include product and product-category display names with clear-text parsers, and make product `Description` data searchable. Search-administrator tests only read the index, so ordinary test runs do not mark it stale.
- Create an API key for that dataset that can search, request recommendations, track data, and administer search indexes. Keep the key in the repository's `INTEGRATION_TESTS_DATASET_API_KEY` Actions secret.
- Run seeding and the full Maven test suite against the new dataset before switching the release workflow. Recommendation and prediction tests verify the SDK response shape because nonempty results depend on asynchronous models and retained activity.

The workflows use dataset `24e8aba9-1e21-46b2-8fad-6fffa956bd3b` at `https://sandbox-api.relewise.com/`. Configure that dataset's API key as the repository's `INTEGRATION_TESTS_DATASET_API_KEY` Actions secret before running them. All three workflows seed before running tests and use one concurrency group so they do not run against the same dataset simultaneously. No UI index rebuild or candidate-cache refresh is required.
