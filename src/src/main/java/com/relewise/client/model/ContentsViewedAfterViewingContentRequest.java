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
    defaultImpl = ContentsViewedAfterViewingContentRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterViewingContentRequest extends ContentRecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingContentRequest, Relewise.Client";
    public String contentId;
    public static ContentsViewedAfterViewingContentRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String contentId)
    {
        return new ContentsViewedAfterViewingContentRequest(language, currency, displayedAtLocationType, user, contentId);
    }
    public ContentsViewedAfterViewingContentRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, String contentId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.contentId = contentId;
    }
    public ContentsViewedAfterViewingContentRequest()
    {
    }
    public String getContentId()
    {
        return this.contentId;
    }
    public ContentsViewedAfterViewingContentRequest setContentId(String contentId)
    {
        this.contentId = contentId;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setSettings(ContentRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingContentRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ContentsViewedAfterViewingContentRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
