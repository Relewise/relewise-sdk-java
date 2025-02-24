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
    property = "$type",
    defaultImpl = SearchTermPredictionSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermPredictionSettings extends SearchSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.SearchTermPredictionSettings, Relewise.Client";
    public @Nullable ArrayList<EntityType> targetEntityTypes;
    public static SearchTermPredictionSettings create()
    {
        return new SearchTermPredictionSettings();
    }
    public SearchTermPredictionSettings()
    {
    }
    public @Nullable ArrayList<EntityType> getTargetEntityTypes()
    {
        return this.targetEntityTypes;
    }
    public SearchTermPredictionSettings setTargetEntityTypes(EntityType... targetEntityTypes)
    {
        this.targetEntityTypes = new ArrayList<>(Arrays.asList(targetEntityTypes));;
        return this;
    }
    public SearchTermPredictionSettings addToTargetEntityTypes(EntityType targetEntityTypes)
    {
        if (this.targetEntityTypes == null)
        {
            this.targetEntityTypes = new ArrayList<>();
        }
        this.targetEntityTypes.add(targetEntityTypes);
        return this;
    }
}
