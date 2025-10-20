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
    defaultImpl = TrackFeedItemPreviewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackFeedItemPreviewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.Feed.TrackFeedItemPreviewRequest, Relewise.Client";
    public FeedItemPreview preview;
    public static TrackFeedItemPreviewRequest create(FeedItemPreview preview)
    {
        return new TrackFeedItemPreviewRequest(preview);
    }
    public TrackFeedItemPreviewRequest(FeedItemPreview preview)
    {
        this.preview = preview;
    }
    public TrackFeedItemPreviewRequest()
    {
    }
    public FeedItemPreview getPreview()
    {
        return this.preview;
    }
    public TrackFeedItemPreviewRequest setPreview(FeedItemPreview preview)
    {
        this.preview = preview;
        return this;
    }
}
