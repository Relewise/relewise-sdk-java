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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryRecommendationWeights
{
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
        this.categoryViews = categoryViews;
        return this;
    }
    public ContentCategoryRecommendationWeights setContentViews(Double contentViews)
    {
        this.contentViews = contentViews;
        return this;
    }
}
