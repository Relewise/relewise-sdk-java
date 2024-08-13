package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
    defaultImpl = TrackProductViewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductViewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductViewRequest, Relewise.Client";
    public ProductView productView;
    public static TrackProductViewRequest create(ProductView productView)
    {
        return new TrackProductViewRequest(productView);
    }
    public TrackProductViewRequest(ProductView productView)
    {
        this.productView = productView;
    }
    public TrackProductViewRequest()
    {
    }
    public ProductView getProductView()
    {
        return this.productView;
    }
    public TrackProductViewRequest setProductView(ProductView productView)
    {
        this.productView = productView;
        return this;
    }
}
