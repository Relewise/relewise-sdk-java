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
    defaultImpl = DeleteStemmingRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteStemmingRulesRequest extends DeleteSearchRulesRequest
{
    public String $type = "Relewise.Client.Requests.Search.Rules.DeleteStemmingRulesRequest, Relewise.Client";
    public static DeleteStemmingRulesRequest create(String deletedBy)
    {
        return new DeleteStemmingRulesRequest(deletedBy);
    }
    public DeleteStemmingRulesRequest(String deletedBy)
    {
        this.deletedBy = deletedBy;
    }
    public DeleteStemmingRulesRequest()
    {
    }
    @Override
    public DeleteStemmingRulesRequest setIds(UUID... ids)
    {
        this.ids = ids;;
        return this;
    }
    public DeleteStemmingRulesRequest addToIds(UUID id)
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
    public DeleteStemmingRulesRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;;
        return this;
    }
}
