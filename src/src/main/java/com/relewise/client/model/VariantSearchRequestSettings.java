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
    
/** Search-specific variant controls for product search requests. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = VariantSearchRequestSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantSearchRequestSettings extends VariantRequestSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.VariantSearchRequestSettings, Relewise.Client";
    public static VariantSearchRequestSettings create()
    {
        return new VariantSearchRequestSettings();
    }
    public VariantSearchRequestSettings()
    {
    }
    @Override
    public VariantSearchRequestSettings setMaxVariantsPerProduct(@Nullable Integer maxVariantsPerProduct)
    {
        this.maxVariantsPerProduct = maxVariantsPerProduct;
        return this;
    }
    @Override
    public VariantSearchRequestSettings setSorting(@Nullable VariantSorting sorting)
    {
        this.sorting = sorting;
        return this;
    }
}
