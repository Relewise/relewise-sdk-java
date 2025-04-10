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
    defaultImpl = ProductDataDoubleRangeFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataDoubleRangeFacetResult extends DoubleProductDataRangeFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleRangeFacetResult, Relewise.Client";
    public static ProductDataDoubleRangeFacetResult create(String key, DataSelectionStrategy dataSelectionStrategy, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        return new ProductDataDoubleRangeFacetResult(key, dataSelectionStrategy, selected, available);
    }
    public ProductDataDoubleRangeFacetResult(String key, DataSelectionStrategy dataSelectionStrategy, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        this.key = key;
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.selected = selected;
        this.available = available;
    }
    public ProductDataDoubleRangeFacetResult()
    {
    }
    @Override
    public ProductDataDoubleRangeFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;
        return this;
    }
    @Override
    public ProductDataDoubleRangeFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
