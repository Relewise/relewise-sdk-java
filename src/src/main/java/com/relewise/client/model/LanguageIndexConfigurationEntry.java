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
    defaultImpl = LanguageIndexConfigurationEntry.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanguageIndexConfigurationEntry
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.LanguageIndexConfigurationEntry, Relewise.Client";
    public Language language;
    public Boolean included;
    public @Nullable String iSO639_1;
    public static LanguageIndexConfigurationEntry create(Language language, Boolean included)
    {
        return new LanguageIndexConfigurationEntry(language, included);
    }
    public LanguageIndexConfigurationEntry(Language language, Boolean included)
    {
        this.language = language;
        this.included = included;
        this.iSO639_1 = null;
    }
    public LanguageIndexConfigurationEntry()
    {
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public Boolean getIncluded()
    {
        return this.included;
    }
    public @Nullable String getISO639_1()
    {
        return this.iSO639_1;
    }
    public LanguageIndexConfigurationEntry setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public LanguageIndexConfigurationEntry setIncluded(Boolean included)
    {
        this.included = included;;
        return this;
    }
    public LanguageIndexConfigurationEntry setISO639_1(String iSO639_1)
    {
        this.iSO639_1 = iSO639_1;;
        return this;
    }
}
