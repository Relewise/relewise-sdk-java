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
    defaultImpl = RedirectRulesRequest.class)
public class RedirectRulesRequest extends RedirectRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.RedirectRulesRequest, Relewise.Client";
    public static RedirectRulesRequest create(SearchRuleFilters filters, RedirectRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new RedirectRulesRequest(filters, sorting, skip, take);
    }
    public RedirectRulesRequest(SearchRuleFilters filters, RedirectRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public RedirectRulesRequest()
    {
    }
    @Override
    public RedirectRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public RedirectRulesRequest setSorting(RedirectRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;;
        return this;
    }
    @Override
    public RedirectRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;;
        return this;
    }
    @Override
    public RedirectRulesRequest setTake(Integer take)
    {
        this.take = take;;
        return this;
    }
}
