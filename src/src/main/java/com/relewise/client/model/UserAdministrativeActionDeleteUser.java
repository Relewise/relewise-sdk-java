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
    defaultImpl = UserAdministrativeActionDeleteUser.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAdministrativeActionDeleteUser extends UserAdministrativeActionUpdateAction
{
    public String $type = "Relewise.Client.DataTypes.UserAdministrativeAction+DeleteUser, Relewise.Client";
    public static UserAdministrativeActionDeleteUser create()
    {
        return new UserAdministrativeActionDeleteUser();
    }
    public UserAdministrativeActionDeleteUser()
    {
    }
}
