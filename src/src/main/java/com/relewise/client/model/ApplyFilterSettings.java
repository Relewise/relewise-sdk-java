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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ApplyFilterSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplyFilterSettings extends FilterScopeSettings
{
    public String $type = "Relewise.Client.Requests.Filters.Settings.ApplyFilterSettings, Relewise.Client";
    public Boolean apply;
    public static ApplyFilterSettings create(Boolean apply)
    {
        return new ApplyFilterSettings(apply);
    }
    public ApplyFilterSettings(Boolean apply)
    {
        this.apply = apply;
    }
    public ApplyFilterSettings()
    {
    }
    public Boolean getApply()
    {
        return this.apply;
    }
    public ApplyFilterSettings setApply(Boolean apply)
    {
        this.apply = apply;
        return this;
    }
}
