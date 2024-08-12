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
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BooleanBooleanValueFacetResult extends FacetResult
{
    public String $type = "";
    public ArrayList<Boolean> selected;
    public ArrayList<BooleanAvailableFacetValue> available;
    public ArrayList<Boolean> getSelected()
    {
        return this.selected;
    }
    public ArrayList<BooleanAvailableFacetValue> getAvailable()
    {
        return this.available;
    }
    public BooleanBooleanValueFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public BooleanBooleanValueFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public BooleanBooleanValueFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public BooleanBooleanValueFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public BooleanBooleanValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
