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
    defaultImpl = SearchResponseCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResponseCollection extends SearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.SearchResponseCollection, Relewise.Client";
    public SearchResponse[] responses;
    public static SearchResponseCollection create()
    {
        return new SearchResponseCollection();
    }
    public SearchResponseCollection()
    {
    }
    public SearchResponse[] getResponses()
    {
        return this.responses;
    }
    public SearchResponseCollection setResponses(SearchResponse... responses)
    {
        this.responses = responses;
        return this;
    }
    public SearchResponseCollection addToResponses(SearchResponse response)
    {
        if (this.responses == null)
        {
            this.responses = new SearchResponse[] { response };
        }
        else
        {
            ArrayList<SearchResponse> existingList = new ArrayList<>(Arrays.asList(this.responses));
            existingList.add(response);
            this.responses = existingList.toArray(new SearchResponse[0]);
        }
        return this;
    }
    @Override
    public SearchResponseCollection setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
