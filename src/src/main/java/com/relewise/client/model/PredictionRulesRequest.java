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
    defaultImpl = PredictionRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionRulesRequest extends PredictionRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.PredictionRulesRequest, Relewise.Client";
    public static PredictionRulesRequest create(SearchRuleFilters filters, PredictionRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new PredictionRulesRequest(filters, sorting, skip, take);
    }
    public PredictionRulesRequest(SearchRuleFilters filters, PredictionRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public PredictionRulesRequest()
    {
    }
    @Override
    public PredictionRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PredictionRulesRequest setSorting(PredictionRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public PredictionRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public PredictionRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
