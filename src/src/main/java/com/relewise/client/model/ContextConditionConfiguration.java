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
public class ContextConditionConfiguration
{
    public ArrayList<RequestContextFilter> filters;
    public static ContextConditionConfiguration create()
    {
        return new ContextConditionConfiguration();
    }
    public ContextConditionConfiguration()
    {
    }
    public ArrayList<RequestContextFilter> getFilters()
    {
        return this.filters;
    }
    public ContextConditionConfiguration setFilters(RequestContextFilter... filters)
    {
        this.filters = new ArrayList<>(Arrays.asList(filters));;
        return this;
    }
    public ContextConditionConfiguration addToFilters(RequestContextFilter filters)
    {
        if (this.filters == null)
        {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filters);
        return this;
    }
}
