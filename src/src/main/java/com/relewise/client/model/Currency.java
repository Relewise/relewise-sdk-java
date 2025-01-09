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
public class Currency
{
    public String value;
    public static final Currency UNDEFINED = null;
    public static Currency create(String name)
    {
        return new Currency(name);
    }
    public Currency(String name)
    {
        this.value = name;
    }
    public Currency()
    {
    }
    public String getValue()
    {
        return this.value;
    }
    public Currency setValue(String value)
    {
        this.value = value;
        return this;
    }
}
