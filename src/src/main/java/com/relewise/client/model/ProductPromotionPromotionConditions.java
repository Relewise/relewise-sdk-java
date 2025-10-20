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
    defaultImpl = ProductPromotionPromotionConditions.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPromotionPromotionConditions extends RetailMediaConditions
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.ProductPromotion+PromotionConditions, Relewise.Client";
    public @Nullable SearchTermConditionByLanguageCollection searchTerm;
    public @Nullable RequestFilterCriteria requestFilters;
    public static ProductPromotionPromotionConditions create()
    {
        return new ProductPromotionPromotionConditions();
    }
    public ProductPromotionPromotionConditions()
    {
    }
    public @Nullable SearchTermConditionByLanguageCollection getSearchTerm()
    {
        return this.searchTerm;
    }
    public @Nullable RequestFilterCriteria getRequestFilters()
    {
        return this.requestFilters;
    }
    public ProductPromotionPromotionConditions setSearchTerm(@Nullable SearchTermConditionByLanguageCollection searchTerm)
    {
        this.searchTerm = searchTerm;
        return this;
    }
    public ProductPromotionPromotionConditions setRequestFilters(@Nullable RequestFilterCriteria requestFilters)
    {
        this.requestFilters = requestFilters;
        return this;
    }
}
