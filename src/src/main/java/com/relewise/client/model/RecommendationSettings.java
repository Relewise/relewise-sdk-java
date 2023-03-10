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
    defaultImpl = RecommendationSettings.class)
public class RecommendationSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.RecommendationSettings, Relewise.Client";
    public @Nullable Integer take;
    public @Nullable Integer onlyIncludeRecommendationsWhenLessResultsThan;
    public static RecommendationSettings create()
    {
        return new RecommendationSettings();
    }
    public RecommendationSettings()
    {
    }
    public @Nullable Integer getTake()
    {
        return this.take;
    }
    public @Nullable Integer getOnlyIncludeRecommendationsWhenLessResultsThan()
    {
        return this.onlyIncludeRecommendationsWhenLessResultsThan;
    }
    public RecommendationSettings setTake(@Nullable Integer take)
    {
        this.take = take;;
        return this;
    }
    public RecommendationSettings setOnlyIncludeRecommendationsWhenLessResultsThan(@Nullable Integer onlyIncludeRecommendationsWhenLessResultsThan)
    {
        this.onlyIncludeRecommendationsWhenLessResultsThan = onlyIncludeRecommendationsWhenLessResultsThan;;
        return this;
    }
}
