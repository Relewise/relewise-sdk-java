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
    
/** Defines an index-time synonym relation managed through the Search Rules API. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SynonymRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SynonymRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SynonymRule, Relewise.Client";
    /** Gets or sets the direction in which the synonym relation is applied. */
    public SynonymRuleSynonymType type;
    /** Gets or sets the source terms for a one-way synonym. */
    public @Nullable String[] from;
    /** Gets or sets the target terms, or every term in a multidirectional synonym. */
    public @Nullable String[] words;
    /** Gets or sets whether source terms may be exposed through search-term predictions. */
    public Boolean allowInPredictions;
    public static SynonymRule create()
    {
        return new SynonymRule();
    }
    public SynonymRule()
    {
    }
    /** Gets or sets the direction in which the synonym relation is applied. */
    public SynonymRuleSynonymType getType()
    {
        return this.type;
    }
    /** Gets or sets the source terms for a one-way synonym. */
    public @Nullable String[] getFrom()
    {
        return this.from;
    }
    /** Gets or sets the target terms, or every term in a multidirectional synonym. */
    public @Nullable String[] getWords()
    {
        return this.words;
    }
    /** Gets or sets whether source terms may be exposed through search-term predictions. */
    public Boolean getAllowInPredictions()
    {
        return this.allowInPredictions;
    }
    /** Gets or sets the direction in which the synonym relation is applied. */
    public SynonymRule setType(SynonymRuleSynonymType type)
    {
        this.type = type;
        return this;
    }
    /** Gets or sets the source terms for a one-way synonym. */
    public SynonymRule setFrom(String... from)
    {
        this.from = from;
        return this;
    }
    /** Gets or sets the source terms for a one-way synonym. */
    public SynonymRule addToFrom(String from)
    {
        if (this.from == null)
        {
            this.from = new String[] { from };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.from));
            existingList.add(from);
            this.from = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** Gets or sets the target terms, or every term in a multidirectional synonym. */
    public SynonymRule setWords(String... words)
    {
        this.words = words;
        return this;
    }
    /** Gets or sets the target terms, or every term in a multidirectional synonym. */
    public SynonymRule addToWords(String word)
    {
        if (this.words == null)
        {
            this.words = new String[] { word };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.words));
            existingList.add(word);
            this.words = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** Gets or sets whether source terms may be exposed through search-term predictions. */
    public SynonymRule setAllowInPredictions(Boolean allowInPredictions)
    {
        this.allowInPredictions = allowInPredictions;
        return this;
    }
    @Override
    public SynonymRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public SynonymRule setIndexes(@Nullable ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    @Override
    public SynonymRule setLanguages(@Nullable ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    @Override
    public SynonymRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public SynonymRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public SynonymRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public SynonymRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public SynonymRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    @Override
    public SynonymRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    @Override
    public SynonymRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
