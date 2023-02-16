package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = GlobalTriggerConfigurationResponse.class)
public class GlobalTriggerConfigurationResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Triggers.GlobalTriggerConfigurationResponse, Relewise.Client";
    public GlobalTriggerConfiguration configuration;
    public static GlobalTriggerConfigurationResponse create()
    {
        return new GlobalTriggerConfigurationResponse();
    }
    public GlobalTriggerConfigurationResponse()
    {
    }
    public GlobalTriggerConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public GlobalTriggerConfigurationResponse setConfiguration(GlobalTriggerConfiguration configuration)
    {
        this.configuration = configuration;;
        return this;
    }
    @Override
    public GlobalTriggerConfigurationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
