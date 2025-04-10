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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRulesRequestSortBySorting
{
    public SearchResultModifierRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static SearchResultModifierRulesRequestSortBySorting create(SearchResultModifierRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new SearchResultModifierRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public SearchResultModifierRulesRequestSortBySorting(SearchResultModifierRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public SearchResultModifierRulesRequestSortBySorting()
    {
    }
    public SearchResultModifierRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public SearchResultModifierRulesRequestSortBySorting setSortBy(SearchResultModifierRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public SearchResultModifierRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
