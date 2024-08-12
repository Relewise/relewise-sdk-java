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
    defaultImpl = TriggerConfigurationsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerConfigurationsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.TriggerConfigurationsRequest, Relewise.Client";
    public @Nullable Integer type;
    public static TriggerConfigurationsRequest create(Integer type)
    {
        return new TriggerConfigurationsRequest(type);
    }
    public TriggerConfigurationsRequest(Integer type)
    {
        this.type = type;
    }
    public TriggerConfigurationsRequest()
    {
    }
    public @Nullable Integer getType()
    {
        return this.type;
    }
    public TriggerConfigurationsRequest setType(@Nullable Integer type)
    {
        this.type = type;
        return this;
    }
}
