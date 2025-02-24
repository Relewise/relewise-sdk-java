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
    defaultImpl = ContentCategoryUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryUpdate extends CategoryUpdate
{
    public String $type = "Relewise.Client.DataTypes.ContentCategoryUpdate, Relewise.Client";
    public ContentCategory category;
    public static ContentCategoryUpdate create(ContentCategory category)
    {
        return new ContentCategoryUpdate(category);
    }
    public ContentCategoryUpdate(ContentCategory category)
    {
        this.category = category;
        this.kind = CategoryUpdateUpdateKind.UpdateAndAppend;
    }
    public static ContentCategoryUpdate create(ContentCategory category, CategoryUpdateUpdateKind kind)
    {
        return new ContentCategoryUpdate(category, kind);
    }
    public ContentCategoryUpdate(ContentCategory category, CategoryUpdateUpdateKind kind)
    {
        this.category = category;
        this.kind = kind;
    }
    public ContentCategoryUpdate()
    {
        this.kind = CategoryUpdateUpdateKind.UpdateAndAppend;
    }
    public ContentCategory getCategory()
    {
        return this.category;
    }
    public ContentCategoryUpdate setCategory(ContentCategory category)
    {
        this.category = category;
        return this;
    }
    @Override
    public ContentCategoryUpdate setKind(CategoryUpdateUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
}
