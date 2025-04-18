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
public abstract class DoubleDataObjectRangeFacetResult extends DoubleRangeFacetResult
{
    public String $type = "";
    public String key;
    public String getKey()
    {
        return this.key;
    }
    public DoubleDataObjectRangeFacetResult setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;
        return this;
    }
    @Override
    public DoubleDataObjectRangeFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
