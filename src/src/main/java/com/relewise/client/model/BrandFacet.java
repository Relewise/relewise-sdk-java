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
    property = "$type",
    defaultImpl = BrandFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandFacet extends StringValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.BrandFacet, Relewise.Client";
    public static BrandFacet create(String... selectedIds)
    {
        return new BrandFacet(selectedIds);
    }
    public BrandFacet(String... selectedIds)
    {
        this.selected = new ArrayList<>(Arrays.asList(selectedIds));
    }
    public BrandFacet()
    {
    }
    @Override
    public BrandFacet setSelected(String... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public BrandFacet addToSelected(String selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public BrandFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public BrandFacet setSettings(FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
