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
    
/** Indicates that some property should change by decreasing in value. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = Decrease.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Decrease implements IChange
{
    public String $type = "Relewise.Client.DataTypes.Changes.Decrease, Relewise.Client";
    public static Decrease create()
    {
        return new Decrease();
    }
    public Decrease()
    {
    }
}
