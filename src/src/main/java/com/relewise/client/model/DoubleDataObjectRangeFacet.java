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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DoubleDataObjectRangeFacet extends DoubleDataRangeFacet
{
    public String $type = "";
    @Override
    public DoubleDataObjectRangeFacet setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
