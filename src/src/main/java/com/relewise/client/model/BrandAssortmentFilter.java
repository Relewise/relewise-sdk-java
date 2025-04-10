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
    defaultImpl = BrandAssortmentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandAssortmentFilter extends Filter implements IBrandFilter
{
    public String $type = "Relewise.Client.Requests.Filters.BrandAssortmentFilter, Relewise.Client";
    public ArrayList<Integer> assortments;
    public static BrandAssortmentFilter create()
    {
        return new BrandAssortmentFilter();
    }
    public BrandAssortmentFilter()
    {
        this.negated = false;
    }
    public static BrandAssortmentFilter create(Boolean negated)
    {
        return new BrandAssortmentFilter(negated);
    }
    public BrandAssortmentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public BrandAssortmentFilter setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public BrandAssortmentFilter addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    @Override
    public BrandAssortmentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public BrandAssortmentFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
