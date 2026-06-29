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
public class SemanticIndexInfo
{
    public SemanticIndexBuildStatus status;
    public Duration lastBuildDuration;
    public static SemanticIndexInfo create()
    {
        return new SemanticIndexInfo();
    }
    public SemanticIndexInfo()
    {
    }
    public SemanticIndexBuildStatus getStatus()
    {
        return this.status;
    }
    public Duration getLastBuildDuration()
    {
        return this.lastBuildDuration;
    }
    public SemanticIndexInfo setStatus(SemanticIndexBuildStatus status)
    {
        this.status = status;
        return this;
    }
    public SemanticIndexInfo setLastBuildDuration(Duration lastBuildDuration)
    {
        this.lastBuildDuration = lastBuildDuration;
        return this;
    }
}
