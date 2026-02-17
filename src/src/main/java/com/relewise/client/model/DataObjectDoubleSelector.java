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
    
/** Selects a double value from a data object (or list of data objects) using an object path and optional filter. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DataObjectDoubleSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectDoubleSelector extends ValueSelector
{
    public String $type = "Relewise.Client.Requests.ValueSelectors.DataObjectDoubleSelector, Relewise.Client";
    /** The data key on the target entity (e.g., product or variant data key) that contains the object or object list. */
    public String key;
    /** The path within the data object that points to the numeric value to select. */
    public String[] objectPath;
    /** Optional filter applied when the data key contains an object list. */
    public @Nullable DataObjectFilter objectFilter;
    /**
     * Creates a selector for a data object value.
     * @param key The data key holding the object or object list.
     * @param objectPath The path to the double value inside the object/object-list.
     * @param objectFilter Optional filter to choose which object to read from an object list.
     */
    public static DataObjectDoubleSelector create(String key, String[] objectPath, @Nullable DataObjectFilter objectFilter)
    {
        return new DataObjectDoubleSelector(key, objectPath, objectFilter);
    }
    /**
     * Creates a selector for a data object value.
     * @param key The data key holding the object or object list.
     * @param objectPath The path to the double value inside the object/object-list.
     * @param objectFilter Optional filter to choose which object to read from an object list.
     */
    public DataObjectDoubleSelector(String key, String[] objectPath, @Nullable DataObjectFilter objectFilter)
    {
        this.key = key;
        this.objectPath = objectPath;
        this.objectFilter = objectFilter;
    }
    public DataObjectDoubleSelector()
    {
    }
    /** The data key on the target entity (e.g., product or variant data key) that contains the object or object list. */
    public String getKey()
    {
        return this.key;
    }
    /** The path within the data object that points to the numeric value to select. */
    public String[] getObjectPath()
    {
        return this.objectPath;
    }
    /** Optional filter applied when the data key contains an object list. */
    public @Nullable DataObjectFilter getObjectFilter()
    {
        return this.objectFilter;
    }
    /** The data key on the target entity (e.g., product or variant data key) that contains the object or object list. */
    public DataObjectDoubleSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The path within the data object that points to the numeric value to select. */
    public DataObjectDoubleSelector setObjectPath(String... objectPath)
    {
        this.objectPath = objectPath;
        return this;
    }
    /** The path within the data object that points to the numeric value to select. */
    public DataObjectDoubleSelector addToObjectPath(String objectPath)
    {
        if (this.objectPath == null)
        {
            this.objectPath = new String[] { objectPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.objectPath));
            existingList.add(objectPath);
            this.objectPath = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** Optional filter applied when the data key contains an object list. */
    public DataObjectDoubleSelector setObjectFilter(@Nullable DataObjectFilter objectFilter)
    {
        this.objectFilter = objectFilter;
        return this;
    }
}
