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
    property = "$type",
    defaultImpl = PurchasedWithMultipleProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchasedWithMultipleProductsRequest extends ProductRecommendationRequest implements IUserIdentifier
{
    public String $type = "Relewise.Client.Requests.Recommendations.PurchasedWithMultipleProductsRequest, Relewise.Client";
    public ProductAndVariantId[] productAndVariantIds;
    public static PurchasedWithMultipleProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        return new PurchasedWithMultipleProductsRequest(language, currency, displayedAtLocationType, user);
    }
    public PurchasedWithMultipleProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
    }
    public PurchasedWithMultipleProductsRequest()
    {
    }
    public ProductAndVariantId[] getProductAndVariantIds()
    {
        return this.productAndVariantIds;
    }
    public PurchasedWithMultipleProductsRequest setProductAndVariantIds(ProductAndVariantId... productAndVariantIds)
    {
        this.productAndVariantIds = productAndVariantIds;
        return this;
    }
    public PurchasedWithMultipleProductsRequest addToProductAndVariantIds(ProductAndVariantId productAndVariantId)
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
    public PurchasedWithMultipleProductsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public PurchasedWithMultipleProductsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public PurchasedWithMultipleProductsRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
