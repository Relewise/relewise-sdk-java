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
public class Synonym
{
    public UUID id;
    public SynonymType type;
    public String[] indexes;
    public Language[] languages;
    public OffsetDateTime created;
    public String createdBy;
    public OffsetDateTime modified;
    public String modifiedBy;
    public String[] from;
    public String[] words;
    public @Nullable OffsetDateTime approved;
    public String approvedBy;
    public Long usages;
    public Boolean isApproved;
    public Boolean allowInPredictions;
    public static Synonym create()
    {
        return new Synonym();
    }
    public Synonym()
    {
    }
    public UUID getId()
    {
        return this.id;
    }
    public SynonymType getType()
    {
        return this.type;
    }
    public String[] getIndexes()
    {
        return this.indexes;
    }
    public Language[] getLanguages()
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
    public String[] getFrom()
    {
        return this.from;
    }
    public String[] getWords()
    {
        return this.words;
    }
    public @Nullable OffsetDateTime getApproved()
    {
        return this.approved;
    }
    public String getApprovedBy()
    {
        return this.approvedBy;
    }
    public Long getUsages()
    {
        return this.usages;
    }
    public Boolean getIsApproved()
    {
        return this.isApproved;
    }
    public Boolean getAllowInPredictions()
    {
        return this.allowInPredictions;
    }
    public Synonym setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public Synonym setType(SynonymType type)
    {
        this.type = type;
        return this;
    }
    public Synonym setIndexes(String... indexes)
    {
        this.indexes = indexes;
        return this;
    }
    public Synonym addToIndexes(String indexe)
    {
        if (this.indexes == null)
        {
            this.indexes = new String[] { indexe };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.indexes));
            existingList.add(indexe);
            this.indexes = existingList.toArray(new String[0]);
        }
        return this;
    }
    public Synonym setLanguages(Language... languages)
    {
        this.languages = languages;
        return this;
    }
    public Synonym addToLanguages(Language language)
    {
        if (this.languages == null)
        {
            this.languages = new Language[] { language };
        }
        else
        {
            ArrayList<Language> existingList = new ArrayList<>(Arrays.asList(this.languages));
            existingList.add(language);
            this.languages = existingList.toArray(new Language[0]);
        }
        return this;
    }
    public Synonym setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    public Synonym setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    public Synonym setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    public Synonym setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    public Synonym setFrom(String... from)
    {
        this.from = from;
        return this;
    }
    public Synonym addToFrom(String from)
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
    public Synonym setWords(String... words)
    {
        this.words = words;
        return this;
    }
    public Synonym addToWords(String word)
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
    public Synonym setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    public Synonym setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    public Synonym setUsages(Long usages)
    {
        this.usages = usages;
        return this;
    }
    public Synonym setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
    public Synonym setAllowInPredictions(Boolean allowInPredictions)
    {
        this.allowInPredictions = allowInPredictions;
        return this;
    }
}
