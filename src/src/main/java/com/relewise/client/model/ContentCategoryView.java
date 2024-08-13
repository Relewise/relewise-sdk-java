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
    defaultImpl = ContentCategoryView.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentCategoryView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ContentCategoryView, Relewise.Client";
    public @Nullable User user;
    public String[] idPath;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    public static ContentCategoryView create(@Nullable User user, String... idPath)
    {
        return new ContentCategoryView(user, idPath);
    }
    public ContentCategoryView(@Nullable User user, String... idPath)
    {
        this.user = user;
        this.idPath = idPath;
    }
    public ContentCategoryView()
    {
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public String[] getIdPath()
    {
        return this.idPath;
    }
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    public ContentCategoryView setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    public ContentCategoryView setIdPath(String... idPath)
    {
        this.idPath = idPath;
        return this;
    }
    public ContentCategoryView addToIdPath(String idPath)
    {
        if (this.idPath == null)
        {
            this.idPath = new String[] { idPath };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.idPath));
            existingList.add(idPath);
            this.idPath = existingList.toArray(new String[0]);
        }
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public ContentCategoryView setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
