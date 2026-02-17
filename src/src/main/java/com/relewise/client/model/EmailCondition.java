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
    defaultImpl = EmailCondition.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailCondition extends UserCondition
{
    public String $type = "Relewise.Client.DataTypes.UserConditions.EmailCondition, Relewise.Client";
    public ArrayList<String> emails;
    public static EmailCondition create()
    {
        return new EmailCondition();
    }
    public EmailCondition()
    {
        this.negated = false;
    }
    public static EmailCondition create(Boolean negated)
    {
        return new EmailCondition(negated);
    }
    public EmailCondition(Boolean negated)
    {
        this.negated = negated;
    }
    public ArrayList<String> getEmails()
    {
        return this.emails;
    }
    public EmailCondition setEmails(String... emails)
    {
        this.emails = new ArrayList<>(Arrays.asList(emails));;
        return this;
    }
    public EmailCondition addToEmails(String emails)
    {
        if (this.emails == null)
        {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emails);
        return this;
    }
    @Override
    public EmailCondition setNegated(Boolean negated)
    {
        this.negated = negated;
        return this;
    }
}
