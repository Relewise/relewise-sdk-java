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
public class DisplayAdResult
{
    public String displayAdId;
    public @Nullable String name;
    public @Nullable HashMap<String, DataValue> data;
    public @Nullable ClickedByUserInfo clickedByUserInfo;
    public static DisplayAdResult create(String displayAdId)
    {
        return new DisplayAdResult(displayAdId);
    }
    public DisplayAdResult(String displayAdId)
    {
        this.displayAdId = displayAdId;
    }
    public DisplayAdResult()
    {
    }
    public String getDisplayAdId()
    {
        return this.displayAdId;
    }
    public @Nullable String getName()
    {
        return this.name;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public @Nullable ClickedByUserInfo getClickedByUserInfo()
    {
        return this.clickedByUserInfo;
    }
    public DisplayAdResult setDisplayAdId(String displayAdId)
    {
        this.displayAdId = displayAdId;
        return this;
    }
    public DisplayAdResult setName(@Nullable String name)
    {
        this.name = name;
        return this;
    }
    public DisplayAdResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public DisplayAdResult setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public DisplayAdResult setClickedByUserInfo(@Nullable ClickedByUserInfo clickedByUserInfo)
    {
        this.clickedByUserInfo = clickedByUserInfo;
        return this;
    }
}
