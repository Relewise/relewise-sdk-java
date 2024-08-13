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
    defaultImpl = SynonymsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SynonymsResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.SynonymsResponse, Relewise.Client";
    public Synonym[] values;
    public Integer hits;
    public static SynonymsResponse create(Synonym[] values, Integer hits)
    {
        return new SynonymsResponse(values, hits);
    }
    public SynonymsResponse(Synonym[] values, Integer hits)
    {
        this.values = values;
        this.hits = hits;
    }
    public SynonymsResponse()
    {
    }
    public Synonym[] getValues()
    {
        return this.values;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public SynonymsResponse setValues(Synonym... values)
    {
        this.values = values;
        return this;
    }
    public SynonymsResponse addToValues(Synonym value)
    {
        if (this.values == null)
        {
            this.values = new Synonym[] { value };
        }
        else
        {
            ArrayList<Synonym> existingList = new ArrayList<>(Arrays.asList(this.values));
            existingList.add(value);
            this.values = existingList.toArray(new Synonym[0]);
        }
        return this;
    }
    public SynonymsResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public SynonymsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
