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
    defaultImpl = UserUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserUpdate extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.UserUpdate, Relewise.Client";
    public User user;
    public UserUpdateUpdateKind kind;
    public static UserUpdate create(User user)
    {
        return new UserUpdate(user);
    }
    public UserUpdate(User user)
    {
        this.user = user;
        this.kind = UserUpdateUpdateKind.UpdateAndAppend;
    }
    public static UserUpdate create(User user, UserUpdateUpdateKind updateKind)
    {
        return new UserUpdate(user, updateKind);
    }
    public UserUpdate(User user, UserUpdateUpdateKind updateKind)
    {
        this.user = user;
        this.kind = updateKind;
    }
    public UserUpdate()
    {
    }
    public User getUser()
    {
        return this.user;
    }
    public UserUpdateUpdateKind getKind()
    {
        return this.kind;
    }
    public UserUpdate setUser(User user)
    {
        this.user = user;;
        return this;
    }
    public UserUpdate setKind(UserUpdateUpdateKind kind)
    {
        this.kind = kind;;
        return this;
    }
}
