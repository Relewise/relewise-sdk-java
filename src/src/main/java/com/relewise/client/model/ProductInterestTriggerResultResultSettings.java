package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ProductInterestTriggerResultResultSettings.class)
public class ProductInterestTriggerResultResultSettings
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductInterestTriggerResult+ResultSettings, Relewise.Client";
    public SelectedProductPropertiesSettings selectedProductProperties;
    public SelectedVariantPropertiesSettings selectedVariantProperties;
    public static ProductInterestTriggerResultResultSettings create()
    {
        return new ProductInterestTriggerResultResultSettings();
    }
    public ProductInterestTriggerResultResultSettings()
    {
    }
    public SelectedProductPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public SelectedVariantPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public ProductInterestTriggerResultResultSettings setSelectedProductProperties(SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;;
        return this;
    }
    public ProductInterestTriggerResultResultSettings setSelectedVariantProperties(SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;;
        return this;
    }
}
