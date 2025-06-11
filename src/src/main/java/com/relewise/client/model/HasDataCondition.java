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
    
/** a <code>UserCondition</code> that checks whether the <code>User</code>'s data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = HasDataCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasDataCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.HasDataCondition, Relewise.Client";
    /** The key that must be found in the <code>User</code>'s data-bag for the <code>UserCondition</code> to be satisfied. */
    public String key;
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>User</code>'s data-bag. */
    public @Nullable ValueConditionCollection conditions;
    public static HasDataCondition create(String key)
    {
        return new HasDataCondition(key);
    }
    public HasDataCondition(String key)
    {
        this.key = key;
        this.conditions = null;
        this.negated = false;
    }
    /**
     * Constructs a <code>UserCondition</code> that checks whether the <code>User</code>'s data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>.
     * @param key The key that must be found in the User's data-bag for the UserCondition to be satisfied.
     * @param conditions The conditions that must be satisfied for the DataValue found at the Key in the User's data-bag.
     * @param negated Whether the UserCondition should have opposite effect.
     */
    public static HasDataCondition create(String key, @Nullable ValueConditionCollection conditions, Boolean negated)
    {
        return new HasDataCondition(key, conditions, negated);
    }
    /**
     * Constructs a <code>UserCondition</code> that checks whether the <code>User</code>'s data-bag has a <code>Key</code> whose value satisfies the provided <code>Conditions</code>.
     * @param key The key that must be found in the User's data-bag for the UserCondition to be satisfied.
     * @param conditions The conditions that must be satisfied for the DataValue found at the Key in the User's data-bag.
     * @param negated Whether the UserCondition should have opposite effect.
     */
    public HasDataCondition(String key, @Nullable ValueConditionCollection conditions, Boolean negated)
    {
        this.key = key;
        this.conditions = conditions;
        this.negated = negated;
    }
    public HasDataCondition()
    {
        this.conditions = null;
        this.negated = false;
    }
    /** The key that must be found in the <code>User</code>'s data-bag for the <code>UserCondition</code> to be satisfied. */
    public String getKey()
    {
        return this.key;
    }
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>User</code>'s data-bag. */
    public @Nullable ValueConditionCollection getConditions()
    {
        return this.conditions;
    }
    /** The key that must be found in the <code>User</code>'s data-bag for the <code>UserCondition</code> to be satisfied. */
    public HasDataCondition setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The conditions that must be satisfied for the <code>DataValue</code> found at the <code>Key</code> in the <code>User</code>'s data-bag. */
    public HasDataCondition setConditions(@Nullable ValueConditionCollection conditions)
    {
        this.conditions = conditions;
        return this;
    }
    @Override
    public HasDataCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
