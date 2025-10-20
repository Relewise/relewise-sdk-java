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
    defaultImpl = DisplayAd.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAd extends DisplayAdEntityStateStringDisplayAdMetadataValuesRetailMediaEntity
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Entities.DisplayAd, Relewise.Client";
    public String name;
    public UUID advertiserId;
    public UUID templateId;
    public @Nullable HashMap<String, DataValue> data;
    public static DisplayAd create(String id, DisplayAdEntityState state, String name, UUID advertiserId, UUID templateId, HashMap<String, DataValue> data)
    {
        return new DisplayAd(id, state, name, advertiserId, templateId, data);
    }
    public DisplayAd(String id, DisplayAdEntityState state, String name, UUID advertiserId, UUID templateId, HashMap<String, DataValue> data)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.advertiserId = advertiserId;
        this.templateId = templateId;
        this.data = data;
    }
    public static DisplayAd create(String id, DisplayAdEntityState state, String name, UUID advertiserId, UUID templateId)
    {
        return new DisplayAd(id, state, name, advertiserId, templateId);
    }
    public DisplayAd(String id, DisplayAdEntityState state, String name, UUID advertiserId, UUID templateId)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.advertiserId = advertiserId;
        this.templateId = templateId;
    }
    public DisplayAd()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public UUID getAdvertiserId()
    {
        return this.advertiserId;
    }
    public UUID getTemplateId()
    {
        return this.templateId;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public DisplayAd setName(String name)
    {
        this.name = name;
        return this;
    }
    public DisplayAd setAdvertiserId(UUID advertiserId)
    {
        this.advertiserId = advertiserId;
        return this;
    }
    public DisplayAd setTemplateId(UUID templateId)
    {
        this.templateId = templateId;
        return this;
    }
    public DisplayAd addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public DisplayAd setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    @Override
    public DisplayAd setState(DisplayAdEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public DisplayAd setMetadata(DisplayAdMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public DisplayAd setId(String id)
    {
        this.id = id;
        return this;
    }
}
