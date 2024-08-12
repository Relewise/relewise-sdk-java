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
    defaultImpl = ProductCategoryAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAdministrativeAction extends CategoryAdministrativeAction
{
    public String $type = "Relewise.Client.DataTypes.ProductCategoryAdministrativeAction, Relewise.Client";
    public static ProductCategoryAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CategoryAdministrativeActionUpdateKind kind)
    {
        return new ProductCategoryAdministrativeAction(language, currency, filters, kind);
    }
    public ProductCategoryAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, CategoryAdministrativeActionUpdateKind kind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.kind = kind;
    }
    public ProductCategoryAdministrativeAction()
    {
    }
    @Override
    public ProductCategoryAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    @Override
    public ProductCategoryAdministrativeAction setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    @Override
    public ProductCategoryAdministrativeAction setKind(CategoryAdministrativeActionUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
    @Override
    public ProductCategoryAdministrativeAction setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
