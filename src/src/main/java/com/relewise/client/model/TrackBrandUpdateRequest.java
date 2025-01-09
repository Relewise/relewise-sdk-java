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
    defaultImpl = TrackBrandUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackBrandUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackBrandUpdateRequest, Relewise.Client";
    public BrandUpdate brandUpdate;
    public static TrackBrandUpdateRequest create(BrandUpdate brandUpdate)
    {
        return new TrackBrandUpdateRequest(brandUpdate);
    }
    public TrackBrandUpdateRequest(BrandUpdate brandUpdate)
    {
        this.brandUpdate = brandUpdate;
    }
    public TrackBrandUpdateRequest()
    {
    }
    public BrandUpdate getBrandUpdate()
    {
        return this.brandUpdate;
    }
    public TrackBrandUpdateRequest setBrandUpdate(BrandUpdate brandUpdate)
    {
        this.brandUpdate = brandUpdate;
        return this;
    }
}
