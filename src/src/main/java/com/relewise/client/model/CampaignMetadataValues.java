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
    defaultImpl = CampaignMetadataValues.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignMetadataValues extends MetadataValues
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.Campaign+MetadataValues, Relewise.Client";
    public @Nullable OffsetDateTime proposed;
    public @Nullable String proposedBy;
    public @Nullable OffsetDateTime approved;
    public @Nullable String approvedBy;
    public @Nullable OffsetDateTime archived;
    public @Nullable String archivedBy;
    public static CampaignMetadataValues create()
    {
        return new CampaignMetadataValues();
    }
    public CampaignMetadataValues()
    {
    }
    public @Nullable OffsetDateTime getProposed()
    {
        return this.proposed;
    }
    public @Nullable String getProposedBy()
    {
        return this.proposedBy;
    }
    public @Nullable OffsetDateTime getApproved()
    {
        return this.approved;
    }
    public @Nullable String getApprovedBy()
    {
        return this.approvedBy;
    }
    public @Nullable OffsetDateTime getArchived()
    {
        return this.archived;
    }
    public @Nullable String getArchivedBy()
    {
        return this.archivedBy;
    }
    public CampaignMetadataValues setProposed(@Nullable OffsetDateTime proposed)
    {
        this.proposed = proposed;
        return this;
    }
    public CampaignMetadataValues setProposedBy(@Nullable String proposedBy)
    {
        this.proposedBy = proposedBy;
        return this;
    }
    public CampaignMetadataValues setApproved(@Nullable OffsetDateTime approved)
    {
        this.approved = approved;
        return this;
    }
    public CampaignMetadataValues setApprovedBy(@Nullable String approvedBy)
    {
        this.approvedBy = approvedBy;
        return this;
    }
    public CampaignMetadataValues setArchived(@Nullable OffsetDateTime archived)
    {
        this.archived = archived;
        return this;
    }
    public CampaignMetadataValues setArchivedBy(@Nullable String archivedBy)
    {
        this.archivedBy = archivedBy;
        return this;
    }
    @Override
    public CampaignMetadataValues setCreated(OffsetDateTime created)
    {
        this.created = created;
        return this;
    }
    @Override
    public CampaignMetadataValues setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
        return this;
    }
    @Override
    public CampaignMetadataValues setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    @Override
    public CampaignMetadataValues setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
