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
    defaultImpl = SearchResultModifierRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRulesRequest extends SearchResultModifierRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SearchResultModifierRulesRequest, Relewise.Client";
    public static SearchResultModifierRulesRequest create(SearchRuleFilters filters, SearchResultModifierRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new SearchResultModifierRulesRequest(filters, sorting, skip, take);
    }
    public SearchResultModifierRulesRequest(SearchRuleFilters filters, SearchResultModifierRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public SearchResultModifierRulesRequest()
    {
    }
    @Override
    public SearchResultModifierRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SearchResultModifierRulesRequest setSorting(SearchResultModifierRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public SearchResultModifierRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public SearchResultModifierRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
