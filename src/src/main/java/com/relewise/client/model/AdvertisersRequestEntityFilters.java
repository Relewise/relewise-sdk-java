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
    defaultImpl = AdvertisersRequestEntityFilters.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertisersRequestEntityFilters extends AdvertiserEntityStateAdvertiserMetadataValuesRetailMediaEntityEntityFilters
{
    public String $type = "Relewise.Client.Requests.RetailMedia.AdvertisersRequest+EntityFilters, Relewise.Client";
    public @Nullable UUID[] ids;
    public static AdvertisersRequestEntityFilters create()
    {
        return new AdvertisersRequestEntityFilters();
    }
    public AdvertisersRequestEntityFilters()
    {
    }
    public @Nullable UUID[] getIds()
    {
        return this.ids;
    }
    public AdvertisersRequestEntityFilters setIds(UUID... ids)
    {
        this.ids = ids;
        return this;
    }
    public AdvertisersRequestEntityFilters addToIds(UUID id)
    {
        if (this.ids == null)
        {
            this.ids = new UUID[] { id };
        }
        else
        {
            ArrayList<UUID> existingList = new ArrayList<>(Arrays.asList(this.ids));
            existingList.add(id);
            this.ids = existingList.toArray(new UUID[0]);
        }
        return this;
    }
    @Override
    public AdvertisersRequestEntityFilters setTerm(@Nullable String term)
    {
        this.term = term;
        return this;
    }
    @Override
    public AdvertisersRequestEntityFilters setStates(AdvertiserEntityState... states)
    {
        this.states = states;
        return this;
    }
    public AdvertisersRequestEntityFilters addToStates(AdvertiserEntityState state)
    {
        if (this.states == null)
        {
            this.states = new AdvertiserEntityState[] { state };
        }
        else
        {
            ArrayList<AdvertiserEntityState> existingList = new ArrayList<>(Arrays.asList(this.states));
            existingList.add(state);
            this.states = existingList.toArray(new AdvertiserEntityState[0]);
        }
        return this;
    }
}
