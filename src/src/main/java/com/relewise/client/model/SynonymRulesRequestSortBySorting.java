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
public class SynonymRulesRequestSortBySorting
{
    public SynonymRulesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static SynonymRulesRequestSortBySorting create(SynonymRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new SynonymRulesRequestSortBySorting(sortBy, sortOrder);
    }
    public SynonymRulesRequestSortBySorting(SynonymRulesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public SynonymRulesRequestSortBySorting()
    {
    }
    public SynonymRulesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public SynonymRulesRequestSortBySorting setSortBy(SynonymRulesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public SynonymRulesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
