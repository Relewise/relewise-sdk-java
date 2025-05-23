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
    
/** The variation to retrieve the retail media content for, e.g. "Desktop", "Mobile", "Tablet" etc. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaQueryVariationSelector
{
    public String key;
    public static RetailMediaQueryVariationSelector create(String key)
    {
        return new RetailMediaQueryVariationSelector(key);
    }
    public RetailMediaQueryVariationSelector(String key)
    {
        this.key = key;
    }
    public RetailMediaQueryVariationSelector()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public RetailMediaQueryVariationSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
}
