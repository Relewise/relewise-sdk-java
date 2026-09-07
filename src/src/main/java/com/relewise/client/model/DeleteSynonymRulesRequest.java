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
    
/** Deletes one or more synonym rules. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DeleteSynonymRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteSynonymRulesRequest extends DeleteSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.DeleteSynonymRulesRequest, Relewise.Client";
    /**
     * Creates a request that deletes one or more synonym rules.
     * @param ids The identifiers of the rules to delete.
     * @param deletedBy The identity responsible for the deletion.
     */
    public static DeleteSynonymRulesRequest create(UUID[] ids, String deletedBy)
    {
        return new DeleteSynonymRulesRequest(ids, deletedBy);
    }
    /**
     * Creates a request that deletes one or more synonym rules.
     * @param ids The identifiers of the rules to delete.
     * @param deletedBy The identity responsible for the deletion.
     */
    public DeleteSynonymRulesRequest(UUID[] ids, String deletedBy)
    {
        this.ids = ids;
        this.deletedBy = deletedBy;
    }
    public DeleteSynonymRulesRequest()
    {
    }
    @Override
    public DeleteSynonymRulesRequest setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public DeleteSynonymRulesRequest addToIds(UUID id)
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
    public DeleteSynonymRulesRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;
        return this;
    }
}
