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
    @JsonSubTypes.Type(value = DeletePredictionRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeletePredictionRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DeleteRedirectRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeleteRedirectRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DeleteDecompoundRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeleteDecompoundRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DeleteStemmingRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeleteStemmingRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DeleteSearchTermModifierRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeleteSearchTermModifierRulesRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = DeleteSearchResultModifierRulesRequest.class, name = "Relewise.Client.Requests.Search.Rules.DeleteSearchResultModifierRulesRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DeleteSearchRulesRequest extends LicensedRequest
{
    public String $type = "";
    public UUID[] ids;
    public String deletedBy;
    public UUID[] getIds()
    {
        return this.ids;
    }
    public String getDeletedBy()
    {
        return this.deletedBy;
    }
    public DeleteSearchRulesRequest setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public DeleteSearchRulesRequest addToIds(UUID id)
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
    public DeleteSearchRulesRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;
        return this;
    }
}
