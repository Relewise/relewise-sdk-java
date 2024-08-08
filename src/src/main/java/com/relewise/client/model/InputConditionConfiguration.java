package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = InputConditionConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputConditionConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Configurations.InputConditionConfiguration, Relewise.Client";
    public FilterCollection filters;
    public EvaluationMode evaluationMode;
    public static InputConditionConfiguration create()
    {
        return new InputConditionConfiguration();
    }
    public InputConditionConfiguration()
    {
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public EvaluationMode getEvaluationMode()
    {
        return this.evaluationMode;
    }
    public InputConditionConfiguration setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    public InputConditionConfiguration setEvaluationMode(EvaluationMode evaluationMode)
    {
        this.evaluationMode = evaluationMode;;
        return this;
    }
}
