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
    defaultImpl = ContentCategoryRecommendationWeights.class)
public class ContentCategoryRecommendationWeights
{
    public String $type = "Relewise.Client.Requests.Recommendations.ContentCategoryRecommendationWeights, Relewise.Client";
    public Double categoryViews;
    public Double contentViews;
    public static ContentCategoryRecommendationWeights create()
    {
        return new ContentCategoryRecommendationWeights();
    }
    public ContentCategoryRecommendationWeights()
    {
        this.categoryViews = 1d;
        this.contentViews = 1d;
    }
    public static ContentCategoryRecommendationWeights create(Double categoryViews, Double contentViews)
    {
        return new ContentCategoryRecommendationWeights(categoryViews, contentViews);
    }
    public ContentCategoryRecommendationWeights(Double categoryViews, Double contentViews)
    {
        this.categoryViews = categoryViews;
        this.contentViews = contentViews;
    }
    public Double getCategoryViews()
    {
        return this.categoryViews;
    }
    public Double getContentViews()
    {
        return this.contentViews;
    }
    public ContentCategoryRecommendationWeights setCategoryViews(Double categoryViews)
    {
        this.categoryViews = categoryViews;;
        return this;
    }
    public ContentCategoryRecommendationWeights setContentViews(Double contentViews)
    {
        this.contentViews = contentViews;;
        return this;
    }
}
