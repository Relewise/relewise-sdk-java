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
    defaultImpl = TrackSearchTermRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackSearchTermRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackSearchTermRequest, Relewise.Client";
    public SearchTerm searchTerm;
    public static TrackSearchTermRequest create(SearchTerm searchTerm)
    {
        return new TrackSearchTermRequest(searchTerm);
    }
    public TrackSearchTermRequest(SearchTerm searchTerm)
    {
        this.searchTerm = searchTerm;
    }
    public TrackSearchTermRequest()
    {
    }
    public SearchTerm getSearchTerm()
    {
        return this.searchTerm;
    }
    public TrackSearchTermRequest setSearchTerm(SearchTerm searchTerm)
    {
        this.searchTerm = searchTerm;
        return this;
    }
}
