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
public class UserConditionCollection
{
    public ArrayList<UserCondition> items;
    public static UserConditionCollection create(UserCondition... conditions)
    {
        return new UserConditionCollection(conditions);
    }
    public UserConditionCollection(UserCondition... conditions)
    {
        this.items = new ArrayList<>(Arrays.asList(conditions));
    }
    public UserConditionCollection()
    {
    }
    public ArrayList<UserCondition> getItems()
    {
        return this.items;
    }
    public UserConditionCollection setItems(UserCondition... items)
    {
        this.items = new ArrayList<>(Arrays.asList(items));;
        return this;
    }
    public UserConditionCollection addToItems(UserCondition items)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items.add(items);
        return this;
    }
}
