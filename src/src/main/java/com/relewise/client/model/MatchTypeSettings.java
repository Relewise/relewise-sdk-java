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
public class MatchTypeSettings
{
    public Boolean compound;
    public Boolean exact;
    public Boolean startsWith;
    public Boolean endsWith;
    public Boolean fuzzy;
    public static MatchTypeSettings create()
    {
        return new MatchTypeSettings();
    }
    public MatchTypeSettings()
    {
    }
    public Boolean getCompound()
    {
        return this.compound;
    }
    public Boolean getExact()
    {
        return this.exact;
    }
    public Boolean getStartsWith()
    {
        return this.startsWith;
    }
    public Boolean getEndsWith()
    {
        return this.endsWith;
    }
    public Boolean getFuzzy()
    {
        return this.fuzzy;
    }
    public MatchTypeSettings setCompound(Boolean compound)
    {
        this.compound = compound;
        return this;
    }
    public MatchTypeSettings setExact(Boolean exact)
    {
        this.exact = exact;
        return this;
    }
    public MatchTypeSettings setStartsWith(Boolean startsWith)
    {
        this.startsWith = startsWith;
        return this;
    }
    public MatchTypeSettings setEndsWith(Boolean endsWith)
    {
        this.endsWith = endsWith;
        return this;
    }
    public MatchTypeSettings setFuzzy(Boolean fuzzy)
    {
        this.fuzzy = fuzzy;
        return this;
    }
}
