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
    defaultImpl = TrackProductCategoryAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductCategoryAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductCategoryAdministrativeActionRequest, Relewise.Client";
    public ProductCategoryAdministrativeAction administrativeAction;
    public static TrackProductCategoryAdministrativeActionRequest create(ProductCategoryAdministrativeAction administrativeAction)
    {
        return new TrackProductCategoryAdministrativeActionRequest(administrativeAction);
    }
    public TrackProductCategoryAdministrativeActionRequest(ProductCategoryAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackProductCategoryAdministrativeActionRequest()
    {
    }
    public ProductCategoryAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackProductCategoryAdministrativeActionRequest setAdministrativeAction(ProductCategoryAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
