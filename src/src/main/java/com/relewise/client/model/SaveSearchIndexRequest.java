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
    defaultImpl = SaveSearchIndexRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSearchIndexRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.SaveSearchIndexRequest, Relewise.Client";
    public SearchIndex index;
    public String modifiedBy;
    public static SaveSearchIndexRequest create(SearchIndex index, String modifiedBy)
    {
        return new SaveSearchIndexRequest(index, modifiedBy);
    }
    public SaveSearchIndexRequest(SearchIndex index, String modifiedBy)
    {
        this.index = index;
        this.modifiedBy = modifiedBy;
    }
    public SaveSearchIndexRequest()
    {
    }
    public SearchIndex getIndex()
    {
        return this.index;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveSearchIndexRequest setIndex(SearchIndex index)
    {
        this.index = index;
        return this;
    }
    public SaveSearchIndexRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
