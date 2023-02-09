package com.relewise.client;

import com.relewise.client.model.*;
import java.io.IOException;

class Searcher extends RelewiseClient
{
    public Searcher(String datasetId, String apiKey) { super(datasetId, apiKey); }
    
    public ProductSearchResponse search(ProductSearchRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("ProductSearchRequest", request, ProductSearchResponse.class);
    }
    
    public ContentSearchResponse search(ContentSearchRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("ContentSearchRequest", request, ContentSearchResponse.class);
    }
    
    public ProductCategorySearchResponse search(ProductCategorySearchRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("ProductCategorySearchRequest", request, ProductCategorySearchResponse.class);
    }
    
    public ContentCategorySearchResponse search(ContentCategorySearchRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("ContentCategorySearchRequest", request, ContentCategorySearchResponse.class);
    }
    
    public SearchTermPredictionResponse predict(SearchTermPredictionRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("SearchTermPredictionRequest", request, SearchTermPredictionResponse.class);
    }
    
    public SearchResponseCollection batch(SearchRequestCollection request) throws IOException, InterruptedException {
        return makeRequestAndValidate("SearchRequestCollection", request, SearchResponseCollection.class);
    }
}
