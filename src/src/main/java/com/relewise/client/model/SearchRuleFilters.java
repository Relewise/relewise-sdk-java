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
public class SearchRuleFilters
{
    public @Nullable String term;
    public @Nullable Boolean approved;
    public @Nullable UUID id;
    public static SearchRuleFilters create(@Nullable String term, @Nullable Boolean approved)
    {
        return new SearchRuleFilters(term, approved);
    }
    public SearchRuleFilters(@Nullable String term, @Nullable Boolean approved)
    {
        this.term = term;
        this.approved = approved;
    }
    public static SearchRuleFilters create(UUID id)
    {
        return new SearchRuleFilters(id);
    }
    public SearchRuleFilters(UUID id)
    {
        this.id = id;
    }
    public SearchRuleFilters()
    {
    }
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable Boolean getApproved()
    {
        return this.approved;
    }
    public @Nullable UUID getId()
    {
        return this.id;
    }
    public SearchRuleFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    public SearchRuleFilters setApproved(@Nullable Boolean approved)
    {
        this.approved = approved;
        return this;
    }
    public SearchRuleFilters setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}
