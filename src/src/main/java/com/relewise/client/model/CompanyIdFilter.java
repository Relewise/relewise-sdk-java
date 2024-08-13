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
    defaultImpl = CompanyIdFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyIdFilter extends Filter implements ICompanyFilter
{
    public String $type = "Relewise.Client.Requests.Filters.CompanyIdFilter, Relewise.Client";
    public ArrayList<String> companyIds;
    public static CompanyIdFilter create()
    {
        return new CompanyIdFilter();
    }
    public CompanyIdFilter()
    {
        this.negated = false;
    }
    public static CompanyIdFilter create(Boolean negated)
    {
        return new CompanyIdFilter(negated);
    }
    public CompanyIdFilter(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getCompanyIds()
    {
        return this.companyIds;
    }
    public CompanyIdFilter setCompanyIds(String... companyIds)
    {
        this.companyIds = new ArrayList<>(Arrays.asList(companyIds));;
        return this;
    }
    public CompanyIdFilter addToCompanyIds(String companyIds)
    {
        if (this.companyIds == null)
        {
            this.companyIds = new ArrayList<>();
        }
        this.companyIds.add(companyIds);
        return this;
    }
    @Override
    public CompanyIdFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CompanyIdFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
