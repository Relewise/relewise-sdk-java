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
    
/** a <code>UserCondition</code> that checks whether one of the <code>User</code>'s <code>Company</code>s's data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = HasCompanyDataCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasCompanyDataCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasCompanyDataCondition, Relewise.Client";
    /** The key that must be found in one of the <code>User</code>'s <code>Company</code>s's data-bag for the <code>UserCondition</code> to be satisfied. */
    public String key;
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>Company</code>'s data-bag. */
    public @Nullable ValueConditionCollection conditions;
    /** Specifies which of the companies associated to the <code>User</code> it should check the data of. It defaults to <code>ImmediateCompany</code>. */
    public CompanyScope evaluationScope;
    public static HasCompanyDataCondition create(String key)
    {
        return new HasCompanyDataCondition(key);
    }
    public HasCompanyDataCondition(String key)
    {
        this.key = key;
        this.conditions = null;
        this.evaluationScope = CompanyScope.ImmediateCompany;
        this.negated = false;
    }
    /**
     * Constructs a <code>UserCondition</code> that checks whether one of the <code>User</code>'s <code>Company</code>s's data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>.
     * @param key The key that must be found in one of the User's Companys's data-bag for the UserCondition to be satisfied.
     * @param conditions The conditions that must be satisfied for the DataValue found at the Key in the Company's data-bag.
     * @param evaluationScope Specifies which of the companies associated to the User it should check the data of. It defaults to ImmediateCompany.
     * @param negated Whether the UserCondition should have opposite effect.
     */
    public static HasCompanyDataCondition create(String key, @Nullable ValueConditionCollection conditions, CompanyScope evaluationScope, Boolean negated)
    {
        return new HasCompanyDataCondition(key, conditions, evaluationScope, negated);
    }
    /**
     * Constructs a <code>UserCondition</code> that checks whether one of the <code>User</code>'s <code>Company</code>s's data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>.
     * @param key The key that must be found in one of the User's Companys's data-bag for the UserCondition to be satisfied.
     * @param conditions The conditions that must be satisfied for the DataValue found at the Key in the Company's data-bag.
     * @param evaluationScope Specifies which of the companies associated to the User it should check the data of. It defaults to ImmediateCompany.
     * @param negated Whether the UserCondition should have opposite effect.
     */
    public HasCompanyDataCondition(String key, @Nullable ValueConditionCollection conditions, CompanyScope evaluationScope, Boolean negated)
    {
        this.key = key;
        this.conditions = conditions;
        this.evaluationScope = evaluationScope;
        this.negated = negated;
    }
    public HasCompanyDataCondition()
    {
        this.conditions = null;
        this.evaluationScope = CompanyScope.ImmediateCompany;
        this.negated = false;
    }
    /** The key that must be found in one of the <code>User</code>'s <code>Company</code>s's data-bag for the <code>UserCondition</code> to be satisfied. */
    public String getKey()
    {
        return this.key;
    }
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>Company</code>'s data-bag. */
    public @Nullable ValueConditionCollection getConditions()
    {
        return this.conditions;
    }
    /** Specifies which of the companies associated to the <code>User</code> it should check the data of. It defaults to <code>ImmediateCompany</code>. */
    public CompanyScope getEvaluationScope()
    {
        return this.evaluationScope;
    }
    /** The key that must be found in one of the <code>User</code>'s <code>Company</code>s's data-bag for the <code>UserCondition</code> to be satisfied. */
    public HasCompanyDataCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>Company</code>'s data-bag. */
    public HasCompanyDataCondition setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    /** Specifies which of the companies associated to the <code>User</code> it should check the data of. It defaults to <code>ImmediateCompany</code>. */
    public HasCompanyDataCondition setEvaluationScope(CompanyScope evaluationScope)
    {
        this.evaluationScope = evaluationScope;
        return this;
    }
    @Override
    public HasCompanyDataCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
