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
public abstract class DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse extends TimedResponse
{
    public String $type = "";
    public DisplayAdTemplate[] entities;
    public Integer hits;
    public HashMap<DisplayAdTemplateEntityState, Integer> hitsPerState;
    public DisplayAdTemplate[] getEntities()
    {
        return this.entities;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public HashMap<DisplayAdTemplateEntityState, Integer> getHitsPerState()
    {
        return this.hitsPerState;
    }
    public DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse setEntities(DisplayAdTemplate... entities)
    {
        this.entities = entities;
        return this;
    }
    public DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse addToHitsPerState(DisplayAdTemplateEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    public DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse setHitsPerState(HashMap<DisplayAdTemplateEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
