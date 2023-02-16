package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    property = "$type")
@JsonSubTypes({
})
public abstract class PaginatedSearchResponse extends SearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.PaginatedSearchResponse, Relewise.Client";
    public Integer hits;
    public Integer getHits()
    {
        return this.hits;
    }
    public PaginatedSearchResponse setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    @Override
    public PaginatedSearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
