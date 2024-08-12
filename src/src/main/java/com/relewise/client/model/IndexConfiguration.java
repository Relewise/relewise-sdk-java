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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndexConfiguration
{
    public LanguageIndexConfiguration language;
    public ProductIndexConfiguration product;
    public ContentIndexConfiguration content;
    public ProductCategoryIndexConfiguration productCategory;
    public static IndexConfiguration create()
    {
        return new IndexConfiguration();
    }
    public IndexConfiguration()
    {
    }
    public LanguageIndexConfiguration getLanguage()
    {
        return this.language;
    }
    public ProductIndexConfiguration getProduct()
    {
        return this.product;
    }
    public ContentIndexConfiguration getContent()
    {
        return this.content;
    }
    public ProductCategoryIndexConfiguration getProductCategory()
    {
        return this.productCategory;
    }
    public IndexConfiguration setLanguage(LanguageIndexConfiguration language)
    {
        this.language = language;
        return this;
    }
    public IndexConfiguration setProduct(ProductIndexConfiguration product)
    {
        this.product = product;
        return this;
    }
    public IndexConfiguration setContent(ContentIndexConfiguration content)
    {
        this.content = content;
        return this;
    }
    public IndexConfiguration setProductCategory(ProductCategoryIndexConfiguration productCategory)
    {
        this.productCategory = productCategory;
        return this;
    }
}
