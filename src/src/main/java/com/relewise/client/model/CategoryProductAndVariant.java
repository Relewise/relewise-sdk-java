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
    defaultImpl = CategoryProductAndVariant.class)
public class CategoryProductAndVariant
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult+Category+ProductAndVariant, Relewise.Client";
    public ProductResultDetails product;
    public VariantResultDetails variant;
    public static CategoryProductAndVariant create()
    {
        return new CategoryProductAndVariant();
    }
    public CategoryProductAndVariant()
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
    public CategoryProductAndVariant setProduct(ProductResultDetails product)
    {
        this.product = product;;
        return this;
    }
    public CategoryProductAndVariant setVariant(VariantResultDetails variant)
    {
        this.variant = variant;;
        return this;
    }
}
