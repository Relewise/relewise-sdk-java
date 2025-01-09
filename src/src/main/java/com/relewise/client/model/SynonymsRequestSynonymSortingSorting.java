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
public class SynonymsRequestSynonymSortingSorting
{
    public SynonymsRequestSynonymSorting sortBy;
    public SortOrder sortOrder;
    public static SynonymsRequestSynonymSortingSorting create(SynonymsRequestSynonymSorting sortBy, SortOrder sortOrder)
    {
        return new SynonymsRequestSynonymSortingSorting(sortBy, sortOrder);
    }
    public SynonymsRequestSynonymSortingSorting(SynonymsRequestSynonymSorting sortBy, SortOrder sortOrder)
    {
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
    }
    public SynonymsRequestSynonymSortingSorting()
    {
    }
    public SynonymsRequestSynonymSorting getSortBy()
    {
        return this.sortBy;
    }
    public SortOrder getSortOrder()
    {
        return this.sortOrder;
    }
    public SynonymsRequestSynonymSortingSorting setSortBy(SynonymsRequestSynonymSorting sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }
    public SynonymsRequestSynonymSortingSorting setSortOrder(SortOrder sortOrder)
    {
        this.sortOrder = sortOrder;
        return this;
    }
}
