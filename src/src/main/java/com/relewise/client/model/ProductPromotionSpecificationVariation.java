package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    
/** Used for specifying that this kind of promotion is allowed at a specific Location as well as for specific advertisers */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductPromotionSpecificationVariation.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPromotionSpecificationVariation extends PromotionSpecificationVariation
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.ProductPromotion+SpecificationVariation, Relewise.Client";
    /** The maximum number of products to promote at a time in this variation. */
    public Integer maxCount;
    public static ProductPromotionSpecificationVariation create(Integer maxCount)
    {
        return new ProductPromotionSpecificationVariation(maxCount);
    }
    public ProductPromotionSpecificationVariation(Integer maxCount)
    {
        this.maxCount = maxCount;
    }
    public ProductPromotionSpecificationVariation()
    {
    }
    /** The maximum number of products to promote at a time in this variation. */
    public Integer getMaxCount()
    {
        return this.maxCount;
    }
    /** The maximum number of products to promote at a time in this variation. */
    public ProductPromotionSpecificationVariation setMaxCount(Integer maxCount)
    {
        this.maxCount = maxCount;
        return this;
    }
}
