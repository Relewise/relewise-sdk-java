package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = TrackProductUpdateRequest.class)
public class TrackProductUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductUpdateRequest, Relewise.Client";
    public ProductUpdate productUpdate;
    public static TrackProductUpdateRequest create(ProductUpdate productUpdate)
    {
        return new TrackProductUpdateRequest(productUpdate);
    }
    public TrackProductUpdateRequest(ProductUpdate productUpdate)
    {
        this.productUpdate = productUpdate;
    }
    public TrackProductUpdateRequest()
    {
    }
    public ProductUpdate getProductUpdate()
    {
        return this.productUpdate;
    }
    public TrackProductUpdateRequest setProductUpdate(ProductUpdate productUpdate)
    {
        this.productUpdate = productUpdate;;
        return this;
    }
}
