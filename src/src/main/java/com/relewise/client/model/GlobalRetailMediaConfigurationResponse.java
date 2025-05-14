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
    defaultImpl = GlobalRetailMediaConfigurationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalRetailMediaConfigurationResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.GlobalRetailMediaConfigurationResponse, Relewise.Client";
    public GlobalRetailMediaConfiguration configuration;
    public static GlobalRetailMediaConfigurationResponse create(GlobalRetailMediaConfiguration configuration)
    {
        return new GlobalRetailMediaConfigurationResponse(configuration);
    }
    public GlobalRetailMediaConfigurationResponse(GlobalRetailMediaConfiguration configuration)
    {
        this.configuration = configuration;
    }
    public GlobalRetailMediaConfigurationResponse()
    {
    }
    public GlobalRetailMediaConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public GlobalRetailMediaConfigurationResponse setConfiguration(GlobalRetailMediaConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    @Override
    public GlobalRetailMediaConfigurationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
