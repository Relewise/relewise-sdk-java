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
public class LanguageIndexConfigurationEntry
{
    public Language language;
    public Boolean included;
    /** The ISO639-1 code for the selected language, this is used for spelling correction, stemming, phonetic analysis etc. This is optional if the specified "Language" already follows the official codes, e.g. "en" for English, "da" for Danish etc (case-insensitive). https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
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
    public static LanguageIndexConfigurationEntry create(Language language, Boolean included, String iso639_1)
    {
        return new LanguageIndexConfigurationEntry(language, included, iso639_1);
    }
    public LanguageIndexConfigurationEntry(Language language, Boolean included, String iso639_1)
    {
        this.language = language;
        this.included = included;
        this.iSO639_1 = iso639_1;
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
    /** The ISO639-1 code for the selected language, this is used for spelling correction, stemming, phonetic analysis etc. This is optional if the specified "Language" already follows the official codes, e.g. "en" for English, "da" for Danish etc (case-insensitive). https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
    public @Nullable String getISO639_1()
    {
        return this.iSO639_1;
    }
    public LanguageIndexConfigurationEntry setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public LanguageIndexConfigurationEntry setIncluded(Boolean included)
    {
        this.included = included;
        return this;
    }
    /** The ISO639-1 code for the selected language, this is used for spelling correction, stemming, phonetic analysis etc. This is optional if the specified "Language" already follows the official codes, e.g. "en" for English, "da" for Danish etc (case-insensitive). https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes */
    public LanguageIndexConfigurationEntry setISO639_1(String iSO639_1)
    {
        this.iSO639_1 = iSO639_1;
        return this;
    }
}
