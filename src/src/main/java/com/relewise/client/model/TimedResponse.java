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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductRecommendationResponse.class, name = "Relewise.Client.Responses.ProductRecommendationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDetailsCollectionResponse.class, name = "Relewise.Client.Responses.ProductDetailsCollectionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDetailsCollectionResponse.class, name = "Relewise.Client.Responses.ContentDetailsCollectionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentRecommendationResponse.class, name = "Relewise.Client.Responses.ContentRecommendationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = UserDetailsCollectionResponse.class, name = "Relewise.Client.Responses.UserDetailsCollectionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductPerformanceResponse.class, name = "Relewise.Client.Responses.Analyzers.ProductPerformanceResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = GlobalTriggerConfigurationResponse.class, name = "Relewise.Client.Responses.Triggers.GlobalTriggerConfigurationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = TriggerConfigurationCollectionResponse.class, name = "Relewise.Client.Responses.Triggers.TriggerConfigurationCollectionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = TriggersResponse.class, name = "Relewise.Client.Responses.Triggers.TriggersResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = TriggerConfigurationResponse.class, name = "Relewise.Client.Responses.Triggers.TriggerConfigurationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchResponse.class, name = "Relewise.Client.Responses.Search.SearchResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = MerchandisingRuleResponse.class, name = "Relewise.Client.Responses.Merchandising.MerchandisingRuleResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchIndexResponse.class, name = "Relewise.Client.Responses.Search.SearchIndexResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchIndexCollectionResponse.class, name = "Relewise.Client.Responses.Search.SearchIndexCollectionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryRecommendationResponse.class, name = "Relewise.Client.Responses.ProductCategoryRecommendationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryRecommendationResponse.class, name = "Relewise.Client.Responses.ContentCategoryRecommendationResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandRecommendationResponse.class, name = "Relewise.Client.Responses.BrandRecommendationResponse, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TimedResponse
{
    public String $type = "";
    public Statistics statistics;
    public Statistics getStatistics()
    {
        return this.statistics;
    }
    public TimedResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
