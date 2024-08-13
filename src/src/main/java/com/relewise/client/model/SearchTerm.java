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
    defaultImpl = SearchTerm.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTerm extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.SearchTerm, Relewise.Client";
    public Language language;
    public User user;
    public String term;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    public static SearchTerm create(Language language, User user, String term)
    {
        return new SearchTerm(language, user, term);
    }
    public SearchTerm(Language language, User user, String term)
    {
        this.language = language;
        this.user = user;
        this.term = term;
    }
    public SearchTerm()
    {
    }
    public Language getLanguage()
    {
        return this.language;
    }
    public User getUser()
    {
        return this.user;
    }
    public String getTerm()
    {
        return this.term;
    }
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    public SearchTerm setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public SearchTerm setUser(User user)
    {
        this.user = user;
        return this;
    }
    public SearchTerm setTerm(String term)
    {
        this.term = term;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public SearchTerm setChannel(Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
