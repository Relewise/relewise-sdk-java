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
    defaultImpl = ContentDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.ContentDetailsCollectionResponse, Relewise.Client";
    public ContentResultDetails[] contents;
    public @Nullable Integer totalNumberOfResults;
    public static ContentDetailsCollectionResponse create(ContentResultDetails[] contents, @Nullable Integer totalNumberOfResults)
    {
        return new ContentDetailsCollectionResponse(contents, totalNumberOfResults);
    }
    public ContentDetailsCollectionResponse(ContentResultDetails[] contents, @Nullable Integer totalNumberOfResults)
    {
        this.contents = contents;
        this.totalNumberOfResults = totalNumberOfResults;
    }
    public ContentDetailsCollectionResponse()
    {
    }
    public ContentResultDetails[] getContents()
    {
        return this.contents;
    }
    public @Nullable Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    public ContentDetailsCollectionResponse setContents(ContentResultDetails... contents)
    {
        this.contents = contents;;
        return this;
    }
    public ContentDetailsCollectionResponse addToContents(ContentResultDetails content)
    {
        if (this.contents == null)
        {
            this.contents = new ContentResultDetails[] { content };
        }
        else
        {
            ArrayList<ContentResultDetails> existingList = new ArrayList<>(Arrays.asList(this.contents));
            existingList.add(content);
            this.contents = existingList.toArray(new ContentResultDetails[0]);
        }
        return this;
    }
    public ContentDetailsCollectionResponse setTotalNumberOfResults(@Nullable Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;;
        return this;
    }
    @Override
    public ContentDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
