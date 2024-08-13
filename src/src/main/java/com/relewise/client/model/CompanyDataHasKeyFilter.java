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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CompanyDataHasKeyFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDataHasKeyFilter extends Filter implements ICompanyFilter
{
    public String $type = "Relewise.Client.Requests.Filters.CompanyDataHasKeyFilter, Relewise.Client";
    public String key;
    public static CompanyDataHasKeyFilter create(String key)
    {
        return new CompanyDataHasKeyFilter(key);
    }
    public CompanyDataHasKeyFilter(String key)
    {
        this.key = key;
        this.negated = false;
    }
    public static CompanyDataHasKeyFilter create(String key, Boolean negated)
    {
        return new CompanyDataHasKeyFilter(key, negated);
    }
    public CompanyDataHasKeyFilter(String key, Boolean negated)
    {
        this.key = key;
        this.negated = negated;
    }
    public CompanyDataHasKeyFilter()
    {
        this.negated = false;
    }
    public String getKey()
    {
        return this.key;
    }
    public CompanyDataHasKeyFilter setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public CompanyDataHasKeyFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CompanyDataHasKeyFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
