package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = Multilingual.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Multilingual
{
    public String $type = "Relewise.Client.DataTypes.Multilingual, Relewise.Client";
    public @Nullable ArrayList<MultilingualValue> values;
    public static Multilingual create(MultilingualValue... translations)
    {
        return new Multilingual(translations);
    }
    public Multilingual(MultilingualValue... translations)
    {
        this.values = new ArrayList<>(Arrays.asList(translations));
    }
    public Multilingual()
    {
    }
    public @Nullable ArrayList<MultilingualValue> getValues()
    {
        return this.values;
    }
    public Multilingual setValues(MultilingualValue... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public Multilingual addToValues(MultilingualValue values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}
