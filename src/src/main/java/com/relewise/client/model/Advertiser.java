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
    defaultImpl = Advertiser.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Advertiser extends AdvertiserEntityStateAdvertiserMetadataValuesRetailMediaEntity
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Advertiser, Relewise.Client";
    public String name;
    /** Defines what kind of promotions an advertiser is allowed to create, and constraints to what may be promoted. Constraints could as an example be all products belonging to the brand(s) this Advertiser is associated with. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public @Nullable PromotionSpecificationCollection allowedPromotions;
    /** Defines locations/placements/variations where this advertiser is allowed to make promotions at. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public @Nullable PromotionLocationCollection allowedLocations;
    public static Advertiser create(@Nullable UUID id, AdvertiserEntityState state, String name, @Nullable PromotionSpecificationCollection allowedPromotions, @Nullable PromotionLocationCollection allowedLocations)
    {
        return new Advertiser(id, state, name, allowedPromotions, allowedLocations);
    }
    public Advertiser(@Nullable UUID id, AdvertiserEntityState state, String name, @Nullable PromotionSpecificationCollection allowedPromotions, @Nullable PromotionLocationCollection allowedLocations)
    {
        this.id = id;
        this.state = state;
        this.name = name;
        this.allowedPromotions = allowedPromotions;
        this.allowedLocations = allowedLocations;
    }
    public Advertiser()
    {
    }
    public String getName()
    {
        return this.name;
    }
    /** Defines what kind of promotions an advertiser is allowed to create, and constraints to what may be promoted. Constraints could as an example be all products belonging to the brand(s) this Advertiser is associated with. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public @Nullable PromotionSpecificationCollection getAllowedPromotions()
    {
        return this.allowedPromotions;
    }
    /** Defines locations/placements/variations where this advertiser is allowed to make promotions at. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public @Nullable PromotionLocationCollection getAllowedLocations()
    {
        return this.allowedLocations;
    }
    public Advertiser setName(String name)
    {
        this.name = name;
        return this;
    }
    /** Defines what kind of promotions an advertiser is allowed to create, and constraints to what may be promoted. Constraints could as an example be all products belonging to the brand(s) this Advertiser is associated with. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public Advertiser setAllowedPromotions(@Nullable PromotionSpecificationCollection allowedPromotions)
    {
        this.allowedPromotions = allowedPromotions;
        return this;
    }
    /** Defines locations/placements/variations where this advertiser is allowed to make promotions at. If <code>null</code> or empty, an advertiser will not be allowed to make any promotions anywhere, only useful for Advertisers in draft. */
    public Advertiser setAllowedLocations(@Nullable PromotionLocationCollection allowedLocations)
    {
        this.allowedLocations = allowedLocations;
        return this;
    }
    @Override
    public Advertiser setState(AdvertiserEntityState state)
    {
        this.state = state;
        return this;
    }
    @Override
    public Advertiser setMetadata(AdvertiserMetadataValues metadata)
    {
        this.metadata = metadata;
        return this;
    }
    @Override
    public Advertiser setId(@Nullable UUID id)
    {
        this.id = id;
        return this;
    }
}
