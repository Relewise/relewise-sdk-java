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
    defaultImpl = UserConditionConfiguration.class)
public class UserConditionConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.Configurations.UserConditionConfiguration, Relewise.Client";
    public UserConditionCollection conditions;
    public static UserConditionConfiguration create()
    {
        return new UserConditionConfiguration();
    }
    public UserConditionConfiguration()
    {
    }
    public UserConditionCollection getConditions()
    {
        return this.conditions;
    }
    public UserConditionConfiguration setConditions(UserConditionCollection conditions)
    {
        this.conditions = conditions;;
        return this;
    }
}
