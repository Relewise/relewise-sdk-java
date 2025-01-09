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
    
/** A result for <code>RecentlyPurchasedFacet</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = RecentlyPurchasedFacetResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPurchasedFacetResult extends BooleanBooleanValueFacetResult
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Result.RecentlyPurchasedFacetResult, Relewise.Client";
    public PurchaseQualifiers purchaseQualifiers;
    public static RecentlyPurchasedFacetResult create(PurchaseQualifiers purchaseQualifiers, ArrayList<Boolean> selected, BooleanAvailableFacetValue... available)
    {
        return new RecentlyPurchasedFacetResult(purchaseQualifiers, selected, available);
    }
    public RecentlyPurchasedFacetResult(PurchaseQualifiers purchaseQualifiers, ArrayList<Boolean> selected, BooleanAvailableFacetValue... available)
    {
        this.purchaseQualifiers = purchaseQualifiers;
        this.selected = selected;
        this.available = new ArrayList<>(Arrays.asList(available));
    }
    public RecentlyPurchasedFacetResult()
    {
    }
    public PurchaseQualifiers getPurchaseQualifiers()
    {
        return this.purchaseQualifiers;
    }
    public RecentlyPurchasedFacetResult setPurchaseQualifiers(PurchaseQualifiers purchaseQualifiers)
    {
        this.purchaseQualifiers = purchaseQualifiers;
        return this;
    }
    @Override
    public RecentlyPurchasedFacetResult setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public RecentlyPurchasedFacetResult addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public RecentlyPurchasedFacetResult setAvailable(BooleanAvailableFacetValue... available)
    {
        this.available = new ArrayList<>(Arrays.asList(available));;
        return this;
    }
    public RecentlyPurchasedFacetResult addToAvailable(BooleanAvailableFacetValue available)
    {
        if (this.available == null)
        {
            this.available = new ArrayList<>();
        }
        this.available.add(available);
        return this;
    }
    @Override
    public RecentlyPurchasedFacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
