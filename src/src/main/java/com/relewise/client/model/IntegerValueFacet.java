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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class IntegerValueFacet extends Facet
{
    public String $type = "";
    public @Nullable ArrayList<Integer> selected;
    public @Nullable ArrayList<Integer> getSelected()
    {
        return this.selected;
    }
    public IntegerValueFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public IntegerValueFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public IntegerValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public IntegerValueFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
