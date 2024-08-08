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
public class User
{
    public @Nullable String authenticatedId;
    public @Nullable String temporaryId;
    public @Nullable String email;
    public @Nullable HashMap<String, String> classifications;
    public @Nullable HashMap<String, String> identifiers;
    public @Nullable HashMap<String, DataValue> data;
    public @Nullable String fingerprint;
    public static User create(@Nullable String authenticatedId, @Nullable String temporaryId, @Nullable String email, @Nullable String fingerprint, @Nullable HashMap<String, String> classifications, @Nullable HashMap<String, String> identifiers, HashMap<String, DataValue> data)
    {
        return new User(authenticatedId, temporaryId, email, fingerprint, classifications, identifiers, data);
    }
    public User(@Nullable String authenticatedId, @Nullable String temporaryId, @Nullable String email, @Nullable String fingerprint, @Nullable HashMap<String, String> classifications, @Nullable HashMap<String, String> identifiers, HashMap<String, DataValue> data)
    {
        this.authenticatedId = authenticatedId;
        this.temporaryId = temporaryId;
        this.email = email;
        this.fingerprint = fingerprint;
        this.classifications = classifications;
        this.identifiers = identifiers;
        this.data = data;
    }
    public User()
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
    public @Nullable HashMap<String, String> getClassifications()
    {
        return this.classifications;
    }
    public @Nullable HashMap<String, String> getIdentifiers()
    {
        return this.identifiers;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public @Nullable String getFingerprint()
    {
        return this.fingerprint;
    }
    public User setAuthenticatedId(String authenticatedId)
    {
        this.authenticatedId = authenticatedId;;
        return this;
    }
    public User setTemporaryId(String temporaryId)
    {
        this.temporaryId = temporaryId;;
        return this;
    }
    public User setEmail(String email)
    {
        this.email = email;;
        return this;
    }
    public User addToClassifications(String key, String value)
    {
        if (this.classifications == null)
        {
            this.classifications = new HashMap<>();
        }
        this.classifications.put(key, value);
        return this;
    }
    public User setClassifications(HashMap<String, String> classifications)
    {
        this.classifications = classifications;;
        return this;
    }
    public User addToIdentifiers(String key, String value)
    {
        if (this.identifiers == null)
        {
            this.identifiers = new HashMap<>();
        }
        this.identifiers.put(key, value);
        return this;
    }
    public User setIdentifiers(HashMap<String, String> identifiers)
    {
        this.identifiers = identifiers;;
        return this;
    }
    public User addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public User setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    public User setFingerprint(String fingerprint)
    {
        this.fingerprint = fingerprint;;
        return this;
    }
}
