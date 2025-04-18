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
public class StemmingRulesRequestSortBySorting
{
    public StemmingRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static StemmingRulesRequestSortBySorting create(StemmingRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new StemmingRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public StemmingRulesRequestSortBySorting(StemmingRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public StemmingRulesRequestSortBySorting()
    {
    }
    public StemmingRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public StemmingRulesRequestSortBySorting setSortBy(StemmingRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public StemmingRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
