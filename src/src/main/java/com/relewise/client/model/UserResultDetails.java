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
public class UserResultDetails
{
    public String authenticatedId;
    public String temporaryId;
    public String email;
    public HashMap<String, String> classifications;
    public @Nullable OffsetDateTime lastCartUpdateUtc;
    public OffsetDateTime lastActivityUtc;
    public @Nullable OffsetDateTime lastOrderUtc;
    public HashMap<String, CartDetails> carts;
    public String lastActiveCartName;
    public Integer totalNumberOfOrders;
    public HashMap<String, String> identifiers;
    public Integer key;
    public HashMap<String, DataValue> data;
    public String[] temporaryIds;
    public static UserResultDetails create()
    {
        return new UserResultDetails();
    }
    public UserResultDetails()
    {
    }
    public String getAuthenticatedId()
    {
        return this.authenticatedId;
    }
    public String getTemporaryId()
    {
        return this.temporaryId;
    }
    public String getEmail()
    {
        return this.email;
    }
    public HashMap<String, String> getClassifications()
    {
        return this.classifications;
    }
    public @Nullable OffsetDateTime getLastCartUpdateUtc()
    {
        return this.lastCartUpdateUtc;
    }
    public OffsetDateTime getLastActivityUtc()
    {
        return this.lastActivityUtc;
    }
    public @Nullable OffsetDateTime getLastOrderUtc()
    {
        return this.lastOrderUtc;
    }
    public HashMap<String, CartDetails> getCarts()
    {
        return this.carts;
    }
    public String getLastActiveCartName()
    {
        return this.lastActiveCartName;
    }
    public Integer getTotalNumberOfOrders()
    {
        return this.totalNumberOfOrders;
    }
    public HashMap<String, String> getIdentifiers()
    {
        return this.identifiers;
    }
    public Integer getKey()
    {
        return this.key;
    }
    public HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public String[] getTemporaryIds()
    {
        return this.temporaryIds;
    }
    public UserResultDetails setAuthenticatedId(String authenticatedId)
    {
        this.authenticatedId = authenticatedId;;
        return this;
    }
    public UserResultDetails setTemporaryId(String temporaryId)
    {
        this.temporaryId = temporaryId;;
        return this;
    }
    public UserResultDetails setEmail(String email)
    {
        this.email = email;;
        return this;
    }
    public UserResultDetails addToClassifications(String key, String value)
    {
        if (this.classifications == null)
        {
            this.classifications = new HashMap<>();
        }
        this.classifications.put(key, value);
        return this;
    }
    public UserResultDetails setClassifications(HashMap<String, String> classifications)
    {
        this.classifications = classifications;;
        return this;
    }
    public UserResultDetails setLastCartUpdateUtc(@Nullable OffsetDateTime lastCartUpdateUtc)
    {
        this.lastCartUpdateUtc = lastCartUpdateUtc;;
        return this;
    }
    public UserResultDetails setLastActivityUtc(OffsetDateTime lastActivityUtc)
    {
        this.lastActivityUtc = lastActivityUtc;;
        return this;
    }
    public UserResultDetails setLastOrderUtc(@Nullable OffsetDateTime lastOrderUtc)
    {
        this.lastOrderUtc = lastOrderUtc;;
        return this;
    }
    public UserResultDetails addToCarts(String key, CartDetails value)
    {
        if (this.carts == null)
        {
            this.carts = new HashMap<>();
        }
        this.carts.put(key, value);
        return this;
    }
    public UserResultDetails setCarts(HashMap<String, CartDetails> carts)
    {
        this.carts = carts;;
        return this;
    }
    public UserResultDetails setLastActiveCartName(String lastActiveCartName)
    {
        this.lastActiveCartName = lastActiveCartName;;
        return this;
    }
    public UserResultDetails setTotalNumberOfOrders(Integer totalNumberOfOrders)
    {
        this.totalNumberOfOrders = totalNumberOfOrders;;
        return this;
    }
    public UserResultDetails addToIdentifiers(String key, String value)
    {
        if (this.identifiers == null)
        {
            this.identifiers = new HashMap<>();
        }
        this.identifiers.put(key, value);
        return this;
    }
    public UserResultDetails setIdentifiers(HashMap<String, String> identifiers)
    {
        this.identifiers = identifiers;;
        return this;
    }
    public UserResultDetails setKey(Integer key)
    {
        this.key = key;;
        return this;
    }
    public UserResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public UserResultDetails setData(HashMap<String, DataValue> data)
    {
        this.data = data;;
        return this;
    }
    public UserResultDetails setTemporaryIds(String... temporaryIds)
    {
        this.temporaryIds = temporaryIds;;
        return this;
    }
    public UserResultDetails addToTemporaryIds(String temporaryId)
    {
        if (this.temporaryIds == null)
        {
            this.temporaryIds = new String[] { temporaryId };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.temporaryIds));
            existingList.add(temporaryId);
            this.temporaryIds = existingList.toArray(new String[0]);
        }
        return this;
    }
}
