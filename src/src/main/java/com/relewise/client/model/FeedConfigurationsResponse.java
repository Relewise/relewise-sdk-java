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
    
/** Response containing all stored feed configurations. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedConfigurationsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedConfigurationsResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Feed.FeedConfigurationsResponse, Relewise.Client";
    /** The stored feed configurations returned by the request. */
    public FeedConfiguration[] configurations;
    public static FeedConfigurationsResponse create(FeedConfiguration... configurations)
    {
        return new FeedConfigurationsResponse(configurations);
    }
    public FeedConfigurationsResponse(FeedConfiguration... configurations)
    {
        this.configurations = configurations;
    }
    public FeedConfigurationsResponse()
    {
    }
    /** The stored feed configurations returned by the request. */
    public FeedConfiguration[] getConfigurations()
    {
        return this.configurations;
    }
    /** The stored feed configurations returned by the request. */
    public FeedConfigurationsResponse setConfigurations(FeedConfiguration... configurations)
    {
        this.configurations = configurations;
        return this;
    }
    /** The stored feed configurations returned by the request. */
    public FeedConfigurationsResponse addToConfigurations(FeedConfiguration configuration)
    {
        if (this.configurations == null)
        {
            this.configurations = new FeedConfiguration[] { configuration };
        }
        else
        {
            ArrayList<FeedConfiguration> existingList = new ArrayList<>(Arrays.asList(this.configurations));
            existingList.add(configuration);
            this.configurations = existingList.toArray(new FeedConfiguration[0]);
        }
        return this;
    }
    @Override
    public FeedConfigurationsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
