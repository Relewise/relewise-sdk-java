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
    defaultImpl = ProductCategoryView.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCategoryView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ProductCategoryView, Relewise.Client";
    public @Nullable User user;
    public String[] idPath;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    public static ProductCategoryView create(@Nullable User user, String... idPath)
    {
        return new ProductCategoryView(user, idPath);
    }
    public ProductCategoryView(@Nullable User user, String... idPath)
    {
        this.user = user;
        this.idPath = idPath;
    }
    public ProductCategoryView()
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
    public ProductCategoryView setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    public ProductCategoryView setIdPath(String... idPath)
    {
        this.idPath = idPath;
        return this;
    }
    public ProductCategoryView addToIdPath(String idPath)
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
    public ProductCategoryView setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
