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
public class PromotionCollection
{
    public ArrayList<Promotion> promotions;
    public static PromotionCollection create(Promotion... promotions)
    {
        return new PromotionCollection(promotions);
    }
    public PromotionCollection(Promotion... promotions)
    {
        this.promotions = new ArrayList<>(Arrays.asList(promotions));
    }
    public PromotionCollection()
    {
    }
    public ArrayList<Promotion> getPromotions()
    {
        return this.promotions;
    }
    public PromotionCollection setPromotions(Promotion... promotions)
    {
        this.promotions = new ArrayList<>(Arrays.asList(promotions));;
        return this;
    }
    public PromotionCollection addToPromotions(Promotion promotions)
    {
        if (this.promotions == null)
        {
            this.promotions = new ArrayList<>();
        }
        this.promotions.add(promotions);
        return this;
    }
}
