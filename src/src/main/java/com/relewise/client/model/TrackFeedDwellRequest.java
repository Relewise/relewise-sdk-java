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
    defaultImpl = TrackFeedDwellRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackFeedDwellRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.Feed.TrackFeedDwellRequest, Relewise.Client";
    public FeedDwell dwell;
    public static TrackFeedDwellRequest create(FeedDwell dwell)
    {
        return new TrackFeedDwellRequest(dwell);
    }
    public TrackFeedDwellRequest(FeedDwell dwell)
    {
        this.dwell = dwell;
    }
    public TrackFeedDwellRequest()
    {
    }
    public FeedDwell getDwell()
    {
        return this.dwell;
    }
    public TrackFeedDwellRequest setDwell(FeedDwell dwell)
    {
        this.dwell = dwell;
        return this;
    }
}
