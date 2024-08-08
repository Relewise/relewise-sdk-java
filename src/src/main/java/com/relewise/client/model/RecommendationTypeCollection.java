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
    defaultImpl = RecommendationTypeCollection.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendationTypeCollection
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.RecommendationTypeCollection, Relewise.Client";
    public ArrayList<Short> unionCodes;
    public static RecommendationTypeCollection create()
    {
        return new RecommendationTypeCollection();
    }
    public RecommendationTypeCollection()
    {
    }
    public ArrayList<Short> getUnionCodes()
    {
        return this.unionCodes;
    }
    public RecommendationTypeCollection setUnionCodes(Short... unionCodes)
    {
        this.unionCodes = new ArrayList<>(Arrays.asList(unionCodes));;
        return this;
    }
    public RecommendationTypeCollection addToUnionCodes(Short unionCodes)
    {
        if (this.unionCodes == null)
        {
            this.unionCodes = new ArrayList<>();
        }
        this.unionCodes.add(unionCodes);
        return this;
    }
}
