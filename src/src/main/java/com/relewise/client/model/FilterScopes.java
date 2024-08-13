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
public class FilterScopes
{
    public @Nullable FilterScopeSettings _default;
    public @Nullable FilterScopeSettings fill;
    public static FilterScopes create()
    {
        return new FilterScopes();
    }
    public FilterScopes()
    {
    }
    @JsonProperty("default")
    public @Nullable FilterScopeSettings getDefault()
    {
        return this._default;
    }
    public @Nullable FilterScopeSettings getFill()
    {
        return this.fill;
    }
    public FilterScopes setDefault(@Nullable FilterScopeSettings _default)
    {
        this._default = _default;
        return this;
    }
    public FilterScopes setFill(@Nullable FilterScopeSettings fill)
    {
        this.fill = fill;
        return this;
    }
}
