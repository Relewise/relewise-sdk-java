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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductPromotion.class, name = "Relewise.Client.DataTypes.RetailMedia.ProductPromotion, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Promotion
{
    public String $type = "";
    public String name;
    public @Nullable PromotionLocationCollection locations;
    public String getName()
    {
        return this.name;
    }
    public @Nullable PromotionLocationCollection getLocations()
    {
        return this.locations;
    }
    public Promotion setName(String name)
    {
        this.name = name;
        return this;
    }
    public Promotion setLocations(@Nullable PromotionLocationCollection locations)
    {
        this.locations = locations;
        return this;
    }
}
