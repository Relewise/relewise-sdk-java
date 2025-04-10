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
    property = "$type",
    defaultImpl = MerchandisingRuleResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MerchandisingRuleResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Merchandising.MerchandisingRuleResponse, Relewise.Client";
    public MerchandisingRule rule;
    public static MerchandisingRuleResponse create()
    {
        return new MerchandisingRuleResponse();
    }
    public MerchandisingRuleResponse()
    {
    }
    public MerchandisingRule getRule()
    {
        return this.rule;
    }
    public MerchandisingRuleResponse setRule(MerchandisingRule rule)
    {
        this.rule = rule;
        return this;
    }
    @Override
    public MerchandisingRuleResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
