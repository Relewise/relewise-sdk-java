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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DoubleProductDataRangeFacetResult extends DoubleRangeFacetResult
{
    public String $type = "";
    public String key;
    public DataSelectionStrategy dataSelectionStrategy;
    public String getKey()
    {
        return this.key;
    }
    public DataSelectionStrategy getDataSelectionStrategy()
    {
        return this.dataSelectionStrategy;
    }
    public DoubleProductDataRangeFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public DoubleProductDataRangeFacetResult setDataSelectionStrategy(DataSelectionStrategy dataSelectionStrategy)
    {
        this.dataSelectionStrategy = dataSelectionStrategy;;
        return this;
    }
    @Override
    public DoubleProductDataRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;;
        return this;
    }
    @Override
    public DoubleProductDataRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;;
        return this;
    }
    @Override
    public DoubleProductDataRangeFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}
