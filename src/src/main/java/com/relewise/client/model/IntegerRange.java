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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = IntegerRange.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegerRange
{
    public String $type = "Relewise.Client.DataTypes.Range`1[[System.Nullable`1[[System.Int32, System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], System.Private.CoreLib, Version=7.0.0.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e]], Relewise.Client";
    public @Nullable Integer lowerBoundInclusive;
    public @Nullable Integer upperBoundInclusive;
    public static IntegerRange create(@Nullable Integer lowerBoundInclusive, @Nullable Integer upperBoundInclusive)
    {
        return new IntegerRange(lowerBoundInclusive, upperBoundInclusive);
    }
    public IntegerRange(@Nullable Integer lowerBoundInclusive, @Nullable Integer upperBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;
        this.upperBoundInclusive = upperBoundInclusive;
    }
    public IntegerRange()
    {
    }
    public @Nullable Integer getLowerBoundInclusive()
    {
        return this.lowerBoundInclusive;
    }
    public @Nullable Integer getUpperBoundInclusive()
    {
        return this.upperBoundInclusive;
    }
    public IntegerRange setLowerBoundInclusive(@Nullable Integer lowerBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;;
        return this;
    }
    public IntegerRange setUpperBoundInclusive(@Nullable Integer upperBoundInclusive)
    {
        this.upperBoundInclusive = upperBoundInclusive;;
        return this;
    }
}
