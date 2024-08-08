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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendPopularSearchTermSettings
{
    public @Nullable EntityType[] targetEntityTypes;
    public Integer numberOfRecommendations;
    public static RecommendPopularSearchTermSettings create()
    {
        return new RecommendPopularSearchTermSettings();
    }
    public RecommendPopularSearchTermSettings()
    {
    }
    public @Nullable EntityType[] getTargetEntityTypes()
    {
        return this.targetEntityTypes;
    }
    public Integer getNumberOfRecommendations()
    {
        return this.numberOfRecommendations;
    }
    public RecommendPopularSearchTermSettings setTargetEntityTypes(EntityType... targetEntityTypes)
    {
        this.targetEntityTypes = targetEntityTypes;;
        return this;
    }
    public RecommendPopularSearchTermSettings addToTargetEntityTypes(EntityType targetEntityType)
    {
        if (this.targetEntityTypes == null)
        {
            this.targetEntityTypes = new EntityType[] { targetEntityType };
        }
        else
        {
            ArrayList<EntityType> existingList = new ArrayList<>(Arrays.asList(this.targetEntityTypes));
            existingList.add(targetEntityType);
            this.targetEntityTypes = existingList.toArray(new EntityType[0]);
        }
        return this;
    }
    public RecommendPopularSearchTermSettings setNumberOfRecommendations(Integer numberOfRecommendations)
    {
        this.numberOfRecommendations = numberOfRecommendations;;
        return this;
    }
}
