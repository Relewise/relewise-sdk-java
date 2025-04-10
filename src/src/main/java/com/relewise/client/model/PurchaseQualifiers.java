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
    
/** Determines what qualifies a purchase as recently purchased */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = PurchaseQualifiers.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseQualifiers implements PurchaseQualifiersIEquatable
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Queries.PurchaseQualifiers, Relewise.Client";
    /** How fresh recent purchase must be to count as hit? */
    public Integer sinceMinutesAgo;
    /** Should hit be count if user recently purchased product? */
    public Boolean byUser;
    /** Should hit be count if user company recently had a product purchase tracked? */
    public Boolean byUserCompany;
    /** Should hit be count if user parent company recently had a product purchase tracked? */
    public Boolean byUserParentCompany;
    /**
     * Creates Determines what qualifies a purchase as recently purchased
     * @param sinceMinutesAgo How fresh recent purchase must be to count as hit?
     * @param byUser Should hit be count if user recently purchased product?
     * @param byUserCompany Should hit be count if user company recently had a product purchase tracked?
     * @param byUserParentCompany Should hit be count if user parent company recently had a product purchase tracked?
     */
    public static PurchaseQualifiers create(Integer sinceMinutesAgo, Boolean byUser, Boolean byUserCompany, Boolean byUserParentCompany)
    {
        return new PurchaseQualifiers(sinceMinutesAgo, byUser, byUserCompany, byUserParentCompany);
    }
    /**
     * Creates Determines what qualifies a purchase as recently purchased
     * @param sinceMinutesAgo How fresh recent purchase must be to count as hit?
     * @param byUser Should hit be count if user recently purchased product?
     * @param byUserCompany Should hit be count if user company recently had a product purchase tracked?
     * @param byUserParentCompany Should hit be count if user parent company recently had a product purchase tracked?
     */
    public PurchaseQualifiers(Integer sinceMinutesAgo, Boolean byUser, Boolean byUserCompany, Boolean byUserParentCompany)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        this.byUser = byUser;
        this.byUserCompany = byUserCompany;
        this.byUserParentCompany = byUserParentCompany;
    }
    public PurchaseQualifiers()
    {
    }
    /** How fresh recent purchase must be to count as hit? */
    public Integer getSinceMinutesAgo()
    {
        return this.sinceMinutesAgo;
    }
    /** Should hit be count if user recently purchased product? */
    public Boolean getByUser()
    {
        return this.byUser;
    }
    /** Should hit be count if user company recently had a product purchase tracked? */
    public Boolean getByUserCompany()
    {
        return this.byUserCompany;
    }
    /** Should hit be count if user parent company recently had a product purchase tracked? */
    public Boolean getByUserParentCompany()
    {
        return this.byUserParentCompany;
    }
    /** How fresh recent purchase must be to count as hit? */
    public PurchaseQualifiers setSinceMinutesAgo(Integer sinceMinutesAgo)
    {
        this.sinceMinutesAgo = sinceMinutesAgo;
        return this;
    }
    /** Should hit be count if user recently purchased product? */
    public PurchaseQualifiers setByUser(Boolean byUser)
    {
        this.byUser = byUser;
        return this;
    }
    /** Should hit be count if user company recently had a product purchase tracked? */
    public PurchaseQualifiers setByUserCompany(Boolean byUserCompany)
    {
        this.byUserCompany = byUserCompany;
        return this;
    }
    /** Should hit be count if user parent company recently had a product purchase tracked? */
    public PurchaseQualifiers setByUserParentCompany(Boolean byUserParentCompany)
    {
        this.byUserParentCompany = byUserParentCompany;
        return this;
    }
}
