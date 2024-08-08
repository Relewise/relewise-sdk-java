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
    defaultImpl = ContentDataDoubleRangeFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleRangeFacetResult extends DoubleContentDataRangeFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleRangeFacetResult, Relewise.Client";
    public static ContentDataDoubleRangeFacetResult create(String key, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        return new ContentDataDoubleRangeFacetResult(key, selected, available);
    }
    public ContentDataDoubleRangeFacetResult(String key, DoubleRange selected, DoubleRangeAvailableFacetValue available)
    {
        this.key = key;
        this.selected = selected;
        this.available = available;
    }
    public ContentDataDoubleRangeFacetResult()
    {
    }
    @Override
    public ContentDataDoubleRangeFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}
