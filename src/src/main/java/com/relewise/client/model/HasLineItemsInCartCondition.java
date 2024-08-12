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
    defaultImpl = HasLineItemsInCartCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasLineItemsInCartCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasLineItemsInCartCondition, Relewise.Client";
    public IntegerRange numberOfItems;
    public String cartName;
    public FilterCollection filters;
    public static HasLineItemsInCartCondition create(IntegerRange numberOfItems)
    {
        return new HasLineItemsInCartCondition(numberOfItems);
    }
    public HasLineItemsInCartCondition(IntegerRange numberOfItems)
    {
        this.numberOfItems = numberOfItems;
        this.cartName = null;
        this.filters = null;
        this.negated = false;
    }
    public static HasLineItemsInCartCondition create(IntegerRange numberOfItems, String cartName, FilterCollection filters, Boolean negated)
    {
        return new HasLineItemsInCartCondition(numberOfItems, cartName, filters, negated);
    }
    public HasLineItemsInCartCondition(IntegerRange numberOfItems, String cartName, FilterCollection filters, Boolean negated)
    {
        this.numberOfItems = numberOfItems;
        this.cartName = cartName;
        this.filters = filters;
        this.negated = negated;
    }
    public HasLineItemsInCartCondition()
    {
        this.cartName = null;
        this.filters = null;
        this.negated = false;
    }
    public IntegerRange getNumberOfItems()
    {
        return this.numberOfItems;
    }
    public String getCartName()
    {
        return this.cartName;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public HasLineItemsInCartCondition setNumberOfItems(IntegerRange numberOfItems)
    {
        this.numberOfItems = numberOfItems;
        return this;
    }
    public HasLineItemsInCartCondition setCartName(String cartName)
    {
        this.cartName = cartName;
        return this;
    }
    public HasLineItemsInCartCondition setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public HasLineItemsInCartCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
