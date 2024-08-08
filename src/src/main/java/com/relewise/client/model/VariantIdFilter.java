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
    defaultImpl = VariantIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantIdFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantIdFilter, Relewise.Client";
    public ArrayList<String> variantIds;
    public static VariantIdFilter create()
    {
        return new VariantIdFilter();
    }
    public VariantIdFilter()
    {
        this.negated = false;
    }
    public static VariantIdFilter create(Boolean negated)
    {
        return new VariantIdFilter(negated);
    }
    public VariantIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getVariantIds()
    {
        return this.variantIds;
    }
    public VariantIdFilter setVariantIds(String... variantIds)
    {
        this.variantIds = new ArrayList<>(Arrays.asList(variantIds));;
        return this;
    }
    public VariantIdFilter addToVariantIds(String variantIds)
    {
        if (this.variantIds == null)
        {
            this.variantIds = new ArrayList<>();
        }
        this.variantIds.add(variantIds);
        return this;
    }
    @Override
    public VariantIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
