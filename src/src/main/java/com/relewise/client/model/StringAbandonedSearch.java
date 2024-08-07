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
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class StringAbandonedSearch extends AbandonedSearch
{
    public String $type = "";
    public String[] topResults;
    public String[] getTopResults()
    {
        return this.topResults;
    }
    public StringAbandonedSearch setTopResults(String... topResults)
    {
        this.topResults = topResults;;
        return this;
    }
    @Override
    public StringAbandonedSearch setLoweredSearchTerm(String loweredSearchTerm)
    {
        this.loweredSearchTerm = loweredSearchTerm;;
        return this;
    }
    @Override
    public StringAbandonedSearch setHits(Integer hits)
    {
        this.hits = hits;;
        return this;
    }
}
