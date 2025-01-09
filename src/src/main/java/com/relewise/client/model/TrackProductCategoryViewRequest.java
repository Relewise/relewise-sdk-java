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
    defaultImpl = TrackProductCategoryViewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductCategoryViewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductCategoryViewRequest, Relewise.Client";
    public ProductCategoryView productCategoryView;
    public static TrackProductCategoryViewRequest create(ProductCategoryView productCategoryView)
    {
        return new TrackProductCategoryViewRequest(productCategoryView);
    }
    public TrackProductCategoryViewRequest(ProductCategoryView productCategoryView)
    {
        this.productCategoryView = productCategoryView;
    }
    public TrackProductCategoryViewRequest()
    {
    }
    public ProductCategoryView getProductCategoryView()
    {
        return this.productCategoryView;
    }
    public TrackProductCategoryViewRequest setProductCategoryView(ProductCategoryView productCategoryView)
    {
        this.productCategoryView = productCategoryView;
        return this;
    }
}
