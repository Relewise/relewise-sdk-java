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
    
/** Settings for which properties should be mapped for the result of the <code>ProductQuery</code>. If settings are not set they default to include everything. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductQuerySelectedPropertiesSettings
{
    /** Settings for which properties should be mapped for the <code>ProductResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public @Nullable SelectedProductDetailsPropertiesSettings selectedProductDetailsProperties;
    /** Settings for which properties should be mapped for the <code>VariantResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public @Nullable SelectedVariantDetailsPropertiesSettings selectedVariantDetailsProperties;
    public static ProductQuerySelectedPropertiesSettings create()
    {
        return new ProductQuerySelectedPropertiesSettings();
    }
    public ProductQuerySelectedPropertiesSettings()
    {
    }
    /** Settings for which properties should be mapped for the <code>ProductResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public @Nullable SelectedProductDetailsPropertiesSettings getSelectedProductDetailsProperties()
    {
        return this.selectedProductDetailsProperties;
    }
    /** Settings for which properties should be mapped for the <code>VariantResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public @Nullable SelectedVariantDetailsPropertiesSettings getSelectedVariantDetailsProperties()
    {
        return this.selectedVariantDetailsProperties;
    }
    /** Settings for which properties should be mapped for the <code>ProductResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public ProductQuerySelectedPropertiesSettings setSelectedProductDetailsProperties(@Nullable SelectedProductDetailsPropertiesSettings selectedProductDetailsProperties)
    {
        this.selectedProductDetailsProperties = selectedProductDetailsProperties;
        return this;
    }
    /** Settings for which properties should be mapped for the <code>VariantResultDetails</code> in the <code>ProductDetailsCollectionResponse</code> returned for the current <code>ProductQuery</code>. */
    public ProductQuerySelectedPropertiesSettings setSelectedVariantDetailsProperties(@Nullable SelectedVariantDetailsPropertiesSettings selectedVariantDetailsProperties)
    {
        this.selectedVariantDetailsProperties = selectedVariantDetailsProperties;
        return this;
    }
}
