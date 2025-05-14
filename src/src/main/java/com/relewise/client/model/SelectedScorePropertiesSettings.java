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
    
/** Defines what <code>Score</code> properties will be included for the <code>Score</code>. If none of the properties are selected then the <code>Score</code> will be <code>null</code>. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelectedScorePropertiesSettings
{
    /** Whether <code>Relevance</code> should be included in the result. */
    public Boolean relevance;
    /** Whether <code>Adjusted</code> should be included in the result. */
    public Boolean adjusted;
    public static SelectedScorePropertiesSettings create()
    {
        return new SelectedScorePropertiesSettings();
    }
    public SelectedScorePropertiesSettings()
    {
    }
    /** Whether <code>Relevance</code> should be included in the result. */
    public Boolean getRelevance()
    {
        return this.relevance;
    }
    /** Whether <code>Adjusted</code> should be included in the result. */
    public Boolean getAdjusted()
    {
        return this.adjusted;
    }
    /** Whether <code>Relevance</code> should be included in the result. */
    public SelectedScorePropertiesSettings setRelevance(Boolean relevance)
    {
        this.relevance = relevance;
        return this;
    }
    /** Whether <code>Adjusted</code> should be included in the result. */
    public SelectedScorePropertiesSettings setAdjusted(Boolean adjusted)
    {
        this.adjusted = adjusted;
        return this;
    }
}
