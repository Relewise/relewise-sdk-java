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
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class Money
{
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
        this.amount = amount;
        return this;
    }
    public Money setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
