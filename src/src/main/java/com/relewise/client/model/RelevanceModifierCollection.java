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
    
/** a collection that contains multiple <code>RelevanceModifier</code>s in its inner list <code>Items</code>. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RelevanceModifierCollection
{
    /** The items that the collection holds. */
    public @Nullable ArrayList<RelevanceModifier> items;
    /**
     * Creates a collection that contains multiple <code>RelevanceModifier</code>s in its inner list <code>Items</code>.
     * @param relevanceModifiers The items that the collection holds.
     */
    public static RelevanceModifierCollection create(RelevanceModifier... relevanceModifiers)
    {
        return new RelevanceModifierCollection(relevanceModifiers);
    }
    /**
     * Creates a collection that contains multiple <code>RelevanceModifier</code>s in its inner list <code>Items</code>.
     * @param relevanceModifiers The items that the collection holds.
     */
    public RelevanceModifierCollection(RelevanceModifier... relevanceModifiers)
    {
        this.items = new ArrayList<>(Arrays.asList(relevanceModifiers));
    }
    public RelevanceModifierCollection()
    {
    }
    /** The items that the collection holds. */
    public @Nullable ArrayList<RelevanceModifier> getItems()
    {
        return this.items;
    }
    /** The items that the collection holds. */
    public RelevanceModifierCollection setItems(RelevanceModifier... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    /** The items that the collection holds. */
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
