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
    defaultImpl = ProductPerformanceResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResult
{
    public String $type = "Relewise.Client.DataTypes.ProductPerformanceResult, Relewise.Client";
    public ProductResult product;
    public ProductPerformanceResultClassificationMetrics[] classifications;
    public static ProductPerformanceResult create()
    {
        return new ProductPerformanceResult();
    }
    public ProductPerformanceResult()
    {
    }
    public ProductResult getProduct()
    {
        return this.product;
    }
    public ProductPerformanceResultClassificationMetrics[] getClassifications()
    {
        return this.classifications;
    }
    public ProductPerformanceResult setProduct(ProductResult product)
    {
        this.product = product;;
        return this;
    }
    public ProductPerformanceResult setClassifications(ProductPerformanceResultClassificationMetrics... classifications)
    {
        this.classifications = classifications;;
        return this;
    }
    public ProductPerformanceResult addToClassifications(ProductPerformanceResultClassificationMetrics classification)
    {
        if (this.classifications == null)
        {
            this.classifications = new ProductPerformanceResultClassificationMetrics[] { classification };
        }
        else
        {
            ArrayList<ProductPerformanceResultClassificationMetrics> existingList = new ArrayList<>(Arrays.asList(this.classifications));
            existingList.add(classification);
            this.classifications = existingList.toArray(new ProductPerformanceResultClassificationMetrics[0]);
        }
        return this;
    }
}
