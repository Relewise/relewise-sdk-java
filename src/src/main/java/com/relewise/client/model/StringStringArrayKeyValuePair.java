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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class StringStringArrayKeyValuePair
{
    public String key;
    public String[] value;
    public static StringStringArrayKeyValuePair create()
    {
        return new StringStringArrayKeyValuePair();
    }
    public StringStringArrayKeyValuePair()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public String[] getValue()
    {
        return this.value;
    }
    public StringStringArrayKeyValuePair setKey(String key)
    {
        this.key = key;
        return this;
    }
    public StringStringArrayKeyValuePair setValue(String... value)
    {
        this.value = value;
        return this;
    }
}
