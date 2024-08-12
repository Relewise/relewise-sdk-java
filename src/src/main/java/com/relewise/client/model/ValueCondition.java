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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = EqualsCondition.class, name = "Relewise.Client.Requests.Conditions.EqualsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = ContainsCondition.class, name = "Relewise.Client.Requests.Conditions.ContainsCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = GreaterThanCondition.class, name = "Relewise.Client.Requests.Conditions.GreaterThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = LessThanCondition.class, name = "Relewise.Client.Requests.Conditions.LessThanCondition, Relewise.Client"),
    @JsonSubTypes.Type(value = DistinctCondition.class, name = "Relewise.Client.Requests.Conditions.DistinctCondition, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ValueCondition
{
    public String $type = "";
    public Boolean negated;
    public Boolean getNegated()
    {
        return this.negated;
    }
    public ValueCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
