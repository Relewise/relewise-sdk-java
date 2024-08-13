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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResult
{
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
        this.product = product;
        return this;
    }
    public ProductPerformanceResult setClassifications(ProductPerformanceResultClassificationMetrics... classifications)
    {
        this.classifications = classifications;
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
