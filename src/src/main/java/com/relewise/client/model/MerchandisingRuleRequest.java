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
    defaultImpl = MerchandisingRuleRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchandisingRuleRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Merchandising.MerchandisingRuleRequest, Relewise.Client";
    public UUID id;
    public @Nullable Short type;
    public static MerchandisingRuleRequest create(UUID id, Short type)
    {
        return new MerchandisingRuleRequest(id, type);
    }
    public MerchandisingRuleRequest(UUID id, Short type)
    {
        this.id = id;
        this.type = type;
    }
    public static MerchandisingRuleRequest create(UUID id)
    {
        return new MerchandisingRuleRequest(id);
    }
    public MerchandisingRuleRequest(UUID id)
    {
        this.id = id;
    }
    public MerchandisingRuleRequest()
    {
    }
    public UUID getId()
    {
        return this.id;
    }
    public @Nullable Short getType()
    {
        return this.type;
    }
    public MerchandisingRuleRequest setId(UUID id)
    {
        this.id = id;
        return this;
    }
    public MerchandisingRuleRequest setType(@Nullable Short type)
    {
        this.type = type;
        return this;
    }
}
