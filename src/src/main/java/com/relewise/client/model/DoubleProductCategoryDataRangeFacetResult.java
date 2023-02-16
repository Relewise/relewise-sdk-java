package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
public abstract class DoubleProductCategoryDataRangeFacetResult extends DoubleRangeFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataRangeFacetResult`1[[System.Nullable`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public String key;
    public String getKey()
    {
        return this.key;
    }
    public DoubleProductCategoryDataRangeFacetResult setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacetResult setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
}
