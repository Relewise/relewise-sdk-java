package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DecompoundRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DecompoundRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.DecompoundRule, Relewise.Client";
    public String word;
    public @Nullable String head;
    public @Nullable String[] modifiers;
    public static DecompoundRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, String word, @Nullable String head, String... modifiers)
    {
        return new DecompoundRule(id, indexes, languages, isApproved, word, head, modifiers);
    }
    public DecompoundRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, String word, @Nullable String head, String... modifiers)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.word = word;
        this.head = head;
        this.modifiers = modifiers;
    }
    public DecompoundRule()
    {
    }
    public String getWord()
    {
        return this.word;
    }
    public @Nullable String getHead()
    {
        return this.head;
    }
    public @Nullable String[] getModifiers()
    {
        return this.modifiers;
    }
    public DecompoundRule setWord(String word)
    {
        this.word = word;
        return this;
    }
    public DecompoundRule setHead(String head)
    {
        this.head = head;
        return this;
    }
    public DecompoundRule setModifiers(String... modifiers)
    {
        this.modifiers = modifiers;
        return this;
    }
    public DecompoundRule addToModifiers(String modifier)
    {
        if (this.modifiers == null)
        {
            this.modifiers = new String[] { modifier };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.modifiers));
            existingList.add(modifier);
            this.modifiers = existingList.toArray(new String[0]);
        }
        return this;
    }
    @Override
    public DecompoundRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public DecompoundRule setIndexes(ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    @Override
    public DecompoundRule setLanguages(ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    @Override
    public DecompoundRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public DecompoundRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public DecompoundRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public DecompoundRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public DecompoundRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    @Override
    public DecompoundRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    @Override
    public DecompoundRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
