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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = TrackCartRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackCartRequest extends TrackingRequest
{
    public String $type = "Relewise.Client.Requests.Tracking.TrackCartRequest, Relewise.Client";
    public Cart cart;
    public static TrackCartRequest create(Cart cart)
    {
        return new TrackCartRequest(cart);
    }
    public TrackCartRequest(Cart cart)
    {
        this.cart = cart;
    }
    public TrackCartRequest()
    {
    }
    public Cart getCart()
    {
        return this.cart;
    }
    public TrackCartRequest setCart(Cart cart)
    {
        this.cart = cart;
        return this;
    }
}
