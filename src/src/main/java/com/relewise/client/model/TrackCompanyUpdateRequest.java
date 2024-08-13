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
    defaultImpl = TrackCompanyUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackCompanyUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackCompanyUpdateRequest, Relewise.Client";
    public CompanyUpdate companyUpdate;
    public static TrackCompanyUpdateRequest create(CompanyUpdate companyUpdate)
    {
        return new TrackCompanyUpdateRequest(companyUpdate);
    }
    public TrackCompanyUpdateRequest(CompanyUpdate companyUpdate)
    {
        this.companyUpdate = companyUpdate;
    }
    public TrackCompanyUpdateRequest()
    {
    }
    public CompanyUpdate getCompanyUpdate()
    {
        return this.companyUpdate;
    }
    public TrackCompanyUpdateRequest setCompanyUpdate(CompanyUpdate companyUpdate)
    {
        this.companyUpdate = companyUpdate;
        return this;
    }
}
