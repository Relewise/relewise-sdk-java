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
    defaultImpl = HasValueCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HasValueCondition extends ValueCondition
{
    public String $type = "Relewise.Client.Requests.Conditions.HasValueCondition, Relewise.Client";
    public static HasValueCondition create()
    {
        return new HasValueCondition();
    }
    public HasValueCondition()
    {
        this.negated = false;
    }
    public static HasValueCondition create(Boolean negated)
    {
        return new HasValueCondition(negated);
    }
    public HasValueCondition(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public HasValueCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
