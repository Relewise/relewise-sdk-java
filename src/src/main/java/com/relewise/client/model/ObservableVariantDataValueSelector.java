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
    defaultImpl = ObservableVariantDataValueSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservableVariantDataValueSelector extends VariantPropertySelector
{
    public String $type = "Relewise.Client.DataTypes.EntityPropertySelectors.ObservableVariantDataValueSelector, Relewise.Client";
    public DataObjectValueSelector dataObjectValueSelector;
    public static ObservableVariantDataValueSelector create(DataObjectValueSelector dataObjectValueSelector)
    {
        return new ObservableVariantDataValueSelector(dataObjectValueSelector);
    }
    public ObservableVariantDataValueSelector(DataObjectValueSelector dataObjectValueSelector)
    {
        this.dataObjectValueSelector = dataObjectValueSelector;
    }
    public ObservableVariantDataValueSelector()
    {
    }
    public DataObjectValueSelector getDataObjectValueSelector()
    {
        return this.dataObjectValueSelector;
    }
    public ObservableVariantDataValueSelector setDataObjectValueSelector(DataObjectValueSelector dataObjectValueSelector)
    {
        this.dataObjectValueSelector = dataObjectValueSelector;
        return this;
    }
}
