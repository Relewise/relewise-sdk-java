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
    defaultImpl = ContentAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentAdministrativeAction extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.ContentAdministrativeAction, Relewise.Client";
    public FilterCollection filters;
    public @Nullable Language language;
    public ContentAdministrativeActionUpdateKind kind;
    public @Nullable Currency currency;
    public static ContentAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ContentAdministrativeActionUpdateKind kind)
    {
        return new ContentAdministrativeAction(language, currency, filters, kind);
    }
    public ContentAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ContentAdministrativeActionUpdateKind kind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.kind = kind;
    }
    public ContentAdministrativeAction()
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
    public ContentAdministrativeActionUpdateKind getKind()
    {
        return this.kind;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public ContentAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public ContentAdministrativeAction setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public ContentAdministrativeAction setKind(ContentAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    public ContentAdministrativeAction setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
