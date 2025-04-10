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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalDateTimeRange
{
    public LocalDateTime lowerBoundInclusive;
    public LocalDateTime upperBoundInclusive;
    public static LocalDateTimeRange create(LocalDateTime lowerBoundInclusive, LocalDateTime upperBoundInclusive)
    {
        return new LocalDateTimeRange(lowerBoundInclusive, upperBoundInclusive);
    }
    public LocalDateTimeRange(LocalDateTime lowerBoundInclusive, LocalDateTime upperBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;
        this.upperBoundInclusive = upperBoundInclusive;
    }
    public LocalDateTimeRange()
    {
    }
    public LocalDateTime getLowerBoundInclusive()
    {
        return this.lowerBoundInclusive;
    }
    public LocalDateTime getUpperBoundInclusive()
    {
        return this.upperBoundInclusive;
    }
    public LocalDateTimeRange setLowerBoundInclusive(LocalDateTime lowerBoundInclusive)
    {
        this.lowerBoundInclusive = lowerBoundInclusive;
        return this;
    }
    public LocalDateTimeRange setUpperBoundInclusive(LocalDateTime upperBoundInclusive)
    {
        this.upperBoundInclusive = upperBoundInclusive;
        return this;
    }
}
