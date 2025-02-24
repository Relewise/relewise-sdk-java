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
public abstract class DoubleDataRangeFacet extends Facet
{
    public String $type = "";
    public @Nullable DoubleRange selected;
    public String key;
    public @Nullable DoubleRange getSelected()
    {
        return this.selected;
    }
    public String getKey()
    {
        return this.key;
    }
    public DoubleDataRangeFacet setSelected(@Nullable DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    public DoubleDataRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DoubleDataRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DoubleDataRangeFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
