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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TrackProductCategoryUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductCategoryUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductCategoryUpdateRequest, Relewise.Client";
    public ProductCategoryUpdate productCategoryUpdate;
    public static TrackProductCategoryUpdateRequest create(ProductCategoryUpdate productCategoryUpdate)
    {
        return new TrackProductCategoryUpdateRequest(productCategoryUpdate);
    }
    public TrackProductCategoryUpdateRequest(ProductCategoryUpdate productCategoryUpdate)
    {
        this.productCategoryUpdate = productCategoryUpdate;
    }
    public TrackProductCategoryUpdateRequest()
    {
    }
    public ProductCategoryUpdate getProductCategoryUpdate()
    {
        return this.productCategoryUpdate;
    }
    public TrackProductCategoryUpdateRequest setProductCategoryUpdate(ProductCategoryUpdate productCategoryUpdate)
    {
        this.productCategoryUpdate = productCategoryUpdate;
        return this;
    }
}
