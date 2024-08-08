package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = GlobalTriggerConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalTriggerConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Triggers.GlobalTriggerConfiguration, Relewise.Client";
    public OffsetDateTime modified;
    public String modifiedBy;
    public Boolean enabled;
    public @Nullable Integer minimumCooldownAnyTrigger;
    public @Nullable Integer minimumCooldownSameTrigger;
    public @Nullable Integer minimumCooldownSameGroup;
    public HashMap<String, String> settings;
    public static GlobalTriggerConfiguration create()
    {
        return new GlobalTriggerConfiguration();
    }
    public GlobalTriggerConfiguration()
    {
    }
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    public @Nullable Integer getMinimumCooldownAnyTrigger()
    {
        return this.minimumCooldownAnyTrigger;
    }
    public @Nullable Integer getMinimumCooldownSameTrigger()
    {
        return this.minimumCooldownSameTrigger;
    }
    public @Nullable Integer getMinimumCooldownSameGroup()
    {
        return this.minimumCooldownSameGroup;
    }
    public HashMap<String, String> getSettings()
    {
        return this.settings;
    }
    public GlobalTriggerConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    public GlobalTriggerConfiguration setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    public GlobalTriggerConfiguration setEnabled(Boolean enabled)
    {
        this.enabled = enabled;;
        return this;
    }
    public GlobalTriggerConfiguration setMinimumCooldownAnyTrigger(@Nullable Integer minimumCooldownAnyTrigger)
    {
        this.minimumCooldownAnyTrigger = minimumCooldownAnyTrigger;;
        return this;
    }
    public GlobalTriggerConfiguration setMinimumCooldownSameTrigger(@Nullable Integer minimumCooldownSameTrigger)
    {
        this.minimumCooldownSameTrigger = minimumCooldownSameTrigger;;
        return this;
    }
    public GlobalTriggerConfiguration setMinimumCooldownSameGroup(@Nullable Integer minimumCooldownSameGroup)
    {
        this.minimumCooldownSameGroup = minimumCooldownSameGroup;;
        return this;
    }
    public GlobalTriggerConfiguration addToSettings(String key, String value)
    {
        if (this.settings == null)
        {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, value);
        return this;
    }
    public GlobalTriggerConfiguration setSettings(HashMap<String, String> settings)
    {
        this.settings = settings;;
        return this;
    }
}
