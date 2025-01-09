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
public class KeyMultiplier
{
    public String key;
    public Double multiplier;
    public static KeyMultiplier create(String key, Double multiplier)
    {
        return new KeyMultiplier(key, multiplier);
    }
    public KeyMultiplier(String key, Double multiplier)
    {
        this.key = key;
        this.multiplier = multiplier;
    }
    public KeyMultiplier()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public Double getMultiplier()
    {
        return this.multiplier;
    }
    public KeyMultiplier setKey(String key)
    {
        this.key = key;
        return this;
    }
    public KeyMultiplier setMultiplier(Double multiplier)
    {
        this.multiplier = multiplier;
        return this;
    }
}
