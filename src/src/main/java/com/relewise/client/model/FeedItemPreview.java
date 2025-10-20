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
    
/** Represents a user preview interaction with a specific feed item, typically when an item in the feed is opened in an overlay or zoomed to full viewport Used to track user engagement and interest in feed items to improve future recommendations and measure item visibility. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedItemPreview.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedItemPreview extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.Feed.FeedItemPreview, Relewise.Client";
    /** The user who previewed the feed item. */
    public @Nullable User user;
    /** The unique identifier of the feed where the preview occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID feedId;
    /** The specific feed item that was previewed. Can represent either a product (with optional variant) or content. */
    public FeedItem item;
    /**
     * Initializes a new instance of the <code>FeedItemPreview</code> class.
     * @param user The user who previewed the feed item. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the preview occurred.
     * @param item The specific feed item that was previewed.
     */
    public static FeedItemPreview create(User user, UUID feedId, FeedItem item)
    {
        return new FeedItemPreview(user, feedId, item);
    }
    /**
     * Initializes a new instance of the <code>FeedItemPreview</code> class.
     * @param user The user who previewed the feed item. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the preview occurred.
     * @param item The specific feed item that was previewed.
     */
    public FeedItemPreview(User user, UUID feedId, FeedItem item)
    {
        this.user = user;
        this.feedId = feedId;
        this.item = item;
    }
    public FeedItemPreview()
    {
    }
    /** The user who previewed the feed item. */
    public @Nullable User getUser()
    {
        return this.user;
    }
    /** The unique identifier of the feed where the preview occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID getFeedId()
    {
        return this.feedId;
    }
    /** The specific feed item that was previewed. Can represent either a product (with optional variant) or content. */
    public FeedItem getItem()
    {
        return this.item;
    }
    /** The user who previewed the feed item. */
    public FeedItemPreview setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    /** The unique identifier of the feed where the preview occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public FeedItemPreview setFeedId(UUID feedId)
    {
        this.feedId = feedId;
        return this;
    }
    /** The specific feed item that was previewed. Can represent either a product (with optional variant) or content. */
    public FeedItemPreview setItem(FeedItem item)
    {
        this.item = item;
        return this;
    }
}
