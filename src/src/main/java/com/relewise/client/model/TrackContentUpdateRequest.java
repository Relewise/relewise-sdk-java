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
    defaultImpl = TrackContentUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentUpdateRequest, Relewise.Client";
    public ContentUpdate contentUpdate;
    public static TrackContentUpdateRequest create(ContentUpdate contentUpdate)
    {
        return new TrackContentUpdateRequest(contentUpdate);
    }
    public TrackContentUpdateRequest(ContentUpdate contentUpdate)
    {
        this.contentUpdate = contentUpdate;
    }
    public TrackContentUpdateRequest()
    {
    }
    public ContentUpdate getContentUpdate()
    {
        return this.contentUpdate;
    }
    public TrackContentUpdateRequest setContentUpdate(ContentUpdate contentUpdate)
    {
        this.contentUpdate = contentUpdate;
        return this;
    }
}
