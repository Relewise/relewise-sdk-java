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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TriggerConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.TriggerConfigurationRequest, Relewise.Client";
    public UUID id;
    public @Nullable Integer type;
    public static TriggerConfigurationRequest create(UUID id, Integer type)
    {
        return new TriggerConfigurationRequest(id, type);
    }
    public TriggerConfigurationRequest(UUID id, Integer type)
    {
        this.id = id;
        this.type = type;
    }
    public static TriggerConfigurationRequest create(UUID id)
    {
        return new TriggerConfigurationRequest(id);
    }
    public TriggerConfigurationRequest(UUID id)
    {
        this.id = id;
    }
    public TriggerConfigurationRequest()
    {
    }
    public UUID getId()
    {
        return this.id;
    }
    public @Nullable Integer getType()
    {
        return this.type;
    }
    public TriggerConfigurationRequest setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public TriggerConfigurationRequest setType(@Nullable Integer type)
    {
        this.type = type;
        return this;
    }
}
