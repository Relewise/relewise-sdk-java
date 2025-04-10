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
    defaultImpl = ScheduledPeriod.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduledPeriod implements ISchedule
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.ScheduledPeriod, Relewise.Client";
    public @Nullable OffsetDateTime fromUtc;
    public @Nullable OffsetDateTime toUtc;
    public static ScheduledPeriod create(@Nullable OffsetDateTime fromUtc, @Nullable OffsetDateTime toUtc)
    {
        return new ScheduledPeriod(fromUtc, toUtc);
    }
    public ScheduledPeriod(@Nullable OffsetDateTime fromUtc, @Nullable OffsetDateTime toUtc)
    {
        this.fromUtc = fromUtc;
        this.toUtc = toUtc;
    }
    public ScheduledPeriod()
    {
    }
    public @Nullable OffsetDateTime getFromUtc()
    {
        return this.fromUtc;
    }
    public @Nullable OffsetDateTime getToUtc()
    {
        return this.toUtc;
    }
    public ScheduledPeriod setFromUtc(@Nullable OffsetDateTime fromUtc)
    {
        this.fromUtc = fromUtc;
        return this;
    }
    public ScheduledPeriod setToUtc(@Nullable OffsetDateTime toUtc)
    {
        this.toUtc = toUtc;
        return this;
    }
}
