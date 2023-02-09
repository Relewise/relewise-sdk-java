package com.relewise.client;

import com.relewise.client.model.ProductSearchRequest;
import com.relewise.client.model.ProductSearchResponse;

import java.io.IOException;

public class Searcher extends RelewiseClient {
    public Searcher(String datasetId, String apiKey) {
        super(datasetId, apiKey);
    }

    public ProductSearchResponse search(ProductSearchRequest request) throws IOException, InterruptedException {
        return makeRequestAndValidate("ProductSearchRequest", request, ProductSearchResponse.class);
    }
}
