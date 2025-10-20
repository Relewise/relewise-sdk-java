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
public abstract class DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "";
    public @Nullable String term;
    public @Nullable DisplayAdTemplateEntityState[] states;
    public @Nullable String getTerm()
    {
        return this.term;
    }
    public @Nullable DisplayAdTemplateEntityState[] getStates()
    {
        return this.states;
    }
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesRetailMediaEntityEntityFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    public DisplayAdTemplateEntityStateUUIDDisplayAdTemplateMetadataValuesRetailMediaEntityEntityFilters setStates(DisplayAdTemplateEntityState... states)
    {
        this.states = states;
        return this;
    }
}
