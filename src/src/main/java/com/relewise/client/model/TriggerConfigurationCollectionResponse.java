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
    defaultImpl = TriggerConfigurationCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TriggerConfigurationCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Triggers.TriggerConfigurationCollectionResponse, Relewise.Client";
    public TriggerConfiguration[] configurations;
    public static TriggerConfigurationCollectionResponse create()
    {
        return new TriggerConfigurationCollectionResponse();
    }
    public TriggerConfigurationCollectionResponse()
    {
    }
    public TriggerConfiguration[] getConfigurations()
    {
        return this.configurations;
    }
    public TriggerConfigurationCollectionResponse setConfigurations(TriggerConfiguration... configurations)
    {
        this.configurations = configurations;
        return this;
    }
    public TriggerConfigurationCollectionResponse addToConfigurations(TriggerConfiguration configuration)
    {
        if (this.configurations == null)
        {
            this.configurations = new TriggerConfiguration[] { configuration };
        }
        else
        {
            ArrayList<TriggerConfiguration> existingList = new ArrayList<>(Arrays.asList(this.configurations));
            existingList.add(configuration);
            this.configurations = existingList.toArray(new TriggerConfiguration[0]);
        }
        return this;
    }
    @Override
    public TriggerConfigurationCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
