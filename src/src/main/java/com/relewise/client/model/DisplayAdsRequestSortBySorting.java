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
public class DisplayAdsRequestSortBySorting
{
    public DisplayAdsRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static DisplayAdsRequestSortBySorting create(DisplayAdsRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new DisplayAdsRequestSortBySorting(sortBy, sortOrder);
    }
    public DisplayAdsRequestSortBySorting(DisplayAdsRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public DisplayAdsRequestSortBySorting()
    {
    }
    public DisplayAdsRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public DisplayAdsRequestSortBySorting setSortBy(DisplayAdsRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public DisplayAdsRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
