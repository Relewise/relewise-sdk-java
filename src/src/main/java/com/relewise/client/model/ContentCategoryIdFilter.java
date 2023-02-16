package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    property = "$type",
    defaultImpl = ContentCategoryIdFilter.class)
public class ContentCategoryIdFilter extends CategoryIdFilter implements IContentFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentCategoryIdFilter, Relewise.Client";
    public static ContentCategoryIdFilter create(CategoryScope evaluationScope)
    {
        return new ContentCategoryIdFilter(evaluationScope);
    }
    public ContentCategoryIdFilter(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        this.negated = false;
    }
    public static ContentCategoryIdFilter create(CategoryScope evaluationScope, Boolean negated)
    {
        return new ContentCategoryIdFilter(evaluationScope, negated);
    }
    public ContentCategoryIdFilter(CategoryScope evaluationScope, Boolean negated)
    {
        this.evaluationScope = evaluationScope;
        this.negated = negated;
    }
    public ContentCategoryIdFilter()
    {
        this.negated = false;
    }
    @Override
    public ContentCategoryIdFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ContentCategoryIdFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ContentCategoryIdFilter setEvaluationScope(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;;
        return this;
    }
    @Override
    public ContentCategoryIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
