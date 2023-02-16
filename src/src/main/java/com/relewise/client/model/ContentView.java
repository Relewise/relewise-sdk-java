package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = ContentView.class)
public class ContentView extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.ContentView, Relewise.Client";
    public @Nullable User user;
    public Content content;
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
    public ContentView setUser(User user)
    {
        this.user = user;;
        return this;
    }
    public ContentView setContent(Content content)
    {
        this.content = content;;
        return this;
    }
}
