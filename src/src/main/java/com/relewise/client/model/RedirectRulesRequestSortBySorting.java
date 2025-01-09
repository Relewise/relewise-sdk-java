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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class RedirectRulesRequestSortBySorting
{
    public RedirectRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static RedirectRulesRequestSortBySorting create(RedirectRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new RedirectRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public RedirectRulesRequestSortBySorting(RedirectRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public RedirectRulesRequestSortBySorting()
    {
    }
    public RedirectRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public RedirectRulesRequestSortBySorting setSortBy(RedirectRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public RedirectRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
