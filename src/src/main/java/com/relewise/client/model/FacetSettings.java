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
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetSettings
{
    public Boolean alwaysIncludeSelectedInAvailable;
    public Boolean includeZeroHitsInAvailable;
    public static FacetSettings create()
    {
        return new FacetSettings();
    }
    public FacetSettings()
    {
    }
    public Boolean getAlwaysIncludeSelectedInAvailable()
    {
        return this.alwaysIncludeSelectedInAvailable;
    }
    public Boolean getIncludeZeroHitsInAvailable()
    {
        return this.includeZeroHitsInAvailable;
    }
    public FacetSettings setAlwaysIncludeSelectedInAvailable(Boolean alwaysIncludeSelectedInAvailable)
    {
        this.alwaysIncludeSelectedInAvailable = alwaysIncludeSelectedInAvailable;
        return this;
    }
    public FacetSettings setIncludeZeroHitsInAvailable(Boolean includeZeroHitsInAvailable)
    {
        this.includeZeroHitsInAvailable = includeZeroHitsInAvailable;
        return this;
    }
}
