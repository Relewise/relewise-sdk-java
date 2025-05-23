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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ProductAndVariantIdAbandonedSearch extends AbandonedSearch
{
    public String $type = "";
    public ProductAndVariantId[] topResults;
    public ProductAndVariantId[] getTopResults()
    {
        return this.topResults;
    }
    public ProductAndVariantIdAbandonedSearch setTopResults(ProductAndVariantId... topResults)
    {
        this.topResults = topResults;
        return this;
    }
    @Override
    public ProductAndVariantIdAbandonedSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;
        return this;
    }
    @Override
    public ProductAndVariantIdAbandonedSearch setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    @Override
    public ProductAndVariantIdAbandonedSearch setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
}
