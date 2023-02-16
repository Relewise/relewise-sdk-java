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
    defaultImpl = VariantResultDetails.class)
public class VariantResultDetails
{
    public String $type = "Relewise.Client.DataTypes.VariantResultDetails, Relewise.Client";
    public String variantId;
    public Multilingual displayName;
    public HashMap<String, String> specification;
    public Integer[] assortments;
    public HashMap<String, DataValue> data;
    public MultiCurrency listPrice;
    public MultiCurrency salesPrice;
    public Boolean disabled;
    public static VariantResultDetails create(String variantId)
    {
        return new VariantResultDetails(variantId);
    }
    public VariantResultDetails(String variantId)
    {
        this.variantId = variantId;
    }
    public VariantResultDetails()
    {
    }
    public String getVariantId()
    {
        return this.variantId;
    }
    public Multilingual getDisplayName()
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
    public MultiCurrency getListPrice()
    {
        return this.listPrice;
    }
    public MultiCurrency getSalesPrice()
    {
        return this.salesPrice;
    }
    public Boolean getDisabled()
    {
        return this.disabled;
    }
    public VariantResultDetails setVariantId(String variantId)
    {
        this.variantId = variantId;;
        return this;
    }
    public VariantResultDetails setDisplayName(Multilingual displayName)
    {
        this.displayName = displayName;;
        return this;
    }
    public VariantResultDetails addToSpecification(String key, String value)
    {
        if (this.specification == null)
        {
            this.specification = new HashMap<>();
        }
        this.specification.put(key, value);
        return this;
    }
    public VariantResultDetails setSpecification(HashMap<String, String> specification)
    {
        this.specification = specification;;
        return this;
    }
    public VariantResultDetails setAssortments(Integer... assortments)
    {
        this.assortments = assortments;;
        return this;
    }
    public VariantResultDetails addToAssortments(Integer assortment)
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
    public VariantResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public VariantResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    public VariantResultDetails setListPrice(MultiCurrency listPrice)
    {
        this.listPrice = listPrice;;
        return this;
    }
    public VariantResultDetails setSalesPrice(MultiCurrency salesPrice)
    {
        this.salesPrice = salesPrice;;
        return this;
    }
    public VariantResultDetails setDisabled(Boolean disabled)
    {
        this.disabled = disabled;;
        return this;
    }
}
