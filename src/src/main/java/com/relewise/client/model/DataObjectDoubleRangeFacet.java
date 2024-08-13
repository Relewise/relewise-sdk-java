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
    defaultImpl = DataObjectDoubleRangeFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectDoubleRangeFacet extends DoubleDataObjectRangeFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectDoubleRangeFacet, Relewise.Client";
    public static DataObjectDoubleRangeFacet create(String key, DoubleRange selected)
    {
        return new DataObjectDoubleRangeFacet(key, selected);
    }
    public DataObjectDoubleRangeFacet(String key, DoubleRange selected)
    {
        this.key = key;
        this.selected = selected;
    }
    public DataObjectDoubleRangeFacet()
    {
    }
    @Override
    public DataObjectDoubleRangeFacet setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DataObjectDoubleRangeFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
