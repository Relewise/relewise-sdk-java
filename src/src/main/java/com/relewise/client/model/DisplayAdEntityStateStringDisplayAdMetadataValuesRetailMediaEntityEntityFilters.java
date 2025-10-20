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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DisplayAdEntityStateStringDisplayAdMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "";
    public @Nullable String term;
    public @Nullable DisplayAdEntityState[] states;
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable DisplayAdEntityState[] getStates()
    {
        return this.states;
    }
    public DisplayAdEntityStateStringDisplayAdMetadataValuesRetailMediaEntityEntityFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    public DisplayAdEntityStateStringDisplayAdMetadataValuesRetailMediaEntityEntityFilters setStates(DisplayAdEntityState... states)
    {
        this.states = states;
        return this;
    }
}
