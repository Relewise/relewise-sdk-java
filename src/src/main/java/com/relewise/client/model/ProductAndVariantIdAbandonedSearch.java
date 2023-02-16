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
    property = "$type")
@JsonSubTypes({
})
public abstract class ProductAndVariantIdAbandonedSearch extends AbandonedSearch
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.AbandonedSearch`1[[Relewise.Client.DataTypes.ProductAndVariantId, Relewise.Client, Version=1.61.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public ProductAndVariantId[] topResults;
    public ProductAndVariantId[] getTopResults()
    {
        return this.topResults;
    }
    public ProductAndVariantIdAbandonedSearch setTopResults(ProductAndVariantId... topResults)
    {
        this.topResults = topResults;;
        return this;
    }
    @Override
    public ProductAndVariantIdAbandonedSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;;
        return this;
    }
    @Override
    public ProductAndVariantIdAbandonedSearch setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
}
