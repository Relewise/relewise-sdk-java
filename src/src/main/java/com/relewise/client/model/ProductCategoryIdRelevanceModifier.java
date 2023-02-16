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
    defaultImpl = ProductCategoryIdRelevanceModifier.class)
public class ProductCategoryIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryIdRelevanceModifier, Relewise.Client";
    public String categoryId;
    public CategoryScope evaluationScope;
    public Double multiplyWeightBy;
    public Boolean negated;
    public static ProductCategoryIdRelevanceModifier create(String categoryId, CategoryScope evaluationScope)
    {
        return new ProductCategoryIdRelevanceModifier(categoryId, evaluationScope);
    }
    public ProductCategoryIdRelevanceModifier(String categoryId, CategoryScope evaluationScope)
    {
        this.categoryId = categoryId;
        this.evaluationScope = evaluationScope;
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    public static ProductCategoryIdRelevanceModifier create(String categoryId, CategoryScope evaluationScope, Double multiplyWeightBy, Boolean negated)
    {
        return new ProductCategoryIdRelevanceModifier(categoryId, evaluationScope, multiplyWeightBy, negated);
    }
    public ProductCategoryIdRelevanceModifier(String categoryId, CategoryScope evaluationScope, Double multiplyWeightBy, Boolean negated)
    {
        this.categoryId = categoryId;
        this.evaluationScope = evaluationScope;
        this.multiplyWeightBy = multiplyWeightBy;
        this.negated = negated;
    }
    public ProductCategoryIdRelevanceModifier()
    {
        this.multiplyWeightBy = 1d;
        this.negated = false;
    }
    public String getCategoryId()
    {
        return this.categoryId;
    }
    public CategoryScope getEvaluationScope()
    {
        return this.evaluationScope;
    }
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    public Boolean getNegated()
    {
        return this.negated;
    }
    public ProductCategoryIdRelevanceModifier setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;;
        return this;
    }
    public ProductCategoryIdRelevanceModifier setEvaluationScope(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;;
        return this;
    }
    public ProductCategoryIdRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    public ProductCategoryIdRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
    @Override
    public ProductCategoryIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}
