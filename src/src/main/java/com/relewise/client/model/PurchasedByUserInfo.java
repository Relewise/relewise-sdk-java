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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchasedByUserInfo
{
    public OffsetDateTime mostRecentPurchasedUtc;
    public Long totalNumberOfTimesPurchased;
    public static PurchasedByUserInfo create(OffsetDateTime mostRecentPurchasedUtc, Long totalNumberOfTimesPurchased)
    {
        return new PurchasedByUserInfo(mostRecentPurchasedUtc, totalNumberOfTimesPurchased);
    }
    public PurchasedByUserInfo(OffsetDateTime mostRecentPurchasedUtc, Long totalNumberOfTimesPurchased)
    {
        this.mostRecentPurchasedUtc = mostRecentPurchasedUtc;
        this.totalNumberOfTimesPurchased = totalNumberOfTimesPurchased;
    }
    public PurchasedByUserInfo()
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
    public PurchasedByUserInfo setMostRecentPurchasedUtc(OffsetDateTime mostRecentPurchasedUtc)
    {
        this.mostRecentPurchasedUtc = mostRecentPurchasedUtc;;
        return this;
    }
    public PurchasedByUserInfo setTotalNumberOfTimesPurchased(Long totalNumberOfTimesPurchased)
    {
        this.totalNumberOfTimesPurchased = totalNumberOfTimesPurchased;;
        return this;
    }
}
