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
    @JsonSubTypes.Type(value = SearchTermPredictionResponse.class, name = "Relewise.Client.Responses.Search.SearchTermPredictionResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductSearchResponse.class, name = "Relewise.Client.Responses.Search.ProductSearchResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentSearchResponse.class, name = "Relewise.Client.Responses.Search.ContentSearchResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategorySearchResponse.class, name = "Relewise.Client.Responses.Search.ProductCategorySearchResponse, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchResponseCollection.class, name = "Relewise.Client.Responses.Search.SearchResponseCollection, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategorySearchResponse.class, name = "Relewise.Client.Responses.Search.ContentCategorySearchResponse, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchResponse extends TimedResponse
{
    public String $type = "";
    @Override
    public SearchResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
