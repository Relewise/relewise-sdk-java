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
    defaultImpl = ContentIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentIdFilter extends Filter implements IContentFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ContentIdFilter, Relewise.Client";
    public ArrayList<String> contentIds;
    public static ContentIdFilter create()
    {
        return new ContentIdFilter();
    }
    public ContentIdFilter()
    {
        this.negated = false;
    }
    public static ContentIdFilter create(Boolean negated)
    {
        return new ContentIdFilter(negated);
    }
    public ContentIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getContentIds()
    {
        return this.contentIds;
    }
    public ContentIdFilter setContentIds(String... contentIds)
    {
        this.contentIds = new ArrayList<>(Arrays.asList(contentIds));;
        return this;
    }
    public ContentIdFilter addToContentIds(String contentIds)
    {
        if (this.contentIds == null)
        {
            this.contentIds = new ArrayList<>();
        }
        this.contentIds.add(contentIds);
        return this;
    }
    @Override
    public ContentIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
