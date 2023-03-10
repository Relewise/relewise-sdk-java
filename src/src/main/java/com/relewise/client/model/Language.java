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
    defaultImpl = Language.class)
public class Language
{
    public String $type = "Relewise.Client.DataTypes.Language, Relewise.Client";
    public String value;
    public static final Language UNDEFINED = null;
    public static Language create(String name)
    {
        return new Language(name);
    }
    public Language(String name)
    {
        this.value = name;
    }
    public Language()
    {
    }
    public String getValue()
    {
        return this.value;
    }
    public Language setValue(String value)
    {
        this.value = value;;
        return this;
    }
}
