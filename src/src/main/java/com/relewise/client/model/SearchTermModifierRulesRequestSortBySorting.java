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
public class SearchTermModifierRulesRequestSortBySorting
{
    public SearchTermModifierRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static SearchTermModifierRulesRequestSortBySorting create(SearchTermModifierRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new SearchTermModifierRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public SearchTermModifierRulesRequestSortBySorting(SearchTermModifierRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public SearchTermModifierRulesRequestSortBySorting()
    {
    }
    public SearchTermModifierRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public SearchTermModifierRulesRequestSortBySorting setSortBy(SearchTermModifierRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public SearchTermModifierRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
