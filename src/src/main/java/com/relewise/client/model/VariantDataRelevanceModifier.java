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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a variant depending on matching conditions on a certain key. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantDataRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantDataRelevanceModifier extends DataRelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantDataRelevanceModifier, Relewise.Client";
    public static VariantDataRelevanceModifier create(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector)
    {
        return new VariantDataRelevanceModifier(key, conditions, multiplierSelector);
    }
    public VariantDataRelevanceModifier(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector)
    {
        this.key = key;
        this.conditions = conditions;
        this.multiplierSelector = multiplierSelector;
        this.mustMatchAllConditions = true;
        this.considerAsMatchIfKeyIsNotFound = false;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a variant depending on matching conditions on a certain key.
     * @param key The data key that this RelevanceModifier will distinguish on.
     * @param conditions The conditions that must hold for the specific data Key in order for the entity to be boosted.
     * @param multiplierSelector The selector for the multiplier which the entities parsing the Conditions will be have their rank multiplied by. It can either be a FixedDoubleValueSelector taking a fixed value or a DataDoubleSelector that can take the multiplier from a data key containing a double.
     * @param mustMatchAllConditions Specifies whether all Conditions should parse their test on the specific data Key (true) or if only one is required (false).
     * @param considerAsMatchIfKeyIsNotFound Specifies whether entities that don't have the specific data Key should be considered a match (true) or not (false).
     */
    public static VariantDataRelevanceModifier create(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector, Boolean mustMatchAllConditions, Boolean considerAsMatchIfKeyIsNotFound)
    {
        return new VariantDataRelevanceModifier(key, conditions, multiplierSelector, mustMatchAllConditions, considerAsMatchIfKeyIsNotFound);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a variant depending on matching conditions on a certain key.
     * @param key The data key that this RelevanceModifier will distinguish on.
     * @param conditions The conditions that must hold for the specific data Key in order for the entity to be boosted.
     * @param multiplierSelector The selector for the multiplier which the entities parsing the Conditions will be have their rank multiplied by. It can either be a FixedDoubleValueSelector taking a fixed value or a DataDoubleSelector that can take the multiplier from a data key containing a double.
     * @param mustMatchAllConditions Specifies whether all Conditions should parse their test on the specific data Key (true) or if only one is required (false).
     * @param considerAsMatchIfKeyIsNotFound Specifies whether entities that don't have the specific data Key should be considered a match (true) or not (false).
     */
    public VariantDataRelevanceModifier(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector, Boolean mustMatchAllConditions, Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.key = key;
        this.conditions = conditions;
        this.multiplierSelector = multiplierSelector;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
    }
    public VariantDataRelevanceModifier()
    {
        this.considerAsMatchIfKeyIsNotFound = false;
        this.mustMatchAllConditions = true;
    }
    @Override
    public VariantDataRelevanceModifier setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setConsiderAsMatchIfKeyIsNotFound(Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
        return this;
    }
    /** @deprecated Use MultiplierSelector instead */
    @Override
    public VariantDataRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setConditions(ValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));;
        return this;
    }
    public VariantDataRelevanceModifier addToConditions(ValueCondition conditions)
    {
        if (this.conditions == null)
        {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditions);
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
