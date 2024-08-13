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
    defaultImpl = VariantSpecificationFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSpecificationFacet extends StringValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.VariantSpecificationFacet, Relewise.Client";
    public String key;
    public static VariantSpecificationFacet create(String key, String... selected)
    {
        return new VariantSpecificationFacet(key, selected);
    }
    public VariantSpecificationFacet(String key, String... selected)
    {
        this.key = key;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public VariantSpecificationFacet()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public VariantSpecificationFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public VariantSpecificationFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public VariantSpecificationFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public VariantSpecificationFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public VariantSpecificationFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
