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
public class MultilingualCollectionValue
{
    public Language language;
    public ArrayList<String> values;
    public static MultilingualCollectionValue create(Language language, String... values)
    {
        return new MultilingualCollectionValue(language, values);
    }
    public MultilingualCollectionValue(Language language, String... values)
    {
        this.language = language;
        this.values = new ArrayList<>(Arrays.asList(values));
    }
    public MultilingualCollectionValue()
    {
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public ArrayList<String> getValues()
    {
        return this.values;
    }
    public MultilingualCollectionValue setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public MultilingualCollectionValue setValues(String... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public MultilingualCollectionValue addToValues(String values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}
