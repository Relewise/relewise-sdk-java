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
    
/** Provides search result highlights as matched text in data. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultSnippet
{
    public HighlightResultSnippetDisplayNameSnippetMatch[] displayName;
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair[] data;
    public static HighlightResultSnippet create()
    {
        return new HighlightResultSnippet();
    }
    public HighlightResultSnippet()
    {
    }
    public HighlightResultSnippetDisplayNameSnippetMatch[] getDisplayName()
    {
        return this.displayName;
    }
    public StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair[] getData()
    {
        return this.data;
    }
    public HighlightResultSnippet setDisplayName(HighlightResultSnippetDisplayNameSnippetMatch... displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public HighlightResultSnippet addToDisplayName(HighlightResultSnippetDisplayNameSnippetMatch displayName)
    {
        if (this.displayName == null)
        {
            this.displayName = new HighlightResultSnippetDisplayNameSnippetMatch[] { displayName };
        }
        else
        {
            ArrayList<HighlightResultSnippetDisplayNameSnippetMatch> existingList = new ArrayList<>(Arrays.asList(this.displayName));
            existingList.add(displayName);
            this.displayName = existingList.toArray(new HighlightResultSnippetDisplayNameSnippetMatch[0]);
        }
        return this;
    }
    public HighlightResultSnippet setData(StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair... data)
    {
        this.data = data;
        return this;
    }
    public HighlightResultSnippet addToData(StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair data)
    {
        if (this.data == null)
        {
            this.data = new StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair[] { data };
        }
        else
        {
            ArrayList<StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair> existingList = new ArrayList<>(Arrays.asList(this.data));
            existingList.add(data);
            this.data = existingList.toArray(new StringHighlightResultSnippetFieldSnippetMatchArrayKeyValuePair[0]);
        }
        return this;
    }
}
