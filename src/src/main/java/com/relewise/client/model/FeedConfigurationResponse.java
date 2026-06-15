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
    
/** Response containing a single stored feed configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedConfigurationResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedConfigurationResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Feed.FeedConfigurationResponse, Relewise.Client";
    /** The retrieved feed configuration. */
    public FeedConfiguration configuration;
    public static FeedConfigurationResponse create(FeedConfiguration configuration)
    {
        return new FeedConfigurationResponse(configuration);
    }
    public FeedConfigurationResponse(FeedConfiguration configuration)
    {
        this.configuration = configuration;
    }
    public FeedConfigurationResponse()
    {
    }
    /** The retrieved feed configuration. */
    public FeedConfiguration getConfiguration()
    {
        return this.configuration;
    }
    /** The retrieved feed configuration. */
    public FeedConfigurationResponse setConfiguration(FeedConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    @Override
    public FeedConfigurationResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
