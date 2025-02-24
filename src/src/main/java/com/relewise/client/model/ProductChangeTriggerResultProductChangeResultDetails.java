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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductChangeTriggerResultProductChangeResultDetails
{
    public OffsetDateTime changeTimeUtc;
    public DataValue oldValue;
    public DataValue newValue;
    public ProductResultDetails product;
    public static ProductChangeTriggerResultProductChangeResultDetails create(OffsetDateTime changeTimeUtc, DataValue oldValue, DataValue newValue, ProductResultDetails product)
    {
        return new ProductChangeTriggerResultProductChangeResultDetails(changeTimeUtc, oldValue, newValue, product);
    }
    public ProductChangeTriggerResultProductChangeResultDetails(OffsetDateTime changeTimeUtc, DataValue oldValue, DataValue newValue, ProductResultDetails product)
    {
        this.changeTimeUtc = changeTimeUtc;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.product = product;
    }
    public ProductChangeTriggerResultProductChangeResultDetails()
    {
    }
    public OffsetDateTime getChangeTimeUtc()
    {
        return this.changeTimeUtc;
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
    public ProductChangeTriggerResultProductChangeResultDetails setChangeTimeUtc(OffsetDateTime changeTimeUtc)
    {
        this.changeTimeUtc = changeTimeUtc;
        return this;
    }
    public ProductChangeTriggerResultProductChangeResultDetails setOldValue(DataValue oldValue)
    {
        this.oldValue = oldValue;
        return this;
    }
    public ProductChangeTriggerResultProductChangeResultDetails setNewValue(DataValue newValue)
    {
        this.newValue = newValue;
        return this;
    }
    public ProductChangeTriggerResultProductChangeResultDetails setProduct(ProductResultDetails product)
    {
        this.product = product;
        return this;
    }
}
