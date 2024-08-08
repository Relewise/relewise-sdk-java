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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultilingualValue
{
    public Language language;
    public @Nullable String text;
    public static MultilingualValue create(Language language, String text)
    {
        return new MultilingualValue(language, text);
    }
    public MultilingualValue(Language language, String text)
    {
        this.language = language;
        this.text = text;
    }
    public MultilingualValue()
    {
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public @Nullable String getText()
    {
        return this.text;
    }
    public MultilingualValue setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public MultilingualValue setText(String text)
    {
        this.text = text;;
        return this;
    }
}
