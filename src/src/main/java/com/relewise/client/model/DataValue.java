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
    defaultImpl = DataValue.class)
public class DataValue
{
    public String $type = "Relewise.Client.DataTypes.DataValue, Relewise.Client";
    public DataValueDataValueTypes type;
    public Object value;
    public static DataValue create()
    {
        return new DataValue();
    }
    public DataValue()
    {
    }
    public DataValueDataValueTypes getType()
    {
        return this.type;
    }
    public Object getValue()
    {
        return this.value;
    }
    public DataValue setType(DataValueDataValueTypes type)
    {
        this.type = type;;
        return this;
    }
    public DataValue setValue(Object value)
    {
        this.value = value;;
        return this;
    }
}
