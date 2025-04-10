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
    
/** Performs faceting based on if product is known to be purchased recently (within <code>SinceMinutesAgo</code>), applicable only for product searches. Requires <b>at least one</b> level of selection, whether <code>ByUser</code>, or <code>ByUserCompany</code>, or <code>ByUserParentCompany</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = RecentlyPurchasedFacet.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecentlyPurchasedFacet extends BooleanValueFacet
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.RecentlyPurchasedFacet, Relewise.Client";
    public PurchaseQualifiers purchaseQualifiers;
    public static RecentlyPurchasedFacet create(PurchaseQualifiers purchaseQualifiers)
    {
        return new RecentlyPurchasedFacet(purchaseQualifiers);
    }
    public RecentlyPurchasedFacet(PurchaseQualifiers purchaseQualifiers)
    {
        this.purchaseQualifiers = purchaseQualifiers;
        this.selected = null;
    }
    public static RecentlyPurchasedFacet create(PurchaseQualifiers purchaseQualifiers, Boolean... selected)
    {
        return new RecentlyPurchasedFacet(purchaseQualifiers, selected);
    }
    public RecentlyPurchasedFacet(PurchaseQualifiers purchaseQualifiers, Boolean... selected)
    {
        this.purchaseQualifiers = purchaseQualifiers;
        this.selected = new ArrayList<>(Arrays.asList(selected));
    }
    public RecentlyPurchasedFacet()
    {
        this.selected = null;
    }
    public PurchaseQualifiers getPurchaseQualifiers()
    {
        return this.purchaseQualifiers;
    }
    public RecentlyPurchasedFacet setPurchaseQualifiers(PurchaseQualifiers purchaseQualifiers)
    {
        this.purchaseQualifiers = purchaseQualifiers;
        return this;
    }
    @Override
    public RecentlyPurchasedFacet setSelected(Boolean... selected)
    {
        this.selected = new ArrayList<>(Arrays.asList(selected));;
        return this;
    }
    public RecentlyPurchasedFacet addToSelected(Boolean selected)
    {
        if (this.selected == null)
        {
            this.selected = new ArrayList<>();
        }
        this.selected.add(selected);
        return this;
    }
    @Override
    public RecentlyPurchasedFacet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    @Override
    public RecentlyPurchasedFacet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
