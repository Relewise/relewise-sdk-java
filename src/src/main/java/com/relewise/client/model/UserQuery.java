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
    defaultImpl = UserQuery.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserQuery extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Queries.UserQuery, Relewise.Client";
    public UserQueryCriteria[] criteria;
    public @Nullable Language language;
    public @Nullable Currency currency;
    public static UserQuery create(@Nullable Language language, @Nullable Currency currency, UserQueryCriteria... criteria)
    {
        return new UserQuery(language, currency, criteria);
    }
    public UserQuery(@Nullable Language language, @Nullable Currency currency, UserQueryCriteria... criteria)
    {
        this.language = language;
        this.currency = currency;
        this.criteria = criteria;
    }
    public static UserQuery create(UserQueryCriteria... criteria)
    {
        return new UserQuery(criteria);
    }
    public UserQuery(UserQueryCriteria... criteria)
    {
        this.criteria = criteria;
    }
    public UserQuery()
    {
    }
    public UserQueryCriteria[] getCriteria()
    {
        return this.criteria;
    }
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public UserQuery setCriteria(UserQueryCriteria... criteria)
    {
        this.criteria = criteria;
        return this;
    }
    public UserQuery addToCriteria(UserQueryCriteria criteria)
    {
        if (this.criteria == null)
        {
            this.criteria = new UserQueryCriteria[] { criteria };
        }
        else
        {
            ArrayList<UserQueryCriteria> existingList = new ArrayList<>(Arrays.asList(this.criteria));
            existingList.add(criteria);
            this.criteria = existingList.toArray(new UserQueryCriteria[0]);
        }
        return this;
    }
    public UserQuery setLanguage(@Nullable Language language)
    {
        this.language = language;
        return this;
    }
    public UserQuery setCurrency(@Nullable Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
