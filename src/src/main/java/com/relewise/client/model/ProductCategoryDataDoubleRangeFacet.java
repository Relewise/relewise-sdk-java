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
    defaultImpl = ProductCategoryDataDoubleRangeFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataDoubleRangeFacet extends DoubleProductCategoryDataRangeFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleRangeFacet, Relewise.Client";
    public static ProductCategoryDataDoubleRangeFacet create(String key, DoubleRange selected)
    {
        return new ProductCategoryDataDoubleRangeFacet(key, selected);
    }
    public ProductCategoryDataDoubleRangeFacet(String key, DoubleRange selected)
    {
        this.key = key;
        this.selected = selected;
    }
    public ProductCategoryDataDoubleRangeFacet()
    {
    }
    @Override
    public ProductCategoryDataDoubleRangeFacet setSelected(@Nullable DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductCategoryDataDoubleRangeFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
