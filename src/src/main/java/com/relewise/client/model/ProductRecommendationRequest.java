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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PurchasedWithProductRequest.class, name = "Relewise.Client.Requests.Recommendations.PurchasedWithProductRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PurchasedWithMultipleProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.PurchasedWithMultipleProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PurchasedWithCurrentCartRequest.class, name = "Relewise.Client.Requests.Recommendations.PurchasedWithCurrentCartRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsViewedAfterViewingProductRequest.class, name = "Relewise.Client.Requests.Recommendations.ProductsViewedAfterViewingProductRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SimilarProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.SimilarProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = RecentlyViewedProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.RecentlyViewedProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalProductRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalProductRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SortProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.SortProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SortVariantsRequest.class, name = "Relewise.Client.Requests.Recommendations.SortVariantsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = CustomProductRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.CustomProductRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsViewedAfterViewingContentRequest.class, name = "Relewise.Client.Requests.Recommendations.ProductsViewedAfterViewingContentRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermBasedProductRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.SearchTermBasedProductRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductRecommendationRequest extends RecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "";
    public ProductRecommendationRequestSettings settings;
    public ProductRecommendationRequestSettings getSettings()
    {
        return this.settings;
    }
    public ProductRecommendationRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public ProductRecommendationRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductRecommendationRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public ProductRecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public ProductRecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductRecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public ProductRecommendationRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public ProductRecommendationRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
