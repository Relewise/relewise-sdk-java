package com.relewise.client;

import com.relewise.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BatchingTest {
    @Test
    public void trackerSplitsItemsIntoConfiguredBatchSize() throws Exception {
        var tracker = new RecordingTracker();
        tracker.setBatchSize(2);

        var items = new Trackable[] {
            new TestTrackable(),
            new TestTrackable(),
            new TestTrackable(),
            new TestTrackable(),
            new TestTrackable()
        };
        var request = BatchedTrackingRequest.create(items);

        tracker.track(request);

        assertEquals(3, tracker.requests.size());
        assertArrayEquals(Arrays.copyOfRange(items, 0, 2), tracker.requests.get(0).getItems());
        assertArrayEquals(Arrays.copyOfRange(items, 2, 4), tracker.requests.get(1).getItems());
        assertArrayEquals(Arrays.copyOfRange(items, 4, 5), tracker.requests.get(2).getItems());
        assertArrayEquals(items, request.getItems(), "The original request must remain unchanged");
        assertNotSame(request, tracker.requests.get(0));
        assertNotSame(tracker.requests.get(0), tracker.requests.get(1));
    }

    @Test
    public void searcherAggregatesResponsesInRequestOrder() throws Exception {
        var searcher = new RecordingSearcher();
        searcher.setBatchSize(2);

        var requests = new SearchRequest[] {
            new TestSearchRequest(),
            new TestSearchRequest(),
            new TestSearchRequest(),
            new TestSearchRequest(),
            new TestSearchRequest()
        };
        var responses = new SearchResponse[] {
            new TestSearchResponse(),
            new TestSearchResponse(),
            new TestSearchResponse(),
            new TestSearchResponse(),
            new TestSearchResponse()
        };
        var request = SearchRequestCollection.create(requests).setDisplayedAtLocation("batching-test");
        searcher.queue(SearchResponseCollection.create().setResponses(Arrays.copyOfRange(responses, 0, 2)));
        searcher.queue(SearchResponseCollection.create().setResponses(Arrays.copyOfRange(responses, 2, 4)));
        searcher.queue(SearchResponseCollection.create().setResponses(Arrays.copyOfRange(responses, 4, 5)));

        var result = searcher.batch(request);

        assertNotNull(result);
        assertArrayEquals(responses, result.getResponses());
        assertEquals(3, searcher.requests.size());
        assertEquals(2, searcher.requests.get(0).getRequests().size());
        assertEquals(2, searcher.requests.get(1).getRequests().size());
        assertEquals(1, searcher.requests.get(2).getRequests().size());
        assertEquals("batching-test", searcher.requests.get(0).getDisplayedAtLocation());
        assertEquals(5, request.getRequests().size(), "The original request must remain unchanged");
    }

    @Test
    public void recommenderAggregatesResponsesAndCopiesCollectionSettings() throws Exception {
        var recommender = new RecordingRecommender();
        recommender.setBatchSize(2);

        var requests = new ProductRecommendationRequest[] {
            new TestProductRecommendationRequest(),
            new TestProductRecommendationRequest(),
            new TestProductRecommendationRequest()
        };
        var responses = new ProductRecommendationResponse[] {
            new ProductRecommendationResponse(),
            new ProductRecommendationResponse(),
            new ProductRecommendationResponse()
        };
        var request = ProductRecommendationRequestCollection.create(true, requests);
        recommender.queue(ProductRecommendationResponseCollection.create(Arrays.copyOfRange(responses, 0, 2)));
        recommender.queue(ProductRecommendationResponseCollection.create(Arrays.copyOfRange(responses, 2, 3)));

        var result = recommender.recommend(request);

        assertNotNull(result);
        assertArrayEquals(responses, result.getResponses());
        assertEquals(2, recommender.requests.size());
        assertTrue(recommender.requests.get(0).getRequireDistinctProductsAcrossResults());
        assertTrue(recommender.requests.get(1).getRequireDistinctProductsAcrossResults());
        assertEquals(3, request.getRequests().size(), "The original request must remain unchanged");
    }

    @Test
    public void emptyCollectionsDoNotSendRequests() throws Exception {
        var tracker = new RecordingTracker();
        var searcher = new RecordingSearcher();

        tracker.track(new BatchedTrackingRequest());
        var response = searcher.batch(new SearchRequestCollection());

        assertTrue(tracker.requests.isEmpty());
        assertTrue(searcher.requests.isEmpty());
        assertNull(response);
    }

    @Test
    public void batchSizeMustBeGreaterThanZero() {
        var tracker = new RecordingTracker();

        assertEquals(1000, tracker.getBatchSize());
        assertThrows(IllegalArgumentException.class, () -> tracker.setBatchSize(0));
        assertThrows(IllegalArgumentException.class, () -> tracker.setBatchSize(-1));
    }

    private static class RecordingTracker extends Tracker {
        private final List<BatchedTrackingRequest> requests = new ArrayList<>();

        private RecordingTracker() {
            super("dataset-id", "api-key", "https://example.com");
        }

        @Override
        public <T> T makeRequestAndValidate(String endpoint, LicensedRequest requestBody, Class<T> responseClass) {
            assertEquals("BatchedTrackingRequest", endpoint);
            requests.add((BatchedTrackingRequest) requestBody);
            return null;
        }
    }

    private static class RecordingSearcher extends Searcher {
        private final List<SearchRequestCollection> requests = new ArrayList<>();
        private final ArrayDeque<SearchResponseCollection> responses = new ArrayDeque<>();

        private RecordingSearcher() {
            super("dataset-id", "api-key", "https://example.com");
        }

        private void queue(SearchResponseCollection response) {
            responses.add(response);
        }

        @Override
        public <T> T makeRequestAndValidate(String endpoint, LicensedRequest requestBody, Class<T> responseClass) {
            assertEquals("SearchRequestCollection", endpoint);
            requests.add((SearchRequestCollection) requestBody);
            return responseClass.cast(responses.remove());
        }
    }

    private static class RecordingRecommender extends Recommender {
        private final List<ProductRecommendationRequestCollection> requests = new ArrayList<>();
        private final ArrayDeque<ProductRecommendationResponseCollection> responses = new ArrayDeque<>();

        private RecordingRecommender() {
            super("dataset-id", "api-key", "https://example.com");
        }

        private void queue(ProductRecommendationResponseCollection response) {
            responses.add(response);
        }

        @Override
        public <T> T makeRequestAndValidate(String endpoint, LicensedRequest requestBody, Class<T> responseClass) {
            assertEquals("ProductRecommendationRequestCollection", endpoint);
            requests.add((ProductRecommendationRequestCollection) requestBody);
            return responseClass.cast(responses.remove());
        }
    }

    private static class TestTrackable extends Trackable {
    }

    private static class TestSearchRequest extends SearchRequest {
    }

    private static class TestSearchResponse extends SearchResponse {
    }

    private static class TestProductRecommendationRequest extends ProductRecommendationRequest {
    }
}
