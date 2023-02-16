package com.relewise.client;

import com.relewise.client.factory.UserFactory;
import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class BatchedSearchesTest extends TestBase {
    @Test
    public void testBatchedSearch() throws Exception {
        var searcher = new Searcher(GetDatasetId(), GetApiKey());

        var searchRequestCollection = SearchRequestCollection.create(
            SearchTermPredictionRequest.create(Language.create("en-US"), Currency.create("USD"), UserFactory.anonymous(), "integration test", "", 0),
            ProductSearchRequest.create(Language.create("en-US"), Currency.create("USD"), UserFactory.anonymous(), "integration test", "a", 0, 0),
            ProductCategorySearchRequest.create(Language.create("en-US"), Currency.create("USD"), UserFactory.anonymous(), "integration test", "c", 0, 0)
        );

        var response = searcher.batch(searchRequestCollection);

        assertNotNull(response);
        assertNotEquals(0, response.responses.length);
    }
}