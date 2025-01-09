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
public class ProductPerformanceResultCartMetrics
{
    public Integer opened;
    public static ProductPerformanceResultCartMetrics create()
    {
        return new ProductPerformanceResultCartMetrics();
    }
    public ProductPerformanceResultCartMetrics()
    {
    }
    public Integer getOpened()
    {
        return this.opened;
    }
    public ProductPerformanceResultCartMetrics setOpened(Integer opened)
    {
        this.opened = opened;
        return this;
    }
}
