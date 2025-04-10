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
public class StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair
{
    public String key;
    public HighlightResultSnippetFieldSnippetMatch[] value;
    public static StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair create()
    {
        return new StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair();
    }
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public HighlightResultSnippetFieldSnippetMatch[] getValue()
    {
        return this.value;
    }
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair setKey(String key)
    {
        this.key = key;
        return this;
    }
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair setValue(HighlightResultSnippetFieldSnippetMatch... value)
    {
        this.value = value;
        return this;
    }
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair addToValue(HighlightResultSnippetFieldSnippetMatch value)
    {
        if (this.value == null)
        {
            this.value = new HighlightResultSnippetFieldSnippetMatch[] { value };
        }
        else
        {
            ArrayList<HighlightResultSnippetFieldSnippetMatch> existingList = new ArrayList<>(Arrays.asList(this.value));
            existingList.add(value);
            this.value = existingList.toArray(new HighlightResultSnippetFieldSnippetMatch[0]);
        }
        return this;
    }
}
