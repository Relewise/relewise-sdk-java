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
    defaultImpl = DataObjectDoubleRangeFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectDoubleRangeFacetResult extends DoubleDataObjectRangeFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectDoubleRangeFacetResult, Relewise.Client";
    public static DataObjectDoubleRangeFacetResult create(String key, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        return new DataObjectDoubleRangeFacetResult(key, selected, available);
    }
    public DataObjectDoubleRangeFacetResult(String key, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        this.key = key;
        this.selected = selected;
        this.available = available;
    }
    public DataObjectDoubleRangeFacetResult()
    {
    }
    @Override
    public DataObjectDoubleRangeFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
