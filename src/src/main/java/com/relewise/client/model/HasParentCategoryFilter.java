package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryHasParentFilter.class, name = "Relewise.Client.Requests.Filters.ProductCategoryHasParentFilter, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryHasParentFilter.class, name = "Relewise.Client.Requests.Filters.ContentCategoryHasParentFilter, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HasParentCategoryFilter extends Filter
{
    public String $type = "Relewise.Client.Requests.Filters.HasParentCategoryFilter, Relewise.Client";
    public ArrayList<String> categoryIds;
    public ArrayList<String> getCategoryIds()
    {
        return this.categoryIds;
    }
    public HasParentCategoryFilter setCategoryIds(String... categoryIds)
    {
        this.categoryIds = new ArrayList<>(Arrays.asList(categoryIds));;
        return this;
    }
    public HasParentCategoryFilter addToCategoryIds(String categoryIds)
    {
        if (this.categoryIds == null)
        {
            this.categoryIds = new ArrayList<>();
        }
        this.categoryIds.add(categoryIds);
        return this;
    }
    @Override
    public HasParentCategoryFilter setNegated(Boolean negated)
    {
        this.negated = negated;;
        return this;
    }
}
