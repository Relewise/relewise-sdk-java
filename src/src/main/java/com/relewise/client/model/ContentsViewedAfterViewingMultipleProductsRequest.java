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
    defaultImpl = ContentsViewedAfterViewingMultipleProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentsViewedAfterViewingMultipleProductsRequest extends ContentRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleProductsRequest, Relewise.Client";
    public ProductAndVariantId[] productAndVariantIds;
    public static ContentsViewedAfterViewingMultipleProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId... productAndVariantIds)
    {
        return new ContentsViewedAfterViewingMultipleProductsRequest(language, currency, displayedAtLocationType, user, productAndVariantIds);
    }
    public ContentsViewedAfterViewingMultipleProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId... productAndVariantIds)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productAndVariantIds = productAndVariantIds;
    }
    public ContentsViewedAfterViewingMultipleProductsRequest()
    {
    }
    public ProductAndVariantId[] getProductAndVariantIds()
    {
        return this.productAndVariantIds;
    }
    public ContentsViewedAfterViewingMultipleProductsRequest setProductAndVariantIds(ProductAndVariantId... productAndVariantIds)
    {
        this.productAndVariantIds = productAndVariantIds;
        return this;
    }
    public ContentsViewedAfterViewingMultipleProductsRequest addToProductAndVariantIds(ProductAndVariantId productAndVariantId)
    {
        if (this.productAndVariantIds == null)
        {
            this.productAndVariantIds = new ProductAndVariantId[] { productAndVariantId };
        }
        else
        {
            ArrayList<ProductAndVariantId> existingList = new ArrayList<>(Arrays.asList(this.productAndVariantIds));
            existingList.add(productAndVariantId);
            this.productAndVariantIds = existingList.toArray(new ProductAndVariantId[0]);
        }
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setSettings(ContentRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ContentsViewedAfterViewingMultipleProductsRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
