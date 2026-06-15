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
    
/** Deletes a stored feed configuration. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DeleteFeedConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteFeedConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Recommendations.Feed.DeleteFeedConfigurationRequest, Relewise.Client";
    /** The identifier of the configuration to delete. */
    public UUID configurationId;
    /** The user or system that deleted the configuration. */
    public String deletedBy;
    public static DeleteFeedConfigurationRequest create(UUID configurationId, String deletedBy)
    {
        return new DeleteFeedConfigurationRequest(configurationId, deletedBy);
    }
    public DeleteFeedConfigurationRequest(UUID configurationId, String deletedBy)
    {
        this.configurationId = configurationId;
        this.deletedBy = deletedBy;
    }
    public DeleteFeedConfigurationRequest()
    {
    }
    /** The identifier of the configuration to delete. */
    public UUID getConfigurationId()
    {
        return this.configurationId;
    }
    /** The user or system that deleted the configuration. */
    public String getDeletedBy()
    {
        return this.deletedBy;
    }
    /** The identifier of the configuration to delete. */
    public DeleteFeedConfigurationRequest setConfigurationId(UUID configurationId)
    {
        this.configurationId = configurationId;
        return this;
    }
    /** The user or system that deleted the configuration. */
    public DeleteFeedConfigurationRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;
        return this;
    }
}
