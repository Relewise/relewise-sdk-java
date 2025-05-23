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
public class FilterCollection
{
    public @Nullable ArrayList<Filter> items;
    public static FilterCollection create(Filter... filters)
    {
        return new FilterCollection(filters);
    }
    public FilterCollection(Filter... filters)
    {
        this.items = new ArrayList<>(Arrays.asList(filters));
    }
    public FilterCollection()
    {
    }
    public @Nullable ArrayList<Filter> getItems()
    {
        return this.items;
    }
    public FilterCollection setItems(Filter... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public FilterCollection addToItems(Filter items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}
