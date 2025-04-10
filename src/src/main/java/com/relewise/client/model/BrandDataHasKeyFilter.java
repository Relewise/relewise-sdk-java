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
    defaultImpl = BrandDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandDataHasKeyFilter extends Filter implements IBrandFilter
{
    public String $type = "Relewise.Client.Requests.Filters.BrandDataHasKeyFilter, Relewise.Client";
    public String key;
    public static BrandDataHasKeyFilter create(String key)
    {
        return new BrandDataHasKeyFilter(key);
    }
    public BrandDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static BrandDataHasKeyFilter create(String key, Boolean negated)
    {
        return new BrandDataHasKeyFilter(key, negated);
    }
    public BrandDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public BrandDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public BrandDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public BrandDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public BrandDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
