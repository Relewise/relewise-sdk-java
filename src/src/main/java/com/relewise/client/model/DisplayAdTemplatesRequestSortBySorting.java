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
public class DisplayAdTemplatesRequestSortBySorting
{
    public DisplayAdTemplatesRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static DisplayAdTemplatesRequestSortBySorting create(DisplayAdTemplatesRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new DisplayAdTemplatesRequestSortBySorting(sortBy, sortOrder);
    }
    public DisplayAdTemplatesRequestSortBySorting(DisplayAdTemplatesRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public DisplayAdTemplatesRequestSortBySorting()
    {
    }
    public DisplayAdTemplatesRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public DisplayAdTemplatesRequestSortBySorting setSortBy(DisplayAdTemplatesRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public DisplayAdTemplatesRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
