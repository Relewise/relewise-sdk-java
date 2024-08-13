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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataValue
{
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
        this.type = type;
        return this;
    }
    public DataValue setValue(Object value)
    {
        this.value = value;
        return this;
    }
}
