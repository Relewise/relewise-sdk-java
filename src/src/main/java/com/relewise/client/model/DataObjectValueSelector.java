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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataObjectValueSelector
{
    public String key;
    public @Nullable DataObjectFilter filter;
    public @Nullable DataObjectValueSelector childSelector;
    public @Nullable DataObjectValueSelector fallbackSelector;
    public static DataObjectValueSelector create(String key, @Nullable DataObjectFilter filter, DataObjectValueSelector childSelector)
    {
        return new DataObjectValueSelector(key, filter, childSelector);
    }
    public DataObjectValueSelector(String key, @Nullable DataObjectFilter filter, DataObjectValueSelector childSelector)
    {
        this.key = key;
        this.filter = filter;
        this.childSelector = childSelector;
    }
    public DataObjectValueSelector()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    public @Nullable DataObjectFilter getFilter()
    {
        return this.filter;
    }
    public @Nullable DataObjectValueSelector getChildSelector()
    {
        return this.childSelector;
    }
    public @Nullable DataObjectValueSelector getFallbackSelector()
    {
        return this.fallbackSelector;
    }
    public DataObjectValueSelector setKey(String key)
    {
        this.key = key;;
        return this;
    }
    public DataObjectValueSelector setFilter(DataObjectFilter filter)
    {
        this.filter = filter;;
        return this;
    }
    public DataObjectValueSelector setChildSelector(DataObjectValueSelector childSelector)
    {
        this.childSelector = childSelector;;
        return this;
    }
    public DataObjectValueSelector setFallbackSelector(DataObjectValueSelector fallbackSelector)
    {
        this.fallbackSelector = fallbackSelector;;
        return this;
    }
}
