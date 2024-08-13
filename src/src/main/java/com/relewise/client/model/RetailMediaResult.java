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
public class RetailMediaResult
{
    public @Nullable HashMap<String, RetailMediaResultPlacement> placements;
    public static RetailMediaResult create()
    {
        return new RetailMediaResult();
    }
    public RetailMediaResult()
    {
    }
    public @Nullable HashMap<String, RetailMediaResultPlacement> getPlacements()
    {
        return this.placements;
    }
    public RetailMediaResult addToPlacements(String key, RetailMediaResultPlacement value)
    {
        if (this.placements == null)
        {
            this.placements = new HashMap<>();
        }
        this.placements.put(key, value);
        return this;
    }
    public RetailMediaResult setPlacements(@Nullable HashMap<String, RetailMediaResultPlacement> placements)
    {
        this.placements = placements;
        return this;
    }
}
