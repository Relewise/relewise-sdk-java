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
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAdministrativeAction extends Trackable implements IHaveCurrencyLanguage
{
    public String $type = "Relewise.Client.DataTypes.ProductAdministrativeAction, Relewise.Client";
    public FilterCollection filters;
    public @Nullable Language language;
    public ProductAdministrativeActionUpdateKind productUpdateKind;
    public ProductAdministrativeActionUpdateKind variantUpdateKind;
    public @Nullable Currency currency;
    public static ProductAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ProductAdministrativeActionUpdateKind productUpdateKind, ProductAdministrativeActionUpdateKind variantUpdateKind)
    {
        return new ProductAdministrativeAction(language, currency, filters, productUpdateKind, variantUpdateKind);
    }
    public ProductAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ProductAdministrativeActionUpdateKind productUpdateKind, ProductAdministrativeActionUpdateKind variantUpdateKind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.productUpdateKind = productUpdateKind;
        this.variantUpdateKind = variantUpdateKind;
    }
    public static ProductAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        return new ProductAdministrativeAction(language, currency, filters, productUpdateKind);
    }
    public ProductAdministrativeAction(@Nullable Language language, @Nullable Currency currency, FilterCollection filters, ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        this.language = language;
        this.currency = currency;
        this.filters = filters;
        this.productUpdateKind = productUpdateKind;
    }
    public ProductAdministrativeAction()
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
    public ProductAdministrativeActionUpdateKind getProductUpdateKind()
    {
        return this.productUpdateKind;
    }
    public ProductAdministrativeActionUpdateKind getVariantUpdateKind()
    {
        return this.variantUpdateKind;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public ProductAdministrativeAction setFilters(FilterCollection filters)
    {
        this.filters = filters;
        return this;
    }
    public ProductAdministrativeAction setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public ProductAdministrativeAction setProductUpdateKind(ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        this.productUpdateKind = productUpdateKind;
        return this;
    }
    public ProductAdministrativeAction setVariantUpdateKind(ProductAdministrativeActionUpdateKind variantUpdateKind)
    {
        this.variantUpdateKind = variantUpdateKind;
        return this;
    }
    public ProductAdministrativeAction setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
