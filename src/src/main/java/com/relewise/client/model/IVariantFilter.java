package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
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

/** a <code>Filter</code> that can be used to define which variants to include for products in queries. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = VariantIdFilter.class, name = "Relewise.Client.Requests.Filters.VariantIdFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationFilter.class, name = "Relewise.Client.Requests.Filters.VariantSpecificationFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantAssortmentFilter.class, name = "Relewise.Client.Requests.Filters.VariantAssortmentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantDataFilter.class, name = "Relewise.Client.Requests.Filters.VariantDataFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantListPriceFilter.class, name = "Relewise.Client.Requests.Filters.VariantListPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSalesPriceFilter.class, name = "Relewise.Client.Requests.Filters.VariantSalesPriceFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = OrFilter.class, name = "Relewise.Client.Requests.Filters.OrFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = AndFilter.class, name = "Relewise.Client.Requests.Filters.AndFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantEngagementFilter.class, name = "Relewise.Client.Requests.Filters.VariantEngagementFilter, Relewise.Client"),
})
public interface IVariantFilter
{
}
