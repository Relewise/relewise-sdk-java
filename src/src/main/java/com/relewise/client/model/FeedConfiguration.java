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
    
/** Stores a feed configuration together with its metadata and configured feed sources. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedConfiguration extends FeedConfigurationEntityStateUUIDFeedConfigurationMetadataValuesConfigurationEntity
{
    public String $type = "Relewise.Client.DataTypes.Feed.FeedConfiguration, Relewise.Client";
    /** The display name for this configuration. */
    public String name;
    /** The stable lookup key for this configuration. The key is the uppercase version of <code>Name</code> with whitespace replaced by underscores. For example, <code>Feed Default</code> becomes <code>FEED_DEFAULT</code>. */
    public @Nullable String key;
    /** Indicates whether this configuration is the default configuration. */
    public Boolean isDefault;
    /** The configured feed sources for this configuration. */
    public FeedSourceConfiguration sources;
    public static FeedConfiguration create(@Nullable UUID id, String name)
    {
        return new FeedConfiguration(id, name);
    }
    public FeedConfiguration(@Nullable UUID id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public static FeedConfiguration create(String name)
    {
        return new FeedConfiguration(name);
    }
    public FeedConfiguration(String name)
    {
        this.name = name;
    }
    public FeedConfiguration()
    {
    }
    /** The display name for this configuration. */
    public String getName()
    {
        return this.name;
    }
    /** The stable lookup key for this configuration. The key is the uppercase version of <code>Name</code> with whitespace replaced by underscores. For example, <code>Feed Default</code> becomes <code>FEED_DEFAULT</code>. */
    public @Nullable String getKey()
    {
        return this.key;
    }
    /** Indicates whether this configuration is the default configuration. */
    public Boolean getIsDefault()
    {
        return this.isDefault;
    }
    /** The configured feed sources for this configuration. */
    public FeedSourceConfiguration getSources()
    {
        return this.sources;
    }
    /** The display name for this configuration. */
    public FeedConfiguration setName(String name)
    {
        this.name = name;
        return this;
    }
    /** The stable lookup key for this configuration. The key is the uppercase version of <code>Name</code> with whitespace replaced by underscores. For example, <code>Feed Default</code> becomes <code>FEED_DEFAULT</code>. */
    public FeedConfiguration setKey(@Nullable String key)
    {
        this.key = key;
        return this;
    }
    /** Indicates whether this configuration is the default configuration. */
    public FeedConfiguration setIsDefault(Boolean isDefault)
    {
        this.isDefault = isDefault;
        return this;
    }
    /** The configured feed sources for this configuration. */
    public FeedConfiguration setSources(FeedSourceConfiguration sources)
    {
        this.sources = sources;
        return this;
    }
    @Override
    public FeedConfiguration setState(FeedConfigurationEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public FeedConfiguration setMetadata(FeedConfigurationMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public FeedConfiguration setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}
