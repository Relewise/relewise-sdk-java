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
    
/** Indicates that some property should change by having a new value which is still of the same type. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = Change.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Change implements IChange
{
    public String $type = "Relewise.Client.DataTypes.Changes.Change, Relewise.Client";
    public static Change create()
    {
        return new Change();
    }
    public Change()
    {
    }
}
