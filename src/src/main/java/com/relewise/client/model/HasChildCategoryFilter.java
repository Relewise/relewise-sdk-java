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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryHasChildFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasChildFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasChildFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasChildFilter, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HasChildCategoryFilter extends Filter
{
    public String $type = "";
    public ArrayList<String> categoryIds;
    public ArrayList<String> getCategoryIds()
    {
        return this.categoryIds;
    }
    public HasChildCategoryFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public HasChildCategoryFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public HasChildCategoryFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public HasChildCategoryFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
