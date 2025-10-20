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
    defaultImpl = SaveDisplayAdTemplatesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveDisplayAdTemplatesRequest extends DisplayAdTemplateUUIDSaveEntitiesRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveDisplayAdTemplatesRequest, Relewise.Client";
    public static SaveDisplayAdTemplatesRequest create(DisplayAdTemplate[] displayAdTemplate, String modifiedBy)
    {
        return new SaveDisplayAdTemplatesRequest(displayAdTemplate, modifiedBy);
    }
    public SaveDisplayAdTemplatesRequest(DisplayAdTemplate[] displayAdTemplate, String modifiedBy)
    {
        this.entities = displayAdTemplate;
        this.modifiedBy = modifiedBy;
    }
    public SaveDisplayAdTemplatesRequest()
    {
    }
    @Override
    public SaveDisplayAdTemplatesRequest setEntities(DisplayAdTemplate... entities)
    {
        this.entities = entities;
        return this;
    }
    public SaveDisplayAdTemplatesRequest addToEntities(DisplayAdTemplate entity)
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
    public SaveDisplayAdTemplatesRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
