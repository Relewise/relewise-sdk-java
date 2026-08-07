package com.relewise.client;

import com.relewise.client.model.*;
import com.relewise.client.infrastructure.*;
import java.io.IOException;
import java.util.*;

public class Searcher extends RelewiseClient
{
    public Searcher(String datasetId, String apiKey, String serverUrl) { super(datasetId, apiKey, serverUrl, 5); }
    public Searcher(String datasetId, String apiKey, String serverUrl, int timeout) { super(datasetId, apiKey, serverUrl, timeout); }
    
    public ProductSearchResponse search(ProductSearchRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductSearchRequest", request, ProductSearchResponse.class);
    }
    
    public ContentSearchResponse search(ContentSearchRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentSearchRequest", request, ContentSearchResponse.class);
    }
    
    public ProductCategorySearchResponse search(ProductCategorySearchRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ProductCategorySearchRequest", request, ProductCategorySearchResponse.class);
    }
    
    public ContentCategorySearchResponse search(ContentCategorySearchRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("ContentCategorySearchRequest", request, ContentCategorySearchResponse.class);
    }
    
    public SearchTermPredictionResponse predict(SearchTermPredictionRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SearchTermPredictionRequest", request, SearchTermPredictionResponse.class);
    }
    
    public SearchResponseCollection batch(SearchRequestCollection request) throws IOException, InterruptedException, ClientException {
        if (request.getRequests() == null || request.getRequests().isEmpty()) {
            return null;
        }
        SearchResponseCollection aggregatedResponse = null;
        for (var batch : createBatches(request.getRequests())) {
            var chunkedRequest = new SearchRequestCollection();
            chunkedRequest.setLanguage(request.getLanguage());
            chunkedRequest.setCurrency(request.getCurrency());
            chunkedRequest.setUser(request.getUser());
            chunkedRequest.setDisplayedAtLocation(request.getDisplayedAtLocation());
            chunkedRequest.setRelevanceModifiers(request.getRelevanceModifiers());
            chunkedRequest.setFilters(request.getFilters());
            chunkedRequest.setIndexSelector(request.getIndexSelector());
            chunkedRequest.setPostFilters(request.getPostFilters());
            chunkedRequest.setChannel(request.getChannel());
            chunkedRequest.setRequests(batch.toArray(new SearchRequest[0]));
            var chunkResponse = makeRequestAndValidate("SearchRequestCollection", chunkedRequest, SearchResponseCollection.class);
            if (chunkResponse == null) {
                continue;
            }
            if (aggregatedResponse == null) {
                aggregatedResponse = chunkResponse;
            }
            else {
                if (chunkResponse.getResponses() != null) {
                    var responses = aggregatedResponse.getResponses() == null
                        ? new ArrayList<SearchResponse>()
                        : new ArrayList<>(Arrays.asList(aggregatedResponse.getResponses()));
                    responses.addAll(Arrays.asList(chunkResponse.getResponses()));
                    aggregatedResponse.setResponses(responses.toArray(new SearchResponse[0]));
                }
            }
        }
        return aggregatedResponse;
    }
}
