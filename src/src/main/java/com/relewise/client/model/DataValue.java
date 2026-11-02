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
    
/** Only used for receiving monetary data in the requested currency from the server, for example in search and recommendation results. Sending a <code>DataValue</code> of this type from client to server is not supported. Use <code>MultiCurrency</code> with a <code>MultiCurrency</code> value instead, even when supplying only one currency. */
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
