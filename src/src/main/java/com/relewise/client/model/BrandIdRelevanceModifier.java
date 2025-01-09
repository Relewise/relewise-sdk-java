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
    
/** a <code>RelevanceModifier</code> that can change the relevance of an entity depending on a <code>BrandId</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = BrandIdRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandIdRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.BrandIdRelevanceModifier, Relewise.Client";
    /** The Id of the Brand that this <code>RelevanceModifier</code> will distinguish on. */
    public String brandId;
    /** The weight that the entity will be multiplied with if it matches the specific <code>BrandId</code>. */
    public Double ifProductIsBrandMultiplyWeightBy;
    /** The weight that the entity will be multiplied with if it does not match the specific <code>BrandId</code>. */
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
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of an entity depending on a <code>BrandId</code>.
     * @param brandId The Id of the Brand that this RelevanceModifier will distinguish on.
     * @param ifProductIsBrandMultiplyWeightBy The weight that the entity will be multiplied with if it matches the specific BrandId.
     * @param ifProductIsNotBrandMultiplyWeightBy The weight that the entity will be multiplied with if it does not match the specific BrandId.
     */
    public static BrandIdRelevanceModifier create(String brandId, Double ifProductIsBrandMultiplyWeightBy, Double ifProductIsNotBrandMultiplyWeightBy)
    {
        return new BrandIdRelevanceModifier(brandId, ifProductIsBrandMultiplyWeightBy, ifProductIsNotBrandMultiplyWeightBy);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of an entity depending on a <code>BrandId</code>.
     * @param brandId The Id of the Brand that this RelevanceModifier will distinguish on.
     * @param ifProductIsBrandMultiplyWeightBy The weight that the entity will be multiplied with if it matches the specific BrandId.
     * @param ifProductIsNotBrandMultiplyWeightBy The weight that the entity will be multiplied with if it does not match the specific BrandId.
     */
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
    /** The Id of the Brand that this <code>RelevanceModifier</code> will distinguish on. */
    public String getBrandId()
    {
        return this.brandId;
    }
    /** The weight that the entity will be multiplied with if it matches the specific <code>BrandId</code>. */
    public Double getIfProductIsBrandMultiplyWeightBy()
    {
        return this.ifProductIsBrandMultiplyWeightBy;
    }
    /** The weight that the entity will be multiplied with if it does not match the specific <code>BrandId</code>. */
    public Double getIfProductIsNotBrandMultiplyWeightBy()
    {
        return this.ifProductIsNotBrandMultiplyWeightBy;
    }
    /** The Id of the Brand that this <code>RelevanceModifier</code> will distinguish on. */
    public BrandIdRelevanceModifier setBrandId(String brandId)
    {
        this.brandId = brandId;
        return this;
    }
    /** The weight that the entity will be multiplied with if it matches the specific <code>BrandId</code>. */
    public BrandIdRelevanceModifier setIfProductIsBrandMultiplyWeightBy(Double ifProductIsBrandMultiplyWeightBy)
    {
        this.ifProductIsBrandMultiplyWeightBy = ifProductIsBrandMultiplyWeightBy;
        return this;
    }
    /** The weight that the entity will be multiplied with if it does not match the specific <code>BrandId</code>. */
    public BrandIdRelevanceModifier setIfProductIsNotBrandMultiplyWeightBy(Double ifProductIsNotBrandMultiplyWeightBy)
    {
        this.ifProductIsNotBrandMultiplyWeightBy = ifProductIsNotBrandMultiplyWeightBy;
        return this;
    }
    @Override
    public BrandIdRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
