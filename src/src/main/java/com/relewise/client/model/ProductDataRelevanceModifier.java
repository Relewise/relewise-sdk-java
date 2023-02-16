package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductDataRelevanceModifier.class)
public class ProductDataRelevanceModifier extends RelevanceModifier implements IProductRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductDataRelevanceModifier, Relewise.Client";
    public String key;
    public Boolean considerAsMatchIfKeyIsNotFound;
    public Double multiplyWeightBy;
    public Boolean mustMatchAllConditions;
    public ArrayList<ValueCondition> conditions;
    public ValueSelector multiplierSelector;
    public static ProductDataRelevanceModifier create(String key, ValueSelector multiplierSelector)
    {
        return new ProductDataRelevanceModifier(key, multiplierSelector);
    }
    public ProductDataRelevanceModifier(String key, ValueSelector multiplierSelector)
    {
        this.key = key;
        this.multiplierSelector = multiplierSelector;
        this.considerAsMatchIfKeyIsNotFound = false;
    }
    public static ProductDataRelevanceModifier create(String key, ValueSelector multiplierSelector, Boolean considerAsMatchIfKeyIsNotFound)
    {
        return new ProductDataRelevanceModifier(key, multiplierSelector, considerAsMatchIfKeyIsNotFound);
    }
    public ProductDataRelevanceModifier(String key, ValueSelector multiplierSelector, Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.key = key;
        this.multiplierSelector = multiplierSelector;
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
    }
    public ProductDataRelevanceModifier()
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
    public ProductDataRelevanceModifier setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public ProductDataRelevanceModifier setConsiderAsMatchIfKeyIsNotFound(Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;;
        return this;
    }
    public ProductDataRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;;
        return this;
    }
    public ProductDataRelevanceModifier setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;;
        return this;
    }
    public ProductDataRelevanceModifier setConditions(ValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));;
        return this;
    }
    public ProductDataRelevanceModifier addToConditions(ValueCondition conditions)
    {
        if (this.conditions == null)
        {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditions);
        return this;
    }
    public ProductDataRelevanceModifier setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;;
        return this;
    }
    @Override
    public ProductDataRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
}
