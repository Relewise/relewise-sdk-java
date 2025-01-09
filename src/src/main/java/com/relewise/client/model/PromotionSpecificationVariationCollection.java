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
public class PromotionSpecificationVariationCollection
{
    public @Nullable ProductPromotionSpecificationVariation productPromotion;
    public static PromotionSpecificationVariationCollection create()
    {
        return new PromotionSpecificationVariationCollection();
    }
    public PromotionSpecificationVariationCollection()
    {
    }
    public @Nullable ProductPromotionSpecificationVariation getProductPromotion()
    {
        return this.productPromotion;
    }
    public PromotionSpecificationVariationCollection setProductPromotion(@Nullable ProductPromotionSpecificationVariation productPromotion)
    {
        this.productPromotion = productPromotion;
        return this;
    }
}
