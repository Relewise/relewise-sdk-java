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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class User
{
    /** A persistent Id for current user, e.g. a database-id This Id should never be expected to change in the future */
    public @Nullable String authenticatedId;
    /** A TemporaryId, likely to change in the future, e.g. a CookieId in a web context */
    public @Nullable String temporaryId;
    /** The email of the user */
    public @Nullable String email;
    /** Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources */
    public @Nullable HashMap<String, String> classifications;
    /** A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc. */
    public @Nullable HashMap<String, String> identifiers;
    /** Data stored on the user */
    public @Nullable HashMap<String, DataValue> data;
    /** A fingerprint, highly likely to change in the future, e.g. between sessions */
    public @Nullable String fingerprint;
    public @Nullable Channel channel;
    /** Company the user is associated with in the current context (Note: Companies themselves can be associated with a parent company, if the current user is acting on the behalf of a hierarchical chain of up to 2 companies) */
    public @Nullable Company company;
    /**
     * User DTO
     * @param authenticatedId A persistent Id for current user, e.g. a database-id
     * @param temporaryId A TemporaryId, likely to change in the future, e.g. a CookieId in a web context
     * @param email The email of the user
     * @param fingerprint A fingerprint, highly likely to change in the future, e.g. between a users sessions
     * @param classifications Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources
     * @param identifiers A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc.
     * @param data Data stored on the user
     */
    public static User create(@Nullable String authenticatedId, @Nullable String temporaryId, @Nullable String email, @Nullable String fingerprint, @Nullable HashMap<String, String> classifications, @Nullable HashMap<String, String> identifiers, @Nullable HashMap<String, DataValue> data)
    {
        return new User(authenticatedId, temporaryId, email, fingerprint, classifications, identifiers, data);
    }
    /**
     * User DTO
     * @param authenticatedId A persistent Id for current user, e.g. a database-id
     * @param temporaryId A TemporaryId, likely to change in the future, e.g. a CookieId in a web context
     * @param email The email of the user
     * @param fingerprint A fingerprint, highly likely to change in the future, e.g. between a users sessions
     * @param classifications Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources
     * @param identifiers A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc.
     * @param data Data stored on the user
     */
    public User(@Nullable String authenticatedId, @Nullable String temporaryId, @Nullable String email, @Nullable String fingerprint, @Nullable HashMap<String, String> classifications, @Nullable HashMap<String, String> identifiers, @Nullable HashMap<String, DataValue> data)
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
    /** A persistent Id for current user, e.g. a database-id This Id should never be expected to change in the future */
    public @Nullable String getAuthenticatedId()
    {
        return this.authenticatedId;
    }
    /** A TemporaryId, likely to change in the future, e.g. a CookieId in a web context */
    public @Nullable String getTemporaryId()
    {
        return this.temporaryId;
    }
    /** The email of the user */
    public @Nullable String getEmail()
    {
        return this.email;
    }
    /** Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources */
    public @Nullable HashMap<String, String> getClassifications()
    {
        return this.classifications;
    }
    /** A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc. */
    public @Nullable HashMap<String, String> getIdentifiers()
    {
        return this.identifiers;
    }
    /** Data stored on the user */
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    /** A fingerprint, highly likely to change in the future, e.g. between sessions */
    public @Nullable String getFingerprint()
    {
        return this.fingerprint;
    }
    public @Nullable Channel getChannel()
    {
        return this.channel;
    }
    /** Company the user is associated with in the current context (Note: Companies themselves can be associated with a parent company, if the current user is acting on the behalf of a hierarchical chain of up to 2 companies) */
    public @Nullable Company getCompany()
    {
        return this.company;
    }
    /** A persistent Id for current user, e.g. a database-id This Id should never be expected to change in the future */
    public User setAuthenticatedId(@Nullable String authenticatedId)
    {
        this.authenticatedId = authenticatedId;
        return this;
    }
    /** A TemporaryId, likely to change in the future, e.g. a CookieId in a web context */
    public User setTemporaryId(@Nullable String temporaryId)
    {
        this.temporaryId = temporaryId;
        return this;
    }
    /** The email of the user */
    public User setEmail(@Nullable String email)
    {
        this.email = email;
        return this;
    }
    /** Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources */
    public User addToClassifications(String key, String value)
    {
        if (this.classifications == null)
        {
            this.classifications = new HashMap<>();
        }
        this.classifications.put(key, value);
        return this;
    }
    /** Segmentation data about the user, e.g. Country or other segmentation, useful for passing known information about the user from a CRM, CDP and other sources */
    public User setClassifications(@Nullable HashMap<String, String> classifications)
    {
        this.classifications = classifications;
        return this;
    }
    /** A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc. */
    public User addToIdentifiers(String key, String value)
    {
        if (this.identifiers == null)
        {
            this.identifiers = new HashMap<>();
        }
        this.identifiers.put(key, value);
        return this;
    }
    /** A set of additional ids associated with the user, e.g. ERP customer id, Marketing id, CDP id etc. */
    public User setIdentifiers(@Nullable HashMap<String, String> identifiers)
    {
        this.identifiers = identifiers;
        return this;
    }
    /** Data stored on the user */
    public User addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    /** Data stored on the user */
    public User setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    /** A fingerprint, highly likely to change in the future, e.g. between sessions */
    public User setFingerprint(@Nullable String fingerprint)
    {
        this.fingerprint = fingerprint;
        return this;
    }
    public User setChannel(@Nullable Channel channel)
    {
        this.channel = channel;
        return this;
    }
    /** Company the user is associated with in the current context (Note: Companies themselves can be associated with a parent company, if the current user is acting on the behalf of a hierarchical chain of up to 2 companies) */
    public User setCompany(@Nullable Company company)
    {
        this.company = company;
        return this;
    }
}
