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
    defaultImpl = SearchTermPredictionResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermPredictionResult
{
    public String $type = "Relewise.Client.DataTypes.SearchTermPredictionResult, Relewise.Client";
    public String term;
    public Integer rank;
    public ExpectedSearchTermResult[] expectedResultTypes;
    public SearchTermPredictionResultPredictionType type;
    public Boolean[] correctedWordsMask;
    public static SearchTermPredictionResult create()
    {
        return new SearchTermPredictionResult();
    }
    public SearchTermPredictionResult()
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
    public SearchTermPredictionResultPredictionType getType()
    {
        return this.type;
    }
    public Boolean[] getCorrectedWordsMask()
    {
        return this.correctedWordsMask;
    }
    public SearchTermPredictionResult setTerm(String term)
    {
        this.term = term;;
        return this;
    }
    public SearchTermPredictionResult setRank(Integer rank)
    {
        this.rank = rank;;
        return this;
    }
    public SearchTermPredictionResult setExpectedResultTypes(ExpectedSearchTermResult... expectedResultTypes)
    {
        this.expectedResultTypes = expectedResultTypes;;
        return this;
    }
    public SearchTermPredictionResult addToExpectedResultTypes(ExpectedSearchTermResult expectedResultType)
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
    public SearchTermPredictionResult setType(SearchTermPredictionResultPredictionType type)
    {
        this.type = type;;
        return this;
    }
    public SearchTermPredictionResult setCorrectedWordsMask(Boolean... correctedWordsMask)
    {
        this.correctedWordsMask = correctedWordsMask;;
        return this;
    }
    public SearchTermPredictionResult addToCorrectedWordsMask(Boolean correctedWordsMask)
    {
        if (this.correctedWordsMask == null)
        {
            this.correctedWordsMask = new Boolean[] { correctedWordsMask };
        }
        else
        {
            ArrayList<Boolean> existingList = new ArrayList<>(Arrays.asList(this.correctedWordsMask));
            existingList.add(correctedWordsMask);
            this.correctedWordsMask = existingList.toArray(new Boolean[0]);
        }
        return this;
    }
}
