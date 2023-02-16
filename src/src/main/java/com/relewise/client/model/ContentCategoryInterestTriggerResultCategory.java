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
    defaultImpl = ContentCategoryInterestTriggerResultCategory.class)
public class ContentCategoryInterestTriggerResultCategory
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ContentCategoryInterestTriggerResult+Category, Relewise.Client";
    public String[] lastPath;
    public Integer views;
    public ContentResultDetails[] viewedContents;
    public static ContentCategoryInterestTriggerResultCategory create()
    {
        return new ContentCategoryInterestTriggerResultCategory();
    }
    public ContentCategoryInterestTriggerResultCategory()
    {
    }
    public String[] getLastPath()
    {
        return this.lastPath;
    }
    public Integer getViews()
    {
        return this.views;
    }
    public ContentResultDetails[] getViewedContents()
    {
        return this.viewedContents;
    }
    public ContentCategoryInterestTriggerResultCategory setLastPath(String... lastPath)
    {
        this.lastPath = lastPath;;
        return this;
    }
    public ContentCategoryInterestTriggerResultCategory addToLastPath(String lastPath)
    {
        if (this.lastPath == null)
        {
            this.lastPath = new String[] { lastPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.lastPath));
            existingList.add(lastPath);
            this.lastPath = existingList.toArray(new String[0]);
        }
        return this;
    }
    public ContentCategoryInterestTriggerResultCategory setViews(Integer views)
    {
        this.views = views;;
        return this;
    }
    public ContentCategoryInterestTriggerResultCategory setViewedContents(ContentResultDetails... viewedContents)
    {
        this.viewedContents = viewedContents;;
        return this;
    }
    public ContentCategoryInterestTriggerResultCategory addToViewedContents(ContentResultDetails viewedContent)
    {
        if (this.viewedContents == null)
        {
            this.viewedContents = new ContentResultDetails[] { viewedContent };
        }
        else
        {
            ArrayList<ContentResultDetails> existingList = new ArrayList<>(Arrays.asList(this.viewedContents));
            existingList.add(viewedContent);
            this.viewedContents = existingList.toArray(new ContentResultDetails[0]);
        }
        return this;
    }
}
