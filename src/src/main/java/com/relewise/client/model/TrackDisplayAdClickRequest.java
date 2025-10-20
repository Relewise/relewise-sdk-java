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
    defaultImpl = TrackDisplayAdClickRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackDisplayAdClickRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackDisplayAdClickRequest, Relewise.Client";
    public DisplayAdClick displayAdClick;
    public static TrackDisplayAdClickRequest create(DisplayAdClick displayAdClick)
    {
        return new TrackDisplayAdClickRequest(displayAdClick);
    }
    public TrackDisplayAdClickRequest(DisplayAdClick displayAdClick)
    {
        this.displayAdClick = displayAdClick;
    }
    public TrackDisplayAdClickRequest()
    {
    }
    public DisplayAdClick getDisplayAdClick()
    {
        return this.displayAdClick;
    }
    public TrackDisplayAdClickRequest setDisplayAdClick(DisplayAdClick displayAdClick)
    {
        this.displayAdClick = displayAdClick;
        return this;
    }
}
