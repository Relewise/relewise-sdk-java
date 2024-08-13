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
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingContentRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingContentRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingProductRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingProductRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsViewedAfterViewingContentRequest.class, name = "Relewise.Client.Requests.Recommendations.ProductsViewedAfterViewingContentRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermBasedProductRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.SearchTermBasedProductRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingMultipleProductsRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleProductsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularSearchTermsRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularSearchTermsRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularContentsRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularContentsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalContentRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalContentRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterViewingMultipleContentsRequest.class, name = "Relewise.Client.Requests.Recommendations.ContentsViewedAfterViewingMultipleContentsRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularProductCategoriesRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularProductCategoriesRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalProductCategoryRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalProductCategoryRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularBrandsRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularBrandsRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PopularContentCategoriesRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PopularContentCategoriesRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalContentCategoryRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalContentCategoryRecommendationRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = PersonalBrandRecommendationRequest.class, name = "Relewise.Client.Requests.Recommendations.PersonalBrandRecommendationRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecommendationRequest extends LicensedRequest implements IUserIdentifier
{
    public String $type = "";
    public @Nullable Language language;
    public User user;
    public RelevanceModifierCollection relevanceModifiers;
    public FilterCollection filters;
    public String displayedAtLocationType;
    public @Nullable Currency currency;
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public User getUser()
    {
        return this.user;
    }
    public RelevanceModifierCollection getRelevanceModifiers()
    {
        return this.relevanceModifiers;
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public String getDisplayedAtLocationType()
    {
        return this.displayedAtLocationType;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public RecommendationRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public RecommendationRequest setUser(User user)
    {
        this.user = user;
        return this;
    }
    public RecommendationRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    public RecommendationRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public RecommendationRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    public RecommendationRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
