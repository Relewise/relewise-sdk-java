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
public class LocationPlacementVariation
{
    public String name;
    public @Nullable String key;
    public @Nullable PromotionSpecificationVariationCollection supportedPromotions;
    public static LocationPlacementVariation create(String name, @Nullable PromotionSpecificationVariationCollection supportedPromotions)
    {
        return new LocationPlacementVariation(name, supportedPromotions);
    }
    public LocationPlacementVariation(String name, @Nullable PromotionSpecificationVariationCollection supportedPromotions)
    {
        this.name = name;
        this.supportedPromotions = supportedPromotions;
    }
    public static LocationPlacementVariation create(String name)
    {
        return new LocationPlacementVariation(name);
    }
    public LocationPlacementVariation(String name)
    {
        this.name = name;
    }
    public LocationPlacementVariation()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public @Nullable String getKey()
    {
        return this.key;
    }
    public @Nullable PromotionSpecificationVariationCollection getSupportedPromotions()
    {
        return this.supportedPromotions;
    }
    public LocationPlacementVariation setName(String name)
    {
        this.name = name;
        return this;
    }
    public LocationPlacementVariation setKey(@Nullable String key)
    {
        this.key = key;
        return this;
    }
    public LocationPlacementVariation setSupportedPromotions(@Nullable PromotionSpecificationVariationCollection supportedPromotions)
    {
        this.supportedPromotions = supportedPromotions;
        return this;
    }
}
