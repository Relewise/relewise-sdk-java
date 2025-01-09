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
    defaultImpl = ProductHighlightProps.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductHighlightProps extends ProductHighlightProperties
{
    public String $type = "Relewise.Client.Requests.Shared.Highlighting.ProductHighlightProps, Relewise.Client";
    public static ProductHighlightProps create()
    {
        return new ProductHighlightProps();
    }
    public ProductHighlightProps()
    {
    }
    @Override
    public ProductHighlightProps setDisplayName(Boolean displayName)
    {
        this.displayName = displayName;
        return this;
    }
    @Override
    public ProductHighlightProps setDataKeys(String... dataKeys)
    {
        this.dataKeys = dataKeys;
        return this;
    }
    public ProductHighlightProps addToDataKeys(String dataKey)
    {
        if (this.dataKeys == null)
        {
            this.dataKeys = new String[] { dataKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.dataKeys));
            existingList.add(dataKey);
            this.dataKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}
