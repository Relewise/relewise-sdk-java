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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegerRange
{
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
        this.lowerBoundInclusive = lowerBoundInclusive;
        return this;
    }
    public IntegerRange setUpperBoundInclusive(@Nullable Integer upperBoundInclusive)
    {
        this.upperBoundInclusive = upperBoundInclusive;
        return this;
    }
}
