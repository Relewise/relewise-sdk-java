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
public class StringIntegerRangeArrayKeyValuePair
{
    public String key;
    public IntegerRange[] value;
    public static StringIntegerRangeArrayKeyValuePair create()
    {
        return new StringIntegerRangeArrayKeyValuePair();
    }
    public StringIntegerRangeArrayKeyValuePair()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public IntegerRange[] getValue()
    {
        return this.value;
    }
    public StringIntegerRangeArrayKeyValuePair setKey(String key)
    {
        this.key = key;
        return this;
    }
    public StringIntegerRangeArrayKeyValuePair setValue(IntegerRange... value)
    {
        this.value = value;
        return this;
    }
    public StringIntegerRangeArrayKeyValuePair addToValue(IntegerRange value)
    {
        if (this.value == null)
        {
            this.value = new IntegerRange[] { value };
        }
        else
        {
            ArrayList<IntegerRange> existingList = new ArrayList<>(Arrays.asList(this.value));
            existingList.add(value);
            this.value = existingList.toArray(new IntegerRange[0]);
        }
        return this;
    }
}
