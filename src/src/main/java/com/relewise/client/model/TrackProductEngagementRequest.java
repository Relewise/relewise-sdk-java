package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TrackProductEngagementRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductEngagementRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductEngagementRequest, Relewise.Client";
    public ProductEngagement productEngagement;
    public static TrackProductEngagementRequest create(ProductEngagement productEngagement)
    {
        return new TrackProductEngagementRequest(productEngagement);
    }
    public TrackProductEngagementRequest(ProductEngagement productEngagement)
    {
        this.productEngagement = productEngagement;
    }
    public TrackProductEngagementRequest()
    {
    }
    public ProductEngagement getProductEngagement()
    {
        return this.productEngagement;
    }
    public TrackProductEngagementRequest setProductEngagement(ProductEngagement productEngagement)
    {
        this.productEngagement = productEngagement;
        return this;
    }
}
