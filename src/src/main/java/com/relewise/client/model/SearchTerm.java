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
    
/** Records a search term entered by a user. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchTerm.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTerm extends Trackable implements IUserIdentifier
{
    public String $type = "Relewise.Client.DataTypes.SearchTerm, Relewise.Client";
    /** The language of the search. Its value must contain a non-whitespace character. */
    public Language language;
    /** The user who entered the search term, if known. */
    public User user;
    /** The text entered by the user. It must contain a non-whitespace character. */
    public String term;
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel channel;
    /**
     * Creates a search term for tracking.
     * @param language The language of the search.
     * @param user The user who entered the search term, if known.
     * @param term The text entered by the user.
     */
    public static SearchTerm create(Language language, User user, String term)
    {
        return new SearchTerm(language, user, term);
    }
    /**
     * Creates a search term for tracking.
     * @param language The language of the search.
     * @param user The user who entered the search term, if known.
     * @param term The text entered by the user.
     */
    public SearchTerm(Language language, User user, String term)
    {
        this.language = language;
        this.user = user;
        this.term = term;
    }
    public SearchTerm()
    {
    }
    /** The language of the search. Its value must contain a non-whitespace character. */
    public Language getLanguage()
    {
        return this.language;
    }
    /** The user who entered the search term, if known. */
    public User getUser()
    {
        return this.user;
    }
    /** The text entered by the user. It must contain a non-whitespace character. */
    public String getTerm()
    {
        return this.term;
    }
    /** @deprecated Use User.Channel instead. */
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    /** The language of the search. Its value must contain a non-whitespace character. */
    public SearchTerm setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    /** The user who entered the search term, if known. */
    public SearchTerm setUser(User user)
    {
        this.user = user;
        return this;
    }
    /** The text entered by the user. It must contain a non-whitespace character. */
    public SearchTerm setTerm(String term)
    {
        this.term = term;
        return this;
    }
    /** @deprecated Use User.Channel instead. */
    public SearchTerm setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
}
