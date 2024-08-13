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
    defaultImpl = ContentCategoryAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryAdministrativeAction extends CategoryAdministrativeAction
{
    public String $type = "Relewise.Client.DataTypes.ContentCategoryAdministrativeAction, Relewise.Client";
    public static ContentCategoryAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CategoryAdministrativeActionUpdateKind kind)
    {
        return new ContentCategoryAdministrativeAction(language, currency, filters, kind);
    }
    public ContentCategoryAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CategoryAdministrativeActionUpdateKind kind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.kind = kind;
    }
    public ContentCategoryAdministrativeAction()
    {
    }
    @Override
    public ContentCategoryAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ContentCategoryAdministrativeAction setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ContentCategoryAdministrativeAction setKind(CategoryAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    @Override
    public ContentCategoryAdministrativeAction setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
