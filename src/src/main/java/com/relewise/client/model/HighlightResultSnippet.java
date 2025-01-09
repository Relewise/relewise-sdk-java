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
    
/** Provides search result highlights as matched text in data. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultSnippet
{
    public String[] displayName;
    public StringStringArrayKeyValuePair[] data;
    public static HighlightResultSnippet create(String[] displayName, StringStringArrayKeyValuePair... data)
    {
        return new HighlightResultSnippet(displayName, data);
    }
    public HighlightResultSnippet(String[] displayName, StringStringArrayKeyValuePair... data)
    {
        this.displayName = displayName;
        this.data = data;
    }
    public HighlightResultSnippet()
    {
    }
    public String[] getDisplayName()
    {
        return this.displayName;
    }
    public StringStringArrayKeyValuePair[] getData()
    {
        return this.data;
    }
    public HighlightResultSnippet setDisplayName(String... displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public HighlightResultSnippet addToDisplayName(String displayName)
    {
        if (this.displayName == null)
        {
            this.displayName = new String[] { displayName };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.displayName));
            existingList.add(displayName);
            this.displayName = existingList.toArray(new String[0]);
        }
        return this;
    }
    public HighlightResultSnippet setData(StringStringArrayKeyValuePair... data)
    {
        this.data = data;
        return this;
    }
    public HighlightResultSnippet addToData(StringStringArrayKeyValuePair data)
    {
        if (this.data == null)
        {
            this.data = new StringStringArrayKeyValuePair[] { data };
        }
        else
        {
            ArrayList<StringStringArrayKeyValuePair> existingList = new ArrayList<>(Arrays.asList(this.data));
            existingList.add(data);
            this.data = existingList.toArray(new StringStringArrayKeyValuePair[0]);
        }
        return this;
    }
}
