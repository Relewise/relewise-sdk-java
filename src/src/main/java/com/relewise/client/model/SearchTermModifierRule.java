package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
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
    defaultImpl = SearchTermModifierRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule, Relewise.Client";
    public SearchTermCondition condition;
    public SearchTermModifierRuleRuleAction[] actions;
    public static SearchTermModifierRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, SearchTermModifierRuleRuleAction... actions)
    {
        return new SearchTermModifierRule(id, indexes, languages, isApproved, condition, actions);
    }
    public SearchTermModifierRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, SearchTermModifierRuleRuleAction... actions)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.actions = actions;
    }
    public SearchTermModifierRule()
    {
    }
    public SearchTermCondition getCondition()
    {
        return this.condition;
    }
    public SearchTermModifierRuleRuleAction[] getActions()
    {
        return this.actions;
    }
    public SearchTermModifierRule setCondition(SearchTermCondition condition)
    {
        this.condition = condition;
        return this;
    }
    public SearchTermModifierRule setActions(SearchTermModifierRuleRuleAction... actions)
    {
        this.actions = actions;
        return this;
    }
    public SearchTermModifierRule addToActions(SearchTermModifierRuleRuleAction action)
    {
        if (this.actions == null)
        {
            this.actions = new SearchTermModifierRuleRuleAction[] { action };
        }
        else
        {
            ArrayList<SearchTermModifierRuleRuleAction> existingList = new ArrayList<>(Arrays.asList(this.actions));
            existingList.add(action);
            this.actions = existingList.toArray(new SearchTermModifierRuleRuleAction[0]);
        }
        return this;
    }
    @Override
    public SearchTermModifierRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public SearchTermModifierRule setIndexes(@Nullable ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    @Override
    public SearchTermModifierRule setLanguages(@Nullable ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    @Override
    public SearchTermModifierRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public SearchTermModifierRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public SearchTermModifierRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public SearchTermModifierRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public SearchTermModifierRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    @Override
    public SearchTermModifierRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    @Override
    public SearchTermModifierRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
