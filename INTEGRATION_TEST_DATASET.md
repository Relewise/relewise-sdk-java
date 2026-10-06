# Java SDK integration dataset

CI, API-version generation, and release publishing all run integration tests against the dataset selected by `DATASET_ID` and `API_KEY`. The integration tests create the products, categories, content, users, and activity they need and remove them after each test. Run them against a dedicated SDK dataset so fixed test IDs cannot collide with unrelated data.

Before switching to a dedicated dataset:

- Create a `default` search index with `en-US` and `da-dk` enabled. Include product and product-category display names with clear-text parsers, and make product `Description` data searchable. Search-administrator tests only read the index, so ordinary test runs do not mark it stale.
- Create a master API key for that dataset so the tests can search, track data, and call the UI rebuild and presorter refresh operations. Keep the key in the repository's `INTEGRATION_TESTS_DATASET_API_KEY` Actions secret.
- Run the full Maven test suite against the new dataset before switching the release workflow. After seeding searchable fixtures, search and facet tests synchronously rebuild the `default` index and refresh Fill, Popular, and Fallback presorter caches through master-key UI requests, then wait for their exact fixture IDs. Recommendation and prediction tests verify the SDK response shape because nonempty results depend on asynchronous models and historical activity, not on request serialization.

The workflows use dataset `24e8aba9-1e21-46b2-8fad-6fffa956bd3b` at `https://sandbox-api.relewise.com/`. Configure that dataset's API key as the repository's `INTEGRATION_TESTS_DATASET_API_KEY` Actions secret before running them. These workflows use one concurrency group so they do not run integration tests against the same dataset simultaneously.
