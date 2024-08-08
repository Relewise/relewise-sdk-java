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
    defaultImpl = ProductAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductAdministrativeAction extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.ProductAdministrativeAction, Relewise.Client";
    public FilterCollection filters;
    public @Nullable Language language;
    public ProductAdministrativeActionUpdateKind productUpdateKind;
    public ProductAdministrativeActionUpdateKind variantUpdateKind;
    public @Nullable Currency currency;
    public static ProductAdministrativeAction create(@Nullable Language language, @Nullable Currency currency, ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        return new ProductAdministrativeAction(language, currency, productUpdateKind);
    }
    public ProductAdministrativeAction(@Nullable Language language, @Nullable Currency currency, ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        this.language = language;
        this.currency = currency;
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
        this.filters = filters;;
        return this;
    }
    public ProductAdministrativeAction setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public ProductAdministrativeAction setProductUpdateKind(ProductAdministrativeActionUpdateKind productUpdateKind)
    {
        this.productUpdateKind = productUpdateKind;;
        return this;
    }
    public ProductAdministrativeAction setVariantUpdateKind(ProductAdministrativeActionUpdateKind variantUpdateKind)
    {
        this.variantUpdateKind = variantUpdateKind;;
        return this;
    }
    public ProductAdministrativeAction setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
}
