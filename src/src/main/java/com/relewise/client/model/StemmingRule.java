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
    property = "$type",
    defaultImpl = StemmingRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StemmingRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.StemmingRule, Relewise.Client";
    public String[] words;
    public @Nullable String stem;
    public static StemmingRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, String[] words, @Nullable String stem)
    {
        return new StemmingRule(id, indexes, languages, isApproved, words, stem);
    }
    public StemmingRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, String[] words, @Nullable String stem)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.words = words;
        this.stem = stem;
    }
    public StemmingRule()
    {
    }
    public String[] getWords()
    {
        return this.words;
    }
    public @Nullable String getStem()
    {
        return this.stem;
    }
    public StemmingRule setWords(String... words)
    {
        this.words = words;
        return this;
    }
    public StemmingRule addToWords(String word)
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
    public StemmingRule setStem(@Nullable String stem)
    {
        this.stem = stem;
        return this;
    }
    @Override
    public StemmingRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public StemmingRule setIndexes(@Nullable ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    @Override
    public StemmingRule setLanguages(@Nullable ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    @Override
    public StemmingRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public StemmingRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public StemmingRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public StemmingRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public StemmingRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    @Override
    public StemmingRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    @Override
    public StemmingRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
