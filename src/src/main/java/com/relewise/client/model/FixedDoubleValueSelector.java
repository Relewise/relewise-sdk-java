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
    property = "$type",
    defaultImpl = FixedDoubleValueSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedDoubleValueSelector extends ValueSelector
{
    public String $type = "Relewise.Client.Requests.ValueSelectors.FixedDoubleValueSelector, Relewise.Client";
    public Double value;
    public static FixedDoubleValueSelector create(Double value)
    {
        return new FixedDoubleValueSelector(value);
    }
    public FixedDoubleValueSelector(Double value)
    {
        this.value = value;
    }
    public FixedDoubleValueSelector()
    {
    }
    public Double getValue()
    {
        return this.value;
    }
    public FixedDoubleValueSelector setValue(Double value)
    {
        this.value = value;
        return this;
    }
}
