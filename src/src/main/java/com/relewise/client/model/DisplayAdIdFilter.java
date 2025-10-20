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
    defaultImpl = DisplayAdIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdIdFilter extends Filter implements IDisplayAdFilter
{
    public String $type = "Relewise.Client.Requests.Filters.DisplayAdIdFilter, Relewise.Client";
    public @Nullable ArrayList<String> ids;
    public static DisplayAdIdFilter create()
    {
        return new DisplayAdIdFilter();
    }
    public DisplayAdIdFilter()
    {
        this.negated = false;
    }
    public static DisplayAdIdFilter create(Boolean negated)
    {
        return new DisplayAdIdFilter(negated);
    }
    public DisplayAdIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public @Nullable ArrayList<String> getIds()
    {
        return this.ids;
    }
    public DisplayAdIdFilter setIds(String... ids)
    {
        this.ids = new ArrayList<>(Arrays.asList(ids));;
        return this;
    }
    public DisplayAdIdFilter addToIds(String ids)
    {
        if (this.ids == null)
        {
            this.ids = new ArrayList<>();
        }
        this.ids.add(ids);
        return this;
    }
    @Override
    public DisplayAdIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public DisplayAdIdFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
