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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicableLanguages
{
    public Language[] languages;
    public static final ApplicableLanguages ALL = null;
    public static ApplicableLanguages create(Language... languages)
    {
        return new ApplicableLanguages(languages);
    }
    public ApplicableLanguages(Language... languages)
    {
        this.languages = languages;
    }
    public ApplicableLanguages()
    {
    }
    public Language[] getLanguages()
    {
        return this.languages;
    }
    public ApplicableLanguages setLanguages(Language... languages)
    {
        this.languages = languages;
        return this;
    }
    public ApplicableLanguages addToLanguages(Language language)
    {
        if (this.languages == null)
        {
            this.languages = new Language[] { language };
        }
        else
        {
            ArrayList<Language> existingList = new ArrayList<>(Arrays.asList(this.languages));
            existingList.add(language);
            this.languages = existingList.toArray(new Language[0]);
        }
        return this;
    }
}
