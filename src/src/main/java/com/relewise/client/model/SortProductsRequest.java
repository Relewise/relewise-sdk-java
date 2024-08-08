package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = SortProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SortProductsRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.SortProductsRequest, Relewise.Client";
    public String[] productIds;
    public static SortProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        return new SortProductsRequest(language, currency, displayedAtLocationType, user);
    }
    public SortProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
    }
    public SortProductsRequest()
    {
    }
    public String[] getProductIds()
    {
        return this.productIds;
    }
    public SortProductsRequest setProductIds(String... productIds)
    {
        this.productIds = productIds;;
        return this;
    }
    public SortProductsRequest addToProductIds(String productId)
    {
        if (this.productIds == null)
        {
            this.productIds = new String[] { productId };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.productIds));
            existingList.add(productId);
            this.productIds = existingList.toArray(new String[0]);
        }
        return this;
    }
    @Override
    public SortProductsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;;
        return this;
    }
    @Override
    public SortProductsRequest setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    @Override
    public SortProductsRequest setUser(User user)
    {
        this.user = user;;
        return this;
    }
    @Override
    public SortProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;;
        return this;
    }
    @Override
    public SortProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    @Override
    public SortProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;;
        return this;
    }
    @Override
    public SortProductsRequest setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}
