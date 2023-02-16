package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = ProductHasVariantsFilter.class)
public class ProductHasVariantsFilter extends Filter implements IProductFilter
{
    public String $type = "Relewise.Client.Requests.Filters.ProductHasVariantsFilter, Relewise.Client";
    public IntegerRange numberOfVariants;
    public static ProductHasVariantsFilter create(IntegerRange numberOfVariants)
    {
        return new ProductHasVariantsFilter(numberOfVariants);
    }
    public ProductHasVariantsFilter(IntegerRange numberOfVariants)
    {
        this.numberOfVariants = numberOfVariants;
        this.negated = false;
    }
    public static ProductHasVariantsFilter create(IntegerRange numberOfVariants, Boolean negated)
    {
        return new ProductHasVariantsFilter(numberOfVariants, negated);
    }
    public ProductHasVariantsFilter(IntegerRange numberOfVariants, Boolean negated)
    {
        this.numberOfVariants = numberOfVariants;
        this.negated = negated;
    }
    public ProductHasVariantsFilter()
    {
        this.negated = false;
    }
    public IntegerRange getNumberOfVariants()
    {
        return this.numberOfVariants;
    }
    public ProductHasVariantsFilter setNumberOfVariants(IntegerRange numberOfVariants)
    {
        this.numberOfVariants = numberOfVariants;;
        return this;
    }
    @Override
    public ProductHasVariantsFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
