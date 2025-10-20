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
public class DisplayAdTemplateFieldDefinition
{
    public String name;
    public DataValueDataValueTypes type;
    public @Nullable HashMap<String, String> metadata;
    public static DisplayAdTemplateFieldDefinition create(String name, DataValueDataValueTypes type, HashMap<String, String> metadata)
    {
        return new DisplayAdTemplateFieldDefinition(name, type, metadata);
    }
    public DisplayAdTemplateFieldDefinition(String name, DataValueDataValueTypes type, HashMap<String, String> metadata)
    {
        this.name = name;
        this.type = type;
        this.metadata = metadata;
    }
    public static DisplayAdTemplateFieldDefinition create(String name, DataValueDataValueTypes type)
    {
        return new DisplayAdTemplateFieldDefinition(name, type);
    }
    public DisplayAdTemplateFieldDefinition(String name, DataValueDataValueTypes type)
    {
        this.name = name;
        this.type = type;
    }
    public DisplayAdTemplateFieldDefinition()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public DataValueDataValueTypes getType()
    {
        return this.type;
    }
    public @Nullable HashMap<String, String> getMetadata()
    {
        return this.metadata;
    }
    public DisplayAdTemplateFieldDefinition setName(String name)
    {
        this.name = name;
        return this;
    }
    public DisplayAdTemplateFieldDefinition setType(DataValueDataValueTypes type)
    {
        this.type = type;
        return this;
    }
    public DisplayAdTemplateFieldDefinition addToMetadata(String key, String value)
    {
        if (this.metadata == null)
        {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, value);
        return this;
    }
    public DisplayAdTemplateFieldDefinition setMetadata(@Nullable HashMap<String, String> metadata)
    {
        this.metadata = metadata;
        return this;
    }
}
