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
public class FilteredVariantsSettings
{
    public @Nullable FilterCollection filters;
    public @Nullable Boolean inheritFiltersFromRequest;
    public static FilteredVariantsSettings create()
    {
        return new FilteredVariantsSettings();
    }
    public FilteredVariantsSettings()
    {
    }
    public @Nullable FilterCollection getFilters()
    {
        return this.filters;
    }
    public @Nullable Boolean getInheritFiltersFromRequest()
    {
        return this.inheritFiltersFromRequest;
    }
    public FilteredVariantsSettings setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public FilteredVariantsSettings setInheritFiltersFromRequest(@Nullable Boolean inheritFiltersFromRequest)
    {
        this.inheritFiltersFromRequest = inheritFiltersFromRequest;
        return this;
    }
}
