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
public abstract class CampaignUUIDSaveEntitiesRequest extends LicensedRequest
{
    public String $type = "";
    public Campaign[] entities;
    public String modifiedBy;
    public Campaign[] getEntities()
    {
        return this.entities;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public CampaignUUIDSaveEntitiesRequest setEntities(Campaign... entities)
    {
        this.entities = entities;
        return this;
    }
    public CampaignUUIDSaveEntitiesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
