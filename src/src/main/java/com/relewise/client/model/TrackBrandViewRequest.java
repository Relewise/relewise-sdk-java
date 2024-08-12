package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TrackBrandViewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackBrandViewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackBrandViewRequest, Relewise.Client";
    public BrandView brandView;
    public static TrackBrandViewRequest create(BrandView brandView)
    {
        return new TrackBrandViewRequest(brandView);
    }
    public TrackBrandViewRequest(BrandView brandView)
    {
        this.brandView = brandView;
    }
    public TrackBrandViewRequest()
    {
    }
    public BrandView getBrandView()
    {
        return this.brandView;
    }
    public TrackBrandViewRequest setBrandView(BrandView brandView)
    {
        this.brandView = brandView;
        return this;
    }
}
