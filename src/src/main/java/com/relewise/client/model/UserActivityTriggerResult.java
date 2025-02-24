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
    defaultImpl = UserActivityTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserActivityTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.UserActivityTriggerResult, Relewise.Client";
    public UserResultDetails user;
    public static UserActivityTriggerResult create()
    {
        return new UserActivityTriggerResult();
    }
    public UserActivityTriggerResult()
    {
    }
    public UserResultDetails getUser()
    {
        return this.user;
    }
    public UserActivityTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
}
