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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentCategoryUpdate.class, name = "Relewise.Client.DataTypes.ContentCategoryUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryUpdate.class, name = "Relewise.Client.DataTypes.ProductCategoryUpdate, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategoryUpdate extends Trackable
{
    public String $type = "";
    public CategoryUpdateUpdateKind kind;
    public CategoryUpdateUpdateKind getKind()
    {
        return this.kind;
    }
    public CategoryUpdate setKind(CategoryUpdateUpdateKind kind)
    {
        this.kind = kind;
        return this;
    }
}
