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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = Order.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.Order, Relewise.Client";
    public @Nullable User user;
    public Money subtotal;
    public ArrayList<LineItem> lineItems;
    public String orderNumber;
    public String cartName;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    /** @deprecated Use Channel.SubChannel instead. */
    public @Nullable String subChannel;
    public @Nullable HashMap<String, DataValue> data;
    /** @deprecated Use OrderNumber instead. */
    public @Nullable String trackingNumber;
    public static Order create(User user, Money subtotal, String orderNumber, LineItem... lineItems)
    {
        return new Order(user, subtotal, orderNumber, lineItems);
    }
    public Order(User user, Money subtotal, String orderNumber, LineItem... lineItems)
    {
        this.user = user;
        this.subtotal = subtotal;
        this.orderNumber = orderNumber;
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
        this.cartName = "default";
    }
    public static Order create(User user, Money subtotal, String orderNumber, ArrayList<LineItem> lineItems, String cartName)
    {
        return new Order(user, subtotal, orderNumber, lineItems, cartName);
    }
    public Order(User user, Money subtotal, String orderNumber, ArrayList<LineItem> lineItems, String cartName)
    {
        this.user = user;
        this.subtotal = subtotal;
        this.orderNumber = orderNumber;
        this.lineItems = lineItems;
        this.cartName = cartName;
    }
    public Order()
    {
        this.cartName = "default";
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public Money getSubtotal()
    {
        return this.subtotal;
    }
    public ArrayList<LineItem> getLineItems()
    {
        return this.lineItems;
    }
    public String getOrderNumber()
    {
        return this.orderNumber;
    }
    public String getCartName()
    {
        return this.cartName;
    }
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    /** @deprecated Use Channel.SubChannel instead. */
    public @Nullable String getSubChannel()
    {
        return this.subChannel;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    /** @deprecated Use OrderNumber instead. */
    public @Nullable String getTrackingNumber()
    {
        return this.trackingNumber;
    }
    public Order setUser(User user)
    {
        this.user = user;
        return this;
    }
    public Order setSubtotal(Money subtotal)
    {
        this.subtotal = subtotal;
        return this;
    }
    public Order setLineItems(LineItem... lineItems)
    {
        this.lineItems = new ArrayList<>(Arrays.asList(lineItems));;
        return this;
    }
    public Order addToLineItems(LineItem lineItems)
    {
        if (this.lineItems == null)
        {
            this.lineItems = new ArrayList<>();
        }
        this.lineItems.add(lineItems);
        return this;
    }
    public Order setOrderNumber(String orderNumber)
    {
        this.orderNumber = orderNumber;
        return this;
    }
    public Order setCartName(String cartName)
    {
        this.cartName = cartName;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public Order setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
    /** @deprecated Use Channel.SubChannel instead. */
    public Order setSubChannel(String subChannel)
    {
        this.subChannel = subChannel;
        return this;
    }
    public Order addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public Order setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    /** @deprecated Use OrderNumber instead. */
    public Order setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
        return this;
    }
}
