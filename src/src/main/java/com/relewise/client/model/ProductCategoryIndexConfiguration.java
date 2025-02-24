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
    defaultImpl = ProductCategoryIndexConfiguration.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryIndexConfiguration extends CategoryIndexConfiguration
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.ProductCategoryIndexConfiguration, Relewise.Client";
    public static ProductCategoryIndexConfiguration create()
    {
        return new ProductCategoryIndexConfiguration();
    }
    public ProductCategoryIndexConfiguration()
    {
    }
    @Override
    public ProductCategoryIndexConfiguration setUnspecified(CategoryIndexConfigurationEntry unspecified)
    {
        this.unspecified = unspecified;
        return this;
    }
}
