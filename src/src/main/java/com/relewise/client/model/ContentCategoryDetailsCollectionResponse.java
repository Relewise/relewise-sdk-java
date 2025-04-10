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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentCategoryDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ContentCategoryDetailsCollectionResponse, Relewise.Client";
    public ContentCategoryResultDetails[] categories;
    public @Nullable Integer totalNumberOfResults;
    public static ContentCategoryDetailsCollectionResponse create(ContentCategoryResultDetails[] categories, @Nullable Integer totalNumberOfResults)
    {
        return new ContentCategoryDetailsCollectionResponse(categories, totalNumberOfResults);
    }
    public ContentCategoryDetailsCollectionResponse(ContentCategoryResultDetails[] categories, @Nullable Integer totalNumberOfResults)
    {
        this.categories = categories;
        this.totalNumberOfResults = totalNumberOfResults;
    }
    public ContentCategoryDetailsCollectionResponse()
    {
    }
    public ContentCategoryResultDetails[] getCategories()
    {
        return this.categories;
    }
    public @Nullable Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    public ContentCategoryDetailsCollectionResponse setCategories(ContentCategoryResultDetails... categories)
    {
        this.categories = categories;
        return this;
    }
    public ContentCategoryDetailsCollectionResponse addToCategories(ContentCategoryResultDetails category)
    {
        if (this.categories == null)
        {
            this.categories = new ContentCategoryResultDetails[] { category };
        }
        else
        {
            ArrayList<ContentCategoryResultDetails> existingList = new ArrayList<>(Arrays.asList(this.categories));
            existingList.add(category);
            this.categories = existingList.toArray(new ContentCategoryResultDetails[0]);
        }
        return this;
    }
    public ContentCategoryDetailsCollectionResponse setTotalNumberOfResults(@Nullable Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;
        return this;
    }
    @Override
    public ContentCategoryDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
