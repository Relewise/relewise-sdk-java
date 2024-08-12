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
    defaultImpl = PredictionRule.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionRule extends SearchRule
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.PredictionRule, Relewise.Client";
    public SearchTermCondition condition;
    public PredictionRulePromotion promote;
    public PredictionRuleSuppression suppress;
    public static PredictionRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, PredictionRulePromotion promote, PredictionRuleSuppression suppress)
    {
        return new PredictionRule(id, indexes, languages, isApproved, condition, promote, suppress);
    }
    public PredictionRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, PredictionRulePromotion promote, PredictionRuleSuppression suppress)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.promote = promote;
        this.suppress = suppress;
    }
    public static PredictionRule create(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, PredictionRulePromotion promote)
    {
        return new PredictionRule(id, indexes, languages, isApproved, condition, promote);
    }
    public PredictionRule(UUID id, @Nullable ApplicableIndexes indexes, @Nullable ApplicableLanguages languages, Boolean isApproved, SearchTermCondition condition, PredictionRulePromotion promote)
    {
        this.id = id;
        this.indexes = indexes;
        this.languages = languages;
        this.isApproved = isApproved;
        this.condition = condition;
        this.promote = promote;
    }
    public PredictionRule()
    {
    }
    public SearchTermCondition getCondition()
    {
        return this.condition;
    }
    public PredictionRulePromotion getPromote()
    {
        return this.promote;
    }
    public PredictionRuleSuppression getSuppress()
    {
        return this.suppress;
    }
    public PredictionRule setCondition(SearchTermCondition condition)
    {
        this.condition = condition;;
        return this;
    }
    public PredictionRule setPromote(PredictionRulePromotion promote)
    {
        this.promote = promote;;
        return this;
    }
    public PredictionRule setSuppress(PredictionRuleSuppression suppress)
    {
        this.suppress = suppress;;
        return this;
    }
    @Override
    public PredictionRule setId(UUID id)
    {
        this.id = id;;
        return this;
    }
    @Override
    public PredictionRule setIndexes(ApplicableIndexes indexes)
    {
        this.indexes = indexes;;
        return this;
    }
    @Override
    public PredictionRule setLanguages(ApplicableLanguages languages)
    {
        this.languages = languages;;
        return this;
    }
    @Override
    public PredictionRule setCreated(OffsetDateTime created)
    {
        this.created = created;;
        return this;
    }
    @Override
    public PredictionRule setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;;
        return this;
    }
    @Override
    public PredictionRule setModified(OffsetDateTime modified)
    {
        this.modified = modified;;
        return this;
    }
    @Override
    public PredictionRule setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
    @Override
    public PredictionRule setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;;
        return this;
    }
    @Override
    public PredictionRule setApprovedBy(String approvedBy)
    {
        this.approvedBy = approvedBy;;
        return this;
    }
    @Override
    public PredictionRule setIsApproved(Boolean isApproved)
    {
        this.isApproved = isApproved;;
        return this;
    }
}
