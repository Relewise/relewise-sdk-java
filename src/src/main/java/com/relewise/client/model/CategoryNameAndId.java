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
    
/** A category segment, containing the id and display name(s) of an individual category */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CategoryNameAndId
{
    public String id;
    public @Nullable Multilingual displayName;
    public static CategoryNameAndId create(String id)
    {
        return new CategoryNameAndId(id);
    }
    public CategoryNameAndId(String id)
    {
        this.id = id;
        this.displayName = null;
    }
    /**
     * The id and name of a category segment
     * @param id The ID of the category (Which is generally very unlikely to change in the future)
     * @param displayName The Display name of the category (More likely to change in the future)
     */
    public static CategoryNameAndId create(String id, Multilingual displayName)
    {
        return new CategoryNameAndId(id, displayName);
    }
    /**
     * The id and name of a category segment
     * @param id The ID of the category (Which is generally very unlikely to change in the future)
     * @param displayName The Display name of the category (More likely to change in the future)
     */
    public CategoryNameAndId(String id, Multilingual displayName)
    {
        this.id = id;
        this.displayName = displayName;
    }
    public CategoryNameAndId()
    {
        this.displayName = null;
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public CategoryNameAndId setId(String id)
    {
        this.id = id;
        return this;
    }
    public CategoryNameAndId setDisplayName(@Nullable Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
}
