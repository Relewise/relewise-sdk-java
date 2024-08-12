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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchIndexRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndexRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.SearchIndexRequest, Relewise.Client";
    public String id;
    public static SearchIndexRequest create(String id)
    {
        return new SearchIndexRequest(id);
    }
    public SearchIndexRequest(String id)
    {
        this.id = id;
    }
    public SearchIndexRequest()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public SearchIndexRequest setId(String id)
    {
        this.id = id;
        return this;
    }
}
