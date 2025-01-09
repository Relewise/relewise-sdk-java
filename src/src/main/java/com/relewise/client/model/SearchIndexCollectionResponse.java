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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchIndexCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndexCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.SearchIndexCollectionResponse, Relewise.Client";
    public SearchIndex[] indexes;
    public static SearchIndexCollectionResponse create()
    {
        return new SearchIndexCollectionResponse();
    }
    public SearchIndexCollectionResponse()
    {
    }
    public SearchIndex[] getIndexes()
    {
        return this.indexes;
    }
    public SearchIndexCollectionResponse setIndexes(SearchIndex... indexes)
    {
        this.indexes = indexes;
        return this;
    }
    public SearchIndexCollectionResponse addToIndexes(SearchIndex indexe)
    {
        if (this.indexes == null)
        {
            this.indexes = new SearchIndex[] { indexe };
        }
        else
        {
            ArrayList<SearchIndex> existingList = new ArrayList<>(Arrays.asList(this.indexes));
            existingList.add(indexe);
            this.indexes = existingList.toArray(new SearchIndex[0]);
        }
        return this;
    }
    @Override
    public SearchIndexCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
