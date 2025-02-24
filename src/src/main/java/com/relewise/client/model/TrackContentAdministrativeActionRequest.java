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
    defaultImpl = TrackContentAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentAdministrativeActionRequest, Relewise.Client";
    public ContentAdministrativeAction administrativeAction;
    public static TrackContentAdministrativeActionRequest create(ContentAdministrativeAction administrativeAction)
    {
        return new TrackContentAdministrativeActionRequest(administrativeAction);
    }
    public TrackContentAdministrativeActionRequest(ContentAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackContentAdministrativeActionRequest()
    {
    }
    public ContentAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackContentAdministrativeActionRequest setAdministrativeAction(ContentAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
