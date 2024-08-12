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
    defaultImpl = SearchResultModifierRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultModifierRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchResultModifierRule, Relewise.Client";
    public SearchTermCondition condition;
    public SearchResultModifierRuleRuleAction[] actions;
    public static SearchResultModifierRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, SearchResultModifierRuleRuleAction... actions)
    {
        return new SearchResultModifierRule(id, indexes, languages, isApproved, condition, actions);
    }
    public SearchResultModifierRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, SearchResultModifierRuleRuleAction... actions)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.actions = actions;
    }
    public SearchResultModifierRule()
    {
    }
    public SearchTermCondition getCondition()
    {
        return this.condition;
    }
    public SearchResultModifierRuleRuleAction[] getActions()
    {
        return this.actions;
    }
    public SearchResultModifierRule setCondition(SearchTermCondition condition)
    {
        this.condition = condition;
        return this;
    }
    public SearchResultModifierRule setActions(SearchResultModifierRuleRuleAction... actions)
    {
        this.actions = actions;
        return this;
    }
    public SearchResultModifierRule addToActions(SearchResultModifierRuleRuleAction action)
    {
        if (this.actions == null)
        {
            this.actions = new SearchResultModifierRuleRuleAction[] { action };
        }
        else
        {
            ArrayList<SearchResultModifierRuleRuleAction> existingList = new ArrayList<>(Arrays.asList(this.actions));
            existingList.add(action);
            this.actions = existingList.toArray(new SearchResultModifierRuleRuleAction[0]);
        }
        return this;
    }
    @Override
    public SearchResultModifierRule setId(UUID id)
    {
        this.id = id;
        return this;
    }
    @Override
    public SearchResultModifierRule setIndexes(ApplicableIndexes indexes)
    {
        this.indexes = indexes;
        return this;
    }
    @Override
    public SearchResultModifierRule setLanguages(ApplicableLanguages languages)
    {
        this.languages = languages;
        return this;
    }
    @Override
    public SearchResultModifierRule setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public SearchResultModifierRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public SearchResultModifierRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public SearchResultModifierRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    @Override
    public SearchResultModifierRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    @Override
    public SearchResultModifierRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    @Override
    public SearchResultModifierRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;
        return this;
    }
}
