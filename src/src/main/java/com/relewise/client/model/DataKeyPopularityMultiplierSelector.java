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
    
/** a selector that uses a <code>Key</code> to pick a value from an entity's data to change the weighing of an observed view or purchase when making a <code>PopularProductsRequest</code>. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = DataKeyPopularityMultiplierSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataKeyPopularityMultiplierSelector extends PopularityMultiplierSelector
{
    public String $type = "Relewise.Client.Requests.PopularityMultiplierSelectors.DataKeyPopularityMultiplierSelector, Relewise.Client";
    /** The data key that will be used to select a factor that is applied to the entities observed views or purchases. */
    public String key;
    /**
     * Creates a selector that uses a <code>Key</code> to pick a value from an entity's data to change the weighing of an observed view or purchase when making a <code>PopularProductsRequest</code>.
     * @param key The data key that will be used to select a factor that is applied to the entities observed views or purchases.
     */
    public static DataKeyPopularityMultiplierSelector create(String key)
    {
        return new DataKeyPopularityMultiplierSelector(key);
    }
    /**
     * Creates a selector that uses a <code>Key</code> to pick a value from an entity's data to change the weighing of an observed view or purchase when making a <code>PopularProductsRequest</code>.
     * @param key The data key that will be used to select a factor that is applied to the entities observed views or purchases.
     */
    public DataKeyPopularityMultiplierSelector(String key)
    {
        this.key = key;
    }
    public DataKeyPopularityMultiplierSelector()
    {
    }
    /** The data key that will be used to select a factor that is applied to the entities observed views or purchases. */
    public String getKey()
    {
        return this.key;
    }
    /** The data key that will be used to select a factor that is applied to the entities observed views or purchases. */
    public DataKeyPopularityMultiplierSelector setKey(String key)
    {
        this.key = key;
        return this;
    }
}
