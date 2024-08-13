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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermResult
{
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
        this.term = term;
        return this;
    }
    public SearchTermResult setRank(Integer rank)
    {
        this.rank = rank;
        return this;
    }
    public SearchTermResult setExpectedResultTypes(ExpectedSearchTermResult... expectedResultTypes)
    {
        this.expectedResultTypes = expectedResultTypes;
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
