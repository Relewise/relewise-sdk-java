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
    @JsonSubTypes.Type(value = ProductCategoryIdFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryIdFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryIdFilter, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategoryIdFilter extends Filter
{
    public String $type = "";
    public ArrayList<String> categoryIds;
    public CategoryScope evaluationScope;
    public ArrayList<String> getCategoryIds()
    {
        return this.categoryIds;
    }
    public CategoryScope getEvaluationScope()
    {
        return this.evaluationScope;
    }
    public CategoryIdFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public CategoryIdFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    public CategoryIdFilter setEvaluationScope(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        return this;
    }
    @Override
    public CategoryIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CategoryIdFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
