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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpectedSearchTermResult
{
    public Integer estimatedHits;
    public EntityType type;
    public static ExpectedSearchTermResult create()
    {
        return new ExpectedSearchTermResult();
    }
    public ExpectedSearchTermResult()
    {
    }
    public Integer getEstimatedHits()
    {
        return this.estimatedHits;
    }
    public EntityType getType()
    {
        return this.type;
    }
    public ExpectedSearchTermResult setEstimatedHits(Integer estimatedHits)
    {
        this.estimatedHits = estimatedHits;
        return this;
    }
    public ExpectedSearchTermResult setType(EntityType type)
    {
        this.type = type;
        return this;
    }
}
