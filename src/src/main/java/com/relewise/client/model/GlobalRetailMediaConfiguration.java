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
public class GlobalRetailMediaConfiguration
{
    public OffsetDateTime modified;
    public @Nullable String modifiedBy;
    public @Nullable ScoreThresholds thresholds;
    public static GlobalRetailMediaConfiguration create()
    {
        return new GlobalRetailMediaConfiguration();
    }
    public GlobalRetailMediaConfiguration()
    {
    }
    public OffsetDateTime getModified()
    {
        return this.modified;
    }
    public @Nullable String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public @Nullable ScoreThresholds getThresholds()
    {
        return this.thresholds;
    }
    public GlobalRetailMediaConfiguration setModified(OffsetDateTime modified)
    {
        this.modified = modified;
        return this;
    }
    public GlobalRetailMediaConfiguration setModifiedBy(@Nullable String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
    public GlobalRetailMediaConfiguration setThresholds(@Nullable ScoreThresholds thresholds)
    {
        this.thresholds = thresholds;
        return this;
    }
}
