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
public class FacetSettings
{
    public Boolean alwaysIncludeSelectedInAvailable;
    public Boolean includeZeroHitsInAvailable;
    /** Defines how to sort the returned available facets Supported sorting are: null (default) or <code>ByHitsFacetSorting</code> */
    public @Nullable FacetSorting sorting;
    /** Limits how many available values can be returned for this facet. If this is used together with a <code>Sorting</code> then it will take the first values after the available values have been sorted. Note: 'Selected' values are always included in the available values, even if they exceed the Take limit, this is to ensure that the selected value is always visible to the user and avoid filtering by hidden facets */
    public @Nullable Integer take;
    public static FacetSettings create()
    {
        return new FacetSettings();
    }
    public FacetSettings()
    {
    }
    public Boolean getAlwaysIncludeSelectedInAvailable()
    {
        return this.alwaysIncludeSelectedInAvailable;
    }
    public Boolean getIncludeZeroHitsInAvailable()
    {
        return this.includeZeroHitsInAvailable;
    }
    /** Defines how to sort the returned available facets Supported sorting are: null (default) or <code>ByHitsFacetSorting</code> */
    public @Nullable FacetSorting getSorting()
    {
        return this.sorting;
    }
    /** Limits how many available values can be returned for this facet. If this is used together with a <code>Sorting</code> then it will take the first values after the available values have been sorted. Note: 'Selected' values are always included in the available values, even if they exceed the Take limit, this is to ensure that the selected value is always visible to the user and avoid filtering by hidden facets */
    public @Nullable Integer getTake()
    {
        return this.take;
    }
    public FacetSettings setAlwaysIncludeSelectedInAvailable(Boolean alwaysIncludeSelectedInAvailable)
    {
        this.alwaysIncludeSelectedInAvailable = alwaysIncludeSelectedInAvailable;
        return this;
    }
    public FacetSettings setIncludeZeroHitsInAvailable(Boolean includeZeroHitsInAvailable)
    {
        this.includeZeroHitsInAvailable = includeZeroHitsInAvailable;
        return this;
    }
    /** Defines how to sort the returned available facets Supported sorting are: null (default) or <code>ByHitsFacetSorting</code> */
    public FacetSettings setSorting(@Nullable FacetSorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
    /** Limits how many available values can be returned for this facet. If this is used together with a <code>Sorting</code> then it will take the first values after the available values have been sorted. Note: 'Selected' values are always included in the available values, even if they exceed the Take limit, this is to ensure that the selected value is always visible to the user and avoid filtering by hidden facets */
    public FacetSettings setTake(@Nullable Integer take)
    {
        this.take = take;
        return this;
    }
}
