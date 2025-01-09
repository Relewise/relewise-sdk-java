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
    defaultImpl = SearchTermModifierRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRulesRequest extends SearchTermModifierRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SearchTermModifierRulesRequest, Relewise.Client";
    public static SearchTermModifierRulesRequest create(SearchRuleFilters filters, SearchTermModifierRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new SearchTermModifierRulesRequest(filters, sorting, skip, take);
    }
    public SearchTermModifierRulesRequest(SearchRuleFilters filters, SearchTermModifierRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public SearchTermModifierRulesRequest()
    {
    }
    @Override
    public SearchTermModifierRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SearchTermModifierRulesRequest setSorting(SearchTermModifierRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public SearchTermModifierRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public SearchTermModifierRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
