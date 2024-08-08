package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = TrackOrderRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackOrderRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackOrderRequest, Relewise.Client";
    public Order order;
    public static TrackOrderRequest create(Order order)
    {
        return new TrackOrderRequest(order);
    }
    public TrackOrderRequest(Order order)
    {
        this.order = order;
    }
    public TrackOrderRequest()
    {
    }
    public Order getOrder()
    {
        return this.order;
    }
    public TrackOrderRequest setOrder(Order order)
    {
        this.order = order;;
        return this;
    }
}
