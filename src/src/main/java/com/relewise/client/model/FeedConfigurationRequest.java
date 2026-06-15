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
    
/** Loads a single stored feed configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.Feed.FeedConfigurationRequest, Relewise.Client";
    /** The identifier of the configuration to load. */
    public UUID configurationId;
    public static FeedConfigurationRequest create(UUID configurationId)
    {
        return new FeedConfigurationRequest(configurationId);
    }
    public FeedConfigurationRequest(UUID configurationId)
    {
        this.configurationId = configurationId;
    }
    public FeedConfigurationRequest()
    {
    }
    /** The identifier of the configuration to load. */
    public UUID getConfigurationId()
    {
        return this.configurationId;
    }
    /** The identifier of the configuration to load. */
    public FeedConfigurationRequest setConfigurationId(UUID configurationId)
    {
        this.configurationId = configurationId;
        return this;
    }
}
