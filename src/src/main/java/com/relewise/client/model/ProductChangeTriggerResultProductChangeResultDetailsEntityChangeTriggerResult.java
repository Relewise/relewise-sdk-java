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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductChangeTriggerResultProductChangeResultDetailsEntityChangeTriggerResult extends EntityChangeTriggerResult implements ITriggerResult
{
    public String $type = "";
    public ProductChangeTriggerResultProductChangeResultDetails[] entitiesWithChanges;
    public ProductChangeTriggerResultProductChangeResultDetails[] getEntitiesWithChanges()
    {
        return this.entitiesWithChanges;
    }
    public ProductChangeTriggerResultProductChangeResultDetailsEntityChangeTriggerResult setEntitiesWithChanges(ProductChangeTriggerResultProductChangeResultDetails... entitiesWithChanges)
    {
        this.entitiesWithChanges = entitiesWithChanges;
        return this;
    }
    @Override
    public ProductChangeTriggerResultProductChangeResultDetailsEntityChangeTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
}
