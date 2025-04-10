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
public class VariantIndexConfiguration
{
    public FieldIndexConfiguration id;
    public FieldIndexConfiguration displayName;
    public SpecificationsIndexConfiguration specifications;
    public DataIndexConfiguration data;
    public static VariantIndexConfiguration create()
    {
        return new VariantIndexConfiguration();
    }
    public VariantIndexConfiguration()
    {
    }
    public FieldIndexConfiguration getId()
    {
        return this.id;
    }
    public FieldIndexConfiguration getDisplayName()
    {
        return this.displayName;
    }
    public SpecificationsIndexConfiguration getSpecifications()
    {
        return this.specifications;
    }
    public DataIndexConfiguration getData()
    {
        return this.data;
    }
    public VariantIndexConfiguration setId(FieldIndexConfiguration id)
    {
        this.id = id;
        return this;
    }
    public VariantIndexConfiguration setDisplayName(FieldIndexConfiguration displayName)
    {
        this.displayName = displayName;
        return this;
    }
    public VariantIndexConfiguration setSpecifications(SpecificationsIndexConfiguration specifications)
    {
        this.specifications = specifications;
        return this;
    }
    public VariantIndexConfiguration setData(DataIndexConfiguration data)
    {
        this.data = data;
        return this;
    }
}
