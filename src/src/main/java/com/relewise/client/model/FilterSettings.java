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
public class FilterSettings
{
    public @Nullable FilterScopes scopes;
    public static FilterSettings create()
    {
        return new FilterSettings();
    }
    public FilterSettings()
    {
    }
    public @Nullable FilterScopes getScopes()
    {
        return this.scopes;
    }
    public FilterSettings setScopes(@Nullable FilterScopes scopes)
    {
        this.scopes = scopes;
        return this;
    }
}
