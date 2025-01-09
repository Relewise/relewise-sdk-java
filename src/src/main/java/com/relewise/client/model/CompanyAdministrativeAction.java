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
    property = "$type",
    defaultImpl = CompanyAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyAdministrativeAction extends Trackable implements IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.DataTypes.CompanyAdministrativeAction, Relewise.Client";
    public FilterCollection filters;
    public @Nullable Language language;
    public CompanyAdministrativeActionUpdateKind kind;
    public @Nullable Currency currency;
    public static CompanyAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CompanyAdministrativeActionUpdateKind kind)
    {
        return new CompanyAdministrativeAction(language, currency, filters, kind);
    }
    public CompanyAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CompanyAdministrativeActionUpdateKind kind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.kind = kind;
    }
    public CompanyAdministrativeAction()
    {
    }
    public FilterCollection getFilters()
    {
        return this.filters;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public CompanyAdministrativeActionUpdateKind getKind()
    {
        return this.kind;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public CompanyAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public CompanyAdministrativeAction setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public CompanyAdministrativeAction setKind(CompanyAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    public CompanyAdministrativeAction setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
