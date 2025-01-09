package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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
public class ViewedByUserInfo
{
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
        this.mostRecentlyViewedUtc = mostRecentlyViewedUtc;
        return this;
    }
    public ViewedByUserInfo setTotalNumberOfTimesViewed(Integer totalNumberOfTimesViewed)
    {
        this.totalNumberOfTimesViewed = totalNumberOfTimesViewed;
        return this;
    }
}
