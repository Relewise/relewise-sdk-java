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
    defaultImpl = UserAdministrativeAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAdministrativeAction extends Trackable
{
    public String $type = "Relewise.Client.DataTypes.UserAdministrativeAction, Relewise.Client";
    public UserConditionCollection userConditions;
    public UserAdministrativeActionUpdateAction userUpdateAction;
    public static UserAdministrativeAction create(UserConditionCollection userConditions, UserAdministrativeActionUpdateAction userUpdateAction)
    {
        return new UserAdministrativeAction(userConditions, userUpdateAction);
    }
    public UserAdministrativeAction(UserConditionCollection userConditions, UserAdministrativeActionUpdateAction userUpdateAction)
    {
        this.userConditions = userConditions;
        this.userUpdateAction = userUpdateAction;
    }
    public UserAdministrativeAction()
    {
    }
    public UserConditionCollection getUserConditions()
    {
        return this.userConditions;
    }
    public UserAdministrativeActionUpdateAction getUserUpdateAction()
    {
        return this.userUpdateAction;
    }
    public UserAdministrativeAction setUserConditions(UserConditionCollection userConditions)
    {
        this.userConditions = userConditions;
        return this;
    }
    public UserAdministrativeAction setUserUpdateAction(UserAdministrativeActionUpdateAction userUpdateAction)
    {
        this.userUpdateAction = userUpdateAction;
        return this;
    }
}
