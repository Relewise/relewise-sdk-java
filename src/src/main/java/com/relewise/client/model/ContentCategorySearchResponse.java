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
    defaultImpl = ContentCategorySearchResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategorySearchResponse extends PaginatedSearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.ContentCategorySearchResponse, Relewise.Client";
    public static ContentCategorySearchResponse create()
    {
        return new ContentCategorySearchResponse();
    }
    public ContentCategorySearchResponse()
    {
    }
    @Override
    public ContentCategorySearchResponse setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    @Override
    public ContentCategorySearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
