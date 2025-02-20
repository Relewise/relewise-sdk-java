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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldIndexConfiguration
{
    public Boolean included;
    public Short weight;
    /** @deprecated Use PredictionConfiguration instead */
    public PredictionSourceType predictionSourceType;
    public @Nullable Parser parser;
    public @Nullable MatchTypeSettings matchTypeSettings;
    public @Nullable PredictionConfiguration predictionConfiguration;
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, Parser parser)
    {
        return new FieldIndexConfiguration(included, weight, predictionConfiguration, parser);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, Parser parser)
    {
        this.included = included;
        this.weight = weight;
        this.predictionConfiguration = predictionConfiguration;
        this.parser = parser;
        this.matchTypeSettings = null;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, Parser parser, @Nullable MatchTypeSettings matchTypeSettings)
    {
        return new FieldIndexConfiguration(included, weight, predictionConfiguration, parser, matchTypeSettings);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, Parser parser, @Nullable MatchTypeSettings matchTypeSettings)
    {
        this.included = included;
        this.weight = weight;
        this.predictionConfiguration = predictionConfiguration;
        this.parser = parser;
        this.matchTypeSettings = matchTypeSettings;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionConfiguration predictionConfiguration)
    {
        return new FieldIndexConfiguration(included, weight, predictionConfiguration);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionConfiguration predictionConfiguration)
    {
        this.included = included;
        this.weight = weight;
        this.predictionConfiguration = predictionConfiguration;
        this.matchTypeSettings = null;
    }
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, @Nullable MatchTypeSettings matchTypeSettings)
    {
        return new FieldIndexConfiguration(included, weight, predictionConfiguration, matchTypeSettings);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionConfiguration predictionConfiguration, @Nullable MatchTypeSettings matchTypeSettings)
    {
        this.included = included;
        this.weight = weight;
        this.predictionConfiguration = predictionConfiguration;
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
    /** @deprecated Use PredictionConfiguration instead */
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
    public @Nullable PredictionConfiguration getPredictionConfiguration()
    {
        return this.predictionConfiguration;
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
    /** @deprecated Use PredictionConfiguration instead */
    public FieldIndexConfiguration setPredictionSourceType(PredictionSourceType predictionSourceType)
    {
        this.predictionSourceType = predictionSourceType;
        return this;
    }
    public FieldIndexConfiguration setParser(@Nullable Parser parser)
    {
        this.parser = parser;
        return this;
    }
    public FieldIndexConfiguration setMatchTypeSettings(@Nullable MatchTypeSettings matchTypeSettings)
    {
        this.matchTypeSettings = matchTypeSettings;
        return this;
    }
    public FieldIndexConfiguration setPredictionConfiguration(@Nullable PredictionConfiguration predictionConfiguration)
    {
        this.predictionConfiguration = predictionConfiguration;
        return this;
    }
}
