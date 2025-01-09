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
    defaultImpl = UserDetailsCollectionResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetailsCollectionResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.UserDetailsCollectionResponse, Relewise.Client";
    public UserResultDetails[][] results;
    public static UserDetailsCollectionResponse create(UserResultDetails[]... results)
    {
        return new UserDetailsCollectionResponse(results);
    }
    public UserDetailsCollectionResponse(UserResultDetails[]... results)
    {
        this.results = results;
    }
    public UserDetailsCollectionResponse()
    {
    }
    public UserResultDetails[][] getResults()
    {
        return this.results;
    }
    public UserDetailsCollectionResponse setResults(UserResultDetails[]... results)
    {
        this.results = results;
        return this;
    }
    public UserDetailsCollectionResponse addToResults(UserResultDetails[] result)
    {
        if (this.results == null)
        {
            this.results = new UserResultDetails[][] { result };
        }
        else
        {
            ArrayList<UserResultDetails[]> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new UserResultDetails[0][0]);
        }
        return this;
    }
    @Override
    public UserDetailsCollectionResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
