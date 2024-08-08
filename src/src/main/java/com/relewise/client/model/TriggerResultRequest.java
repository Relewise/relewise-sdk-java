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
    defaultImpl = TriggerResultRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerResultRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.TriggerResultRequest, Relewise.Client";
    public UUID configurationId;
    public static TriggerResultRequest create(UUID configurationId)
    {
        return new TriggerResultRequest(configurationId);
    }
    public TriggerResultRequest(UUID configurationId)
    {
        this.configurationId = configurationId;
    }
    public TriggerResultRequest()
    {
    }
    public UUID getConfigurationId()
    {
        return this.configurationId;
    }
    public TriggerResultRequest setConfigurationId(UUID configurationId)
    {
        this.configurationId = configurationId;;
        return this;
    }
}
