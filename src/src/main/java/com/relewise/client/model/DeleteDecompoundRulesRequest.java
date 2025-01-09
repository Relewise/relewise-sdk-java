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
    defaultImpl = DeleteDecompoundRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteDecompoundRulesRequest extends DeleteSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.DeleteDecompoundRulesRequest, Relewise.Client";
    public static DeleteDecompoundRulesRequest create(UUID[] ids, String deletedBy)
    {
        return new DeleteDecompoundRulesRequest(ids, deletedBy);
    }
    public DeleteDecompoundRulesRequest(UUID[] ids, String deletedBy)
    {
        this.ids = ids;
        this.deletedBy = deletedBy;
    }
    public DeleteDecompoundRulesRequest()
    {
    }
    @Override
    public DeleteDecompoundRulesRequest setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public DeleteDecompoundRulesRequest addToIds(UUID id)
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
    @Override
    public DeleteDecompoundRulesRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;
        return this;
    }
}
