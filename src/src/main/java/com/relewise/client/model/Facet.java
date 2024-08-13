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
    @JsonSubTypes.Type(value = CategoryFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.CategoryFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataStringValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataStringValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataBooleanValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataBooleanValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataIntegerValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataIntegerValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataStringValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataStringValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataBooleanValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataBooleanValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataIntegerValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataIntegerValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.VariantSpecificationFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.BrandFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAssortmentFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductAssortmentFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentAssortmentFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentAssortmentFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = PriceRangeFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.PriceRangeFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = PriceRangesFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.PriceRangesFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleRangeFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleRangeFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleRangeFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleRangeFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleRangesFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataDoubleRangesFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleRangesFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataDoubleRangesFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryAssortmentFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryAssortmentFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataStringValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataStringValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataBooleanValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataBooleanValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleRangeFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleRangeFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleRangesFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataDoubleRangesFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataObjectFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductDataObjectFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectStringValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectStringValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectDoubleValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectBooleanValueFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectBooleanValueFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleRangeFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectDoubleRangeFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleRangesFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectDoubleRangesFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.DataObjectFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataObjectFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ProductCategoryDataObjectFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataObjectFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.ContentDataObjectFacet, Relewise.Client"),
    @JsonSubTypes.Type(value = CategoryHierarchyFacet.class, name = "Relewise.Client.DataTypes.Search.Facets.Queries.CategoryHierarchyFacet, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Facet
{
    public String $type = "";
    public FacetingField field;
    public @Nullable FacetSettings settings;
    public FacetingField getField()
    {
        return this.field;
    }
    public @Nullable FacetSettings getSettings()
    {
        return this.settings;
    }
    public Facet setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
    public Facet setSettings(@Nullable FacetSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
