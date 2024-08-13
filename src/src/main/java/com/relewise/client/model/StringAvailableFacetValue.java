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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class StringAvailableFacetValue
{
    public String value;
    public Integer hits;
    public Boolean selected;
    public static StringAvailableFacetValue create(String value, Boolean selected, Integer hits)
    {
        return new StringAvailableFacetValue(value, selected, hits);
    }
    public StringAvailableFacetValue(String value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public StringAvailableFacetValue()
    {
    }
    public String getValue()
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
    public StringAvailableFacetValue setValue(String value)
    {
        this.value = value;
        return this;
    }
    public StringAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public StringAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;
        return this;
    }
}
