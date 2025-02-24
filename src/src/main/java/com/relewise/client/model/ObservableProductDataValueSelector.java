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
    defaultImpl = ObservableProductDataValueSelector.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservableProductDataValueSelector extends ProductPropertySelector
{
    public String $type = "Relewise.Client.DataTypes.EntityPropertySelectors.ObservableProductDataValueSelector, Relewise.Client";
    public DataObjectValueSelector dataObjectValueSelector;
    public static ObservableProductDataValueSelector create(DataObjectValueSelector dataObjectValueSelector)
    {
        return new ObservableProductDataValueSelector(dataObjectValueSelector);
    }
    public ObservableProductDataValueSelector(DataObjectValueSelector dataObjectValueSelector)
    {
        this.dataObjectValueSelector = dataObjectValueSelector;
    }
    public ObservableProductDataValueSelector()
    {
    }
    public DataObjectValueSelector getDataObjectValueSelector()
    {
        return this.dataObjectValueSelector;
    }
    public ObservableProductDataValueSelector setDataObjectValueSelector(DataObjectValueSelector dataObjectValueSelector)
    {
        this.dataObjectValueSelector = dataObjectValueSelector;
        return this;
    }
}
