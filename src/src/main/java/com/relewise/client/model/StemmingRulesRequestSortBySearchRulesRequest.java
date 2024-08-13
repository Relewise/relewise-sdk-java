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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PredictionRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.PredictionRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = RedirectRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.RedirectRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DecompoundRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DecompoundRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = StemmingRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.StemmingRulesRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StemmingRulesRequestSortBySearchRulesRequest extends LicensedRequest
{
    public String $type = "";
    public SearchRuleFilters filters;
    public StemmingRulesRequestSortBySorting sorting;
    public Integer skip;
    public Integer take;
    public SearchRuleFilters getFilters()
    {
        return this.filters;
    }
    public StemmingRulesRequestSortBySorting getSorting()
    {
        return this.sorting;
    }
    public Integer getSkip()
    {
        return this.skip;
    }
    public Integer getTake()
    {
        return this.take;
    }
    public StemmingRulesRequestSortBySearchRulesRequest setFilters(SearchRuleFilters filters)
    {
        this.filters = filters;
        return this;
    }
    public StemmingRulesRequestSortBySearchRulesRequest setSorting(StemmingRulesRequestSortBySorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    public StemmingRulesRequestSortBySearchRulesRequest setSkip(Integer skip)
    {
        this.skip = skip;
        return this;
    }
    public StemmingRulesRequestSortBySearchRulesRequest setTake(Integer take)
    {
        this.take = take;
        return this;
    }
}
