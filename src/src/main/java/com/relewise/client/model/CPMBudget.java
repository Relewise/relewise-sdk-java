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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = CPMBudget.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CPMBudget extends Budget
{
    public String $type = "Relewise.Client.DataTypes.RetailMedia.CPMBudget, Relewise.Client";
    public Double costPerMille;
    public static CPMBudget create(Double costPerMille, @Nullable Double maxTotalCost)
    {
        return new CPMBudget(costPerMille, maxTotalCost);
    }
    public CPMBudget(Double costPerMille, @Nullable Double maxTotalCost)
    {
        this.costPerMille = costPerMille;
        this.maxTotalCost = maxTotalCost;
    }
    public CPMBudget()
    {
    }
    public Double getCostPerMille()
    {
        return this.costPerMille;
    }
    public CPMBudget setCostPerMille(Double costPerMille)
    {
        this.costPerMille = costPerMille;
        return this;
    }
    @Override
    public CPMBudget setMaxTotalCost(@Nullable Double maxTotalCost)
    {
        this.maxTotalCost = maxTotalCost;
        return this;
    }
    @Override
    public CPMBudget setTotalCost(Double totalCost)
    {
        this.totalCost = totalCost;
        return this;
    }
}
