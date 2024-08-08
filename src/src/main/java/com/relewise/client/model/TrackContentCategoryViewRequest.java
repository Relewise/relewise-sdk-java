package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = TrackContentCategoryViewRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackContentCategoryViewRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackContentCategoryViewRequest, Relewise.Client";
    public ContentCategoryView contentCategoryView;
    public static TrackContentCategoryViewRequest create(ContentCategoryView contentCategoryView)
    {
        return new TrackContentCategoryViewRequest(contentCategoryView);
    }
    public TrackContentCategoryViewRequest(ContentCategoryView contentCategoryView)
    {
        this.contentCategoryView = contentCategoryView;
    }
    public TrackContentCategoryViewRequest()
    {
    }
    public ContentCategoryView getContentCategoryView()
    {
        return this.contentCategoryView;
    }
    public TrackContentCategoryViewRequest setContentCategoryView(ContentCategoryView contentCategoryView)
    {
        this.contentCategoryView = contentCategoryView;;
        return this;
    }
}
