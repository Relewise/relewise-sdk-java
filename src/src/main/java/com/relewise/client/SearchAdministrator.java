package com.relewise.client;

import com.relewise.client.model.*;
import com.relewise.client.infrastructure.*;
import java.io.IOException;

class SearchAdministrator extends RelewiseClient
{
    public SearchAdministrator(String datasetId, String apiKey) { super(datasetId, apiKey); }
    
    public void delete(DeleteSearchIndexRequest request) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("DeleteSearchIndexRequest", request, Void.class);
    }
    
    public SearchIndexResponse save(SaveSearchIndexRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SaveSearchIndexRequest", request, SearchIndexResponse.class);
    }
    
    public SearchIndexResponse load(SearchIndexRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SearchIndexRequest", request, SearchIndexResponse.class);
    }
    
    public SearchIndexCollectionResponse load(SearchIndexesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SearchIndexesRequest", request, SearchIndexCollectionResponse.class);
    }
    
    public SynonymsResponse load(SynonymsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SynonymsRequest", request, SynonymsResponse.class);
    }
    
    public SynonymsResponse save(SaveSynonymsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SaveSynonymsRequest", request, SynonymsResponse.class);
    }
    
    public DeleteSynonymsResponse delete(DeleteSynonymsRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("DeleteSynonymsRequest", request, DeleteSynonymsResponse.class);
    }
    
    public RedirectRulesResponse load(RedirectRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("RedirectRulesRequest", request, RedirectRulesResponse.class);
    }
    
    public SaveRedirectRulesResponse save(SaveRedirectRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SaveRedirectRulesRequest", request, SaveRedirectRulesResponse.class);
    }
    
    public DeleteSearchRulesResponse delete(DeleteRedirectRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("DeleteRedirectRulesRequest", request, DeleteSearchRulesResponse.class);
    }
    
    public DecompoundRulesResponse load(DecompoundRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("DecompoundRulesRequest", request, DecompoundRulesResponse.class);
    }
    
    public SaveDecompoundRulesResponse save(SaveDecompoundRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SaveDecompoundRulesRequest", request, SaveDecompoundRulesResponse.class);
    }
    
    public DeleteSearchRulesResponse delete(DeleteDecompoundRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("DeleteDecompoundRulesRequest", request, DeleteSearchRulesResponse.class);
    }
    
    public StemmingRulesResponse load(StemmingRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("StemmingRulesRequest", request, StemmingRulesResponse.class);
    }
    
    public SaveStemmingRulesResponse save(SaveStemmingRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("SaveStemmingRulesRequest", request, SaveStemmingRulesResponse.class);
    }
    
    public DeleteSearchRulesResponse delete(DeleteStemmingRulesRequest request) throws IOException, InterruptedException, ClientException {
        return makeRequestAndValidate("DeleteStemmingRulesRequest", request, DeleteSearchRulesResponse.class);
    }
}
