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
    defaultImpl = SaveMerchandisingRuleRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveMerchandisingRuleRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Merchandising.SaveMerchandisingRuleRequest, Relewise.Client";
    public MerchandisingRule rule;
    public String modifiedBy;
    public static SaveMerchandisingRuleRequest create(MerchandisingRule rule, String modifiedBy)
    {
        return new SaveMerchandisingRuleRequest(rule, modifiedBy);
    }
    public SaveMerchandisingRuleRequest(MerchandisingRule rule, String modifiedBy)
    {
        this.rule = rule;
        this.modifiedBy = modifiedBy;
    }
    public SaveMerchandisingRuleRequest()
    {
    }
    public MerchandisingRule getRule()
    {
        return this.rule;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveMerchandisingRuleRequest setRule(MerchandisingRule rule)
    {
        this.rule = rule;;
        return this;
    }
    public SaveMerchandisingRuleRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
}
