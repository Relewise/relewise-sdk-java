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
    defaultImpl = UserActivityTriggerResultTriggerResultResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserActivityTriggerResultTriggerResultResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Triggers.TriggerResultResponse`1[[Relewise.Client.Responses.Triggers.Results.UserActivityTriggerResult, Relewise.Client, Version=1.280.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public UserActivityTriggerResult result;
    public static UserActivityTriggerResultTriggerResultResponse create()
    {
        return new UserActivityTriggerResultTriggerResultResponse();
    }
    public UserActivityTriggerResultTriggerResultResponse()
    {
    }
    public UserActivityTriggerResult getResult()
    {
        return this.result;
    }
    public UserActivityTriggerResultTriggerResultResponse setResult(UserActivityTriggerResult result)
    {
        this.result = result;
        return this;
    }
    @Override
    public UserActivityTriggerResultTriggerResultResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
