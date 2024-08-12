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
    defaultImpl = ContentCategoryInterestTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryInterestTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ContentCategoryInterestTriggerResult, Relewise.Client";
    public UserResultDetails user;
    public ContentCategoryInterestTriggerResultCategory[] categories;
    public static ContentCategoryInterestTriggerResult create()
    {
        return new ContentCategoryInterestTriggerResult();
    }
    public ContentCategoryInterestTriggerResult()
    {
    }
    public UserResultDetails getUser()
    {
        return this.user;
    }
    public ContentCategoryInterestTriggerResultCategory[] getCategories()
    {
        return this.categories;
    }
    public ContentCategoryInterestTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
    public ContentCategoryInterestTriggerResult setCategories(ContentCategoryInterestTriggerResultCategory... categories)
    {
        this.categories = categories;
        return this;
    }
    public ContentCategoryInterestTriggerResult addToCategories(ContentCategoryInterestTriggerResultCategory category)
    {
        if (this.categories == null)
        {
            this.categories = new ContentCategoryInterestTriggerResultCategory[] { category };
        }
        else
        {
            ArrayList<ContentCategoryInterestTriggerResultCategory> existingList = new ArrayList<>(Arrays.asList(this.categories));
            existingList.add(category);
            this.categories = existingList.toArray(new ContentCategoryInterestTriggerResultCategory[0]);
        }
        return this;
    }
}
