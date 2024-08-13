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
    defaultImpl = ProductChangeTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductChangeTriggerResult extends ProductChangeTriggerResultProductChangeResultDetailsEntityChangeTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductChangeTriggerResult, Relewise.Client";
    public static ProductChangeTriggerResult create(UserResultDetails user, ProductChangeTriggerResultProductChangeResultDetails... entitiesWithChanges)
    {
        return new ProductChangeTriggerResult(user, entitiesWithChanges);
    }
    public ProductChangeTriggerResult(UserResultDetails user, ProductChangeTriggerResultProductChangeResultDetails... entitiesWithChanges)
    {
        this.user = user;
        this.entitiesWithChanges = entitiesWithChanges;
    }
    public ProductChangeTriggerResult()
    {
    }
    @Override
    public ProductChangeTriggerResult setEntitiesWithChanges(ProductChangeTriggerResultProductChangeResultDetails... entitiesWithChanges)
    {
        this.entitiesWithChanges = entitiesWithChanges;
        return this;
    }
    public ProductChangeTriggerResult addToEntitiesWithChanges(ProductChangeTriggerResultProductChangeResultDetails entitiesWithChange)
    {
        if (this.entitiesWithChanges == null)
        {
            this.entitiesWithChanges = new ProductChangeTriggerResultProductChangeResultDetails[] { entitiesWithChange };
        }
        else
        {
            ArrayList<ProductChangeTriggerResultProductChangeResultDetails> existingList = new ArrayList<>(Arrays.asList(this.entitiesWithChanges));
            existingList.add(entitiesWithChange);
            this.entitiesWithChanges = existingList.toArray(new ProductChangeTriggerResultProductChangeResultDetails[0]);
        }
        return this;
    }
    @Override
    public ProductChangeTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
}
