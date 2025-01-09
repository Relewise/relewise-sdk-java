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
    defaultImpl = MerchandisingRulesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchandisingRulesRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Merchandising.MerchandisingRulesRequest, Relewise.Client";
    public @Nullable Short type;
    public static MerchandisingRulesRequest create(Short type)
    {
        return new MerchandisingRulesRequest(type);
    }
    public MerchandisingRulesRequest(Short type)
    {
        this.type = type;
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
        this.type = type;
        return this;
    }
}
