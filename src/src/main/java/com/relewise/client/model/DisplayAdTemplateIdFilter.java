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
    defaultImpl = DisplayAdTemplateIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplateIdFilter extends Filter implements IDisplayAdTemplateFilter, IDisplayAdFilter
{
    public String $type = "Relewise.Client.Requests.Filters.DisplayAdTemplateIdFilter, Relewise.Client";
    public @Nullable ArrayList<UUID> ids;
    public static DisplayAdTemplateIdFilter create()
    {
        return new DisplayAdTemplateIdFilter();
    }
    public DisplayAdTemplateIdFilter()
    {
        this.negated = false;
    }
    public static DisplayAdTemplateIdFilter create(Boolean negated)
    {
        return new DisplayAdTemplateIdFilter(negated);
    }
    public DisplayAdTemplateIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public @Nullable ArrayList<UUID> getIds()
    {
        return this.ids;
    }
    public DisplayAdTemplateIdFilter setIds(UUID... ids)
    {
        this.ids = new ArrayList<>(Arrays.asList(ids));;
        return this;
    }
    public DisplayAdTemplateIdFilter addToIds(UUID ids)
    {
        if (this.ids == null)
        {
            this.ids = new ArrayList<>();
        }
        this.ids.add(ids);
        return this;
    }
    @Override
    public DisplayAdTemplateIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public DisplayAdTemplateIdFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
