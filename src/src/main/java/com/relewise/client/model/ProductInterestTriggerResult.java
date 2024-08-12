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
    defaultImpl = ProductInterestTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInterestTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductInterestTriggerResult, Relewise.Client";
    public UserResultDetails user;
    public ProductInterestTriggerResultProductAndVariant[] products;
    public static ProductInterestTriggerResult create()
    {
        return new ProductInterestTriggerResult();
    }
    public ProductInterestTriggerResult()
    {
    }
    public UserResultDetails getUser()
    {
        return this.user;
    }
    public ProductInterestTriggerResultProductAndVariant[] getProducts()
    {
        return this.products;
    }
    public ProductInterestTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
    public ProductInterestTriggerResult setProducts(ProductInterestTriggerResultProductAndVariant... products)
    {
        this.products = products;
        return this;
    }
    public ProductInterestTriggerResult addToProducts(ProductInterestTriggerResultProductAndVariant product)
    {
        if (this.products == null)
        {
            this.products = new ProductInterestTriggerResultProductAndVariant[] { product };
        }
        else
        {
            ArrayList<ProductInterestTriggerResultProductAndVariant> existingList = new ArrayList<>(Arrays.asList(this.products));
            existingList.add(product);
            this.products = existingList.toArray(new ProductInterestTriggerResultProductAndVariant[0]);
        }
        return this;
    }
}
