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
public abstract class DoubleRangeFacetResult extends FacetResult
{
    public String $type = "";
    public DoubleRange selected;
    public DoubleRangeAvailableFacetValue available;
    public DoubleRange getSelected()
    {
        return this.selected;
    }
    public DoubleRangeAvailableFacetValue getAvailable()
    {
        return this.available;
    }
    public DoubleRangeFacetResult setSelected(DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    public DoubleRangeFacetResult setAvailable(DoubleRangeAvailableFacetValue available)
    {
        this.available = available;
        return this;
    }
    @Override
    public DoubleRangeFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
