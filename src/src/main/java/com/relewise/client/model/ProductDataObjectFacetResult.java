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
    defaultImpl = ProductDataObjectFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDataObjectFacetResult extends DataObjectFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataObjectFacetResult, Relewise.Client";
    public DataSelectionStrategy dataSelectionStrategy;
    public static ProductDataObjectFacetResult create(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<FacetResult> items, DataObjectFilter filter, FacetEvaluationMode evaluationMode)
    {
        return new ProductDataObjectFacetResult(dataSelectionStrategy, key, items, filter, evaluationMode);
    }
    public ProductDataObjectFacetResult(DataSelectionStrategy dataSelectionStrategy, String key, ArrayList<FacetResult> items, DataObjectFilter filter, FacetEvaluationMode evaluationMode)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        this.key = key;
        this.items = items;
        this.filter = filter;
        this.evaluationMode = evaluationMode;
    }
    public ProductDataObjectFacetResult()
    {
    }
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public ProductDataObjectFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public ProductDataObjectFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductDataObjectFacetResult setItems(FacetResult... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public ProductDataObjectFacetResult addToItems(FacetResult items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
    @Override
    public ProductDataObjectFacetResult setFilter(DataObjectFilter filter)
    {
        this.filter = filter;
        return this;
    }
    @Override
    public ProductDataObjectFacetResult setEvaluationMode(FacetEvaluationMode evaluationMode)
    {
        this.evaluationMode = evaluationMode;
        return this;
    }
    @Override
    public ProductDataObjectFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
