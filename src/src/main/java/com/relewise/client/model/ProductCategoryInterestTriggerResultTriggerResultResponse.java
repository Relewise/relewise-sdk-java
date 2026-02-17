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
    defaultImpl = ProductCategoryInterestTriggerResultTriggerResultResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryInterestTriggerResultTriggerResultResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Triggers.TriggerResultResponse`1[[Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult, Relewise.Client, Version=1.280.0.0, Culture=neutral, PublicKeyToken=null]], Relewise.Client";
    public ProductCategoryInterestTriggerResult result;
    public static ProductCategoryInterestTriggerResultTriggerResultResponse create()
    {
        return new ProductCategoryInterestTriggerResultTriggerResultResponse();
    }
    public ProductCategoryInterestTriggerResultTriggerResultResponse()
    {
    }
    public ProductCategoryInterestTriggerResult getResult()
    {
        return this.result;
    }
    public ProductCategoryInterestTriggerResultTriggerResultResponse setResult(ProductCategoryInterestTriggerResult result)
    {
        this.result = result;
        return this;
    }
    @Override
    public ProductCategoryInterestTriggerResultTriggerResultResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;
        return this;
    }
}
