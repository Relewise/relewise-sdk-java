package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentsViewedAfterViewingMultipleContentsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterViewingMultipleContentsRequest extends ContentRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleContentsRequest, Relewise.Client";
    public String[] contentIds;
    public static ContentsViewedAfterViewingMultipleContentsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String... contentIds)
    {
        return new ContentsViewedAfterViewingMultipleContentsRequest(language, currency, displayedAtLocationType, user, contentIds);
    }
    public ContentsViewedAfterViewingMultipleContentsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String... contentIds)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.contentIds = contentIds;
    }
    public ContentsViewedAfterViewingMultipleContentsRequest()
    {
    }
    public String[] getContentIds()
    {
        return this.contentIds;
    }
    public ContentsViewedAfterViewingMultipleContentsRequest setContentIds(String... contentIds)
    {
        this.contentIds = contentIds;
        return this;
    }
    public ContentsViewedAfterViewingMultipleContentsRequest addToContentIds(String contentId)
    {
        if (this.contentIds == null)
        {
            this.contentIds = new String[] { contentId };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.contentIds));
            existingList.add(contentId);
            this.contentIds = existingList.toArray(new String[0]);
        }
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setSettings(ContentRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentsViewedAfterViewingMultipleContentsRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
