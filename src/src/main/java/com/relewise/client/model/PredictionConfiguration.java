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
public class PredictionConfiguration
{
    public Boolean includeInPredictions;
    public static PredictionConfiguration create()
    {
        return new PredictionConfiguration();
    }
    public PredictionConfiguration()
    {
    }
    public Boolean getIncludeInPredictions()
    {
        return this.includeInPredictions;
    }
    public PredictionConfiguration setIncludeInPredictions(Boolean includeInPredictions)
    {
        this.includeInPredictions = includeInPredictions;
        return this;
    }
}
