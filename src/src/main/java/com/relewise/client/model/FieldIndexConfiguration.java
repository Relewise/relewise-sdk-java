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
    defaultImpl = FieldIndexConfiguration.class)
public class FieldIndexConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.FieldIndexConfiguration, Relewise.Client";
    public Boolean included;
    public Short weight;
    public PredictionSourceType predictionSourceType;
    public @Nullable Parser parser;
    public static FieldIndexConfiguration create(Boolean included, Short weight, PredictionSourceType predictionSourceType)
    {
        return new FieldIndexConfiguration(included, weight, predictionSourceType);
    }
    public FieldIndexConfiguration(Boolean included, Short weight, PredictionSourceType predictionSourceType)
    {
        this.included = included;
        this.weight = weight;
        this.predictionSourceType = predictionSourceType;
    }
    public FieldIndexConfiguration()
    {
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
    public FieldIndexConfiguration setIncluded(Boolean included)
    {
        this.included = included;;
        return this;
    }
    public FieldIndexConfiguration setWeight(Short weight)
    {
        this.weight = weight;;
        return this;
    }
    public FieldIndexConfiguration setPredictionSourceType(PredictionSourceType predictionSourceType)
    {
        this.predictionSourceType = predictionSourceType;;
        return this;
    }
    public FieldIndexConfiguration setParser(Parser parser)
    {
        this.parser = parser;;
        return this;
    }
}
