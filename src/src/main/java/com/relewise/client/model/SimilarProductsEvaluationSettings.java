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
    defaultImpl = SimilarProductsEvaluationSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimilarProductsEvaluationSettings
{
    public String $type = "Relewise.Client.Requests.Recommendations.SimilarProductsEvaluationSettings, Relewise.Client";
    public Double significanceOfSimilaritiesInDisplayName;
    public @Nullable TrimStringTransformer productDisplayNameTransformer;
    public Double significanceOfSimilarListPrice;
    public Double significanceOfCommonImmediateParentCategories;
    public Double significanceOfCommonParentsParentCategories;
    public Double significanceOfCommonAncestorCategories;
    public Double significanceOfCommonProductDataKeys;
    public Double significanceOfIdenticalProductDataValues;
    public @Nullable ArrayList<SignificantDataValue> significantProductDataFields;
    public Double significanceOfSimilarSalesPrice;
    public Double significanceOfSimilarBrand;
    public static SimilarProductsEvaluationSettings create()
    {
        return new SimilarProductsEvaluationSettings();
    }
    public SimilarProductsEvaluationSettings()
    {
    }
    public Double getSignificanceOfSimilaritiesInDisplayName()
    {
        return this.significanceOfSimilaritiesInDisplayName;
    }
    public @Nullable TrimStringTransformer getProductDisplayNameTransformer()
    {
        return this.productDisplayNameTransformer;
    }
    public Double getSignificanceOfSimilarListPrice()
    {
        return this.significanceOfSimilarListPrice;
    }
    public Double getSignificanceOfCommonImmediateParentCategories()
    {
        return this.significanceOfCommonImmediateParentCategories;
    }
    public Double getSignificanceOfCommonParentsParentCategories()
    {
        return this.significanceOfCommonParentsParentCategories;
    }
    public Double getSignificanceOfCommonAncestorCategories()
    {
        return this.significanceOfCommonAncestorCategories;
    }
    public Double getSignificanceOfCommonProductDataKeys()
    {
        return this.significanceOfCommonProductDataKeys;
    }
    public Double getSignificanceOfIdenticalProductDataValues()
    {
        return this.significanceOfIdenticalProductDataValues;
    }
    public @Nullable ArrayList<SignificantDataValue> getSignificantProductDataFields()
    {
        return this.significantProductDataFields;
    }
    public Double getSignificanceOfSimilarSalesPrice()
    {
        return this.significanceOfSimilarSalesPrice;
    }
    public Double getSignificanceOfSimilarBrand()
    {
        return this.significanceOfSimilarBrand;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfSimilaritiesInDisplayName(Double significanceOfSimilaritiesInDisplayName)
    {
        this.significanceOfSimilaritiesInDisplayName = significanceOfSimilaritiesInDisplayName;;
        return this;
    }
    public SimilarProductsEvaluationSettings setProductDisplayNameTransformer(TrimStringTransformer productDisplayNameTransformer)
    {
        this.productDisplayNameTransformer = productDisplayNameTransformer;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfSimilarListPrice(Double significanceOfSimilarListPrice)
    {
        this.significanceOfSimilarListPrice = significanceOfSimilarListPrice;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfCommonImmediateParentCategories(Double significanceOfCommonImmediateParentCategories)
    {
        this.significanceOfCommonImmediateParentCategories = significanceOfCommonImmediateParentCategories;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfCommonParentsParentCategories(Double significanceOfCommonParentsParentCategories)
    {
        this.significanceOfCommonParentsParentCategories = significanceOfCommonParentsParentCategories;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfCommonAncestorCategories(Double significanceOfCommonAncestorCategories)
    {
        this.significanceOfCommonAncestorCategories = significanceOfCommonAncestorCategories;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfCommonProductDataKeys(Double significanceOfCommonProductDataKeys)
    {
        this.significanceOfCommonProductDataKeys = significanceOfCommonProductDataKeys;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfIdenticalProductDataValues(Double significanceOfIdenticalProductDataValues)
    {
        this.significanceOfIdenticalProductDataValues = significanceOfIdenticalProductDataValues;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificantProductDataFields(SignificantDataValue... significantProductDataFields)
    {
        this.significantProductDataFields = new ArrayList<>(Arrays.asList(significantProductDataFields));;
        return this;
    }
    public SimilarProductsEvaluationSettings addToSignificantProductDataFields(SignificantDataValue significantProductDataFields)
    {
        if (this.significantProductDataFields == null)
        {
            this.significantProductDataFields = new ArrayList<>();
        }
        this.significantProductDataFields.add(significantProductDataFields);
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfSimilarSalesPrice(Double significanceOfSimilarSalesPrice)
    {
        this.significanceOfSimilarSalesPrice = significanceOfSimilarSalesPrice;;
        return this;
    }
    public SimilarProductsEvaluationSettings setSignificanceOfSimilarBrand(Double significanceOfSimilarBrand)
    {
        this.significanceOfSimilarBrand = significanceOfSimilarBrand;;
        return this;
    }
}
