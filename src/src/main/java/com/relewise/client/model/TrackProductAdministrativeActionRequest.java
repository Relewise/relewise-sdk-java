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
    defaultImpl = TrackProductAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackProductAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackProductAdministrativeActionRequest, Relewise.Client";
    public ProductAdministrativeAction administrativeAction;
    public static TrackProductAdministrativeActionRequest create(ProductAdministrativeAction administrativeAction)
    {
        return new TrackProductAdministrativeActionRequest(administrativeAction);
    }
    public TrackProductAdministrativeActionRequest(ProductAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackProductAdministrativeActionRequest()
    {
    }
    public ProductAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackProductAdministrativeActionRequest setAdministrativeAction(ProductAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
