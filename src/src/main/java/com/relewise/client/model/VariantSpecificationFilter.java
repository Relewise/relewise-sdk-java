package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = VariantSpecificationFilter.class)
public class VariantSpecificationFilter extends Filter implements IVariantFilter
{
    public String $type = "Relewise.Client.Requests.Filters.VariantSpecificationFilter, Relewise.Client";
    public String key;
    public Boolean filterOutIfKeyIsNotFound;
    public String equalTo;
    public static VariantSpecificationFilter create(String key, String equalToValue)
    {
        return new VariantSpecificationFilter(key, equalToValue);
    }
    public VariantSpecificationFilter(String key, String equalToValue)
    {
        this.key = key;
        this.key = equalToValue;
        this.filterOutIfKeyIsNotFound = true;
    }
    public static VariantSpecificationFilter create(String key, Boolean filterOutIfKeyIsNotFound)
    {
        return new VariantSpecificationFilter(key, filterOutIfKeyIsNotFound);
    }
    public VariantSpecificationFilter(String key, Boolean filterOutIfKeyIsNotFound)
    {
        this.key = key;
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;
    }
    public VariantSpecificationFilter()
    {
        this.filterOutIfKeyIsNotFound = true;
    }
    public String getKey()
    {
        return this.key;
    }
    public Boolean getFilterOutIfKeyIsNotFound()
    {
        return this.filterOutIfKeyIsNotFound;
    }
    public String getEqualTo()
    {
        return this.equalTo;
    }
    public VariantSpecificationFilter setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public VariantSpecificationFilter setFilterOutIfKeyIsNotFound(Boolean filterOutIfKeyIsNotFound)
    {
        this.filterOutIfKeyIsNotFound = filterOutIfKeyIsNotFound;;
        return this;
    }
    public VariantSpecificationFilter setEqualTo(String equalTo)
    {
        this.equalTo = equalTo;;
        return this;
    }
    @Override
    public VariantSpecificationFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
