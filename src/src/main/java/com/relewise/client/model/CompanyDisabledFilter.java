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
    property = "$type",
    defaultImpl = CompanyDisabledFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyDisabledFilter extends Filter implements ICompanyFilter
{
    public String $type = "Relewise.Client.Requests.Filters.CompanyDisabledFilter, Relewise.Client";
    public static CompanyDisabledFilter create()
    {
        return new CompanyDisabledFilter();
    }
    public CompanyDisabledFilter()
    {
        this.negated = false;
    }
    public static CompanyDisabledFilter create(Boolean negated)
    {
        return new CompanyDisabledFilter(negated);
    }
    public CompanyDisabledFilter(Boolean negated)
    {
        this.negated = negated;
    }
    @Override
    public CompanyDisabledFilter setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
    @Override
    public CompanyDisabledFilter setSettings(@Nullable FilterSettings settings)
    {
        this.settings = settings;
        return this;
    }
}
