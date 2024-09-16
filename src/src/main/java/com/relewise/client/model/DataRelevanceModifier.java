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
    
/** a <code>RelevanceModifier</code> that can change the relevance of an entity depending on matching conditions on a certain key. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ProductCategoryDataRelevanceModifier, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryDataRelevanceModifier.class, name = "Relewise.Client.Requests.RelevanceModifiers.ContentCategoryDataRelevanceModifier, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DataRelevanceModifier extends RelevanceModifier
{
    public String $type = "";
    /** The data key that this <code>RelevanceModifier</code> will distinguish on. */
    public String key;
    /** Specifies whether entities that don't have the specific data <code>Key</code> should be considered a match (<code>true</code>) or not (<code>false</code>). */
    public Boolean considerAsMatchIfKeyIsNotFound;
    /** @deprecated Use MultiplierSelector instead */
    public Double multiplyWeightBy;
    /** Specifies whether all <code>Conditions</code> should parse their test on the specific data <code>Key</code> (<code>true</code>) or if only one is required (<code>false</code>). */
    public Boolean mustMatchAllConditions;
    /** The conditions that must hold for the specific data <code>Key</code> in order for the entity to be boosted. */
    public ArrayList<ValueCondition> conditions;
    /** The selector for the multiplier which the entities parsing the <code>Conditions</code> will be have their rank multiplied by. It can either be a <code>FixedDoubleValueSelector</code> taking a fixed value or a <code>DataDoubleSelector</code> that can take the multiplier from a data key containing a double. */
    public ValueSelector multiplierSelector;
    /** The data key that this <code>RelevanceModifier</code> will distinguish on. */
    public String getKey()
    {
        return this.key;
    }
    /** Specifies whether entities that don't have the specific data <code>Key</code> should be considered a match (<code>true</code>) or not (<code>false</code>). */
    public Boolean getConsiderAsMatchIfKeyIsNotFound()
    {
        return this.considerAsMatchIfKeyIsNotFound;
    }
    /** @deprecated Use MultiplierSelector instead */
    public Double getMultiplyWeightBy()
    {
        return this.multiplyWeightBy;
    }
    /** Specifies whether all <code>Conditions</code> should parse their test on the specific data <code>Key</code> (<code>true</code>) or if only one is required (<code>false</code>). */
    public Boolean getMustMatchAllConditions()
    {
        return this.mustMatchAllConditions;
    }
    /** The conditions that must hold for the specific data <code>Key</code> in order for the entity to be boosted. */
    public ArrayList<ValueCondition> getConditions()
    {
        return this.conditions;
    }
    /** The selector for the multiplier which the entities parsing the <code>Conditions</code> will be have their rank multiplied by. It can either be a <code>FixedDoubleValueSelector</code> taking a fixed value or a <code>DataDoubleSelector</code> that can take the multiplier from a data key containing a double. */
    public ValueSelector getMultiplierSelector()
    {
        return this.multiplierSelector;
    }
    /** The data key that this <code>RelevanceModifier</code> will distinguish on. */
    public DataRelevanceModifier setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** Specifies whether entities that don't have the specific data <code>Key</code> should be considered a match (<code>true</code>) or not (<code>false</code>). */
    public DataRelevanceModifier setConsiderAsMatchIfKeyIsNotFound(Boolean considerAsMatchIfKeyIsNotFound)
    {
        this.considerAsMatchIfKeyIsNotFound = considerAsMatchIfKeyIsNotFound;
        return this;
    }
    /** @deprecated Use MultiplierSelector instead */
    public DataRelevanceModifier setMultiplyWeightBy(Double multiplyWeightBy)
    {
        this.multiplyWeightBy = multiplyWeightBy;
        return this;
    }
    /** Specifies whether all <code>Conditions</code> should parse their test on the specific data <code>Key</code> (<code>true</code>) or if only one is required (<code>false</code>). */
    public DataRelevanceModifier setMustMatchAllConditions(Boolean mustMatchAllConditions)
    {
        this.mustMatchAllConditions = mustMatchAllConditions;
        return this;
    }
    /** The conditions that must hold for the specific data <code>Key</code> in order for the entity to be boosted. */
    public DataRelevanceModifier setConditions(ValueCondition... conditions)
    {
        this.conditions = new ArrayList<>(Arrays.asList(conditions));;
        return this;
    }
    /** The conditions that must hold for the specific data <code>Key</code> in order for the entity to be boosted. */
    public DataRelevanceModifier addToConditions(ValueCondition conditions)
    {
        if (this.conditions == null)
        {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditions);
        return this;
    }
    /** The selector for the multiplier which the entities parsing the <code>Conditions</code> will be have their rank multiplied by. It can either be a <code>FixedDoubleValueSelector</code> taking a fixed value or a <code>DataDoubleSelector</code> that can take the multiplier from a data key containing a double. */
    public DataRelevanceModifier setMultiplierSelector(ValueSelector multiplierSelector)
    {
        this.multiplierSelector = multiplierSelector;
        return this;
    }
    @Override
    public DataRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
