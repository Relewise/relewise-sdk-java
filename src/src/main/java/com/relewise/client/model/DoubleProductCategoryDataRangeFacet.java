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
public abstract class DoubleProductCategoryDataRangeFacet extends DoubleDataRangeFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataRangeFacet`1[[System.Nullable`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    @Override
    public DoubleProductCategoryDataRangeFacet setSelected(DoubleRange selected)
    {
        this.selected = selected;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacet setKey(String key)
    {
        this.key = key;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacet setField(FacetingField field)
    {
        this.field = field;;
        return this;
    }
    @Override
    public DoubleProductCategoryDataRangeFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;;
        return this;
    }
}
