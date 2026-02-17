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
    defaultImpl = TrackUserAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackUserAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackUserAdministrativeActionRequest, Relewise.Client";
    public UserAdministrativeAction administrativeAction;
    public static TrackUserAdministrativeActionRequest create(UserAdministrativeAction administrativeAction)
    {
        return new TrackUserAdministrativeActionRequest(administrativeAction);
    }
    public TrackUserAdministrativeActionRequest(UserAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackUserAdministrativeActionRequest()
    {
    }
    public UserAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackUserAdministrativeActionRequest setAdministrativeAction(UserAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
