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
public class PurchasedByUserCompanyInfo
{
    public OffsetDateTime mostRecentPurchasedUtc;
    public Long totalNumberOfTimesPurchased;
    public PurchasedByUserCompanyInfo purchasedByParentCompany;
    public static PurchasedByUserCompanyInfo create(OffsetDateTime mostRecentPurchasedUtc, Long totalNumberOfTimesPurchased)
    {
        return new PurchasedByUserCompanyInfo(mostRecentPurchasedUtc, totalNumberOfTimesPurchased);
    }
    public PurchasedByUserCompanyInfo(OffsetDateTime mostRecentPurchasedUtc, Long totalNumberOfTimesPurchased)
    {
        this.mostRecentPurchasedUtc = mostRecentPurchasedUtc;
        this.totalNumberOfTimesPurchased = totalNumberOfTimesPurchased;
    }
    public PurchasedByUserCompanyInfo()
    {
    }
    public OffsetDateTime getMostRecentPurchasedUtc()
    {
        return this.mostRecentPurchasedUtc;
    }
    public Long getTotalNumberOfTimesPurchased()
    {
        return this.totalNumberOfTimesPurchased;
    }
    public PurchasedByUserCompanyInfo getPurchasedByParentCompany()
    {
        return this.purchasedByParentCompany;
    }
    public PurchasedByUserCompanyInfo setMostRecentPurchasedUtc(OffsetDateTime mostRecentPurchasedUtc)
    {
        this.mostRecentPurchasedUtc = mostRecentPurchasedUtc;
        return this;
    }
    public PurchasedByUserCompanyInfo setTotalNumberOfTimesPurchased(Long totalNumberOfTimesPurchased)
    {
        this.totalNumberOfTimesPurchased = totalNumberOfTimesPurchased;
        return this;
    }
    public PurchasedByUserCompanyInfo setPurchasedByParentCompany(PurchasedByUserCompanyInfo purchasedByParentCompany)
    {
        this.purchasedByParentCompany = purchasedByParentCompany;
        return this;
    }
}
