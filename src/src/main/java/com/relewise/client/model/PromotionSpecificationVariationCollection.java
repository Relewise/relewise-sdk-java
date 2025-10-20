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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotionSpecificationVariationCollection
{
    /** @deprecated Use VariationPromotion instead */
    public @Nullable ProductPromotionSpecificationVariation productPromotion;
    public @Nullable PromotionVariationPromotion variationPromotion;
    public static PromotionSpecificationVariationCollection create()
    {
        return new PromotionSpecificationVariationCollection();
    }
    public PromotionSpecificationVariationCollection()
    {
    }
    /** @deprecated Use VariationPromotion instead */
    public @Nullable ProductPromotionSpecificationVariation getProductPromotion()
    {
        return this.productPromotion;
    }
    public @Nullable PromotionVariationPromotion getVariationPromotion()
    {
        return this.variationPromotion;
    }
    /** @deprecated Use VariationPromotion instead */
    public PromotionSpecificationVariationCollection setProductPromotion(@Nullable ProductPromotionSpecificationVariation productPromotion)
    {
        this.productPromotion = productPromotion;
        return this;
    }
    public PromotionSpecificationVariationCollection setVariationPromotion(@Nullable PromotionVariationPromotion variationPromotion)
    {
        this.variationPromotion = variationPromotion;
        return this;
    }
}
