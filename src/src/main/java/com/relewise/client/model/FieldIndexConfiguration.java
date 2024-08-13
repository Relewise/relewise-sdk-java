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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldIndexConfiguration
{
    public Boolean included;
    public Short weight;
    public PredictionSourceType predictionSourceType;
    public @Nullable Parser parser;
    public @Nullable MatchTypeSettings matchTypeSettings;
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionSourceType predictionSourceType, Parser parser)
    {
        return new FieldIndexConfiguration(included, weight, predictionSourceType, parser);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionSourceType predictionSourceType, Parser parser)
    {
        this.included = included;
        this.weight = weight;
        this.predictionSourceType = predictionSourceType;
        this.parser = parser;
        this.matchTypeSettings = null;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionSourceType predictionSourceType, Parser parser, MatchTypeSettings matchTypeSettings)
    {
        return new FieldIndexConfiguration(included, weight, predictionSourceType, parser, matchTypeSettings);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionSourceType predictionSourceType, Parser parser, MatchTypeSettings matchTypeSettings)
    {
        this.included = included;
        this.weight = weight;
        this.predictionSourceType = predictionSourceType;
        this.parser = parser;
        this.matchTypeSettings = matchTypeSettings;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionSourceType predictionSourceType)
    {
        return new FieldIndexConfiguration(included, weight, predictionSourceType);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionSourceType predictionSourceType)
    {
        this.included = included;
        this.weight = weight;
        this.predictionSourceType = predictionSourceType;
        this.matchTypeSettings = null;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionSourceType predictionSourceType, MatchTypeSettings matchTypeSettings)
    {
        return new FieldIndexConfiguration(included, weight, predictionSourceType, matchTypeSettings);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionSourceType predictionSourceType, MatchTypeSettings matchTypeSettings)
    {
        this.included = included;
        this.weight = weight;
        this.predictionSourceType = predictionSourceType;
        this.matchTypeSettings = matchTypeSettings;
    }
    public FieldIndexConfiguration()
    {
        this.matchTypeSettings = null;
    }
    public Boolean getIncluded()
    {
        return this.included;
    }
    public Short getWeight()
    {
        return this.weight;
    }
    public PredictionSourceType getPredictionSourceType()
    {
        return this.predictionSourceType;
    }
    public @Nullable Parser getParser()
    {
        return this.parser;
    }
    public @Nullable MatchTypeSettings getMatchTypeSettings()
    {
        return this.matchTypeSettings;
    }
    public FieldIndexConfiguration setIncluded(Boolean included)
    {
        this.included = included;
        return this;
    }
    public FieldIndexConfiguration setWeight(Short weight)
    {
        this.weight = weight;
        return this;
    }
    public FieldIndexConfiguration setPredictionSourceType(PredictionSourceType predictionSourceType)
    {
        this.predictionSourceType = predictionSourceType;
        return this;
    }
    public FieldIndexConfiguration setParser(Parser parser)
    {
        this.parser = parser;
        return this;
    }
    public FieldIndexConfiguration setMatchTypeSettings(MatchTypeSettings matchTypeSettings)
    {
        this.matchTypeSettings = matchTypeSettings;
        return this;
    }
}
