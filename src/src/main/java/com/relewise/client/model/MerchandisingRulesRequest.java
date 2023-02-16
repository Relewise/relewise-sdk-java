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
    defaultImpl = MerchandisingRulesRequest.class)
public class MerchandisingRulesRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Merchandising.MerchandisingRulesRequest, Relewise.Client";
    public @Nullable Short type;
    public static MerchandisingRulesRequest create()
    {
        return new MerchandisingRulesRequest();
    }
    public MerchandisingRulesRequest()
    {
    }
    public @Nullable Short getType()
    {
        return this.type;
    }
    public MerchandisingRulesRequest setType(@Nullable Short type)
    {
        this.type = type;;
        return this;
    }
}
