package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductCategoryRecommendationRequestSettings.class)
public class ProductCategoryRecommendationRequestSettings
{
    public String $type = "Relewise.Client.Requests.Recommendations.ProductCategoryRecommendationRequestSettings, Relewise.Client";
    public Integer numberOfRecommendations;
    public Boolean allowFillIfNecessaryToReachNumberOfRecommendations;
    public Boolean allowReplacingOfRecentlyShownRecommendations;
    public Boolean prioritizeDiversityBetweenRequests;
    public SelectedProductCategoryPropertiesSettings selectedProductCategoryProperties;
    public static ProductCategoryRecommendationRequestSettings create()
    {
        return new ProductCategoryRecommendationRequestSettings();
    }
    public ProductCategoryRecommendationRequestSettings()
    {
    }
    public Integer getNumberOfRecommendations()
    {
        return this.numberOfRecommendations;
    }
    public Boolean getAllowFillIfNecessaryToReachNumberOfRecommendations()
    {
        return this.allowFillIfNecessaryToReachNumberOfRecommendations;
    }
    public Boolean getAllowReplacingOfRecentlyShownRecommendations()
    {
        return this.allowReplacingOfRecentlyShownRecommendations;
    }
    public Boolean getPrioritizeDiversityBetweenRequests()
    {
        return this.prioritizeDiversityBetweenRequests;
    }
    public SelectedProductCategoryPropertiesSettings getSelectedProductCategoryProperties()
    {
        return this.selectedProductCategoryProperties;
    }
    public ProductCategoryRecommendationRequestSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;;
        return this;
    }
    public ProductCategoryRecommendationRequestSettings setAllowFillIfNecessaryToReachNumberOfRecommendations(Boolean allowFillIfNecessaryToReachNumberOfRecommendations)
    {
        this.allowFillIfNecessaryToReachNumberOfRecommendations = allowFillIfNecessaryToReachNumberOfRecommendations;;
        return this;
    }
    public ProductCategoryRecommendationRequestSettings setAllowReplacingOfRecentlyShownRecommendations(Boolean allowReplacingOfRecentlyShownRecommendations)
    {
        this.allowReplacingOfRecentlyShownRecommendations = allowReplacingOfRecentlyShownRecommendations;;
        return this;
    }
    public ProductCategoryRecommendationRequestSettings setPrioritizeDiversityBetweenRequests(Boolean prioritizeDiversityBetweenRequests)
    {
        this.prioritizeDiversityBetweenRequests = prioritizeDiversityBetweenRequests;;
        return this;
    }
    public ProductCategoryRecommendationRequestSettings setSelectedProductCategoryProperties(SelectedProductCategoryPropertiesSettings selectedProductCategoryProperties)
    {
        this.selectedProductCategoryProperties = selectedProductCategoryProperties;;
        return this;
    }
}
