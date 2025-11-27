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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermCriteria
{
    public @Nullable SearchTermCriteriaSearchTermPolicy policy;
    public @Nullable SearchTermConditionByLanguageCollection termCriteria;
    public static SearchTermCriteria create()
    {
        return new SearchTermCriteria();
    }
    public SearchTermCriteria()
    {
    }
    public @Nullable SearchTermCriteriaSearchTermPolicy getPolicy()
    {
        return this.policy;
    }
    public @Nullable SearchTermConditionByLanguageCollection getTermCriteria()
    {
        return this.termCriteria;
    }
    public SearchTermCriteria setPolicy(@Nullable SearchTermCriteriaSearchTermPolicy policy)
    {
        this.policy = policy;
        return this;
    }
    public SearchTermCriteria setTermCriteria(@Nullable SearchTermConditionByLanguageCollection termCriteria)
    {
        this.termCriteria = termCriteria;
        return this;
    }
}
