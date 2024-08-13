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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisersRequestSortBySorting
{
    public AdvertisersRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static AdvertisersRequestSortBySorting create(AdvertisersRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new AdvertisersRequestSortBySorting(sortBy, sortOrder);
    }
    public AdvertisersRequestSortBySorting(AdvertisersRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public AdvertisersRequestSortBySorting()
    {
    }
    public AdvertisersRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public AdvertisersRequestSortBySorting setSortBy(AdvertisersRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public AdvertisersRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
