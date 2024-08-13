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
public class InputConditionConfiguration
{
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
        this.filters = filters;
        return this;
    }
    public InputConditionConfiguration setEvaluationMode(EvaluationMode evaluationMode)
    {
        this.evaluationMode = evaluationMode;
        return this;
    }
}
