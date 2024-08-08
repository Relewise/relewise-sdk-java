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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveGlobalTriggerConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveGlobalTriggerConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.SaveGlobalTriggerConfigurationRequest, Relewise.Client";
    public GlobalTriggerConfiguration configuration;
    public String modifiedBy;
    public static SaveGlobalTriggerConfigurationRequest create(GlobalTriggerConfiguration configuration, String modifiedBy)
    {
        return new SaveGlobalTriggerConfigurationRequest(configuration, modifiedBy);
    }
    public SaveGlobalTriggerConfigurationRequest(GlobalTriggerConfiguration configuration, String modifiedBy)
    {
        this.configuration = configuration;
        this.modifiedBy = modifiedBy;
    }
    public SaveGlobalTriggerConfigurationRequest()
    {
    }
    public GlobalTriggerConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveGlobalTriggerConfigurationRequest setConfiguration(GlobalTriggerConfiguration configuration)
    {
        this.configuration = configuration;;
        return this;
    }
    public SaveGlobalTriggerConfigurationRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;;
        return this;
    }
}
