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
    property = "$type",
    defaultImpl = DoubleChainableRange.class)
public class DoubleChainableRange
{
    public String $type = "Relewise.Client.DataTypes.ChainableRange`1[[System.Nullable`1[[System.Double, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public @Nullable Double lowerBoundInclusive;
    public @Nullable Double upperBoundExclusive;
    public static DoubleChainableRange create(@Nullable Double lowerBoundInclusive, @Nullable Double upperBoundExclusive)
    {
        return new DoubleChainableRange(lowerBoundInclusive, upperBoundExclusive);
    }
    public DoubleChainableRange(@Nullable Double lowerBoundInclusive, @Nullable Double upperBoundExclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;
        this.upperBoundExclusive = upperBoundExclusive;
    }
    public DoubleChainableRange()
    {
    }
    public @Nullable Double getLowerBoundInclusive()
    {
        return this.lowerBoundInclusive;
    }
    public @Nullable Double getUpperBoundExclusive()
    {
        return this.upperBoundExclusive;
    }
    public DoubleChainableRange setLowerBoundInclusive(@Nullable Double lowerBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;;
        return this;
    }
    public DoubleChainableRange setUpperBoundExclusive(@Nullable Double upperBoundExclusive)
    {
        this.upperBoundExclusive = upperBoundExclusive;;
        return this;
    }
}
