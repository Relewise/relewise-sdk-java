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
public class PromotionLocation
{
    public String key;
    public @Nullable PromotionLocationPlacementCollection placements;
    public static PromotionLocation create(String key)
    {
        return new PromotionLocation(key);
    }
    public PromotionLocation(String key)
    {
        this.key = key;
        this.placements = null;
    }
    public static PromotionLocation create(String key, @Nullable PromotionLocationPlacementCollection placements)
    {
        return new PromotionLocation(key, placements);
    }
    public PromotionLocation(String key, @Nullable PromotionLocationPlacementCollection placements)
    {
        this.key = key;
        this.placements = placements;
    }
    public PromotionLocation()
    {
        this.placements = null;
    }
    public String getKey()
    {
        return this.key;
    }
    public @Nullable PromotionLocationPlacementCollection getPlacements()
    {
        return this.placements;
    }
    public PromotionLocation setKey(String key)
    {
        this.key = key;
        return this;
    }
    public PromotionLocation setPlacements(@Nullable PromotionLocationPlacementCollection placements)
    {
        this.placements = placements;
        return this;
    }
}
