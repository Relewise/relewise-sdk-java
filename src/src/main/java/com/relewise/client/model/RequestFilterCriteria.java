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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestFilterCriteria
{
    public FilterCollection includes;
    public FilterCollection excludes;
    public @Nullable IntegerRange count;
    public static RequestFilterCriteria create()
    {
        return new RequestFilterCriteria();
    }
    public RequestFilterCriteria()
    {
    }
    public FilterCollection getIncludes()
    {
        return this.includes;
    }
    public FilterCollection getExcludes()
    {
        return this.excludes;
    }
    public @Nullable IntegerRange getCount()
    {
        return this.count;
    }
    public RequestFilterCriteria setIncludes(FilterCollection includes)
    {
        this.includes = includes;
        return this;
    }
    public RequestFilterCriteria setExcludes(FilterCollection excludes)
    {
        this.excludes = excludes;
        return this;
    }
    public RequestFilterCriteria setCount(@Nullable IntegerRange count)
    {
        this.count = count;
        return this;
    }
}
