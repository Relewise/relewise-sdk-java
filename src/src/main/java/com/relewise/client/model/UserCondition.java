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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = HasAuthenticatedIdCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasAuthenticatedIdCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasClassificationCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasClassificationCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasEmailCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasEmailCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasIdentifierCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasIdentifierCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasPlacedOrderCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasPlacedOrderCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasActivityCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasActivityCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasRecentlyReceivedSameTriggerCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasRecentlyReceivedSameTriggerCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasRecentlyReceivedTriggerCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasRecentlyReceivedTriggerCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasModifiedCartCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasModifiedCartCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = HasLineItemsInCartCondition.class, name = "Relewise.Client.DataTypes.UserConditions.HasLineItemsInCartCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = OrCondition.class, name = "Relewise.Client.DataTypes.UserConditions.OrCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = AndCondition.class, name = "Relewise.Client.DataTypes.UserConditions.AndCondition, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class UserCondition
{
    public String $type = "";
    public Boolean negated;
    public Boolean getNegated()
    {
        return this.negated;
    }
    public UserCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
