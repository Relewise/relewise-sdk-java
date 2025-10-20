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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DisplayAdTemplate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplate extends DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesRetailMediaEntity
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Entities.DisplayAdTemplate, Relewise.Client";
    public String name;
    public DisplayAdTemplateFieldDefinition[] fields;
    public static DisplayAdTemplate create(@Nullable UUID id, DisplayAdTemplateEntityState state, String name, DisplayAdTemplateFieldDefinition... fields)
    {
        return new DisplayAdTemplate(id, state, name, fields);
    }
    public DisplayAdTemplate(@Nullable UUID id, DisplayAdTemplateEntityState state, String name, DisplayAdTemplateFieldDefinition... fields)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.fields = fields;
    }
    public DisplayAdTemplate()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public DisplayAdTemplateFieldDefinition[] getFields()
    {
        return this.fields;
    }
    public DisplayAdTemplate setName(String name)
    {
        this.name = name;
        return this;
    }
    public DisplayAdTemplate setFields(DisplayAdTemplateFieldDefinition... fields)
    {
        this.fields = fields;
        return this;
    }
    public DisplayAdTemplate addToFields(DisplayAdTemplateFieldDefinition field)
    {
        if (this.fields == null)
        {
            this.fields = new DisplayAdTemplateFieldDefinition[] { field };
        }
        else
        {
            ArrayList<DisplayAdTemplateFieldDefinition> existingList = new ArrayList<>(Arrays.asList(this.fields));
            existingList.add(field);
            this.fields = existingList.toArray(new DisplayAdTemplateFieldDefinition[0]);
        }
        return this;
    }
    @Override
    public DisplayAdTemplate setState(DisplayAdTemplateEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public DisplayAdTemplate setMetadata(DisplayAdTemplateMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public DisplayAdTemplate setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}
