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
    defaultImpl = UserAdministrativeActionRemoveClassifications.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAdministrativeActionRemoveClassifications extends UserAdministrativeActionUpdateAction
{
    public String $type = "Relewise.Client.DataTypes.UserAdministrativeAction+RemoveClassifications, Relewise.Client";
    /** Optional list of classification keys to remove from users matching <code>UserConditions</code>. If <code>null</code> removes all classifications. */
    public @Nullable String[] classificationKeys;
    public static UserAdministrativeActionRemoveClassifications create()
    {
        return new UserAdministrativeActionRemoveClassifications();
    }
    public UserAdministrativeActionRemoveClassifications()
    {
    }
    /** Optional list of classification keys to remove from users matching <code>UserConditions</code>. If <code>null</code> removes all classifications. */
    public @Nullable String[] getClassificationKeys()
    {
        return this.classificationKeys;
    }
    /** Optional list of classification keys to remove from users matching <code>UserConditions</code>. If <code>null</code> removes all classifications. */
    public UserAdministrativeActionRemoveClassifications setClassificationKeys(String... classificationKeys)
    {
        this.classificationKeys = classificationKeys;
        return this;
    }
    /** Optional list of classification keys to remove from users matching <code>UserConditions</code>. If <code>null</code> removes all classifications. */
    public UserAdministrativeActionRemoveClassifications addToClassificationKeys(String classificationKey)
    {
        if (this.classificationKeys == null)
        {
            this.classificationKeys = new String[] { classificationKey };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.classificationKeys));
            existingList.add(classificationKey);
            this.classificationKeys = existingList.toArray(new String[0]);
        }
        return this;
    }
}
