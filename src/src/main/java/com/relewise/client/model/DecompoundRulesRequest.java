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
    defaultImpl = DecompoundRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DecompoundRulesRequest extends DecompoundRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.DecompoundRulesRequest, Relewise.Client";
    public static DecompoundRulesRequest create(SearchRuleFilters filters, DecompoundRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new DecompoundRulesRequest(filters, sorting, skip, take);
    }
    public DecompoundRulesRequest(SearchRuleFilters filters, DecompoundRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public DecompoundRulesRequest()
    {
    }
    @Override
    public DecompoundRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public DecompoundRulesRequest setSorting(DecompoundRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public DecompoundRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public DecompoundRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
