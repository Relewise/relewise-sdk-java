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
    defaultImpl = TrackUserUpdateRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackUserUpdateRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackUserUpdateRequest, Relewise.Client";
    public UserUpdate userUpdate;
    public static TrackUserUpdateRequest create(UserUpdate userUpdate)
    {
        return new TrackUserUpdateRequest(userUpdate);
    }
    public TrackUserUpdateRequest(UserUpdate userUpdate)
    {
        this.userUpdate = userUpdate;
    }
    public TrackUserUpdateRequest()
    {
    }
    public UserUpdate getUserUpdate()
    {
        return this.userUpdate;
    }
    public TrackUserUpdateRequest setUserUpdate(UserUpdate userUpdate)
    {
        this.userUpdate = userUpdate;
        return this;
    }
}
