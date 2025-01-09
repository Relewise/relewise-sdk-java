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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Product depending on if the product is in a category that matches the given <code>CategoryId</code> and <code>EvaluationScope</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryIdRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryIdRelevanceModifier, Relewise.Client";
    /** The Id of the Category that this <code>RelevanceModifier</code> will multiply the weight for. */
    public String categoryId;
    /** The relative Category levels that this <code>RelevanceModifier</code> should match with. */
    public CategoryScope evaluationScope;
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double multiplyWeightBy;
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match the specific <code>CategoryId</code> instead. */
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on if the product is in a category that matches the given <code>CategoryId</code> and <code>EvaluationScope</code>.
     * @param categoryId The Id of the Category that this RelevanceModifier will multiply the weight for.
     * @param evaluationScope The relative Category levels that this RelevanceModifier should match with.
     * @param multiplyWeightBy The weight that this RelevanceModifier will multiply relevant products with.
     * @param negated Determines whether this RelevanceModifier should apply to all the Products that don't match the specific CategoryId instead.
     */
    public static ProductCategoryIdRelevanceModifier create(String categoryId, CategoryScope evaluationScope, Double multiplyWeightBy, Boolean negated)
    {
        return new ProductCategoryIdRelevanceModifier(categoryId, evaluationScope, multiplyWeightBy, negated);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Product depending on if the product is in a category that matches the given <code>CategoryId</code> and <code>EvaluationScope</code>.
     * @param categoryId The Id of the Category that this RelevanceModifier will multiply the weight for.
     * @param evaluationScope The relative Category levels that this RelevanceModifier should match with.
     * @param multiplyWeightBy The weight that this RelevanceModifier will multiply relevant products with.
     * @param negated Determines whether this RelevanceModifier should apply to all the Products that don't match the specific CategoryId instead.
     */
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
    /** The Id of the Category that this <code>RelevanceModifier</code> will multiply the weight for. */
    public String getCategoryId()
    {
        return this.categoryId;
    }
    /** The relative Category levels that this <code>RelevanceModifier</code> should match with. */
    public CategoryScope getEvaluationScope()
    {
        return this.evaluationScope;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match the specific <code>CategoryId</code> instead. */
    public Boolean getNegated()
    {
        return this.negated;
    }
    /** The Id of the Category that this <code>RelevanceModifier</code> will multiply the weight for. */
    public ProductCategoryIdRelevanceModifier setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
        return this;
    }
    /** The relative Category levels that this <code>RelevanceModifier</code> should match with. */
    public ProductCategoryIdRelevanceModifier setEvaluationScope(CategoryScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        return this;
    }
    /** The weight that this <code>RelevanceModifier</code> will multiply relevant products with. */
    public ProductCategoryIdRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** Determines whether this <code>RelevanceModifier</code> should apply to all the Products that don't match the specific <code>CategoryId</code> instead. */
    public ProductCategoryIdRelevanceModifier setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public ProductCategoryIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
