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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TimeSpan.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeSpan implements IComparable, TimeSpanIComparable, TimeSpanIEquatable, ISpanFormattable, IFormattable, TimeSpanISpanParsable, TimeSpanIParsable, IUtf8SpanFormattable
{
    public String $type = "System.TimeSpan, System.Private.CoreLib";
    public Long ticks;
    public Integer days;
    public Integer hours;
    public Integer milliseconds;
    public Integer microseconds;
    public Integer nanoseconds;
    public Integer minutes;
    public Integer seconds;
    public Double totalDays;
    public Double totalHours;
    public Double totalMilliseconds;
    public Double totalMicroseconds;
    public Double totalNanoseconds;
    public Double totalMinutes;
    public Double totalSeconds;
    public static TimeSpan create(Long ticks)
    {
        return new TimeSpan(ticks);
    }
    public TimeSpan(Long ticks)
    {
        this.ticks = ticks;
    }
    public TimeSpan()
    {
    }
    public Long getTicks()
    {
        return this.ticks;
    }
    public Integer getDays()
    {
        return this.days;
    }
    public Integer getHours()
    {
        return this.hours;
    }
    public Integer getMilliseconds()
    {
        return this.milliseconds;
    }
    public Integer getMicroseconds()
    {
        return this.microseconds;
    }
    public Integer getNanoseconds()
    {
        return this.nanoseconds;
    }
    public Integer getMinutes()
    {
        return this.minutes;
    }
    public Integer getSeconds()
    {
        return this.seconds;
    }
    public Double getTotalDays()
    {
        return this.totalDays;
    }
    public Double getTotalHours()
    {
        return this.totalHours;
    }
    public Double getTotalMilliseconds()
    {
        return this.totalMilliseconds;
    }
    public Double getTotalMicroseconds()
    {
        return this.totalMicroseconds;
    }
    public Double getTotalNanoseconds()
    {
        return this.totalNanoseconds;
    }
    public Double getTotalMinutes()
    {
        return this.totalMinutes;
    }
    public Double getTotalSeconds()
    {
        return this.totalSeconds;
    }
    public TimeSpan setTicks(Long ticks)
    {
        this.ticks = ticks;
        return this;
    }
    public TimeSpan setDays(Integer days)
    {
        this.days = days;
        return this;
    }
    public TimeSpan setHours(Integer hours)
    {
        this.hours = hours;
        return this;
    }
    public TimeSpan setMilliseconds(Integer milliseconds)
    {
        this.milliseconds = milliseconds;
        return this;
    }
    public TimeSpan setMicroseconds(Integer microseconds)
    {
        this.microseconds = microseconds;
        return this;
    }
    public TimeSpan setNanoseconds(Integer nanoseconds)
    {
        this.nanoseconds = nanoseconds;
        return this;
    }
    public TimeSpan setMinutes(Integer minutes)
    {
        this.minutes = minutes;
        return this;
    }
    public TimeSpan setSeconds(Integer seconds)
    {
        this.seconds = seconds;
        return this;
    }
    public TimeSpan setTotalDays(Double totalDays)
    {
        this.totalDays = totalDays;
        return this;
    }
    public TimeSpan setTotalHours(Double totalHours)
    {
        this.totalHours = totalHours;
        return this;
    }
    public TimeSpan setTotalMilliseconds(Double totalMilliseconds)
    {
        this.totalMilliseconds = totalMilliseconds;
        return this;
    }
    public TimeSpan setTotalMicroseconds(Double totalMicroseconds)
    {
        this.totalMicroseconds = totalMicroseconds;
        return this;
    }
    public TimeSpan setTotalNanoseconds(Double totalNanoseconds)
    {
        this.totalNanoseconds = totalNanoseconds;
        return this;
    }
    public TimeSpan setTotalMinutes(Double totalMinutes)
    {
        this.totalMinutes = totalMinutes;
        return this;
    }
    public TimeSpan setTotalSeconds(Double totalSeconds)
    {
        this.totalSeconds = totalSeconds;
        return this;
    }
}
