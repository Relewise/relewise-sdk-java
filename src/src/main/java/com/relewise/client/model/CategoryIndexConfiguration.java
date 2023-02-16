package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CategoryIndexConfiguration.class)
public class CategoryIndexConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.CategoryIndexConfiguration, Relewise.Client";
    public CategoryIndexConfigurationEntry unspecified;
    public static CategoryIndexConfiguration create()
    {
        return new CategoryIndexConfiguration();
    }
    public CategoryIndexConfiguration()
    {
    }
    public CategoryIndexConfigurationEntry getUnspecified()
    {
        return this.unspecified;
    }
    public CategoryIndexConfiguration setUnspecified(CategoryIndexConfigurationEntry unspecified)
    {
        this.unspecified = unspecified;;
        return this;
    }
}
