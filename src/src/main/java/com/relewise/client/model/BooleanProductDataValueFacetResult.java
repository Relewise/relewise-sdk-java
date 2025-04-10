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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BooleanProductDataValueFacetResult extends BooleanDataValueFacetResult
{
    public String $type = "";
    public DataSelectionStrategy dataSelectionStrategy;
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public BooleanProductDataValueFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;
        return this;
    }
    @Override
    public BooleanProductDataValueFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public BooleanProductDataValueFacetResult setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public BooleanProductDataValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public BooleanProductDataValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public BooleanProductDataValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public BooleanProductDataValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public BooleanProductDataValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
