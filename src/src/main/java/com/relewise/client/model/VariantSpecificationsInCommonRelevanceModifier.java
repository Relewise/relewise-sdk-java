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
    
/** a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether certain <code>SpecificationKeysAndMultipliers</code> match with a specific variant. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantSpecificationsInCommonRelevanceModifier.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationsInCommonRelevanceModifier extends RelevanceModifier implements IVariantRelevanceModifier
{
    public String $type = "Relewise.Client.Requests.RelevanceModifiers.VariantSpecificationsInCommonRelevanceModifier, Relewise.Client";
    /** A collection of <code>KeyMultiplier</code> that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0. */
    public KeyMultiplier[] specificationKeysAndMultipliers;
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether certain <code>SpecificationKeysAndMultipliers</code> match with a specific variant.
     * @param specificationKeysAndMultipliers A collection of KeyMultiplier that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0.
     */
    public static VariantSpecificationsInCommonRelevanceModifier create(KeyMultiplier... specificationKeysAndMultipliers)
    {
        return new VariantSpecificationsInCommonRelevanceModifier(specificationKeysAndMultipliers);
    }
    /**
     * Creates a <code>RelevanceModifier</code> that can change the relevance of a Variant depending on whether certain <code>SpecificationKeysAndMultipliers</code> match with a specific variant.
     * @param specificationKeysAndMultipliers A collection of KeyMultiplier that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0.
     */
    public VariantSpecificationsInCommonRelevanceModifier(KeyMultiplier... specificationKeysAndMultipliers)
    {
        this.specificationKeysAndMultipliers = specificationKeysAndMultipliers;
    }
    public VariantSpecificationsInCommonRelevanceModifier()
    {
    }
    /** A collection of <code>KeyMultiplier</code> that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0. */
    public KeyMultiplier[] getSpecificationKeysAndMultipliers()
    {
        return this.specificationKeysAndMultipliers;
    }
    /** A collection of <code>KeyMultiplier</code> that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0. */
    public VariantSpecificationsInCommonRelevanceModifier setSpecificationKeysAndMultipliers(KeyMultiplier... specificationKeysAndMultipliers)
    {
        this.specificationKeysAndMultipliers = specificationKeysAndMultipliers;
        return this;
    }
    /** A collection of <code>KeyMultiplier</code> that each define a certain key and value that the relevance should be multiplied with if matching on this key. The default multiplier for keys not included, is 1.0. */
    public VariantSpecificationsInCommonRelevanceModifier addToSpecificationKeysAndMultipliers(KeyMultiplier specificationKeysAndMultiplier)
    {
        if (this.specificationKeysAndMultipliers == null)
        {
            this.specificationKeysAndMultipliers = new KeyMultiplier[] { specificationKeysAndMultiplier };
        }
        else
        {
            ArrayList<KeyMultiplier> existingList = new ArrayList<>(Arrays.asList(this.specificationKeysAndMultipliers));
            existingList.add(specificationKeysAndMultiplier);
            this.specificationKeysAndMultipliers = existingList.toArray(new KeyMultiplier[0]);
        }
        return this;
    }
    @Override
    public VariantSpecificationsInCommonRelevanceModifier setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
}
