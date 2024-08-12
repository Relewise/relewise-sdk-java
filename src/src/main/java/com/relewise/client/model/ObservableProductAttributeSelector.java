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
    property = "$type",
    defaultImpl = ObservableProductAttributeSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservableProductAttributeSelector extends ProductPropertySelector
{
    public String $type = "Relewise.Client.DataTypes.EntityPropertySelectors.ObservableProductAttributeSelector, Relewise.Client";
    public ObservableProductAttribute attribute;
    public static ObservableProductAttributeSelector create(ObservableProductAttribute attribute)
    {
        return new ObservableProductAttributeSelector(attribute);
    }
    public ObservableProductAttributeSelector(ObservableProductAttribute attribute)
    {
        this.attribute = attribute;
    }
    public ObservableProductAttributeSelector()
    {
    }
    public ObservableProductAttribute getAttribute()
    {
        return this.attribute;
    }
    public ObservableProductAttributeSelector setAttribute(ObservableProductAttribute attribute)
    {
        this.attribute = attribute;
        return this;
    }
}
