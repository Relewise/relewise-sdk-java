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
    defaultImpl = ProductCategoryAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryAdministrativeAction extends CategoryAdministrativeAction implements IHaveCurrencyLanguage
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
    public ProductCategoryAdministrativeAction setLanguage(@Nullable Language language)
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
    public ProductCategoryAdministrativeAction setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
