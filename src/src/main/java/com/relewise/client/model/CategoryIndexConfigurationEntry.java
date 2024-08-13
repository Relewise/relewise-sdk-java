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
public class CategoryIndexConfigurationEntry
{
    public FieldIndexConfiguration id;
    public FieldIndexConfiguration displayName;
    public DataIndexConfiguration data;
    public static CategoryIndexConfigurationEntry create()
    {
        return new CategoryIndexConfigurationEntry();
    }
    public CategoryIndexConfigurationEntry()
    {
    }
    public FieldIndexConfiguration getId()
    {
        return this.id;
    }
    public FieldIndexConfiguration getDisplayName()
    {
        return this.displayName;
    }
    public DataIndexConfiguration getData()
    {
        return this.data;
    }
    public CategoryIndexConfigurationEntry setId(FieldIndexConfiguration id)
    {
        this.id = id;
        return this;
    }
    public CategoryIndexConfigurationEntry setDisplayName(FieldIndexConfiguration displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public CategoryIndexConfigurationEntry setData(DataIndexConfiguration data)
    {
        this.data = data;
        return this;
    }
}
