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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchTermResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermResult
{
    public String $type = "Relewise.Client.DataTypes.SearchTermResult, Relewise.Client";
    public String term;
    public Integer rank;
    public ExpectedSearchTermResult[] expectedResultTypes;
    public static SearchTermResult create()
    {
        return new SearchTermResult();
    }
    public SearchTermResult()
    {
    }
    public String getTerm()
    {
        return this.term;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public ExpectedSearchTermResult[] getExpectedResultTypes()
    {
        return this.expectedResultTypes;
    }
    public SearchTermResult setTerm(String term)
    {
        this.term = term;;
        return this;
    }
    public SearchTermResult setRank(Integer rank)
    {
        this.rank = rank;;
        return this;
    }
    public SearchTermResult setExpectedResultTypes(ExpectedSearchTermResult... expectedResultTypes)
    {
        this.expectedResultTypes = expectedResultTypes;;
        return this;
    }
    public SearchTermResult addToExpectedResultTypes(ExpectedSearchTermResult expectedResultType)
    {
        if (this.expectedResultTypes == null)
        {
            this.expectedResultTypes = new ExpectedSearchTermResult[] { expectedResultType };
        }
        else
        {
            ArrayList<ExpectedSearchTermResult> existingList = new ArrayList<>(Arrays.asList(this.expectedResultTypes));
            existingList.add(expectedResultType);
            this.expectedResultTypes = existingList.toArray(new ExpectedSearchTermResult[0]);
        }
        return this;
    }
}
