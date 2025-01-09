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
import java.util.Set;
import java.util.HashSet;
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class LanguageIndexConfiguration
{
    public ArrayList<LanguageIndexConfigurationEntry> languages;
    public static LanguageIndexConfiguration create()
    {
        return new LanguageIndexConfiguration();
    }
    public LanguageIndexConfiguration()
    {
    }
    public ArrayList<LanguageIndexConfigurationEntry> getLanguages()
    {
        return this.languages;
    }
    public LanguageIndexConfiguration setLanguages(LanguageIndexConfigurationEntry... languages)
    {
        this.languages = new ArrayList<>(Arrays.asList(languages));;
        return this;
    }
    public LanguageIndexConfiguration addToLanguages(LanguageIndexConfigurationEntry languages)
    {
        if (this.languages == null)
        {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languages);
        return this;
    }
}
