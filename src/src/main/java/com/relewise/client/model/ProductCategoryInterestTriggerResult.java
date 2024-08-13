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
    defaultImpl = ProductCategoryInterestTriggerResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryInterestTriggerResult implements ITriggerResult
{
    public String $type = "Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult, Relewise.Client";
    public UserResultDetails user;
    public ProductCategoryInterestTriggerResultCategory[] categories;
    public static ProductCategoryInterestTriggerResult create()
    {
        return new ProductCategoryInterestTriggerResult();
    }
    public ProductCategoryInterestTriggerResult()
    {
    }
    public UserResultDetails getUser()
    {
        return this.user;
    }
    public ProductCategoryInterestTriggerResultCategory[] getCategories()
    {
        return this.categories;
    }
    public ProductCategoryInterestTriggerResult setUser(UserResultDetails user)
    {
        this.user = user;
        return this;
    }
    public ProductCategoryInterestTriggerResult setCategories(ProductCategoryInterestTriggerResultCategory... categories)
    {
        this.categories = categories;
        return this;
    }
    public ProductCategoryInterestTriggerResult addToCategories(ProductCategoryInterestTriggerResultCategory category)
    {
        if (this.categories == null)
        {
            this.categories = new ProductCategoryInterestTriggerResultCategory[] { category };
        }
        else
        {
            ArrayList<ProductCategoryInterestTriggerResultCategory> existingList = new ArrayList<>(Arrays.asList(this.categories));
            existingList.add(category);
            this.categories = existingList.toArray(new ProductCategoryInterestTriggerResultCategory[0]);
        }
        return this;
    }
}
