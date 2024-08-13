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
    defaultImpl = ContentView.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ContentView, Relewise.Client";
    public @Nullable User user;
    public Content content;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    public static ContentView create(@Nullable User user, Content content)
    {
        return new ContentView(user, content);
    }
    public ContentView(@Nullable User user, Content content)
    {
        this.user = user;
        this.content = content;
    }
    public ContentView()
    {
    }
    public @Nullable User getUser()
    {
        return this.user;
    }
    public Content getContent()
    {
        return this.content;
    }
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    public ContentView setUser(@Nullable User user)
    {
        this.user = user;
        return this;
    }
    public ContentView setContent(Content content)
    {
        this.content = content;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public ContentView setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
