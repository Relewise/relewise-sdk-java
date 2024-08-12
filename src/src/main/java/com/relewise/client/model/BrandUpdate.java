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
    defaultImpl = BrandUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandUpdate extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.BrandUpdate, Relewise.Client";
    public Brand brand;
    public BrandUpdateUpdateKind kind;
    public static BrandUpdate create(Brand brand)
    {
        return new BrandUpdate(brand);
    }
    public BrandUpdate(Brand brand)
    {
        this.brand = brand;
        this.kind = BrandUpdateUpdateKind.UpdateAndAppend;
    }
    public static BrandUpdate create(Brand brand, BrandUpdateUpdateKind kind)
    {
        return new BrandUpdate(brand, kind);
    }
    public BrandUpdate(Brand brand, BrandUpdateUpdateKind kind)
    {
        this.brand = brand;
        this.kind = kind;
    }
    public BrandUpdate()
    {
        this.kind = BrandUpdateUpdateKind.UpdateAndAppend;
    }
    public Brand getBrand()
    {
        return this.brand;
    }
    public BrandUpdateUpdateKind getKind()
    {
        return this.kind;
    }
    public BrandUpdate setBrand(Brand brand)
    {
        this.brand = brand;
        return this;
    }
    public BrandUpdate setKind(BrandUpdateUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
}
