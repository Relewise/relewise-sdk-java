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
    defaultImpl = VariantDataRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantDataRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantDataRelevanceModifier, Relewise.Client";
    public String key;
    public Boolean considerAsMatchIfKeyIsNotFound;
    public Double multiplyWeightBy;
    public Boolean mustMatchAllConditions;
    public ArrayList<ValueCondition> conditions;
    public ValueSelector multiplierSelector;
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
    public static VariantDataRelevanceModifier create(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector, Boolean mustMatchAllConditions, Boolean considerAsMatchIfKeyIsNotFound)
    {
        return new VariantDataRelevanceModifier(key, conditions, multiplierSelector, mustMatchAllConditions, considerAsMatchIfKeyIsNotFound);
    }
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
    public String getKey()
    {
        return this.key;
    }
    public Boolean getConsiderAsMatchIfKeyIsNotFound()
    {
        return this.considerAsMatchIfKeyIsNotFound;
    }
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    public Boolean getMustMatchAllConditions()
    {
        return this.mustMatchAllConditions;
    }
    public ArrayList<ValueCondition> getConditions()
    {
        return this.conditions;
    }
    public ValueSelector getMultiplierSelector()
    {
        return this.multiplierSelector;
    }
    public VariantDataRelevanceModifier setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public VariantDataRelevanceModifier setConsiderAsMatchIfKeyIsNotFound(Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;;
        return this;
    }
    public VariantDataRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    public VariantDataRelevanceModifier setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
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
    public VariantDataRelevanceModifier setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;;
        return this;
    }
    @Override
    public VariantDataRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}
