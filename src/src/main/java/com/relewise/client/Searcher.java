package com.relewise.client;

import com.relewise.client.model.*;
import com.relewise.client.infrastructure.*;
import java.io.IOException;

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
        return makeRequestAndValidate("SearchRequestCollection", request, SearchResponseCollection.class);
    }
}
