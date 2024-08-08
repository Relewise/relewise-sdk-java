package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
public class ValueConditionCollection
{
    public @Nullable ArrayList<ValueCondition> items;
    public static ValueConditionCollection create()
    {
        return new ValueConditionCollection();
    }
    public ValueConditionCollection()
    {
    }
    public @Nullable ArrayList<ValueCondition> getItems()
    {
        return this.items;
    }
    public ValueConditionCollection setItems(ValueCondition... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
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
