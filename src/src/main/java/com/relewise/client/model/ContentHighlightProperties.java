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
    
/** The properties to be included in highlighting. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ContentHighlightProperties
{
    public String $type = "";
    /** If highlights should include display name. */
    public Boolean displayName;
    public String[] dataKeys;
    /** If highlights should include display name. */
    public Boolean getDisplayName()
    {
        return this.displayName;
    }
    public String[] getDataKeys()
    {
        return this.dataKeys;
    }
    /** If highlights should include display name. */
    public ContentHighlightProperties setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ContentHighlightProperties setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public ContentHighlightProperties addToDataKeys(String dataKey)
    {
        if (this.dataKeys == null)
        {
            this.dataKeys = new String[] { dataKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.dataKeys));
            existingList.add(dataKey);
            this.dataKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}
