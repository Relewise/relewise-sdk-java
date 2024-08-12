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
    
/** Defines a placement (f.e. 'main zone', or 'power action') to locate promotions for. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaQueryPlacementSelector
{
    public String key;
    public static RetailMediaQueryPlacementSelector create(String key)
    {
        return new RetailMediaQueryPlacementSelector(key);
    }
    public RetailMediaQueryPlacementSelector(String key)
    {
        this.key = key;
    }
    public RetailMediaQueryPlacementSelector()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public RetailMediaQueryPlacementSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
}
