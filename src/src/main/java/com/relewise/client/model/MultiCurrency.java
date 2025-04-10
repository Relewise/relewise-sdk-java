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
public class MultiCurrency
{
    public @Nullable ArrayList<Money> values;
    public static MultiCurrency create(Money... amounts)
    {
        return new MultiCurrency(amounts);
    }
    public MultiCurrency(Money... amounts)
    {
        this.values = new ArrayList<>(Arrays.asList(amounts));
    }
    public MultiCurrency()
    {
    }
    public @Nullable ArrayList<Money> getValues()
    {
        return this.values;
    }
    public MultiCurrency setValues(Money... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public MultiCurrency addToValues(Money values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}
