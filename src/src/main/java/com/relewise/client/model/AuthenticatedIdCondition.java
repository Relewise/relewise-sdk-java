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
    defaultImpl = AuthenticatedIdCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticatedIdCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.AuthenticatedIdCondition, Relewise.Client";
    public ArrayList<String> authenticatedIds;
    public static AuthenticatedIdCondition create()
    {
        return new AuthenticatedIdCondition();
    }
    public AuthenticatedIdCondition()
    {
        this.negated = false;
    }
    public static AuthenticatedIdCondition create(Boolean negated)
    {
        return new AuthenticatedIdCondition(negated);
    }
    public AuthenticatedIdCondition(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getAuthenticatedIds()
    {
        return this.authenticatedIds;
    }
    public AuthenticatedIdCondition setAuthenticatedIds(String... authenticatedIds)
    {
        this.authenticatedIds = new ArrayList<>(Arrays.asList(authenticatedIds));;
        return this;
    }
    public AuthenticatedIdCondition addToAuthenticatedIds(String authenticatedIds)
    {
        if (this.authenticatedIds == null)
        {
            this.authenticatedIds = new ArrayList<>();
        }
        this.authenticatedIds.add(authenticatedIds);
        return this;
    }
    @Override
    public AuthenticatedIdCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
