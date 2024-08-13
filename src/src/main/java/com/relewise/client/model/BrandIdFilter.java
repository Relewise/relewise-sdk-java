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
    defaultImpl = BrandIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandIdFilter extends Filter implements IProductFilter, IBrandFilter
{
    public String $type = "Relewise.Client.Requests.Filters.BrandIdFilter, Relewise.Client";
    public ArrayList<String> brandIds;
    public static BrandIdFilter create()
    {
        return new BrandIdFilter();
    }
    public BrandIdFilter()
    {
        this.negated = false;
    }
    public static BrandIdFilter create(Boolean negated)
    {
        return new BrandIdFilter(negated);
    }
    public BrandIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getBrandIds()
    {
        return this.brandIds;
    }
    public BrandIdFilter setBrandIds(String... brandIds)
    {
        this.brandIds = new ArrayList<>(Arrays.asList(brandIds));;
        return this;
    }
    public BrandIdFilter addToBrandIds(String brandIds)
    {
        if (this.brandIds == null)
        {
            this.brandIds = new ArrayList<>();
        }
        this.brandIds.add(brandIds);
        return this;
    }
    @Override
    public BrandIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
