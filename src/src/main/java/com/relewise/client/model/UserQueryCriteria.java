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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserQueryCriteria
{
    public @Nullable String authenticatedId;
    public @Nullable String temporaryId;
    public @Nullable String email;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public @Nullable HashMap<String, String> identifiers;
    public static UserQueryCriteria create()
    {
        return new UserQueryCriteria();
    }
    public UserQueryCriteria()
    {
    }
    public @Nullable String getAuthenticatedId()
    {
        return this.authenticatedId;
    }
    public @Nullable String getTemporaryId()
    {
        return this.temporaryId;
    }
    public @Nullable String getEmail()
    {
        return this.email;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public @Nullable HashMap<String, String> getIdentifiers()
    {
        return this.identifiers;
    }
    public UserQueryCriteria setAuthenticatedId(String authenticatedId)
    {
        this.authenticatedId = authenticatedId;;
        return this;
    }
    public UserQueryCriteria setTemporaryId(String temporaryId)
    {
        this.temporaryId = temporaryId;;
        return this;
    }
    public UserQueryCriteria setEmail(String email)
    {
        this.email = email;;
        return this;
    }
    public UserQueryCriteria setLanguage(Language language)
    {
        this.language = language;;
        return this;
    }
    public UserQueryCriteria setCurrency(Currency currency)
    {
        this.currency = currency;;
        return this;
    }
    public UserQueryCriteria addToIdentifiers(String key, String value)
    {
        if (this.identifiers == null)
        {
            this.identifiers = new HashMap<>();
        }
        this.identifiers.put(key, value);
        return this;
    }
    public UserQueryCriteria setIdentifiers(HashMap<String, String> identifiers)
    {
        this.identifiers = identifiers;;
        return this;
    }
}
