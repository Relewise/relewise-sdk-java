package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = ProductCategoryAssortmentFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAssortmentFacet extends AssortmentFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryAssortmentFacet, Relewise.Client";
    public static ProductCategoryAssortmentFacet create(AssortmentFilterType assortmentFilterType, Integer... selected)
    {
        return new ProductCategoryAssortmentFacet(assortmentFilterType, selected);
    }
    public ProductCategoryAssortmentFacet(AssortmentFilterType assortmentFilterType, Integer... selected)
    {
        this.assortmentFilterType = assortmentFilterType;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public ProductCategoryAssortmentFacet()
    {
    }
    @Override
    public ProductCategoryAssortmentFacet setAssortmentFilterType(AssortmentFilterType assortmentFilterType)
    {
        this.assortmentFilterType = assortmentFilterType;
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public ProductCategoryAssortmentFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryAssortmentFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
