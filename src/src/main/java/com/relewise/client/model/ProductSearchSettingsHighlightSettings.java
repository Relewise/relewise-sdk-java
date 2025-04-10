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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ProductSearchSettingsHighlightSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchSettingsHighlightSettings extends ProductProductHighlightPropsHighlightSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ProductSearchSettings+HighlightSettings, Relewise.Client";
    public static ProductSearchSettingsHighlightSettings create()
    {
        return new ProductSearchSettingsHighlightSettings();
    }
    public ProductSearchSettingsHighlightSettings()
    {
    }
    @Override
    public ProductSearchSettingsHighlightSettings setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ProductSearchSettingsHighlightSettings setLimit(ProductProductHighlightPropsHighlightSettingsLimits limit)
    {
        this.limit = limit;
        return this;
    }
    @Override
    public ProductSearchSettingsHighlightSettings setHighlightable(ProductHighlightProps highlightable)
    {
        this.highlightable = highlightable;
        return this;
    }
    @Override
    public ProductSearchSettingsHighlightSettings setShape(ProductProductHighlightPropsHighlightSettingsResponseShape shape)
    {
        this.shape = shape;
        return this;
    }
}
