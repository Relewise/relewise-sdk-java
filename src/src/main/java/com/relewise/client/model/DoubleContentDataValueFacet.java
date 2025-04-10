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
public abstract class DoubleContentDataValueFacet extends DoubleDataValueFacet
{
    public String $type = "";
    @Override
    public DoubleContentDataValueFacet setKey(String key)
    {
        this.key = key;
        return this;
    }
    @Override
    public DoubleContentDataValueFacet setCollectionFilterType(@Nullable CollectionFilterType collectionFilterType)
    {
        this.collectionFilterType = collectionFilterType;
        return this;
    }
    @Override
    public DoubleContentDataValueFacet setSelected(Double... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public DoubleContentDataValueFacet addToSelected(Double selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public DoubleContentDataValueFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public DoubleContentDataValueFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
