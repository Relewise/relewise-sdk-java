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
    
/** Provides search result highlights as match indices in data. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultOffset
{
    public IntegerRange[] displayName;
    public StringIntegerRangeArrayKeyValuePair[] data;
    public static HighlightResultOffset create(IntegerRange[] displayName, StringIntegerRangeArrayKeyValuePair... data)
    {
        return new HighlightResultOffset(displayName, data);
    }
    public HighlightResultOffset(IntegerRange[] displayName, StringIntegerRangeArrayKeyValuePair... data)
    {
        this.displayName = displayName;
        this.data = data;
    }
    public HighlightResultOffset()
    {
    }
    public IntegerRange[] getDisplayName()
    {
        return this.displayName;
    }
    public StringIntegerRangeArrayKeyValuePair[] getData()
    {
        return this.data;
    }
    public HighlightResultOffset setDisplayName(IntegerRange... displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public HighlightResultOffset addToDisplayName(IntegerRange displayName)
    {
        if (this.displayName == null)
        {
            this.displayName = new IntegerRange[] { displayName };
        }
        else
        {
            ArrayList<IntegerRange> existingList = new ArrayList<>(Arrays.asList(this.displayName));
            existingList.add(displayName);
            this.displayName = existingList.toArray(new IntegerRange[0]);
        }
        return this;
    }
    public HighlightResultOffset setData(StringIntegerRangeArrayKeyValuePair... data)
    {
        this.data = data;
        return this;
    }
    public HighlightResultOffset addToData(StringIntegerRangeArrayKeyValuePair data)
    {
        if (this.data == null)
        {
            this.data = new StringIntegerRangeArrayKeyValuePair[] { data };
        }
        else
        {
            ArrayList<StringIntegerRangeArrayKeyValuePair> existingList = new ArrayList<>(Arrays.asList(this.data));
            existingList.add(data);
            this.data = existingList.toArray(new StringIntegerRangeArrayKeyValuePair[0]);
        }
        return this;
    }
}
