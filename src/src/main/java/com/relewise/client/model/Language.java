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
public class Language
{
    /** Trimmed language name in lower-invariant. */
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
    /** Trimmed language name in lower-invariant. */
    public String getValue()
    {
        return this.value;
    }
    /** Trimmed language name in lower-invariant. */
    public Language setValue(String value)
    {
        this.value = value;
        return this;
    }
}
