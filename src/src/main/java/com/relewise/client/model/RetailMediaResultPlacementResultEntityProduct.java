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
public class RetailMediaResultPlacementResultEntityProduct
{
    public ProductResult result;
    public static RetailMediaResultPlacementResultEntityProduct create()
    {
        return new RetailMediaResultPlacementResultEntityProduct();
    }
    public RetailMediaResultPlacementResultEntityProduct()
    {
    }
    public ProductResult getResult()
    {
        return this.result;
    }
    public RetailMediaResultPlacementResultEntityProduct setResult(ProductResult result)
    {
        this.result = result;
        return this;
    }
}
