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
public class BooleanAvailableFacetValue
{
    public Boolean value;
    public Integer hits;
    public Boolean selected;
    public static BooleanAvailableFacetValue create(Boolean value, Boolean selected, Integer hits)
    {
        return new BooleanAvailableFacetValue(value, selected, hits);
    }
    public BooleanAvailableFacetValue(Boolean value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public BooleanAvailableFacetValue()
    {
    }
    public Boolean getValue()
    {
        return this.value;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public Boolean getSelected()
    {
        return this.selected;
    }
    public BooleanAvailableFacetValue setValue(Boolean value)
    {
        this.value = value;;
        return this;
    }
    public BooleanAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
    public BooleanAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;;
        return this;
    }
}
