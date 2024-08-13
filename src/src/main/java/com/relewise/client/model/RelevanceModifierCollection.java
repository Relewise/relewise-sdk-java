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
public class RelevanceModifierCollection
{
    public @Nullable ArrayList<RelevanceModifier> items;
    public static RelevanceModifierCollection create(RelevanceModifier... relevanceModifiers)
    {
        return new RelevanceModifierCollection(relevanceModifiers);
    }
    public RelevanceModifierCollection(RelevanceModifier... relevanceModifiers)
    {
        this.items = new ArrayList<>(Arrays.asList(relevanceModifiers));
    }
    public RelevanceModifierCollection()
    {
    }
    public @Nullable ArrayList<RelevanceModifier> getItems()
    {
        return this.items;
    }
    public RelevanceModifierCollection setItems(RelevanceModifier... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public RelevanceModifierCollection addToItems(RelevanceModifier items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}
