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
    defaultImpl = SimilarProductsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SimilarProductsRequest extends ProductRecommendationRequest implements IUserIdentifier, IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.Requests.Recommendations.SimilarProductsRequest, Relewise.Client";
    public @Nullable ProductAndVariantId existingProductId;
    public @Nullable Product productData;
    public Boolean considerAlreadyKnownInformationAboutProduct;
    public @Nullable SimilarProductsEvaluationSettings evaluationSettings;
    public @Nullable Integer explodedVariants;
    public static SimilarProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Product productData, Boolean considerAlreadyKnownInformationAboutProduct)
    {
        return new SimilarProductsRequest(language, currency, displayedAtLocationType, user, productData, considerAlreadyKnownInformationAboutProduct);
    }
    public SimilarProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Product productData, Boolean considerAlreadyKnownInformationAboutProduct)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productData = productData;
        this.considerAlreadyKnownInformationAboutProduct = considerAlreadyKnownInformationAboutProduct;
        this.evaluationSettings = null;
    }
    public static SimilarProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Product productData, Boolean considerAlreadyKnownInformationAboutProduct, @Nullable SimilarProductsEvaluationSettings evaluationSettings)
    {
        return new SimilarProductsRequest(language, currency, displayedAtLocationType, user, productData, considerAlreadyKnownInformationAboutProduct, evaluationSettings);
    }
    public SimilarProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, Product productData, Boolean considerAlreadyKnownInformationAboutProduct, @Nullable SimilarProductsEvaluationSettings evaluationSettings)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.productData = productData;
        this.considerAlreadyKnownInformationAboutProduct = considerAlreadyKnownInformationAboutProduct;
        this.evaluationSettings = evaluationSettings;
    }
    public static SimilarProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId existingProductId)
    {
        return new SimilarProductsRequest(language, currency, displayedAtLocationType, user, existingProductId);
    }
    public SimilarProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId existingProductId)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.existingProductId = existingProductId;
        this.evaluationSettings = null;
    }
    public static SimilarProductsRequest create(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId existingProductId, @Nullable SimilarProductsEvaluationSettings evaluationSettings)
    {
        return new SimilarProductsRequest(language, currency, displayedAtLocationType, user, existingProductId, evaluationSettings);
    }
    public SimilarProductsRequest(@Nullable Language language, @Nullable Currency currency, String displayedAtLocationType, User user, ProductAndVariantId existingProductId, @Nullable SimilarProductsEvaluationSettings evaluationSettings)
    {
        this.language = language;
        this.currency = currency;
        this.displayedAtLocationType = displayedAtLocationType;
        this.user = user;
        this.existingProductId = existingProductId;
        this.evaluationSettings = evaluationSettings;
    }
    public SimilarProductsRequest()
    {
        this.evaluationSettings = null;
    }
    public @Nullable ProductAndVariantId getExistingProductId()
    {
        return this.existingProductId;
    }
    public @Nullable Product getProductData()
    {
        return this.productData;
    }
    public Boolean getConsiderAlreadyKnownInformationAboutProduct()
    {
        return this.considerAlreadyKnownInformationAboutProduct;
    }
    public @Nullable SimilarProductsEvaluationSettings getEvaluationSettings()
    {
        return this.evaluationSettings;
    }
    public @Nullable Integer getExplodedVariants()
    {
        return this.explodedVariants;
    }
    public SimilarProductsRequest setExistingProductId(@Nullable ProductAndVariantId existingProductId)
    {
        this.existingProductId = existingProductId;
        return this;
    }
    public SimilarProductsRequest setProductData(@Nullable Product productData)
    {
        this.productData = productData;
        return this;
    }
    public SimilarProductsRequest setConsiderAlreadyKnownInformationAboutProduct(Boolean considerAlreadyKnownInformationAboutProduct)
    {
        this.considerAlreadyKnownInformationAboutProduct = considerAlreadyKnownInformationAboutProduct;
        return this;
    }
    public SimilarProductsRequest setEvaluationSettings(@Nullable SimilarProductsEvaluationSettings evaluationSettings)
    {
        this.evaluationSettings = evaluationSettings;
        return this;
    }
    public SimilarProductsRequest setExplodedVariants(@Nullable Integer explodedVariants)
    {
        this.explodedVariants = explodedVariants;
        return this;
    }
    @Override
    public SimilarProductsRequest setSettings(ProductRecommendationRequestSettings settings)
    {
        this.settings = settings;
        return this;
    }
    @Override
    public SimilarProductsRequest setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public SimilarProductsRequest setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    @Override
    public SimilarProductsRequest setRelevanceModifiers(RelevanceModifierCollection relevanceModifiers)
    {
        this.relevanceModifiers = relevanceModifiers;
        return this;
    }
    @Override
    public SimilarProductsRequest setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public SimilarProductsRequest setDisplayedAtLocationType(String displayedAtLocationType)
    {
        this.displayedAtLocationType = displayedAtLocationType;
        return this;
    }
    @Override
    public SimilarProductsRequest setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    @Override
    public SimilarProductsRequest setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
