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
    defaultImpl = UserAdministrativeActionRemoveIdentifiers.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAdministrativeActionRemoveIdentifiers extends UserAdministrativeActionUpdateAction
{
    public String $type = "Relewise.Client.DataTypes.UserAdministrativeAction+RemoveIdentifiers, Relewise.Client";
    /** Optional list of identifier keys whose values should be removed from users matching <code>UserConditions</code>. If <code>null</code> removes all identifiers. */
    public @Nullable String[] identifierKeys;
    public static UserAdministrativeActionRemoveIdentifiers create()
    {
        return new UserAdministrativeActionRemoveIdentifiers();
    }
    public UserAdministrativeActionRemoveIdentifiers()
    {
    }
    /** Optional list of identifier keys whose values should be removed from users matching <code>UserConditions</code>. If <code>null</code> removes all identifiers. */
    public @Nullable String[] getIdentifierKeys()
    {
        return this.identifierKeys;
    }
    /** Optional list of identifier keys whose values should be removed from users matching <code>UserConditions</code>. If <code>null</code> removes all identifiers. */
    public UserAdministrativeActionRemoveIdentifiers setIdentifierKeys(String... identifierKeys)
    {
        this.identifierKeys = identifierKeys;
        return this;
    }
    /** Optional list of identifier keys whose values should be removed from users matching <code>UserConditions</code>. If <code>null</code> removes all identifiers. */
    public UserAdministrativeActionRemoveIdentifiers addToIdentifierKeys(String identifierKey)
    {
        if (this.identifierKeys == null)
        {
            this.identifierKeys = new String[] { identifierKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.identifierKeys));
            existingList.add(identifierKey);
            this.identifierKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}
