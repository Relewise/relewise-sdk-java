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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = PredictionRule.class, name = "Relewise.Client.DataTypes.Search.Rules.PredictionRule, Relewise.Client"),
    @JsonSubTypes.Type(value = RedirectRule.class, name = "Relewise.Client.DataTypes.Search.Rules.RedirectRule, Relewise.Client"),
    @JsonSubTypes.Type(value = DecompoundRule.class, name = "Relewise.Client.DataTypes.Search.Rules.DecompoundRule, Relewise.Client"),
    @JsonSubTypes.Type(value = StemmingRule.class, name = "Relewise.Client.DataTypes.Search.Rules.StemmingRule, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermModifierRule.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchResultModifierRule.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchResultModifierRule, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchRule
{
    public String $type = "";
    public UUID id;
    public @Nullable ApplicableIndexes indexes;
    public @Nullable ApplicableLanguages languages;
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public @Nullable OffsetDateTime approved;
    public String approvedBy;
    public Boolean isApproved;
    public UUID getId()
    {
        return this.id;
    }
    public @Nullable ApplicableIndexes getIndexes()
    {
        return this.indexes;
    }
    public @Nullable ApplicableLanguages getLanguages()
    {
        return this.languages;
    }
    public OffsetDateTime getCreated()
    {
        return this.created;
    }
    public String getCreatedBy()
    {
        return this.createdBy;
    }
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public @Nullable OffsetDateTime getApproved()
    {
        return this.approved;
    }
    public String getApprovedBy()
    {
        return this.approvedBy;
    }
    public Boolean getIsApproved()
    {
        return this.isApproved;
    }
    public SearchRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public SearchRule setIndexes(@Nullable ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    public SearchRule setLanguages(@Nullable ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    public SearchRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    public SearchRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    public SearchRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    public SearchRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    public SearchRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    public SearchRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    public SearchRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
