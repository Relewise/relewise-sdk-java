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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryInterestTriggerResultCategoryProductAndVariant
{
    public ProductResultDetails product;
    public VariantResultDetails variant;
    public static ProductCategoryInterestTriggerResultCategoryProductAndVariant create()
    {
        return new ProductCategoryInterestTriggerResultCategoryProductAndVariant();
    }
    public ProductCategoryInterestTriggerResultCategoryProductAndVariant()
    {
    }
    public ProductResultDetails getProduct()
    {
        return this.product;
    }
    public VariantResultDetails getVariant()
    {
        return this.variant;
    }
    public ProductCategoryInterestTriggerResultCategoryProductAndVariant setProduct(ProductResultDetails product)
    {
        this.product = product;
        return this;
    }
    public ProductCategoryInterestTriggerResultCategoryProductAndVariant setVariant(VariantResultDetails variant)
    {
        this.variant = variant;
        return this;
    }
}
