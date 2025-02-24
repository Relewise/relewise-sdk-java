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
    defaultImpl = ProductCategoryAssortmentFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAssortmentFacetResult extends AssortmentFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryAssortmentFacetResult, Relewise.Client";
    public static ProductCategoryAssortmentFacetResult create(AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        return new ProductCategoryAssortmentFacetResult(assortmentFilterType, selected, available);
    }
    public ProductCategoryAssortmentFacetResult(AssortmentFilterType assortmentFilterType, ArrayList<Integer> selected, IntegerAvailableFacetValue... available)
    {
        this.assortmentFilterType = assortmentFilterType;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public ProductCategoryAssortmentFacetResult()
    {
    }
    @Override
    public ProductCategoryAssortmentFacetResult setAssortmentFilterType(AssortmentFilterType assortmentFilterType)
    {
        this.assortmentFilterType = assortmentFilterType;
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacetResult setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryAssortmentFacetResult addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacetResult setAvailable(IntegerAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public ProductCategoryAssortmentFacetResult addToAvailable(IntegerAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
