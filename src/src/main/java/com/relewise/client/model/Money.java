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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = Money.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Money
{
    public String $type = "Relewise.Client.DataTypes.Money, Relewise.Client";
    public Double amount;
    public Currency currency;
    public static Money create(Currency currency, Double amount)
    {
        return new Money(currency, amount);
    }
    public Money(Currency currency, Double amount)
    {
        this.currency = currency;
        this.amount = amount;
    }
    public Money()
    {
    }
    public Double getAmount()
    {
        return this.amount;
    }
    public Currency getCurrency()
    {
        return this.currency;
    }
    public Money setAmount(Double amount)
    {
        this.amount = amount;;
        return this;
    }
    public Money setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}
