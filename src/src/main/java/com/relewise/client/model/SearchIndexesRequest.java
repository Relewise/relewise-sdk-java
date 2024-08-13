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
    defaultImpl = SearchIndexesRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchIndexesRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.SearchIndexesRequest, Relewise.Client";
    public static SearchIndexesRequest create()
    {
        return new SearchIndexesRequest();
    }
    public SearchIndexesRequest()
    {
    }
}
