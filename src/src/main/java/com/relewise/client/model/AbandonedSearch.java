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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AbandonedProductSearch.class, name = "Relewise.Client.Responses.Triggers.Results.AbandonedProductSearch, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedProductCategorySearch.class, name = "Relewise.Client.Responses.Triggers.Results.AbandonedProductCategorySearch, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedContentSearch.class, name = "Relewise.Client.Responses.Triggers.Results.AbandonedContentSearch, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbandonedSearch
{
    public String $type = "";
    public String loweredSearchTerm;
    public Integer hits;
    public @Nullable Language language;
    public String getLoweredSearchTerm()
    {
        return this.loweredSearchTerm;
    }
    public Integer getHits()
    {
        return this.hits;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public AbandonedSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;
        return this;
    }
    public AbandonedSearch setHits(Integer hits)
    {
        this.hits = hits;
        return this;
    }
    public AbandonedSearch setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
}
