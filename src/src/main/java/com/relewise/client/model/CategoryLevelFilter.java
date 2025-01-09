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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryLevelFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryLevelFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryLevelFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryLevelFilter, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategoryLevelFilter extends Filter
{
    public String $type = "";
    public ArrayList<Integer> levels;
    public ArrayList<Integer> getLevels()
    {
        return this.levels;
    }
    public CategoryLevelFilter setLevels(Integer... levels)
    {
        this.levels = new ArrayList<>(Arrays.asList(levels));;
        return this;
    }
    public CategoryLevelFilter addToLevels(Integer levels)
    {
        if (this.levels == null)
        {
            this.levels = new ArrayList<>();
        }
        this.levels.add(levels);
        return this;
    }
    @Override
    public CategoryLevelFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CategoryLevelFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
