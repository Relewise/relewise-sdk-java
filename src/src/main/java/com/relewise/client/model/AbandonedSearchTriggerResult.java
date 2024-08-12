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
    defaultImpl = AbandonedSearchTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbandonedSearchTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.AbandonedSearchTriggerResult, Relewise.Client";
    public UserResultDetails user;
    public SearchType type;
    public AbandonedSearch[] searches;
    public static AbandonedSearchTriggerResult create()
    {
        return new AbandonedSearchTriggerResult();
    }
    public AbandonedSearchTriggerResult()
    {
    }
    public UserResultDetails getUser()
    {
        return this.user;
    }
    public SearchType getType()
    {
        return this.type;
    }
    public AbandonedSearch[] getSearches()
    {
        return this.searches;
    }
    public AbandonedSearchTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
    public AbandonedSearchTriggerResult setType(SearchType type)
    {
        this.type = type;
        return this;
    }
    public AbandonedSearchTriggerResult setSearches(AbandonedSearch... searches)
    {
        this.searches = searches;
        return this;
    }
    public AbandonedSearchTriggerResult addToSearches(AbandonedSearch searche)
    {
        if (this.searches == null)
        {
            this.searches = new AbandonedSearch[] { searche };
        }
        else
        {
            ArrayList<AbandonedSearch> existingList = new ArrayList<>(Arrays.asList(this.searches));
            existingList.add(searche);
            this.searches = existingList.toArray(new AbandonedSearch[0]);
        }
        return this;
    }
}
