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
    defaultImpl = SaveDisplayAdTemplatesResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDisplayAdTemplatesResponse extends DisplayAdTemplateUUIDSaveEntitiesResponse
{
    public String $type = "Relewise.Client.Responses.RetailMedia.SaveDisplayAdTemplatesResponse, Relewise.Client";
    public static SaveDisplayAdTemplatesResponse create(DisplayAdTemplate... displayAdTemplates)
    {
        return new SaveDisplayAdTemplatesResponse(displayAdTemplates);
    }
    public SaveDisplayAdTemplatesResponse(DisplayAdTemplate... displayAdTemplates)
    {
        this.entities = displayAdTemplates;
    }
    public SaveDisplayAdTemplatesResponse()
    {
    }
    @Override
    public SaveDisplayAdTemplatesResponse setEntities(DisplayAdTemplate... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveDisplayAdTemplatesResponse addToEntities(DisplayAdTemplate entity)
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
    public SaveDisplayAdTemplatesResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
