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
    defaultImpl = DeleteMerchandisingRuleRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteMerchandisingRuleRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Merchandising.DeleteMerchandisingRuleRequest, Relewise.Client";
    public UUID id;
    public static DeleteMerchandisingRuleRequest create(UUID id)
    {
        return new DeleteMerchandisingRuleRequest(id);
    }
    public DeleteMerchandisingRuleRequest(UUID id)
    {
        this.id = id;
    }
    public DeleteMerchandisingRuleRequest()
    {
    }
    public UUID getId()
    {
        return this.id;
    }
    public DeleteMerchandisingRuleRequest setId(UUID id)
    {
        this.id = id;;
        return this;
    }
}
