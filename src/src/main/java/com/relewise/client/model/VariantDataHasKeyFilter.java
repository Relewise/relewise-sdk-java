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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantDataHasKeyFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantDataHasKeyFilter, Relewise.Client";
    public String key;
    public static VariantDataHasKeyFilter create(String key)
    {
        return new VariantDataHasKeyFilter(key);
    }
    public VariantDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static VariantDataHasKeyFilter create(String key, Boolean negated)
    {
        return new VariantDataHasKeyFilter(key, negated);
    }
    public VariantDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public VariantDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public VariantDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public VariantDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
