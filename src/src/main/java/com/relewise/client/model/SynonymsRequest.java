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
    defaultImpl = SynonymsRequest.class)
public class SynonymsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.SynonymsRequest, Relewise.Client";
    public SynonymsRequestSynonymSortingSorting sorting;
    public Integer take;
    public Integer skip;
    public String term;
    public @Nullable Boolean isApproved;
    public static SynonymsRequest create()
    {
        return new SynonymsRequest();
    }
    public SynonymsRequest()
    {
    }
    public SynonymsRequestSynonymSortingSorting getSorting()
    {
        return this.sorting;
    }
    public Integer getTake()
    {
        return this.take;
    }
    public Integer getSkip()
    {
        return this.skip;
    }
    public String getTerm()
    {
        return this.term;
    }
    public @Nullable Boolean getIsApproved()
    {
        return this.isApproved;
    }
    public SynonymsRequest setSorting(SynonymsRequestSynonymSortingSorting sorting)
    {
        this.sorting = sorting;;
        return this;
    }
    public SynonymsRequest setTake(Integer take)
    {
        this.take = take;;
        return this;
    }
    public SynonymsRequest setSkip(Integer skip)
    {
        this.skip = skip;;
        return this;
    }
    public SynonymsRequest setTerm(String term)
    {
        this.term = term;;
        return this;
    }
    public SynonymsRequest setIsApproved(@Nullable Boolean isApproved)
    {
        this.isApproved = isApproved;;
        return this;
    }
}
