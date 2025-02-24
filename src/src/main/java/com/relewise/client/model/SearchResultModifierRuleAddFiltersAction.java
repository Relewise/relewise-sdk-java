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
    defaultImpl = SearchResultModifierRuleAddFiltersAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRuleAddFiltersAction extends SearchResultModifierRuleRuleAction
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchResultModifierRule+AddFiltersAction, Relewise.Client";
    public FilterCollection filters;
    public static SearchResultModifierRuleAddFiltersAction create(FilterCollection filters)
    {
        return new SearchResultModifierRuleAddFiltersAction(filters);
    }
    public SearchResultModifierRuleAddFiltersAction(FilterCollection filters)
    {
        this.filters = filters;
    }
    public SearchResultModifierRuleAddFiltersAction()
    {
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public SearchResultModifierRuleAddFiltersAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
