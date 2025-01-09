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
    defaultImpl = TrackCompanyAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackCompanyAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackCompanyAdministrativeActionRequest, Relewise.Client";
    public CompanyAdministrativeAction administrativeAction;
    public static TrackCompanyAdministrativeActionRequest create(CompanyAdministrativeAction administrativeAction)
    {
        return new TrackCompanyAdministrativeActionRequest(administrativeAction);
    }
    public TrackCompanyAdministrativeActionRequest(CompanyAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackCompanyAdministrativeActionRequest()
    {
    }
    public CompanyAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackCompanyAdministrativeActionRequest setAdministrativeAction(CompanyAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
