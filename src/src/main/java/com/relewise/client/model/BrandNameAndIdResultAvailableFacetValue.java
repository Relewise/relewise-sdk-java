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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandNameAndIdResultAvailableFacetValue
{
    public BrandNameAndIdResult value;
    public Integer hits;
    public Boolean selected;
    public static BrandNameAndIdResultAvailableFacetValue create(BrandNameAndIdResult value, Boolean selected, Integer hits)
    {
        return new BrandNameAndIdResultAvailableFacetValue(value, selected, hits);
    }
    public BrandNameAndIdResultAvailableFacetValue(BrandNameAndIdResult value, Boolean selected, Integer hits)
    {
        this.value = value;
        this.selected = selected;
        this.hits = hits;
    }
    public BrandNameAndIdResultAvailableFacetValue()
    {
    }
    public BrandNameAndIdResult getValue()
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
    public BrandNameAndIdResultAvailableFacetValue setValue(BrandNameAndIdResult value)
    {
        this.value = value;
        return this;
    }
    public BrandNameAndIdResultAvailableFacetValue setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public BrandNameAndIdResultAvailableFacetValue setSelected(Boolean selected)
    {
        this.selected = selected;
        return this;
    }
}
