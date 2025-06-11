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
    
/** Used for sorting the available values of a facet by the largest number of hits descending. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ByHitsFacetSorting.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ByHitsFacetSorting extends FacetSorting
{
    public String $type = "Relewise.Client.DataTypes.Search.Facets.Sorting.ByHitsFacetSorting, Relewise.Client";
    public static ByHitsFacetSorting create()
    {
        return new ByHitsFacetSorting();
    }
    public ByHitsFacetSorting()
    {
    }
}
