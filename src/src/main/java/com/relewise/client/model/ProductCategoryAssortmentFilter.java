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
    defaultImpl = ProductCategoryAssortmentFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAssortmentFilter extends Filter implements IProductCategoryFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryAssortmentFilter, Relewise.Client";
    public ArrayList<Integer> assortments;
    public static ProductCategoryAssortmentFilter create()
    {
        return new ProductCategoryAssortmentFilter();
    }
    public ProductCategoryAssortmentFilter()
    {
        this.negated = false;
    }
    public static ProductCategoryAssortmentFilter create(Boolean negated)
    {
        return new ProductCategoryAssortmentFilter(negated);
    }
    public ProductCategoryAssortmentFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<Integer> getAssortments()
    {
        return this.assortments;
    }
    public ProductCategoryAssortmentFilter setAssortments(Integer... assortments)
    {
        this.assortments = new ArrayList<>(Arrays.asList(assortments));;
        return this;
    }
    public ProductCategoryAssortmentFilter addToAssortments(Integer assortments)
    {
        if (this.assortments == null)
        {
            this.assortments = new ArrayList<>();
        }
        this.assortments.add(assortments);
        return this;
    }
    @Override
    public ProductCategoryAssortmentFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryAssortmentFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
