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
public class RetailMediaResultPlacementResultEntity
{
    public @Nullable RetailMediaResultPlacementResultEntityProduct promotedProduct;
    public static RetailMediaResultPlacementResultEntity create()
    {
        return new RetailMediaResultPlacementResultEntity();
    }
    public RetailMediaResultPlacementResultEntity()
    {
    }
    public @Nullable RetailMediaResultPlacementResultEntityProduct getPromotedProduct()
    {
        return this.promotedProduct;
    }
    public RetailMediaResultPlacementResultEntity setPromotedProduct(@Nullable RetailMediaResultPlacementResultEntityProduct promotedProduct)
    {
        this.promotedProduct = promotedProduct;
        return this;
    }
}
