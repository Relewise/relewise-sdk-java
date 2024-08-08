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
    defaultImpl = UserFavoriteProductRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserFavoriteProductRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.UserFavoriteProductRelevanceModifier, Relewise.Client";
    public Integer sinceMinutesAgo;
    public Double numberOfPurchasesWeight;
    public Double mostRecentPurchaseWeight;
    public Double ifNotPurchasedBaseWeight;
    public static UserFavoriteProductRelevanceModifier create()
    {
        return new UserFavoriteProductRelevanceModifier();
    }
    public UserFavoriteProductRelevanceModifier()
    {
        this.numberOfPurchasesWeight = 1d;
        this.mostRecentPurchaseWeight = 1d;
        this.ifNotPurchasedBaseWeight = 1d;
    }
    public static UserFavoriteProductRelevanceModifier create(Double numberOfPurchasesWeight, Double mostRecentPurchaseWeight, Double ifNotPurchasedBaseWeight)
    {
        return new UserFavoriteProductRelevanceModifier(numberOfPurchasesWeight, mostRecentPurchaseWeight, ifNotPurchasedBaseWeight);
    }
    public UserFavoriteProductRelevanceModifier(Double numberOfPurchasesWeight, Double mostRecentPurchaseWeight, Double ifNotPurchasedBaseWeight)
    {
        this.numberOfPurchasesWeight = numberOfPurchasesWeight;
        this.mostRecentPurchaseWeight = mostRecentPurchaseWeight;
        this.ifNotPurchasedBaseWeight = ifNotPurchasedBaseWeight;
    }
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    public Double getNumberOfPurchasesWeight()
    {
        return this.numberOfPurchasesWeight;
    }
    public Double getMostRecentPurchaseWeight()
    {
        return this.mostRecentPurchaseWeight;
    }
    public Double getIfNotPurchasedBaseWeight()
    {
        return this.ifNotPurchasedBaseWeight;
    }
    public UserFavoriteProductRelevanceModifier setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;;
        return this;
    }
    public UserFavoriteProductRelevanceModifier setNumberOfPurchasesWeight(Double numberOfPurchasesWeight)
    {
        this.numberOfPurchasesWeight = numberOfPurchasesWeight;;
        return this;
    }
    public UserFavoriteProductRelevanceModifier setMostRecentPurchaseWeight(Double mostRecentPurchaseWeight)
    {
        this.mostRecentPurchaseWeight = mostRecentPurchaseWeight;;
        return this;
    }
    public UserFavoriteProductRelevanceModifier setIfNotPurchasedBaseWeight(Double ifNotPurchasedBaseWeight)
    {
        this.ifNotPurchasedBaseWeight = ifNotPurchasedBaseWeight;;
        return this;
    }
    @Override
    public UserFavoriteProductRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}
