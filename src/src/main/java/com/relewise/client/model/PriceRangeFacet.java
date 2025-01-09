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
    defaultImpl = PriceRangeFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceRangeFacet extends Facet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.PriceRangeFacet, Relewise.Client";
    public @Nullable DoubleRange selected;
    public PriceSelectionStrategy priceSelectionStrategy;
    public static PriceRangeFacet create(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable DoubleRange selected)
    {
        return new PriceRangeFacet(field, priceSelectionStrategy, selected);
    }
    public PriceRangeFacet(FacetingField field, PriceSelectionStrategy priceSelectionStrategy, @Nullable DoubleRange selected)
    {
        this.field = field;
        this.priceSelectionStrategy = priceSelectionStrategy;
        this.selected = selected;
    }
    public PriceRangeFacet()
    {
    }
    public @Nullable DoubleRange getSelected()
    {
        return this.selected;
    }
    public PriceSelectionStrategy getPriceSelectionStrategy()
    {
        return this.priceSelectionStrategy;
    }
    public PriceRangeFacet setSelected(@Nullable DoubleRange selected)
    {
        this.selected = selected;
        return this;
    }
    public PriceRangeFacet setPriceSelectionStrategy(PriceSelectionStrategy priceSelectionStrategy)
    {
        this.priceSelectionStrategy = priceSelectionStrategy;
        return this;
    }
    @Override
    public PriceRangeFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public PriceRangeFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
