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
    property = "$type",
    defaultImpl = PredictionRulesRequestSortBySorting.class)
public class PredictionRulesRequestSortBySorting
{
    public String $type = "Relewise.Client.Requests.Shared.Sorting`1[[Relewise.Client.Requests.Search.Rules.PredictionRulesRequest+SortBy, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public PredictionRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static PredictionRulesRequestSortBySorting create(PredictionRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new PredictionRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public PredictionRulesRequestSortBySorting(PredictionRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public PredictionRulesRequestSortBySorting()
    {
    }
    public PredictionRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public PredictionRulesRequestSortBySorting setSortBy(PredictionRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;;
        return this;
    }
    public PredictionRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;;
        return this;
    }
}
