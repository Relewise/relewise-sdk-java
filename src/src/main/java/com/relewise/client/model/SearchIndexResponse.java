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
    defaultImpl = SearchIndexResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndexResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.SearchIndexResponse, Relewise.Client";
    public SearchIndex index;
    public static SearchIndexResponse create()
    {
        return new SearchIndexResponse();
    }
    public SearchIndexResponse()
    {
    }
    public SearchIndex getIndex()
    {
        return this.index;
    }
    public SearchIndexResponse setIndex(SearchIndex index)
    {
        this.index = index;
        return this;
    }
    @Override
    public SearchIndexResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
