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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CategoryFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.CategoryFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataStringValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataStringValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataBooleanValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataBooleanValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataIntegerValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataIntegerValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataStringValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataStringValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataBooleanValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataBooleanValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataIntegerValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataIntegerValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantSpecificationFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.VariantSpecificationFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.BrandFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAssortmentFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductAssortmentFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentAssortmentFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentAssortmentFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = PriceRangeFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.PriceRangeFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = PriceRangesFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.PriceRangesFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleRangeFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleRangeFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleRangeFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleRangeFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataDoubleRangesFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataDoubleRangesFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentDataDoubleRangesFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ContentDataDoubleRangesFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryAssortmentFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryAssortmentFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataStringValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataStringValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataBooleanValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataBooleanValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataDoubleValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleRangeFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataDoubleRangeFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryDataDoubleRangesFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductCategoryDataDoubleRangesFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductDataObjectFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.ProductDataObjectFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectStringValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectStringValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectDoubleValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectBooleanValueFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectBooleanValueFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleRangeFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectDoubleRangeFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectDoubleRangesFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectDoubleRangesFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = DataObjectFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.DataObjectFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = CategoryHierarchyFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.CategoryHierarchyFacetResult, Relewise.Client"),
    @JsonSubTypes.Type(value = RecentlyPurchasedFacetResult.class, name = "Relewise.Client.DataTypes.Search.Facets.Result.RecentlyPurchasedFacetResult, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class FacetResult
{
    public String $type = "";
    public FacetingField field;
    public FacetingField getField()
    {
        return this.field;
    }
    public FacetResult setField(FacetingField field)
    {
        this.field = field;
        return this;
    }
}
