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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FeedConfigurationEntityStateUUIDFeedConfigurationMetadataValuesConfigurationEntity extends UUIDConfigurationEntity
{
    public String $type = "";
    public FeedConfigurationEntityState state;
    /** Managed on the server side only, manually setting this will have no effect */
    public FeedConfigurationMetadataValues metadata;
    public FeedConfigurationEntityState getState()
    {
        return this.state;
    }
    /** Managed on the server side only, manually setting this will have no effect */
    public FeedConfigurationMetadataValues getMetadata()
    {
        return this.metadata;
    }
    public FeedConfigurationEntityStateUUIDFeedConfigurationMetadataValuesConfigurationEntity setState(FeedConfigurationEntityState state)
    {
        this.state = state;
        return this;
    }
    /** Managed on the server side only, manually setting this will have no effect */
    public FeedConfigurationEntityStateUUIDFeedConfigurationMetadataValuesConfigurationEntity setMetadata(FeedConfigurationMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public FeedConfigurationEntityStateUUIDFeedConfigurationMetadataValuesConfigurationEntity setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}
