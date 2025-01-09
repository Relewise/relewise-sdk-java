package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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
public class UserAssociatedCompanyResultDetails
{
    public String id;
    public @Nullable UserAssociatedCompanyResultDetails parent;
    public @Nullable HashMap<String, DataValue> data;
    public OffsetDateTime createdUtc;
    public OffsetDateTime lastAccessedUtc;
    public static UserAssociatedCompanyResultDetails create(String id)
    {
        return new UserAssociatedCompanyResultDetails(id);
    }
    public UserAssociatedCompanyResultDetails(String id)
    {
        this.id = id;
    }
    public UserAssociatedCompanyResultDetails()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public @Nullable UserAssociatedCompanyResultDetails getParent()
    {
        return this.parent;
    }
    public @Nullable HashMap<String, DataValue> getData()
    {
        return this.data;
    }
    public OffsetDateTime getCreatedUtc()
    {
        return this.createdUtc;
    }
    public OffsetDateTime getLastAccessedUtc()
    {
        return this.lastAccessedUtc;
    }
    public UserAssociatedCompanyResultDetails setId(String id)
    {
        this.id = id;
        return this;
    }
    public UserAssociatedCompanyResultDetails setParent(@Nullable UserAssociatedCompanyResultDetails parent)
    {
        this.parent = parent;
        return this;
    }
    public UserAssociatedCompanyResultDetails addToData(String key, DataValue value)
    {
        if (this.data == null)
        {
            this.data = new HashMap<>();
        }
        this.data.put(key, value);
        return this;
    }
    public UserAssociatedCompanyResultDetails setData(@Nullable HashMap<String, DataValue> data)
    {
        this.data = data;
        return this;
    }
    public UserAssociatedCompanyResultDetails setCreatedUtc(OffsetDateTime createdUtc)
    {
        this.createdUtc = createdUtc;
        return this;
    }
    public UserAssociatedCompanyResultDetails setLastAccessedUtc(OffsetDateTime lastAccessedUtc)
    {
        this.lastAccessedUtc = lastAccessedUtc;
        return this;
    }
}
