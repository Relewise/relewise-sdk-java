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
    
/** Used for specifying that this kind of promotion is allowed at a specific Location as well as for specific advertisers */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DisplayAdPromotionSpecification.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdPromotionSpecification extends PromotionSpecification
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.DisplayAdPromotion+Specification, Relewise.Client";
    /** The DisplayAdTemplate Ids that are valid to promote */
    public @Nullable UUID[] promotableDisplayAdTemplateIds;
    /** The DisplayAdTemplates found via filters that are valid to promote */
    public @Nullable FilterCollection promotableDisplayAdTemplateFilters;
    public static DisplayAdPromotionSpecification create(@Nullable UUID[] promotableDisplayAdTemplateIds, @Nullable FilterCollection promotableDisplayAdTemplateFilters)
    {
        return new DisplayAdPromotionSpecification(promotableDisplayAdTemplateIds, promotableDisplayAdTemplateFilters);
    }
    public DisplayAdPromotionSpecification(@Nullable UUID[] promotableDisplayAdTemplateIds, @Nullable FilterCollection promotableDisplayAdTemplateFilters)
    {
        this.promotableDisplayAdTemplateIds = promotableDisplayAdTemplateIds;
        this.promotableDisplayAdTemplateFilters = promotableDisplayAdTemplateFilters;
    }
    public DisplayAdPromotionSpecification()
    {
    }
    /** The DisplayAdTemplate Ids that are valid to promote */
    public @Nullable UUID[] getPromotableDisplayAdTemplateIds()
    {
        return this.promotableDisplayAdTemplateIds;
    }
    /** The DisplayAdTemplates found via filters that are valid to promote */
    public @Nullable FilterCollection getPromotableDisplayAdTemplateFilters()
    {
        return this.promotableDisplayAdTemplateFilters;
    }
    /** The DisplayAdTemplate Ids that are valid to promote */
    public DisplayAdPromotionSpecification setPromotableDisplayAdTemplateIds(UUID... promotableDisplayAdTemplateIds)
    {
        this.promotableDisplayAdTemplateIds = promotableDisplayAdTemplateIds;
        return this;
    }
    /** The DisplayAdTemplate Ids that are valid to promote */
    public DisplayAdPromotionSpecification addToPromotableDisplayAdTemplateIds(UUID promotableDisplayAdTemplateId)
    {
        if (this.promotableDisplayAdTemplateIds == null)
        {
            this.promotableDisplayAdTemplateIds = new UUID[] { promotableDisplayAdTemplateId };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.promotableDisplayAdTemplateIds));
            existingList.add(promotableDisplayAdTemplateId);
            this.promotableDisplayAdTemplateIds = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    /** The DisplayAdTemplates found via filters that are valid to promote */
    public DisplayAdPromotionSpecification setPromotableDisplayAdTemplateFilters(@Nullable FilterCollection promotableDisplayAdTemplateFilters)
    {
        this.promotableDisplayAdTemplateFilters = promotableDisplayAdTemplateFilters;
        return this;
    }
}
