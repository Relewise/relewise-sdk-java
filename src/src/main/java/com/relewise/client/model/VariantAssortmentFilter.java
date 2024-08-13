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
    defaultImpl = VariantAssortmentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantAssortmentFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantAssortmentFilter, Relewise.Client";
    public ArrayList<Integer> assortments;
    public static VariantAssortmentFilter create()
    {
        return new VariantAssortmentFilter();
    }
    public VariantAssortmentFilter()
    {
        this.negated = false;
    }
    public static VariantAssortmentFilter create(Boolean negated)
    {
        return new VariantAssortmentFilter(negated);
    }
    public VariantAssortmentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public VariantAssortmentFilter setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public VariantAssortmentFilter addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    @Override
    public VariantAssortmentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public VariantAssortmentFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
