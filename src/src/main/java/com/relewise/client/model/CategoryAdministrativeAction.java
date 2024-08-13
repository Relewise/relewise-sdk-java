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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategoryAdministrativeAction extends Trackable
{
    public String $type = "";
    public FilterCollection filters;
    public @Nullable Language language;
    public CategoryAdministrativeActionUpdateKind kind;
    public @Nullable Currency currency;
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public CategoryAdministrativeActionUpdateKind getKind()
    {
        return this.kind;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public CategoryAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public CategoryAdministrativeAction setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public CategoryAdministrativeAction setKind(CategoryAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    public CategoryAdministrativeAction setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
