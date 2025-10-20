package com.relewise.client;

import com.relewise.client.model.*;
import com.relewise.client.infrastructure.*;
import java.io.IOException;

public class Tracker extends RelewiseClient
{
    public Tracker(String datasetId, String apiKey, String serverUrl) { super(datasetId, apiKey, serverUrl, 5); }
    public Tracker(String datasetId, String apiKey, String serverUrl, int timeout) { super(datasetId, apiKey, serverUrl, timeout); }
    
    public void track(BatchedTrackingRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("BatchedTrackingRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackBrandAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackBrandUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandViewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackBrandViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackCartRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackCartRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackCompanyAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackCompanyAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackCompanyUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackCompanyUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentCategoryAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentCategoryUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryViewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentCategoryViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentEngagementRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentEngagementRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentViewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackContentViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackDisplayAdClickRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackDisplayAdClickRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackingRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackingRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackOrderRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackOrderRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductCategoryAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductCategoryUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryViewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductCategoryViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductEngagementRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductEngagementRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductViewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackProductViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackSearchTermRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackSearchTermRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackUserUpdateRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackUserUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackFeedDwellRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackFeedDwellRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackFeedItemClickRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackFeedItemClickRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackFeedItemPreviewRequest trackingRequest) throws IOException, InterruptedException, ClientException {
        makeRequestAndValidate("TrackFeedItemPreviewRequest", trackingRequest, Void.class);
    }
}
