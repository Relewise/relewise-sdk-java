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
    defaultImpl = TriggerConfigurationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerConfigurationResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Triggers.TriggerConfigurationResponse, Relewise.Client";
    public TriggerConfiguration configuration;
    public static TriggerConfigurationResponse create()
    {
        return new TriggerConfigurationResponse();
    }
    public TriggerConfigurationResponse()
    {
    }
    public TriggerConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public TriggerConfigurationResponse setConfiguration(TriggerConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    @Override
    public TriggerConfigurationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
