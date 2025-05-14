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
    
/** Defines <code>Score</code> thresholds to be honored. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScoreThresholds
{
    /** How well searched term is to match located entity, greater value indicate more relevant results. Produced <b>before</b> relevance modifiers and merchandising rules are applied. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public @Nullable Float relevance;
    /** How well searched term is to match located entity with respect to relevance modifiers and merchandising rules. Example: out-of-stock products may be buried in results despite good match from search perspective. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public @Nullable Float adjusted;
    public static ScoreThresholds create()
    {
        return new ScoreThresholds();
    }
    public ScoreThresholds()
    {
    }
    /** How well searched term is to match located entity, greater value indicate more relevant results. Produced <b>before</b> relevance modifiers and merchandising rules are applied. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public @Nullable Float getRelevance()
    {
        return this.relevance;
    }
    /** How well searched term is to match located entity with respect to relevance modifiers and merchandising rules. Example: out-of-stock products may be buried in results despite good match from search perspective. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public @Nullable Float getAdjusted()
    {
        return this.adjusted;
    }
    /** How well searched term is to match located entity, greater value indicate more relevant results. Produced <b>before</b> relevance modifiers and merchandising rules are applied. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public ScoreThresholds setRelevance(@Nullable Float relevance)
    {
        this.relevance = relevance;
        return this;
    }
    /** How well searched term is to match located entity with respect to relevance modifiers and merchandising rules. Example: out-of-stock products may be buried in results despite good match from search perspective. Expected to be from 0 (everything matches) to 100 (only exact matches) range. */
    public ScoreThresholds setAdjusted(@Nullable Float adjusted)
    {
        this.adjusted = adjusted;
        return this;
    }
}
