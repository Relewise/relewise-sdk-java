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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CPMBudget.class, name = "Relewise.Client.DataTypes.RetailMedia.CPMBudget, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Budget
{
    public String $type = "";
    public @Nullable Double maxTotalCost;
    public Double totalCost;
    public @Nullable Double getMaxTotalCost()
    {
        return this.maxTotalCost;
    }
    public Double getTotalCost()
    {
        return this.totalCost;
    }
    public Budget setMaxTotalCost(@Nullable Double maxTotalCost)
    {
        this.maxTotalCost = maxTotalCost;
        return this;
    }
    public Budget setTotalCost(Double totalCost)
    {
        this.totalCost = totalCost;
        return this;
    }
}
