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
    
/** Saves a feed configuration under the specified identifier. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveFeedConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveFeedConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.Feed.SaveFeedConfigurationRequest, Relewise.Client";
    /** The feed configuration to save. */
    public FeedConfiguration configuration;
    /** The user or system that modified the configuration. */
    public String modifiedBy;
    public static SaveFeedConfigurationRequest create(FeedConfiguration configuration, String modifiedBy)
    {
        return new SaveFeedConfigurationRequest(configuration, modifiedBy);
    }
    public SaveFeedConfigurationRequest(FeedConfiguration configuration, String modifiedBy)
    {
        this.configuration = configuration;
        this.modifiedBy = modifiedBy;
    }
    public SaveFeedConfigurationRequest()
    {
    }
    /** The feed configuration to save. */
    public FeedConfiguration getConfiguration()
    {
        return this.configuration;
    }
    /** The user or system that modified the configuration. */
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    /** The feed configuration to save. */
    public SaveFeedConfigurationRequest setConfiguration(FeedConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    /** The user or system that modified the configuration. */
    public SaveFeedConfigurationRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
