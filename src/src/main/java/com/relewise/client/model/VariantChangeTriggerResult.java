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
    defaultImpl = VariantChangeTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantChangeTriggerResult extends VariantChangeTriggerResultVariantChangeResultDetailsEntityChangeTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.VariantChangeTriggerResult, Relewise.Client";
    public static VariantChangeTriggerResult create(UserResultDetails user, VariantChangeTriggerResultVariantChangeResultDetails... entitiesWithChanges)
    {
        return new VariantChangeTriggerResult(user, entitiesWithChanges);
    }
    public VariantChangeTriggerResult(UserResultDetails user, VariantChangeTriggerResultVariantChangeResultDetails... entitiesWithChanges)
    {
        this.user = user;
        this.entitiesWithChanges = entitiesWithChanges;
    }
    public VariantChangeTriggerResult()
    {
    }
    @Override
    public VariantChangeTriggerResult setEntitiesWithChanges(VariantChangeTriggerResultVariantChangeResultDetails... entitiesWithChanges)
    {
        this.entitiesWithChanges = entitiesWithChanges;
        return this;
    }
    public VariantChangeTriggerResult addToEntitiesWithChanges(VariantChangeTriggerResultVariantChangeResultDetails entitiesWithChange)
    {
        if (this.entitiesWithChanges == null)
        {
            this.entitiesWithChanges = new VariantChangeTriggerResultVariantChangeResultDetails[] { entitiesWithChange };
        }
        else
        {
            ArrayList<VariantChangeTriggerResultVariantChangeResultDetails> existingList = new ArrayList<>(Arrays.asList(this.entitiesWithChanges));
            existingList.add(entitiesWithChange);
            this.entitiesWithChanges = existingList.toArray(new VariantChangeTriggerResultVariantChangeResultDetails[0]);
        }
        return this;
    }
    @Override
    public VariantChangeTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
}
