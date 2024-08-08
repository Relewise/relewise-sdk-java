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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = BrandAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandAdministrativeAction extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.BrandAdministrativeAction, Relewise.Client";
    public FilterCollection filters;
    public @Nullable Language language;
    public BrandAdministrativeActionUpdateKind kind;
    public @Nullable Currency currency;
    public static BrandAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, BrandAdministrativeActionUpdateKind kind)
    {
        return new BrandAdministrativeAction(language, currency, filters, kind);
    }
    public BrandAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, BrandAdministrativeActionUpdateKind kind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.kind = kind;
    }
    public BrandAdministrativeAction()
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
    public BrandAdministrativeActionUpdateKind getKind()
    {
        return this.kind;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public BrandAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;;
        return this;
    }
    public BrandAdministrativeAction setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public BrandAdministrativeAction setKind(BrandAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;;
        return this;
    }
    public BrandAdministrativeAction setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}
