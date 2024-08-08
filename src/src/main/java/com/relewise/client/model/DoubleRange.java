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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoubleRange
{
    public @Nullable Double lowerBoundInclusive;
    public @Nullable Double upperBoundInclusive;
    public static DoubleRange create(@Nullable Double lowerBoundInclusive, @Nullable Double upperBoundInclusive)
    {
        return new DoubleRange(lowerBoundInclusive, upperBoundInclusive);
    }
    public DoubleRange(@Nullable Double lowerBoundInclusive, @Nullable Double upperBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;
        this.upperBoundInclusive = upperBoundInclusive;
    }
    public DoubleRange()
    {
    }
    public @Nullable Double getLowerBoundInclusive()
    {
        return this.lowerBoundInclusive;
    }
    public @Nullable Double getUpperBoundInclusive()
    {
        return this.upperBoundInclusive;
    }
    public DoubleRange setLowerBoundInclusive(@Nullable Double lowerBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;;
        return this;
    }
    public DoubleRange setUpperBoundInclusive(@Nullable Double upperBoundInclusive)
    {
        this.upperBoundInclusive = upperBoundInclusive;;
        return this;
    }
}
