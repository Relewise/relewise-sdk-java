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
public class PromotionLocationCollection
{
    public ArrayList<PromotionLocation> items;
    public static PromotionLocationCollection create(PromotionLocation... placements)
    {
        return new PromotionLocationCollection(placements);
    }
    public PromotionLocationCollection(PromotionLocation... placements)
    {
        this.items = new ArrayList<>(Arrays.asList(placements));
    }
    public PromotionLocationCollection()
    {
    }
    public ArrayList<PromotionLocation> getItems()
    {
        return this.items;
    }
    public PromotionLocationCollection setItems(PromotionLocation... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public PromotionLocationCollection addToItems(PromotionLocation items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}
