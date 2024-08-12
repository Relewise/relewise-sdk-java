package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = ProductCategoryIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryIdFilter extends CategoryIdFilter implements IProductFilter, ICategoryFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductCategoryIdFilter, Relewise.Client";
    public static ProductCategoryIdFilter create(CategoryScope evaluationScope)
    {
        return new ProductCategoryIdFilter(evaluationScope);
    }
    public ProductCategoryIdFilter(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        this.negated = false;
    }
    public static ProductCategoryIdFilter create(CategoryScope evaluationScope, Boolean negated)
    {
        return new ProductCategoryIdFilter(evaluationScope, negated);
    }
    public ProductCategoryIdFilter(CategoryScope evaluationScope, Boolean negated)
    {
        this.evaluationScope = evaluationScope;
        this.negated = negated;
    }
    public ProductCategoryIdFilter()
    {
        this.negated = false;
    }
    @Override
    public ProductCategoryIdFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public ProductCategoryIdFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public ProductCategoryIdFilter setEvaluationScope(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        return this;
    }
    @Override
    public ProductCategoryIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
