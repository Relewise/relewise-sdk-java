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
    defaultImpl = VariantDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantDisabledFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantDisabledFilter, Relewise.Client";
    public static VariantDisabledFilter create()
    {
        return new VariantDisabledFilter();
    }
    public VariantDisabledFilter()
    {
        this.negated = false;
    }
    public static VariantDisabledFilter create(Boolean negated)
    {
        return new VariantDisabledFilter(negated);
    }
    public VariantDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public VariantDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
