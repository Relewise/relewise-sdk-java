package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentResultDetails
{
    public String contentId;
    public Multilingual displayName;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public CategoryPathResultDetails[] categoryPaths;
    public ViewedByUserInfo viewedByUser;
    public OffsetDateTime createdUtc;
    public @Nullable OffsetDateTime lastViewedUtc;
    public Long viewedTotalNumberOfTimes;
    public Integer viewedByDifferentNumberOfUsers;
    public Boolean disabled;
    public Boolean deleted;
    /** Contains engagement signals (sentiment and favorite state) recorded for the current user on this content item. Populated only when the request sets <code>UserEngagement</code> to <code>true</code>. */
    public @Nullable ContentEngagementData userEngagement;
    public static ContentResultDetails create(String contentId)
    {
        return new ContentResultDetails(contentId);
    }
    public ContentResultDetails(String contentId)
    {
        this.contentId = contentId;
    }
    public ContentResultDetails()
    {
    }
    public String getContentId()
    {
        return this.contentId;
    }
    public Multilingual getDisplayName()
    {
        return this.displayName;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public CategoryPathResultDetails[] getCategoryPaths()
    {
        return this.categoryPaths;
    }
    public ViewedByUserInfo getViewedByUser()
    {
        return this.viewedByUser;
    }
    public OffsetDateTime getCreatedUtc()
    {
        return this.createdUtc;
    }
    public @Nullable OffsetDateTime getLastViewedUtc()
    {
        return this.lastViewedUtc;
    }
    public Long getViewedTotalNumberOfTimes()
    {
        return this.viewedTotalNumberOfTimes;
    }
    public Integer getViewedByDifferentNumberOfUsers()
    {
        return this.viewedByDifferentNumberOfUsers;
    }
    public Boolean getDisabled()
    {
        return this.disabled;
    }
    public Boolean getDeleted()
    {
        return this.deleted;
    }
    /** Contains engagement signals (sentiment and favorite state) recorded for the current user on this content item. Populated only when the request sets <code>UserEngagement</code> to <code>true</code>. */
    public @Nullable ContentEngagementData getUserEngagement()
    {
        return this.userEngagement;
    }
    public ContentResultDetails setContentId(String contentId)
    {
        this.contentId = contentId;
        return this;
    }
    public ContentResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public ContentResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;
        return this;
    }
    public ContentResultDetails addToAssortments(Integer assortment)
    {
        if (this.assortments == null)
        {
            this.assortments = new Integer[] { assortment };
        }
        else
        {
            ArrayList<Integer> existingList = new ArrayList<>(Arrays.asList(this.assortments));
            existingList.add(assortment);
            this.assortments = existingList.toArray(new Integer[0]);
        }
        return this;
    }
    public ContentResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public ContentResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public ContentResultDetails setCategoryPaths(CategoryPathResultDetails... categoryPaths)
    {
        this.categoryPaths = categoryPaths;
        return this;
    }
    public ContentResultDetails addToCategoryPaths(CategoryPathResultDetails categoryPath)
    {
        if (this.categoryPaths == null)
        {
            this.categoryPaths = new CategoryPathResultDetails[] { categoryPath };
        }
        else
        {
            ArrayList<CategoryPathResultDetails> existingList = new ArrayList<>(Arrays.asList(this.categoryPaths));
            existingList.add(categoryPath);
            this.categoryPaths = existingList.toArray(new CategoryPathResultDetails[0]);
        }
        return this;
    }
    public ContentResultDetails setViewedByUser(ViewedByUserInfo viewedByUser)
    {
        this.viewedByUser = viewedByUser;
        return this;
    }
    public ContentResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;
        return this;
    }
    public ContentResultDetails setLastViewedUtc(@Nullable OffsetDateTime lastViewedUtc)
    {
        this.lastViewedUtc = lastViewedUtc;
        return this;
    }
    public ContentResultDetails setViewedTotalNumberOfTimes(Long viewedTotalNumberOfTimes)
    {
        this.viewedTotalNumberOfTimes = viewedTotalNumberOfTimes;
        return this;
    }
    public ContentResultDetails setViewedByDifferentNumberOfUsers(Integer viewedByDifferentNumberOfUsers)
    {
        this.viewedByDifferentNumberOfUsers = viewedByDifferentNumberOfUsers;
        return this;
    }
    public ContentResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }
    public ContentResultDetails setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
        return this;
    }
    /** Contains engagement signals (sentiment and favorite state) recorded for the current user on this content item. Populated only when the request sets <code>UserEngagement</code> to <code>true</code>. */
    public ContentResultDetails setUserEngagement(@Nullable ContentEngagementData userEngagement)
    {
        this.userEngagement = userEngagement;
        return this;
    }
}
