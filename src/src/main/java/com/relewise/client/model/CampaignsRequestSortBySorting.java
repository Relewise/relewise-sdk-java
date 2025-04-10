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
public class CampaignsRequestSortBySorting
{
    public CampaignsRequestSortBy sortBy;
    public SortOrder sortOrder;
    public static CampaignsRequestSortBySorting create(CampaignsRequestSortBy sortBy, SortOrder sortOrder)
    {
        return new CampaignsRequestSortBySorting(sortBy, sortOrder);
    }
    public CampaignsRequestSortBySorting(CampaignsRequestSortBy sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public CampaignsRequestSortBySorting()
    {
    }
    public CampaignsRequestSortBy getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public CampaignsRequestSortBySorting setSortBy(CampaignsRequestSortBy sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public CampaignsRequestSortBySorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
