package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    defaultImpl = VariantResult.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantResult
{
    public String $type = "Relewise.Client.DataTypes.VariantResult, Relewise.Client";
    public String variantId;
    public String displayName;
    public HashMap<String, String> specification;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public Integer rank;
    public @Nullable Double listPrice;
    public @Nullable Double salesPrice;
    public static VariantResult create(String variantId, Integer rank)
    {
        return new VariantResult(variantId, rank);
    }
    public VariantResult(String variantId, Integer rank)
    {
        this.variantId = variantId;
        this.rank = rank;
    }
    public VariantResult()
    {
    }
    public String getVariantId()
    {
        return this.variantId;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public HashMap<String, String> getSpecification()
    {
        return this.specification;
    }
    public Integer[] getAssortments()
    {
        return this.assortments;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public Integer getRank()
    {
        return this.rank;
    }
    public @Nullable Double getListPrice()
    {
        return this.listPrice;
    }
    public @Nullable Double getSalesPrice()
    {
        return this.salesPrice;
    }
    public VariantResult setVariantId(String variantId)
    {
        this.variantId = variantId;;
        return this;
    }
    public VariantResult setDisplayName(String displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public VariantResult addToSpecification(String key, String value)
    {
        if (this.specification == null)
        {
            this.specification = new HashMap<>();
        }
        this.specification.put(key, value);
        return this;
    }
    public VariantResult setSpecification(HashMap<String, String> specification)
    {
        this.specification = specification;;
        return this;
    }
    public VariantResult setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public VariantResult addToAssortments(Integer assortment)
    {
        if (this.assortments == null)
        {
            this.assortments = new Integer[] { assortment };
        }
        else
        {
            ArrayList<Integer> existingList = new ArrayList<>(Arrays.asList(this.assortments));
            existingList.add(assortment);
            this.assortments = existingList.toArray(new Integer[0]);
        }
        return this;
    }
    public VariantResult addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public VariantResult setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    public VariantResult setRank(Integer rank)
    {
        this.rank = rank;;
        return this;
    }
    public VariantResult setListPrice(@Nullable Double listPrice)
    {
        this.listPrice = listPrice;;
        return this;
    }
    public VariantResult setSalesPrice(@Nullable Double salesPrice)
    {
        this.salesPrice = salesPrice;;
        return this;
    }
}
