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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = AbandonedProductSearch.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbandonedProductSearch extends ProductAndVariantIdAbandonedSearch
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.AbandonedProductSearch, Relewise.Client";
    public static AbandonedProductSearch create()
    {
        return new AbandonedProductSearch();
    }
    public AbandonedProductSearch()
    {
    }
    @Override
    public AbandonedProductSearch setTopResults(ProductAndVariantId... topResults)
    {
        this.topResults = topResults;
        return this;
    }
    public AbandonedProductSearch addToTopResults(ProductAndVariantId topResult)
    {
        if (this.topResults == null)
        {
            this.topResults = new ProductAndVariantId[] { topResult };
        }
        else
        {
            ArrayList<ProductAndVariantId> existingList = new ArrayList<>(Arrays.asList(this.topResults));
            existingList.add(topResult);
            this.topResults = existingList.toArray(new ProductAndVariantId[0]);
        }
        return this;
    }
    @Override
    public AbandonedProductSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;
        return this;
    }
    @Override
    public AbandonedProductSearch setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public AbandonedProductSearch setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
}
