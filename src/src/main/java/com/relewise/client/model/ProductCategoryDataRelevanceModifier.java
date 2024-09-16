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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a ProductCategory depending on matching conditions on a certain key. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductCategoryDataRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryDataRelevanceModifier extends DataRelevanceModifier implements IProductCategoryRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryDataRelevanceModifier, Relewise.Client";
    public static ProductCategoryDataRelevanceModifier create(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector)
    {
        return new ProductCategoryDataRelevanceModifier(key, conditions, multiplierSelector);
    }
    public ProductCategoryDataRelevanceModifier(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector)
    {
        this.key = key;
        this.conditions = conditions;
        this.multiplierSelector = multiplierSelector;
        this.mustMatchAllConditions = true;
        this.considerAsMatchIfKeyIsNotFound = false;
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a ProductCategory depending on matching conditions on a certain key.
     * @param key The data key that this RelevanceModifier will distinguish on.
     * @param conditions The conditions that must hold for the specific data Key in order for the entity to be boosted.
     * @param multiplierSelector The selector for the multiplier which the entities parsing the Conditions will be have their rank multiplied by. It can either be a FixedDoubleValueSelector taking a fixed value or a DataDoubleSelector that can take the multiplier from a data key containing a double.
     * @param mustMatchAllConditions Specifies whether all Conditions should parse their test on the specific data Key (true) or if only one is required (false).
     * @param considerAsMatchIfKeyIsNotFound Specifies whether entities that don't have the specific data Key should be considered a match (true) or not (false).
     */
    public static ProductCategoryDataRelevanceModifier create(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector, Boolean mustMatchAllConditions, Boolean considerAsMatchIfKeyIsNotFound)
    {
        return new ProductCategoryDataRelevanceModifier(key, conditions, multiplierSelector, mustMatchAllConditions, considerAsMatchIfKeyIsNotFound);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a ProductCategory depending on matching conditions on a certain key.
     * @param key The data key that this RelevanceModifier will distinguish on.
     * @param conditions The conditions that must hold for the specific data Key in order for the entity to be boosted.
     * @param multiplierSelector The selector for the multiplier which the entities parsing the Conditions will be have their rank multiplied by. It can either be a FixedDoubleValueSelector taking a fixed value or a DataDoubleSelector that can take the multiplier from a data key containing a double.
     * @param mustMatchAllConditions Specifies whether all Conditions should parse their test on the specific data Key (true) or if only one is required (false).
     * @param considerAsMatchIfKeyIsNotFound Specifies whether entities that don't have the specific data Key should be considered a match (true) or not (false).
     */
    public ProductCategoryDataRelevanceModifier(String key, ArrayList<ValueCondition> conditions, ValueSelector multiplierSelector, Boolean mustMatchAllConditions, Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.key = key;
        this.conditions = conditions;
        this.multiplierSelector = multiplierSelector;
        this.mustMatchAllConditions = mustMatchAllConditions;
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
    }
    public ProductCategoryDataRelevanceModifier()
    {
        this.considerAsMatchIfKeyIsNotFound = false;
        this.mustMatchAllConditions = true;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setConsiderAsMatchIfKeyIsNotFound(Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
        return this;
    }
    /** @deprecated Use MultiplierSelector instead */
    @Override
    public ProductCategoryDataRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setConditions(ValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));;
        return this;
    }
    public ProductCategoryDataRelevanceModifier addToConditions(ValueCondition conditions)
    {
        if (this.conditions == null)
        {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditions);
        return this;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;
        return this;
    }
    @Override
    public ProductCategoryDataRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
