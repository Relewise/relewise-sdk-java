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
    defaultImpl = TrackContentCategoryAdministrativeActionRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentCategoryAdministrativeActionRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentCategoryAdministrativeActionRequest, Relewise.Client";
    public ContentCategoryAdministrativeAction administrativeAction;
    public static TrackContentCategoryAdministrativeActionRequest create(ContentCategoryAdministrativeAction administrativeAction)
    {
        return new TrackContentCategoryAdministrativeActionRequest(administrativeAction);
    }
    public TrackContentCategoryAdministrativeActionRequest(ContentCategoryAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
    }
    public TrackContentCategoryAdministrativeActionRequest()
    {
    }
    public ContentCategoryAdministrativeAction getAdministrativeAction()
    {
        return this.administrativeAction;
    }
    public TrackContentCategoryAdministrativeActionRequest setAdministrativeAction(ContentCategoryAdministrativeAction administrativeAction)
    {
        this.administrativeAction = administrativeAction;
        return this;
    }
}
