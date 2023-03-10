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
    defaultImpl = ViewedByUserInfo.class)
public class ViewedByUserInfo
{
    public String $type = "Relewise.Client.DataTypes.ViewedByUserInfo, Relewise.Client";
    public OffsetDateTime mostRecentlyViewedUtc;
    public Integer totalNumberOfTimesViewed;
    public static ViewedByUserInfo create(OffsetDateTime mostRecentlyViewedUtc, Integer totalNumberOfTimesViewed)
    {
        return new ViewedByUserInfo(mostRecentlyViewedUtc, totalNumberOfTimesViewed);
    }
    public ViewedByUserInfo(OffsetDateTime mostRecentlyViewedUtc, Integer totalNumberOfTimesViewed)
    {
        this.mostRecentlyViewedUtc = mostRecentlyViewedUtc;
        this.totalNumberOfTimesViewed = totalNumberOfTimesViewed;
    }
    public ViewedByUserInfo()
    {
    }
    public OffsetDateTime getMostRecentlyViewedUtc()
    {
        return this.mostRecentlyViewedUtc;
    }
    public Integer getTotalNumberOfTimesViewed()
    {
        return this.totalNumberOfTimesViewed;
    }
    public ViewedByUserInfo setMostRecentlyViewedUtc(OffsetDateTime mostRecentlyViewedUtc)
    {
        this.mostRecentlyViewedUtc = mostRecentlyViewedUtc;;
        return this;
    }
    public ViewedByUserInfo setTotalNumberOfTimesViewed(Integer totalNumberOfTimesViewed)
    {
        this.totalNumberOfTimesViewed = totalNumberOfTimesViewed;;
        return this;
    }
}
