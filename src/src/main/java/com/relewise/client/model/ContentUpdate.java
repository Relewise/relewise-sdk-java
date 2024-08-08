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
    property = "$type",
    defaultImpl = ContentUpdate.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentUpdate extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.ContentUpdate, Relewise.Client";
    public Content content;
    public ContentUpdateUpdateKind kind;
    public static ContentUpdate create(Content content)
    {
        return new ContentUpdate(content);
    }
    public ContentUpdate(Content content)
    {
        this.content = content;
        this.kind = ContentUpdateUpdateKind.UpdateAndAppend;
    }
    public static ContentUpdate create(Content content, ContentUpdateUpdateKind kind)
    {
        return new ContentUpdate(content, kind);
    }
    public ContentUpdate(Content content, ContentUpdateUpdateKind kind)
    {
        this.content = content;
        this.kind = kind;
    }
    public ContentUpdate()
    {
        this.kind = ContentUpdateUpdateKind.UpdateAndAppend;
    }
    public Content getContent()
    {
        return this.content;
    }
    public ContentUpdateUpdateKind getKind()
    {
        return this.kind;
    }
    public ContentUpdate setContent(Content content)
    {
        this.content = content;;
        return this;
    }
    public ContentUpdate setKind(ContentUpdateUpdateKind kind)
    {
        this.kind = kind;;
        return this;
    }
}
