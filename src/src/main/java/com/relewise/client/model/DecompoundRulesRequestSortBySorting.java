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
public class DecompoundRulesRequestSortBySorting
{
    public DecompoundRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static DecompoundRulesRequestSortBySorting create(DecompoundRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new DecompoundRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public DecompoundRulesRequestSortBySorting(DecompoundRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public DecompoundRulesRequestSortBySorting()
    {
    }
    public DecompoundRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public DecompoundRulesRequestSortBySorting setSortBy(DecompoundRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public DecompoundRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
