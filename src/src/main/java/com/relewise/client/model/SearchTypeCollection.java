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
    defaultImpl = SearchTypeCollection.class)
public class SearchTypeCollection
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.SearchTypeCollection, Relewise.Client";
    public ArrayList<Short> unionCodes;
    public static SearchTypeCollection create()
    {
        return new SearchTypeCollection();
    }
    public SearchTypeCollection()
    {
    }
    public ArrayList<Short> getUnionCodes()
    {
        return this.unionCodes;
    }
    public SearchTypeCollection setUnionCodes(Short... unionCodes)
    {
        this.unionCodes = new ArrayList<>(Arrays.asList(unionCodes));;
        return this;
    }
    public SearchTypeCollection addToUnionCodes(Short unionCodes)
    {
        if (this.unionCodes == null)
        {
            this.unionCodes = new ArrayList<>();
        }
        this.unionCodes.add(unionCodes);
        return this;
    }
}
