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
    
/** a collection that contains multiple <code>ValueCondition</code>s in its inner list <code>Items</code>. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValueConditionCollection
{
    /** The items that this collection holds. */
    public @Nullable ArrayList<ValueCondition> items;
    public static ValueConditionCollection create()
    {
        return new ValueConditionCollection();
    }
    public ValueConditionCollection()
    {
    }
    /** The items that this collection holds. */
    public @Nullable ArrayList<ValueCondition> getItems()
    {
        return this.items;
    }
    /** The items that this collection holds. */
    public ValueConditionCollection setItems(ValueCondition... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    /** The items that this collection holds. */
    public ValueConditionCollection addToItems(ValueCondition items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}
