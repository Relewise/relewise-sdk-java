package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = UserConditionCollection.class)
public class UserConditionCollection
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.UserConditionCollection, Relewise.Client";
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
