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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDetails
{
    public String name;
    public OffsetDateTime modifiedUtc;
    public LineItem[] lineItems;
    public Money subtotal;
    public HashMap<String, DataValue> data;
    public static CartDetails create(String name, OffsetDateTime modifiedUtc, LineItem[] lineItems, Money subtotal, HashMap<String, DataValue> data)
    {
        return new CartDetails(name, modifiedUtc, lineItems, subtotal, data);
    }
    public CartDetails(String name, OffsetDateTime modifiedUtc, LineItem[] lineItems, Money subtotal, HashMap<String, DataValue> data)
    {
        this.name = name;
        this.modifiedUtc = modifiedUtc;
        this.lineItems = lineItems;
        this.subtotal = subtotal;
        this.data = data;
    }
    public CartDetails()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public OffsetDateTime getModifiedUtc()
    {
        return this.modifiedUtc;
    }
    public LineItem[] getLineItems()
    {
        return this.lineItems;
    }
    public Money getSubtotal()
    {
        return this.subtotal;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CartDetails setName(String name)
    {
        this.name = name;
        return this;
    }
    public CartDetails setModifiedUtc(OffsetDateTime modifiedUtc)
    {
        this.modifiedUtc = modifiedUtc;
        return this;
    }
    public CartDetails setLineItems(LineItem... lineItems)
    {
        this.lineItems = lineItems;
        return this;
    }
    public CartDetails addToLineItems(LineItem lineItem)
    {
        if (this.lineItems == null)
        {
            this.lineItems = new LineItem[] { lineItem };
        }
        else
        {
            ArrayList<LineItem> existingList = new ArrayList<>(Arrays.asList(this.lineItems));
            existingList.add(lineItem);
            this.lineItems = existingList.toArray(new LineItem[0]);
        }
        return this;
    }
    public CartDetails setSubtotal(Money subtotal)
    {
        this.subtotal = subtotal;
        return this;
    }
    public CartDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public CartDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}
