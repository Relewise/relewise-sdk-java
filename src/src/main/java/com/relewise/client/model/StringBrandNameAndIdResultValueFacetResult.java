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
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StringBrandNameAndIdResultValueFacetResult extends FacetResult
{
    public String $type = "";
    public ArrayList<String> selected;
    public ArrayList<BrandNameAndIdResultAvailableFacetValue> available;
    public ArrayList<String> getSelected()
    {
        return this.selected;
    }
    public ArrayList<BrandNameAndIdResultAvailableFacetValue> getAvailable()
    {
        return this.available;
    }
    public StringBrandNameAndIdResultValueFacetResult setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public StringBrandNameAndIdResultValueFacetResult addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    public StringBrandNameAndIdResultValueFacetResult setAvailable(BrandNameAndIdResultAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public StringBrandNameAndIdResultValueFacetResult addToAvailable(BrandNameAndIdResultAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public StringBrandNameAndIdResultValueFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
