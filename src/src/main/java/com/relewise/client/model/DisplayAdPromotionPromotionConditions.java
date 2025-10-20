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
    defaultImpl = DisplayAdPromotionPromotionConditions.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdPromotionPromotionConditions extends RetailMediaConditions
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.DisplayAdPromotion+PromotionConditions, Relewise.Client";
    public @Nullable SearchTermConditionByLanguageCollection searchTerm;
    public @Nullable RequestFilterCriteria requestFilters;
    public static DisplayAdPromotionPromotionConditions create()
    {
        return new DisplayAdPromotionPromotionConditions();
    }
    public DisplayAdPromotionPromotionConditions()
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
    public DisplayAdPromotionPromotionConditions setSearchTerm(@Nullable SearchTermConditionByLanguageCollection searchTerm)
    {
        this.searchTerm = searchTerm;
        return this;
    }
    public DisplayAdPromotionPromotionConditions setRequestFilters(@Nullable RequestFilterCriteria requestFilters)
    {
        this.requestFilters = requestFilters;
        return this;
    }
}
