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
    defaultImpl = BatchedTrackingRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchedTrackingRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.BatchedTrackingRequest, Relewise.Client";
    public Trackable[] items;
    public static BatchedTrackingRequest create(Trackable... items)
    {
        return new BatchedTrackingRequest(items);
    }
    public BatchedTrackingRequest(Trackable... items)
    {
        this.items = items;
    }
    public BatchedTrackingRequest()
    {
    }
    public Trackable[] getItems()
    {
        return this.items;
    }
    public BatchedTrackingRequest setItems(Trackable... items)
    {
        this.items = items;
        return this;
    }
    public BatchedTrackingRequest addToItems(Trackable item)
    {
        if (this.items == null)
        {
            this.items = new Trackable[] { item };
        }
        else
        {
            ArrayList<Trackable> existingList = new ArrayList<>(Arrays.asList(this.items));
            existingList.add(item);
            this.items = existingList.toArray(new Trackable[0]);
        }
        return this;
    }
}
