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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantChangeTriggerResultSettings
{
    public SelectedProductPropertiesSettings selectedProductProperties;
    public SelectedVariantPropertiesSettings selectedVariantProperties;
    public static VariantChangeTriggerResultSettings create()
    {
        return new VariantChangeTriggerResultSettings();
    }
    public VariantChangeTriggerResultSettings()
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
    public VariantChangeTriggerResultSettings setSelectedProductProperties(SelectedProductPropertiesSettings selectedProductProperties)
    {
        this.selectedProductProperties = selectedProductProperties;
        return this;
    }
    public VariantChangeTriggerResultSettings setSelectedVariantProperties(SelectedVariantPropertiesSettings selectedVariantProperties)
    {
        this.selectedVariantProperties = selectedVariantProperties;
        return this;
    }
}
