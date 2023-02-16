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
    defaultImpl = BrandIdRelevanceModifier.class)
public class BrandIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.BrandIdRelevanceModifier, Relewise.Client";
    public String brandId;
    public Double ifProductIsBrandMultiplyWeightBy;
    public Double ifProductIsNotBrandMultiplyWeightBy;
    public static BrandIdRelevanceModifier create(String brandId)
    {
        return new BrandIdRelevanceModifier(brandId);
    }
    public BrandIdRelevanceModifier(String brandId)
    {
        this.brandId = brandId;
        this.ifProductIsBrandMultiplyWeightBy = 1d;
        this.ifProductIsNotBrandMultiplyWeightBy = 1d;
    }
    public static BrandIdRelevanceModifier create(String brandId, Double ifProductIsBrandMultiplyWeightBy, Double ifProductIsNotBrandMultiplyWeightBy)
    {
        return new BrandIdRelevanceModifier(brandId, ifProductIsBrandMultiplyWeightBy, ifProductIsNotBrandMultiplyWeightBy);
    }
    public BrandIdRelevanceModifier(String brandId, Double ifProductIsBrandMultiplyWeightBy, Double ifProductIsNotBrandMultiplyWeightBy)
    {
        this.brandId = brandId;
        this.ifProductIsBrandMultiplyWeightBy = ifProductIsBrandMultiplyWeightBy;
        this.ifProductIsNotBrandMultiplyWeightBy = ifProductIsNotBrandMultiplyWeightBy;
    }
    public BrandIdRelevanceModifier()
    {
        this.ifProductIsBrandMultiplyWeightBy = 1d;
        this.ifProductIsNotBrandMultiplyWeightBy = 1d;
    }
    public String getBrandId()
    {
        return this.brandId;
    }
    public Double getIfProductIsBrandMultiplyWeightBy()
    {
        return this.ifProductIsBrandMultiplyWeightBy;
    }
    public Double getIfProductIsNotBrandMultiplyWeightBy()
    {
        return this.ifProductIsNotBrandMultiplyWeightBy;
    }
    public BrandIdRelevanceModifier setBrandId(String brandId)
    {
        this.brandId = brandId;;
        return this;
    }
    public BrandIdRelevanceModifier setIfProductIsBrandMultiplyWeightBy(Double ifProductIsBrandMultiplyWeightBy)
    {
        this.ifProductIsBrandMultiplyWeightBy = ifProductIsBrandMultiplyWeightBy;;
        return this;
    }
    public BrandIdRelevanceModifier setIfProductIsNotBrandMultiplyWeightBy(Double ifProductIsNotBrandMultiplyWeightBy)
    {
        this.ifProductIsNotBrandMultiplyWeightBy = ifProductIsNotBrandMultiplyWeightBy;;
        return this;
    }
    @Override
    public BrandIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}
