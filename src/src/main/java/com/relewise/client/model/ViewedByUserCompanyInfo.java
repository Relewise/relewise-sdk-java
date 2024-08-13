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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewedByUserCompanyInfo
{
    public OffsetDateTime mostRecentlyViewedUtc;
    public Long totalNumberOfTimesViewed;
    public ViewedByUserCompanyInfo viewedByParentCompany;
    public static ViewedByUserCompanyInfo create(OffsetDateTime mostRecentlyViewedUtc, Long totalNumberOfTimesViewed)
    {
        return new ViewedByUserCompanyInfo(mostRecentlyViewedUtc, totalNumberOfTimesViewed);
    }
    public ViewedByUserCompanyInfo(OffsetDateTime mostRecentlyViewedUtc, Long totalNumberOfTimesViewed)
    {
        this.mostRecentlyViewedUtc = mostRecentlyViewedUtc;
        this.totalNumberOfTimesViewed = totalNumberOfTimesViewed;
    }
    public ViewedByUserCompanyInfo()
    {
    }
    public OffsetDateTime getMostRecentlyViewedUtc()
    {
        return this.mostRecentlyViewedUtc;
    }
    public Long getTotalNumberOfTimesViewed()
    {
        return this.totalNumberOfTimesViewed;
    }
    public ViewedByUserCompanyInfo getViewedByParentCompany()
    {
        return this.viewedByParentCompany;
    }
    public ViewedByUserCompanyInfo setMostRecentlyViewedUtc(OffsetDateTime mostRecentlyViewedUtc)
    {
        this.mostRecentlyViewedUtc = mostRecentlyViewedUtc;
        return this;
    }
    public ViewedByUserCompanyInfo setTotalNumberOfTimesViewed(Long totalNumberOfTimesViewed)
    {
        this.totalNumberOfTimesViewed = totalNumberOfTimesViewed;
        return this;
    }
    public ViewedByUserCompanyInfo setViewedByParentCompany(ViewedByUserCompanyInfo viewedByParentCompany)
    {
        this.viewedByParentCompany = viewedByParentCompany;
        return this;
    }
}
