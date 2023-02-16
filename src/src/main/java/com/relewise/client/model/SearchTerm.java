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
    defaultImpl = SearchTerm.class)
public class SearchTerm extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.SearchTerm, Relewise.Client";
    public Language language;
    public User user;
    public String term;
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
    public SearchTerm setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public SearchTerm setUser(User user)
    {
        this.user = user;;
        return this;
    }
    public SearchTerm setTerm(String term)
    {
        this.term = term;;
        return this;
    }
}
