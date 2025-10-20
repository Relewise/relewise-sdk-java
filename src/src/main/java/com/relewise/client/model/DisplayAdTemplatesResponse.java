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
    property = "$type",
    defaultImpl = DisplayAdTemplatesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DisplayAdTemplatesResponse extends DisplayAdTemplateUUIDDisplayAdTemplateEntityStateEntityResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.DisplayAdTemplatesResponse, Relewise.Client";
    public static DisplayAdTemplatesResponse create(DisplayAdTemplate[] displayAdTemplates, Integer hits, HashMap<DisplayAdTemplateEntityState, Integer> hitsPerState)
    {
        return new DisplayAdTemplatesResponse(displayAdTemplates, hits, hitsPerState);
    }
    public DisplayAdTemplatesResponse(DisplayAdTemplate[] displayAdTemplates, Integer hits, HashMap<DisplayAdTemplateEntityState, Integer> hitsPerState)
    {
        this.entities = displayAdTemplates;
        this.hits = hits;
        this.hitsPerState = hitsPerState;
    }
    public DisplayAdTemplatesResponse()
    {
    }
    @Override
    public DisplayAdTemplatesResponse setEntities(DisplayAdTemplate... entities)
    {
        this.entities = entities;
        return this;
    }
    public DisplayAdTemplatesResponse addToEntities(DisplayAdTemplate entity)
    {
        if (this.entities == null)
        {
            this.entities = new DisplayAdTemplate[] { entity };
        }
        else
        {
            ArrayList<DisplayAdTemplate> existingList = new ArrayList<>(Arrays.asList(this.entities));
            existingList.add(entity);
            this.entities = existingList.toArray(new DisplayAdTemplate[0]);
        }
        return this;
    }
    @Override
    public DisplayAdTemplatesResponse setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public DisplayAdTemplatesResponse addToHitsPerState(DisplayAdTemplateEntityState key, Integer value)
    {
        if (this.hitsPerState == null)
        {
            this.hitsPerState = new HashMap<>();
        }
        this.hitsPerState.put(key, value);
        return this;
    }
    @Override
    public DisplayAdTemplatesResponse setHitsPerState(HashMap<DisplayAdTemplateEntityState, Integer> hitsPerState)
    {
        this.hitsPerState = hitsPerState;
        return this;
    }
    @Override
    public DisplayAdTemplatesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
