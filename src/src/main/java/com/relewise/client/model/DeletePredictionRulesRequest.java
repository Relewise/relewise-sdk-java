package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = DeletePredictionRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeletePredictionRulesRequest extends DeleteSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.DeletePredictionRulesRequest, Relewise.Client";
    public static DeletePredictionRulesRequest create(UUID[] ids, String deletedBy)
    {
        return new DeletePredictionRulesRequest(ids, deletedBy);
    }
    public DeletePredictionRulesRequest(UUID[] ids, String deletedBy)
    {
        this.ids = ids;
        this.deletedBy = deletedBy;
    }
    public DeletePredictionRulesRequest()
    {
    }
    @Override
    public DeletePredictionRulesRequest setIds(UUID... ids)
    {
        this.ids = ids;;
        return this;
    }
    public DeletePredictionRulesRequest addToIds(UUID id)
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
    public DeletePredictionRulesRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;;
        return this;
    }
}
