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
public class RetailMediaResultPlacementResultEntityDisplayAd
{
    public DisplayAdResult result;
    public static RetailMediaResultPlacementResultEntityDisplayAd create()
    {
        return new RetailMediaResultPlacementResultEntityDisplayAd();
    }
    public RetailMediaResultPlacementResultEntityDisplayAd()
    {
    }
    public DisplayAdResult getResult()
    {
        return this.result;
    }
    public RetailMediaResultPlacementResultEntityDisplayAd setResult(DisplayAdResult result)
    {
        this.result = result;
        return this;
    }
}
