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
public class PromotionSpecificationCollection
{
    public @Nullable ProductPromotionSpecification productPromotion;
    public @Nullable DisplayAdPromotionSpecification displayAdPromotion;
    public static PromotionSpecificationCollection create()
    {
        return new PromotionSpecificationCollection();
    }
    public PromotionSpecificationCollection()
    {
    }
    public @Nullable ProductPromotionSpecification getProductPromotion()
    {
        return this.productPromotion;
    }
    public @Nullable DisplayAdPromotionSpecification getDisplayAdPromotion()
    {
        return this.displayAdPromotion;
    }
    public PromotionSpecificationCollection setProductPromotion(@Nullable ProductPromotionSpecification productPromotion)
    {
        this.productPromotion = productPromotion;
        return this;
    }
    public PromotionSpecificationCollection setDisplayAdPromotion(@Nullable DisplayAdPromotionSpecification displayAdPromotion)
    {
        this.displayAdPromotion = displayAdPromotion;
        return this;
    }
}
