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
    defaultImpl = VariantSearchSettings.class)
public class VariantSearchSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.VariantSearchSettings, Relewise.Client";
    public Boolean excludeResultsWithoutVariant;
    public static VariantSearchSettings create()
    {
        return new VariantSearchSettings();
    }
    public VariantSearchSettings()
    {
    }
    public Boolean getExcludeResultsWithoutVariant()
    {
        return this.excludeResultsWithoutVariant;
    }
    public VariantSearchSettings setExcludeResultsWithoutVariant(Boolean excludeResultsWithoutVariant)
    {
        this.excludeResultsWithoutVariant = excludeResultsWithoutVariant;;
        return this;
    }
}
