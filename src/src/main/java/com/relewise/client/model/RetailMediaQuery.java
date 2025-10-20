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
public class RetailMediaQuery
{
    /** Defines the location (f.e. 'Home Page'), placements (f.e. 'main zone' and 'power action') for specific <code>Variation</code> (f.e. 'desktop'). */
    public RetailMediaQueryLocationSelector location;
    public @Nullable RetailMediaQuerySettings settings;
    public static RetailMediaQuery create(RetailMediaQueryLocationSelector location)
    {
        return new RetailMediaQuery(location);
    }
    public RetailMediaQuery(RetailMediaQueryLocationSelector location)
    {
        this.location = location;
    }
    public RetailMediaQuery()
    {
    }
    /** Defines the location (f.e. 'Home Page'), placements (f.e. 'main zone' and 'power action') for specific <code>Variation</code> (f.e. 'desktop'). */
    public RetailMediaQueryLocationSelector getLocation()
    {
        return this.location;
    }
    public @Nullable RetailMediaQuerySettings getSettings()
    {
        return this.settings;
    }
    /** Defines the location (f.e. 'Home Page'), placements (f.e. 'main zone' and 'power action') for specific <code>Variation</code> (f.e. 'desktop'). */
    public RetailMediaQuery setLocation(RetailMediaQueryLocationSelector location)
    {
        this.location = location;
        return this;
    }
    public RetailMediaQuery setSettings(@Nullable RetailMediaQuerySettings settings)
    {
        this.settings = settings;
        return this;
    }
}
