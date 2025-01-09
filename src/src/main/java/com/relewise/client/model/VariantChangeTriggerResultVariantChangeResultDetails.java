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
public class VariantChangeTriggerResultVariantChangeResultDetails
{
    public OffsetDateTime changeTime;
    public DataValue oldValue;
    public DataValue newValue;
    public ProductResultDetails product;
    public VariantResultDetails variant;
    public static VariantChangeTriggerResultVariantChangeResultDetails create(OffsetDateTime changeTime, DataValue oldValue, DataValue newValue, ProductResultDetails product, VariantResultDetails variant)
    {
        return new VariantChangeTriggerResultVariantChangeResultDetails(changeTime, oldValue, newValue, product, variant);
    }
    public VariantChangeTriggerResultVariantChangeResultDetails(OffsetDateTime changeTime, DataValue oldValue, DataValue newValue, ProductResultDetails product, VariantResultDetails variant)
    {
        this.changeTime = changeTime;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.product = product;
        this.variant = variant;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails()
    {
    }
    public OffsetDateTime getChangeTime()
    {
        return this.changeTime;
    }
    public DataValue getOldValue()
    {
        return this.oldValue;
    }
    public DataValue getNewValue()
    {
        return this.newValue;
    }
    public ProductResultDetails getProduct()
    {
        return this.product;
    }
    public VariantResultDetails getVariant()
    {
        return this.variant;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails setChangeTime(OffsetDateTime changeTime)
    {
        this.changeTime = changeTime;
        return this;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails setOldValue(DataValue oldValue)
    {
        this.oldValue = oldValue;
        return this;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails setNewValue(DataValue newValue)
    {
        this.newValue = newValue;
        return this;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails setProduct(ProductResultDetails product)
    {
        this.product = product;
        return this;
    }
    public VariantChangeTriggerResultVariantChangeResultDetails setVariant(VariantResultDetails variant)
    {
        this.variant = variant;
        return this;
    }
}
