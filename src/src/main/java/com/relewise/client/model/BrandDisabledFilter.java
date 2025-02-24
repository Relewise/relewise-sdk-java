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
    defaultImpl = BrandDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandDisabledFilter extends Filter implements IBrandFilter
{
    public String $type = "Relewise.Client.Requests.Filters.BrandDisabledFilter, Relewise.Client";
    public static BrandDisabledFilter create()
    {
        return new BrandDisabledFilter();
    }
    public BrandDisabledFilter()
    {
        this.negated = false;
    }
    public static BrandDisabledFilter create(Boolean negated)
    {
        return new BrandDisabledFilter(negated);
    }
    public BrandDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public BrandDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public BrandDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
