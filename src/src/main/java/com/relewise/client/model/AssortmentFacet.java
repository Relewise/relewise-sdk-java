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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AssortmentFacet extends IntegerValueFacet
{
    public String $type = "";
    public AssortmentFilterType assortmentFilterType;
    public AssortmentFilterType getAssortmentFilterType()
    {
        return this.assortmentFilterType;
    }
    public AssortmentFacet setAssortmentFilterType(AssortmentFilterType assortmentFilterType)
    {
        this.assortmentFilterType = assortmentFilterType;
        return this;
    }
    @Override
    public AssortmentFacet setSelected(Integer... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public AssortmentFacet addToSelected(Integer selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public AssortmentFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public AssortmentFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
