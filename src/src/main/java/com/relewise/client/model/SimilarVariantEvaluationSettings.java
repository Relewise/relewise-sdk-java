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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimilarVariantEvaluationSettings
{
    public @Nullable Double significanceOfSimilaritiesInDisplayName;
    public @Nullable Double significanceOfSimilarListPrice;
    public @Nullable Double significanceOfSimilarSalesPrice;
    public @Nullable Double significanceOfCommonDataKeys;
    public @Nullable Double significanceOfIdenticalDataValues;
    public @Nullable ArrayList<SignificantDataValue> significantDataFields;
    public static SimilarVariantEvaluationSettings create()
    {
        return new SimilarVariantEvaluationSettings();
    }
    public SimilarVariantEvaluationSettings()
    {
    }
    public @Nullable Double getSignificanceOfSimilaritiesInDisplayName()
    {
        return this.significanceOfSimilaritiesInDisplayName;
    }
    public @Nullable Double getSignificanceOfSimilarListPrice()
    {
        return this.significanceOfSimilarListPrice;
    }
    public @Nullable Double getSignificanceOfSimilarSalesPrice()
    {
        return this.significanceOfSimilarSalesPrice;
    }
    public @Nullable Double getSignificanceOfCommonDataKeys()
    {
        return this.significanceOfCommonDataKeys;
    }
    public @Nullable Double getSignificanceOfIdenticalDataValues()
    {
        return this.significanceOfIdenticalDataValues;
    }
    public @Nullable ArrayList<SignificantDataValue> getSignificantDataFields()
    {
        return this.significantDataFields;
    }
    public SimilarVariantEvaluationSettings setSignificanceOfSimilaritiesInDisplayName(@Nullable Double significanceOfSimilaritiesInDisplayName)
    {
        this.significanceOfSimilaritiesInDisplayName = significanceOfSimilaritiesInDisplayName;
        return this;
    }
    public SimilarVariantEvaluationSettings setSignificanceOfSimilarListPrice(@Nullable Double significanceOfSimilarListPrice)
    {
        this.significanceOfSimilarListPrice = significanceOfSimilarListPrice;
        return this;
    }
    public SimilarVariantEvaluationSettings setSignificanceOfSimilarSalesPrice(@Nullable Double significanceOfSimilarSalesPrice)
    {
        this.significanceOfSimilarSalesPrice = significanceOfSimilarSalesPrice;
        return this;
    }
    public SimilarVariantEvaluationSettings setSignificanceOfCommonDataKeys(@Nullable Double significanceOfCommonDataKeys)
    {
        this.significanceOfCommonDataKeys = significanceOfCommonDataKeys;
        return this;
    }
    public SimilarVariantEvaluationSettings setSignificanceOfIdenticalDataValues(@Nullable Double significanceOfIdenticalDataValues)
    {
        this.significanceOfIdenticalDataValues = significanceOfIdenticalDataValues;
        return this;
    }
    public SimilarVariantEvaluationSettings setSignificantDataFields(SignificantDataValue... significantDataFields)
    {
        this.significantDataFields = new ArrayList<>(Arrays.asList(significantDataFields));;
        return this;
    }
    public SimilarVariantEvaluationSettings addToSignificantDataFields(SignificantDataValue significantDataFields)
    {
        if (this.significantDataFields == null)
        {
            this.significantDataFields = new ArrayList<>();
        }
        this.significantDataFields.add(significantDataFields);
        return this;
    }
}
