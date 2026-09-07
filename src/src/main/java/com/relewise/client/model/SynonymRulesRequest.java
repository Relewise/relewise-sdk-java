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
    
/** Requests a filtered, sorted, and paged set of synonym rules. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SynonymRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SynonymRulesRequest extends SynonymRulesRequestSortBySearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.SynonymRulesRequest, Relewise.Client";
    /**
     * Creates a request for a filtered and paged set of synonym rules.
     * @param filters The filters applied to the rule set.
     * @param sorting The requested ordering.
     * @param skip The number of matching rules to skip.
     * @param take The maximum number of matching rules to return.
     */
    public static SynonymRulesRequest create(SearchRuleFilters filters, SynonymRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        return new SynonymRulesRequest(filters, sorting, skip, take);
    }
    /**
     * Creates a request for a filtered and paged set of synonym rules.
     * @param filters The filters applied to the rule set.
     * @param sorting The requested ordering.
     * @param skip The number of matching rules to skip.
     * @param take The maximum number of matching rules to return.
     */
    public SynonymRulesRequest(SearchRuleFilters filters, SynonymRulesRequestSortBySorting sorting, Integer skip, Integer take)
    {
        this.filters = filters;
        this.sorting = sorting;
        this.skip = skip;
        this.take = take;
    }
    public SynonymRulesRequest()
    {
    }
    @Override
    public SynonymRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SynonymRulesRequest setSorting(SynonymRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    @Override
    public SynonymRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    @Override
    public SynonymRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
