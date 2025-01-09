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
    
/** Provides search result highlights as match indices in data. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultOffset
{
    public IntegerRange[] displayName;
    public AbstractMap.SimpleEntry<String, IntegerRange[]>[] data;
    public static HighlightResultOffset create(IntegerRange[] displayName, AbstractMap.SimpleEntry<String, IntegerRange[]>... data)
    {
        return new HighlightResultOffset(displayName, data);
    }
    public HighlightResultOffset(IntegerRange[] displayName, AbstractMap.SimpleEntry<String, IntegerRange[]>... data)
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
    public AbstractMap.SimpleEntry<String, IntegerRange[]>[] getData()
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
    public HighlightResultOffset setData(AbstractMap.SimpleEntry<String, IntegerRange[]>... data)
    {
        this.data = data;
        return this;
    }
    public HighlightResultOffset addToData(AbstractMap.SimpleEntry<String, IntegerRange[]> data)
    {
        if (this.data == null)
        {
            this.data = new AbstractMap.SimpleEntry<String, IntegerRange[]>[] { data };
        }
        else
        {
            ArrayList<AbstractMap.SimpleEntry<String, IntegerRange[]>> existingList = new ArrayList<>(Arrays.asList(this.data));
            existingList.add(data);
            this.data = existingList.toArray(new AbstractMap.SimpleEntry<String, IntegerRange[]>[0]);
        }
        return this;
    }
}
