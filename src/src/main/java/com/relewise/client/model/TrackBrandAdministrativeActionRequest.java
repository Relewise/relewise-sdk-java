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
    defaultImpl = TrackBrandAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackBrandAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackBrandAdministrativeActionRequest, Relewise.Client";
    public BrandAdministrativeAction administrativeAction;
    public static TrackBrandAdministrativeActionRequest create(BrandAdministrativeAction administrativeAction)
    {
        return new TrackBrandAdministrativeActionRequest(administrativeAction);
    }
    public TrackBrandAdministrativeActionRequest(BrandAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackBrandAdministrativeActionRequest()
    {
    }
    public BrandAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackBrandAdministrativeActionRequest setAdministrativeAction(BrandAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
