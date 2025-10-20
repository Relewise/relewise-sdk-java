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
    
/** Represents an engagement (sentiment feedback, etc.) performed by a <code>User</code> on a specific content item. Instances are validated on construction and can be sent through the tracking API. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentEngagement.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentEngagement extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ContentEngagement, Relewise.Client";
    /** The user associated with the engagement. */
    public @Nullable User user;
    /** The identifier of the content the engagement concerns. Must be non-null and non-empty. */
    public String id;
    /** The engagement payload describing the sentiment/favorite signal for the content. */
    public ContentEngagementData engagement;
    /** Initializes a new <code>ContentEngagement</code>. */
    public static ContentEngagement create(@Nullable User user, String id, ContentEngagementData engagement)
    {
        return new ContentEngagement(user, id, engagement);
    }
    /** Initializes a new <code>ContentEngagement</code>. */
    public ContentEngagement(@Nullable User user, String id, ContentEngagementData engagement)
    {
        this.user = user;
        this.id = id;
        this.engagement = engagement;
    }
    public ContentEngagement()
    {
    }
    /** The user associated with the engagement. */
    public @Nullable User getUser()
    {
        return this.user;
    }
    /** The identifier of the content the engagement concerns. Must be non-null and non-empty. */
    public String getId()
    {
        return this.id;
    }
    /** The engagement payload describing the sentiment/favorite signal for the content. */
    public ContentEngagementData getEngagement()
    {
        return this.engagement;
    }
    /** The user associated with the engagement. */
    public ContentEngagement setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    /** The identifier of the content the engagement concerns. Must be non-null and non-empty. */
    public ContentEngagement setId(String id)
    {
        this.id = id;
        return this;
    }
    /** The engagement payload describing the sentiment/favorite signal for the content. */
    public ContentEngagement setEngagement(ContentEngagementData engagement)
    {
        this.engagement = engagement;
        return this;
    }
}
