package com.relewise.client;

import com.relewise.client.model.*;
import java.io.IOException;

class Tracker extends RelewiseClient
{
    public Tracker(String datasetId, String apiKey) { super(datasetId, apiKey); }
    
    public void track(BatchedTrackingRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("BatchedTrackingRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackBrandAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackBrandUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackBrandViewRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackBrandViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackCartRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackCartRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentCategoryAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentCategoryUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentCategoryViewRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentCategoryViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackContentViewRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackContentViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackingRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackingRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackOrderRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackOrderRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryAdministrativeActionRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductCategoryAdministrativeActionRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductCategoryUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductCategoryViewRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductCategoryViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductUpdateRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackProductViewRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackProductViewRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackSearchTermRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackSearchTermRequest", trackingRequest, Void.class);
    }
    
    public void track(TrackUserUpdateRequest trackingRequest) throws IOException, InterruptedException {
        makeRequestAndValidate("TrackUserUpdateRequest", trackingRequest, Void.class);
    }
}
