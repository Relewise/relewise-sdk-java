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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaResultPlacement
{
    public @Nullable RetailMediaResultPlacementResultEntity[] results;
    public static RetailMediaResultPlacement create()
    {
        return new RetailMediaResultPlacement();
    }
    public RetailMediaResultPlacement()
    {
    }
    public @Nullable RetailMediaResultPlacementResultEntity[] getResults()
    {
        return this.results;
    }
    public RetailMediaResultPlacement setResults(RetailMediaResultPlacementResultEntity... results)
    {
        this.results = results;
        return this;
    }
    public RetailMediaResultPlacement addToResults(RetailMediaResultPlacementResultEntity result)
    {
        if (this.results == null)
        {
            this.results = new RetailMediaResultPlacementResultEntity[] { result };
        }
        else
        {
            ArrayList<RetailMediaResultPlacementResultEntity> existingList = new ArrayList<>(Arrays.asList(this.results));
            existingList.add(result);
            this.results = existingList.toArray(new RetailMediaResultPlacementResultEntity[0]);
        }
        return this;
    }
}
