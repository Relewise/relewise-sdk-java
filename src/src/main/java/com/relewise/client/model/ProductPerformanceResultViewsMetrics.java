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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPerformanceResultViewsMetrics
{
    public Integer total;
    public static ProductPerformanceResultViewsMetrics create()
    {
        return new ProductPerformanceResultViewsMetrics();
    }
    public ProductPerformanceResultViewsMetrics()
    {
    }
    public Integer getTotal()
    {
        return this.total;
    }
    public ProductPerformanceResultViewsMetrics setTotal(Integer total)
    {
        this.total = total;
        return this;
    }
}
