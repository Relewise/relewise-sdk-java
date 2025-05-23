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
    defaultImpl = TrackContentViewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentViewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentViewRequest, Relewise.Client";
    public ContentView contentView;
    public static TrackContentViewRequest create(ContentView contentView)
    {
        return new TrackContentViewRequest(contentView);
    }
    public TrackContentViewRequest(ContentView contentView)
    {
        this.contentView = contentView;
    }
    public TrackContentViewRequest()
    {
    }
    public ContentView getContentView()
    {
        return this.contentView;
    }
    public TrackContentViewRequest setContentView(ContentView contentView)
    {
        this.contentView = contentView;
        return this;
    }
}
