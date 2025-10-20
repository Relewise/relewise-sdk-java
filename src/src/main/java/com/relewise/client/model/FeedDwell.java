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
    
/** Represents user dwell time tracking for feed items, capturing how long a user spent viewing specific items in a feed. Used to measure user engagement and improve future feed recommendations based on time spent consuming content. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = FeedDwell.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedDwell extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.Feed.FeedDwell, Relewise.Client";
    /** The user who dwelled on the feed items. */
    public @Nullable User user;
    /** The unique identifier of the feed where the dwell occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID feedId;
    /** The total time in milliseconds that the user spent viewing the visible items. Must be greater than 0. */
    public Integer dwellTimeMilliseconds;
    /** The collection of feed items that were visible to the user during the dwell period. Must contain at least one item. */
    public FeedItem[] visibleItems;
    /**
     * Initializes a new instance of the <code>FeedDwell</code> class.
     * @param user The user who was viewing the feed items. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the dwell occurred.
     * @param dwellTimeMilliseconds The total time in milliseconds that the user spent viewing the visible items.
     * @param visibleItems The collection of feed items that were visible to the user during the dwell period.
     */
    public static FeedDwell create(User user, UUID feedId, Integer dwellTimeMilliseconds, FeedItem... visibleItems)
    {
        return new FeedDwell(user, feedId, dwellTimeMilliseconds, visibleItems);
    }
    /**
     * Initializes a new instance of the <code>FeedDwell</code> class.
     * @param user The user who was viewing the feed items. Must be an authenticated user.
     * @param feedId The unique identifier of the feed where the dwell occurred.
     * @param dwellTimeMilliseconds The total time in milliseconds that the user spent viewing the visible items.
     * @param visibleItems The collection of feed items that were visible to the user during the dwell period.
     */
    public FeedDwell(User user, UUID feedId, Integer dwellTimeMilliseconds, FeedItem... visibleItems)
    {
        this.user = user;
        this.feedId = feedId;
        this.dwellTimeMilliseconds = dwellTimeMilliseconds;
        this.visibleItems = visibleItems;
    }
    public FeedDwell()
    {
    }
    /** The user who dwelled on the feed items. */
    public @Nullable User getUser()
    {
        return this.user;
    }
    /** The unique identifier of the feed where the dwell occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public UUID getFeedId()
    {
        return this.feedId;
    }
    /** The total time in milliseconds that the user spent viewing the visible items. Must be greater than 0. */
    public Integer getDwellTimeMilliseconds()
    {
        return this.dwellTimeMilliseconds;
    }
    /** The collection of feed items that were visible to the user during the dwell period. Must contain at least one item. */
    public FeedItem[] getVisibleItems()
    {
        return this.visibleItems;
    }
    /** The user who dwelled on the feed items. */
    public FeedDwell setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    /** The unique identifier of the feed where the dwell occurred. This corresponds to the <code>InitializedFeedId</code> from a feed recommendation response. */
    public FeedDwell setFeedId(UUID feedId)
    {
        this.feedId = feedId;
        return this;
    }
    /** The total time in milliseconds that the user spent viewing the visible items. Must be greater than 0. */
    public FeedDwell setDwellTimeMilliseconds(Integer dwellTimeMilliseconds)
    {
        this.dwellTimeMilliseconds = dwellTimeMilliseconds;
        return this;
    }
    /** The collection of feed items that were visible to the user during the dwell period. Must contain at least one item. */
    public FeedDwell setVisibleItems(FeedItem... visibleItems)
    {
        this.visibleItems = visibleItems;
        return this;
    }
    /** The collection of feed items that were visible to the user during the dwell period. Must contain at least one item. */
    public FeedDwell addToVisibleItems(FeedItem visibleItem)
    {
        if (this.visibleItems == null)
        {
            this.visibleItems = new FeedItem[] { visibleItem };
        }
        else
        {
            ArrayList<FeedItem> existingList = new ArrayList<>(Arrays.asList(this.visibleItems));
            existingList.add(visibleItem);
            this.visibleItems = existingList.toArray(new FeedItem[0]);
        }
        return this;
    }
}
