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
    
/** Holds scores for a result. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Score
{
    /** The base score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public Float base;
    /** The adjusted score is based on the base score but with relevance modifiers and merchandising rules applied. */
    public Float adjusted;
    public static Score create(Float baseScore, Float adjustedScore)
    {
        return new Score(baseScore, adjustedScore);
    }
    public Score(Float baseScore, Float adjustedScore)
    {
        this.base = baseScore;
        this.adjusted = adjustedScore;
    }
    public Score()
    {
    }
    /** The base score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public Float getBase()
    {
        return this.base;
    }
    /** The adjusted score is based on the base score but with relevance modifiers and merchandising rules applied. */
    public Float getAdjusted()
    {
        return this.adjusted;
    }
    /** The base score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public Score setBase(Float base)
    {
        this.base = base;
        return this;
    }
    /** The adjusted score is based on the base score but with relevance modifiers and merchandising rules applied. */
    public Score setAdjusted(Float adjusted)
    {
        this.adjusted = adjusted;
        return this;
    }
}
