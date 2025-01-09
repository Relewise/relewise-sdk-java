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
    
/** Defines the location (f.e. 'Home Page'), placements (f.e. 'main zone' and 'power action') for specific <code>Variation</code> (f.e. 'desktop'). */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaQueryLocationSelector
{
    public String key;
    /** The variation to retrieve the retail media content for, e.g. "Desktop", "Mobile", "Tablet" etc. */
    public RetailMediaQueryVariationSelector variation;
    /** The placements on the specified location. */
    public RetailMediaQueryPlacementSelector[] placements;
    public static RetailMediaQueryLocationSelector create(String key, RetailMediaQueryVariationSelector variation, RetailMediaQueryPlacementSelector... placements)
    {
        return new RetailMediaQueryLocationSelector(key, variation, placements);
    }
    public RetailMediaQueryLocationSelector(String key, RetailMediaQueryVariationSelector variation, RetailMediaQueryPlacementSelector... placements)
    {
        this.key = key;
        this.variation = variation;
        this.placements = placements;
    }
    public RetailMediaQueryLocationSelector()
    {
    }
    public String getKey()
    {
        return this.key;
    }
    /** The variation to retrieve the retail media content for, e.g. "Desktop", "Mobile", "Tablet" etc. */
    public RetailMediaQueryVariationSelector getVariation()
    {
        return this.variation;
    }
    /** The placements on the specified location. */
    public RetailMediaQueryPlacementSelector[] getPlacements()
    {
        return this.placements;
    }
    public RetailMediaQueryLocationSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
    /** The variation to retrieve the retail media content for, e.g. "Desktop", "Mobile", "Tablet" etc. */
    public RetailMediaQueryLocationSelector setVariation(RetailMediaQueryVariationSelector variation)
    {
        this.variation = variation;
        return this;
    }
    /** The placements on the specified location. */
    public RetailMediaQueryLocationSelector setPlacements(RetailMediaQueryPlacementSelector... placements)
    {
        this.placements = placements;
        return this;
    }
    /** The placements on the specified location. */
    public RetailMediaQueryLocationSelector addToPlacements(RetailMediaQueryPlacementSelector placement)
    {
        if (this.placements == null)
        {
            this.placements = new RetailMediaQueryPlacementSelector[] { placement };
        }
        else
        {
            ArrayList<RetailMediaQueryPlacementSelector> existingList = new ArrayList<>(Arrays.asList(this.placements));
            existingList.add(placement);
            this.placements = existingList.toArray(new RetailMediaQueryPlacementSelector[0]);
        }
        return this;
    }
}
