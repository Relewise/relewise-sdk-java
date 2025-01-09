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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantChangeTriggerResultSettings
{
    public SelectedProductDetailsPropertiesSettings selectedProductProperties;
    public SelectedVariantDetailsPropertiesSettings selectedVariantProperties;
    public static VariantChangeTriggerResultSettings create()
    {
        return new VariantChangeTriggerResultSettings();
    }
    public VariantChangeTriggerResultSettings()
    {
    }
    public SelectedProductDetailsPropertiesSettings getSelectedProductProperties()
    {
        return this.selectedProductProperties;
    }
    public SelectedVariantDetailsPropertiesSettings getSelectedVariantProperties()
    {
        return this.selectedVariantProperties;
    }
    public VariantChangeTriggerResultSettings setSelectedProductProperties(SelectedProductDetailsPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public VariantChangeTriggerResultSettings setSelectedVariantProperties(SelectedVariantDetailsPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
}
