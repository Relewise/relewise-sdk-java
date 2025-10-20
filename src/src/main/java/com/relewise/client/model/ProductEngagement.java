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
    
/** Represents an engagement (e.g. favorite marking, sentiment feedback, etc.) performed by a <code>User</code> on a specific product. This is a trackable entity used when sending engagement events to Relewise. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductEngagement.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductEngagement extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ProductEngagement, Relewise.Client";
    /** The user associated with the engagement. Can represent an authenticated, temporary, or otherwise identified user. */
    public @Nullable User user;
    /** Identifies the product that the engagement concerns. The <code>ProductId</code> must be non-null and non-empty. */
    public ProductAndVariantId id;
    /** The engagement data describing what kind of feedback or interaction has occurred (e.g. favorite flag, sentiment value). Must contain at least one piece of data. */
    public ProductEngagementData engagement;
    /**
     * Creates a new <code>ProductEngagement</code> describing a user interaction with a product.
     * @param user The user performing or associated with the engagement. Cannot be null.
     * @param id The product identifier. Must have a non-empty
     * @param engagement The engagement data (e.g. favorite or sentiment). Cannot be null and must contain data.
     */
    public static ProductEngagement create(@Nullable User user, ProductAndVariantId id, ProductEngagementData engagement)
    {
        return new ProductEngagement(user, id, engagement);
    }
    /**
     * Creates a new <code>ProductEngagement</code> describing a user interaction with a product.
     * @param user The user performing or associated with the engagement. Cannot be null.
     * @param id The product identifier. Must have a non-empty
     * @param engagement The engagement data (e.g. favorite or sentiment). Cannot be null and must contain data.
     */
    public ProductEngagement(@Nullable User user, ProductAndVariantId id, ProductEngagementData engagement)
    {
        this.user = user;
        this.id = id;
        this.engagement = engagement;
    }
    public ProductEngagement()
    {
    }
    /** The user associated with the engagement. Can represent an authenticated, temporary, or otherwise identified user. */
    public @Nullable User getUser()
    {
        return this.user;
    }
    /** Identifies the product that the engagement concerns. The <code>ProductId</code> must be non-null and non-empty. */
    public ProductAndVariantId getId()
    {
        return this.id;
    }
    /** The engagement data describing what kind of feedback or interaction has occurred (e.g. favorite flag, sentiment value). Must contain at least one piece of data. */
    public ProductEngagementData getEngagement()
    {
        return this.engagement;
    }
    /** The user associated with the engagement. Can represent an authenticated, temporary, or otherwise identified user. */
    public ProductEngagement setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    /** Identifies the product that the engagement concerns. The <code>ProductId</code> must be non-null and non-empty. */
    public ProductEngagement setId(ProductAndVariantId id)
    {
        this.id = id;
        return this;
    }
    /** The engagement data describing what kind of feedback or interaction has occurred (e.g. favorite flag, sentiment value). Must contain at least one piece of data. */
    public ProductEngagement setEngagement(ProductEngagementData engagement)
    {
        this.engagement = engagement;
        return this;
    }
}
