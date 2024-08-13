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
    defaultImpl = AbandonedContentSearch.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbandonedContentSearch extends StringAbandonedSearch
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.AbandonedContentSearch, Relewise.Client";
    public static AbandonedContentSearch create()
    {
        return new AbandonedContentSearch();
    }
    public AbandonedContentSearch()
    {
    }
    @Override
    public AbandonedContentSearch setTopResults(String... topResults)
    {
        this.topResults = topResults;
        return this;
    }
    public AbandonedContentSearch addToTopResults(String topResult)
    {
        if (this.topResults == null)
        {
            this.topResults = new String[] { topResult };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.topResults));
            existingList.add(topResult);
            this.topResults = existingList.toArray(new String[0]);
        }
        return this;
    }
    @Override
    public AbandonedContentSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;
        return this;
    }
    @Override
    public AbandonedContentSearch setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public AbandonedContentSearch setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
}
