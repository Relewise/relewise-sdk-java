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
    defaultImpl = Cart.class)
public class Cart extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.Cart, Relewise.Client";
    public @Nullable User user;
    public @Nullable String name;
    public @Nullable Money subtotal;
    public @Nullable ArrayList<LineItem> lineItems;
    public @Nullable HashMap<String, DataValue> data;
    public static Cart create(@Nullable User user, Money subtotal)
    {
        return new Cart(user, subtotal);
    }
    public Cart(@Nullable User user, Money subtotal)
    {
        this.user = user;
        this.subtotal = subtotal;
        this.name = "default";
    }
    public Cart()
    {
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public @Nullable String getName()
    {
        return this.name;
    }
    public @Nullable Money getSubtotal()
    {
        return this.subtotal;
    }
    public @Nullable ArrayList<LineItem> getLineItems()
    {
        return this.lineItems;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Cart setUser(User user)
    {
        this.user = user;;
        return this;
    }
    public Cart setName(String name)
    {
        this.name = name;;
        return this;
    }
    public Cart setSubtotal(Money subtotal)
    {
        this.subtotal = subtotal;;
        return this;
    }
    public Cart setLineItems(LineItem... lineItems)
    {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));;
        return this;
    }
    public Cart addToLineItems(LineItem lineItems)
    {
        if (this.lineItems == null)
        {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(lineItems);
        return this;
    }
    public Cart addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Cart setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
}
