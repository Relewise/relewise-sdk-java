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
    /** The relevance score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public @Nullable Float relevance;
    /** The adjusted score is based on the relevance score but with relevance modifiers and merchandising rules applied. */
    public @Nullable Float adjusted;
    public static Score create()
    {
        return new Score();
    }
    public Score()
    {
    }
    /** The relevance score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public @Nullable Float getRelevance()
    {
        return this.relevance;
    }
    /** The adjusted score is based on the relevance score but with relevance modifiers and merchandising rules applied. */
    public @Nullable Float getAdjusted()
    {
        return this.adjusted;
    }
    /** The relevance score is a number between 0 and 100 that has not been manipulated by relevance modifiers and merchandising rules. Greater values indicate better results. */
    public Score setRelevance(@Nullable Float relevance)
    {
        this.relevance = relevance;
        return this;
    }
    /** The adjusted score is based on the relevance score but with relevance modifiers and merchandising rules applied. */
    public Score setAdjusted(@Nullable Float adjusted)
    {
        this.adjusted = adjusted;
        return this;
    }
}
