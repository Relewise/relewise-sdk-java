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
    property = "$type",
    defaultImpl = ContentDataDoubleRangeFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDataDoubleRangeFacet extends DoubleContentDataRangeFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleRangeFacet, Relewise.Client";
    public static ContentDataDoubleRangeFacet create(String key, @Nullable DoubleRange selected)
    {
        return new ContentDataDoubleRangeFacet(key, selected);
    }
    public ContentDataDoubleRangeFacet(String key, @Nullable DoubleRange selected)
    {
        this.key = key;
        this.selected = selected;
    }
    public ContentDataDoubleRangeFacet()
    {
    }
    @Override
    public ContentDataDoubleRangeFacet setSelected(@Nullable DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public ContentDataDoubleRangeFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
