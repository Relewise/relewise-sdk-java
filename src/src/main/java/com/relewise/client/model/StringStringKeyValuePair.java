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
public class StringStringKeyValuePair
{
    public String key;
    public String value;
    public static StringStringKeyValuePair create()
    {
        return new StringStringKeyValuePair();
    }
    public StringStringKeyValuePair()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public String getValue()
    {
        return this.value;
    }
    public StringStringKeyValuePair setKey(String key)
    {
        this.key = key;
        return this;
    }
    public StringStringKeyValuePair setValue(String value)
    {
        this.value = value;
        return this;
    }
}
