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
    defaultImpl = TrackContentEngagementRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentEngagementRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentEngagementRequest, Relewise.Client";
    public ContentEngagement contentEngagement;
    public static TrackContentEngagementRequest create(ContentEngagement contentEngagement)
    {
        return new TrackContentEngagementRequest(contentEngagement);
    }
    public TrackContentEngagementRequest(ContentEngagement contentEngagement)
    {
        this.contentEngagement = contentEngagement;
    }
    public TrackContentEngagementRequest()
    {
    }
    public ContentEngagement getContentEngagement()
    {
        return this.contentEngagement;
    }
    public TrackContentEngagementRequest setContentEngagement(ContentEngagement contentEngagement)
    {
        this.contentEngagement = contentEngagement;
        return this;
    }
}
