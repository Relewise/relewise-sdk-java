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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObject
{
    public HashMap<String, DataValue> data;
    public static DataObject create(HashMap<String, DataValue> data)
    {
        return new DataObject(data);
    }
    public DataObject(HashMap<String, DataValue> data)
    {
        this.data = data;
    }
    public DataObject()
    {
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public DataObject addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public DataObject setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
}
