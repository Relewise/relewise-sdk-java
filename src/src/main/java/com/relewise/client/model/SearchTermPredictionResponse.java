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
    defaultImpl = SearchTermPredictionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermPredictionResponse extends SearchResponse
{
    public String $type = "Relewise.Client.Responses.Search.SearchTermPredictionResponse, Relewise.Client";
    public SearchTermPredictionResult[] predictions;
    public static SearchTermPredictionResponse create()
    {
        return new SearchTermPredictionResponse();
    }
    public SearchTermPredictionResponse()
    {
    }
    public SearchTermPredictionResult[] getPredictions()
    {
        return this.predictions;
    }
    public SearchTermPredictionResponse setPredictions(SearchTermPredictionResult... predictions)
    {
        this.predictions = predictions;
        return this;
    }
    public SearchTermPredictionResponse addToPredictions(SearchTermPredictionResult prediction)
    {
        if (this.predictions == null)
        {
            this.predictions = new SearchTermPredictionResult[] { prediction };
        }
        else
        {
            ArrayList<SearchTermPredictionResult> existingList = new ArrayList<>(Arrays.asList(this.predictions));
            existingList.add(prediction);
            this.predictions = existingList.toArray(new SearchTermPredictionResult[0]);
        }
        return this;
    }
    @Override
    public SearchTermPredictionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
