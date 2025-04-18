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
    defaultImpl = ProductDataDoubleRangeFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleRangeFacet extends DoubleProductDataRangeFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleRangeFacet, Relewise.Client";
    public static ProductDataDoubleRangeFacet create(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable DoubleRange selected)
    {
        return new ProductDataDoubleRangeFacet(key, dataSelectionStrategy, selected);
    }
    public ProductDataDoubleRangeFacet(String key, DataSelectionStrategy dataSelectionStrategy, @Nullable DoubleRange selected)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.selected = selected;
    }
    public ProductDataDoubleRangeFacet()
    {
    }
    @Override
    public ProductDataDoubleRangeFacet setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacet setSelected(@Nullable DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
