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
    property = "$type",
    defaultImpl = DeleteSynonymsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteSynonymsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.DeleteSynonymsRequest, Relewise.Client";
    public UUID[] ids;
    public String deletedBy;
    public static DeleteSynonymsRequest create(UUID[] ids, String deletedBy)
    {
        return new DeleteSynonymsRequest(ids, deletedBy);
    }
    public DeleteSynonymsRequest(UUID[] ids, String deletedBy)
    {
        this.ids = ids;
        this.deletedBy = deletedBy;
    }
    public DeleteSynonymsRequest()
    {
    }
    public UUID[] getIds()
    {
        return this.ids;
    }
    public String getDeletedBy()
    {
        return this.deletedBy;
    }
    public DeleteSynonymsRequest setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public DeleteSynonymsRequest addToIds(UUID id)
    {
        if (this.ids == null)
        {
            this.ids = new UUID[] { id };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.ids));
            existingList.add(id);
            this.ids = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    public DeleteSynonymsRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;
        return this;
    }
}
