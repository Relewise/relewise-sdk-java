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
    
/** Represents a user clicking interaction with a specific feed item. Typically used to track when navigating to the details page of the item from the feed. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedItemClick.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedItemClick extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.Feed.FeedItemClick, Relewise.Client";
    /** The user who clicked the feed item. */
    public @Nullable User user;
    /** The unique identifier of the feed where the click occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID feedId;
    /** The specific feed item that was clicked. Can represent either a product (with optional variant) or content. */
    public FeedItem item;
    /**
     * Initializes a new instance of the <code>FeedItemClick</code> class.
     * @param user The user who clicked the feed item. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the click occurred.
     * @param item The specific feed item that was clicked.
     */
    public static FeedItemClick create(User user, UUID feedId, FeedItem item)
    {
        return new FeedItemClick(user, feedId, item);
    }
    /**
     * Initializes a new instance of the <code>FeedItemClick</code> class.
     * @param user The user who clicked the feed item. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the click occurred.
     * @param item The specific feed item that was clicked.
     */
    public FeedItemClick(User user, UUID feedId, FeedItem item)
    {
        this.user = user;
        this.feedId = feedId;
        this.item = item;
    }
    public FeedItemClick()
    {
    }
    /** The user who clicked the feed item. */
    public @Nullable User getUser()
    {
        return this.user;
    }
    /** The unique identifier of the feed where the click occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID getFeedId()
    {
        return this.feedId;
    }
    /** The specific feed item that was clicked. Can represent either a product (with optional variant) or content. */
    public FeedItem getItem()
    {
        return this.item;
    }
    /** The user who clicked the feed item. */
    public FeedItemClick setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    /** The unique identifier of the feed where the click occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public FeedItemClick setFeedId(UUID feedId)
    {
        this.feedId = feedId;
        return this;
    }
    /** The specific feed item that was clicked. Can represent either a product (with optional variant) or content. */
    public FeedItemClick setItem(FeedItem item)
    {
        this.item = item;
        return this;
    }
}
