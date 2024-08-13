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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TrackContentCategoryUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentCategoryUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentCategoryUpdateRequest, Relewise.Client";
    public ContentCategoryUpdate contentCategoryUpdate;
    public static TrackContentCategoryUpdateRequest create(ContentCategoryUpdate contentCategoryUpdate)
    {
        return new TrackContentCategoryUpdateRequest(contentCategoryUpdate);
    }
    public TrackContentCategoryUpdateRequest(ContentCategoryUpdate contentCategoryUpdate)
    {
        this.contentCategoryUpdate = contentCategoryUpdate;
    }
    public TrackContentCategoryUpdateRequest()
    {
    }
    public ContentCategoryUpdate getContentCategoryUpdate()
    {
        return this.contentCategoryUpdate;
    }
    public TrackContentCategoryUpdateRequest setContentCategoryUpdate(ContentCategoryUpdate contentCategoryUpdate)
    {
        this.contentCategoryUpdate = contentCategoryUpdate;
        return this;
    }
}
