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
    defaultImpl = MerchandisingRuleCollectionResponse.class)
public class MerchandisingRuleCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Merchandising.MerchandisingRuleCollectionResponse, Relewise.Client";
    public MerchandisingRule[] rules;
    public static MerchandisingRuleCollectionResponse create()
    {
        return new MerchandisingRuleCollectionResponse();
    }
    public MerchandisingRuleCollectionResponse()
    {
    }
    public MerchandisingRule[] getRules()
    {
        return this.rules;
    }
    public MerchandisingRuleCollectionResponse setRules(MerchandisingRule... rules)
    {
        this.rules = rules;;
        return this;
    }
    public MerchandisingRuleCollectionResponse addToRules(MerchandisingRule rule)
    {
        if (this.rules == null)
        {
            this.rules = new MerchandisingRule[] { rule };
        }
        else
        {
            ArrayList<MerchandisingRule> existingList = new ArrayList<>(Arrays.asList(this.rules));
            existingList.add(rule);
            this.rules = existingList.toArray(new MerchandisingRule[0]);
        }
        return this;
    }
    @Override
    public MerchandisingRuleCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
