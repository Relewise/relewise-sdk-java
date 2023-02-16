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
    defaultImpl = StemmingRulesRequest.class)
public class StemmingRulesRequest extends StemmingRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.StemmingRulesRequest, Relewise.Client";
    public static StemmingRulesRequest create(SearchRuleFilters filters, StemmingRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new StemmingRulesRequest(filters, sorting, skip, take);
    }
    public StemmingRulesRequest(SearchRuleFilters filters, StemmingRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public StemmingRulesRequest()
    {
    }
    @Override
    public StemmingRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public StemmingRulesRequest setSorting(StemmingRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;;
        return this;
    }
    @Override
    public StemmingRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;;
        return this;
    }
    @Override
    public StemmingRulesRequest setTake(Integer take)
    {
        this.take = take;;
        return this;
    }
}
