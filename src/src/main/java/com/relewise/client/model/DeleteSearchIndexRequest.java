package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = DeleteSearchIndexRequest.class)
public class DeleteSearchIndexRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.DeleteSearchIndexRequest, Relewise.Client";
    public String id;
    public String deletedBy;
    public static DeleteSearchIndexRequest create(String id, String deletedBy)
    {
        return new DeleteSearchIndexRequest(id, deletedBy);
    }
    public DeleteSearchIndexRequest(String id, String deletedBy)
    {
        this.id = id;
        this.deletedBy = deletedBy;
    }
    public DeleteSearchIndexRequest()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public String getDeletedBy()
    {
        return this.deletedBy;
    }
    public DeleteSearchIndexRequest setId(String id)
    {
        this.id = id;;
        return this;
    }
    public DeleteSearchIndexRequest setDeletedBy(String deletedBy)
    {
        this.deletedBy = deletedBy;;
        return this;
    }
}
