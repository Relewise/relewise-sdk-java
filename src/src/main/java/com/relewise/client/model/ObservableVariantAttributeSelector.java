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
    property = "$type",
    defaultImpl = ObservableVariantAttributeSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservableVariantAttributeSelector extends VariantPropertySelector
{
    public String $type = "Relewise.Client.DataTypes.EntityPropertySelectors.ObservableVariantAttributeSelector, Relewise.Client";
    public ObservableVariantAttribute attribute;
    public static ObservableVariantAttributeSelector create(ObservableVariantAttribute attribute)
    {
        return new ObservableVariantAttributeSelector(attribute);
    }
    public ObservableVariantAttributeSelector(ObservableVariantAttribute attribute)
    {
        this.attribute = attribute;
    }
    public ObservableVariantAttributeSelector()
    {
    }
    public ObservableVariantAttribute getAttribute()
    {
        return this.attribute;
    }
    public ObservableVariantAttributeSelector setAttribute(ObservableVariantAttribute attribute)
    {
        this.attribute = attribute;
        return this;
    }
}
