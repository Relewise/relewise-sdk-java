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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = BrandDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.BrandDetailsCollectionResponse, Relewise.Client";
    public BrandResultDetails[] brands;
    public @Nullable Integer totalNumberOfResults;
    public static BrandDetailsCollectionResponse create(BrandResultDetails[] brands, @Nullable Integer totalNumberOfResults)
    {
        return new BrandDetailsCollectionResponse(brands, totalNumberOfResults);
    }
    public BrandDetailsCollectionResponse(BrandResultDetails[] brands, @Nullable Integer totalNumberOfResults)
    {
        this.brands = brands;
        this.totalNumberOfResults = totalNumberOfResults;
    }
    public BrandDetailsCollectionResponse()
    {
    }
    public BrandResultDetails[] getBrands()
    {
        return this.brands;
    }
    public @Nullable Integer getTotalNumberOfResults()
    {
        return this.totalNumberOfResults;
    }
    public BrandDetailsCollectionResponse setBrands(BrandResultDetails... brands)
    {
        this.brands = brands;
        return this;
    }
    public BrandDetailsCollectionResponse addToBrands(BrandResultDetails brand)
    {
        if (this.brands == null)
        {
            this.brands = new BrandResultDetails[] { brand };
        }
        else
        {
            ArrayList<BrandResultDetails> existingList = new ArrayList<>(Arrays.asList(this.brands));
            existingList.add(brand);
            this.brands = existingList.toArray(new BrandResultDetails[0]);
        }
        return this;
    }
    public BrandDetailsCollectionResponse setTotalNumberOfResults(@Nullable Integer totalNumberOfResults)
    {
        this.totalNumberOfResults = totalNumberOfResults;
        return this;
    }
    @Override
    public BrandDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
