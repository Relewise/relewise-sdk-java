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
    defaultImpl = BrandView.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.BrandView, Relewise.Client";
    public @Nullable User user;
    public Brand brand;
    public static BrandView create(@Nullable User user, Brand brand)
    {
        return new BrandView(user, brand);
    }
    public BrandView(@Nullable User user, Brand brand)
    {
        this.user = user;
        this.brand = brand;
    }
    public BrandView()
    {
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public Brand getBrand()
    {
        return this.brand;
    }
    public BrandView setUser(User user)
    {
        this.user = user;
        return this;
    }
    public BrandView setBrand(Brand brand)
    {
        this.brand = brand;
        return this;
    }
}
