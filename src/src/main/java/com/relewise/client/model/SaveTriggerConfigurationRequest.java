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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SaveTriggerConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveTriggerConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.SaveTriggerConfigurationRequest, Relewise.Client";
    public TriggerConfiguration configuration;
    public String modifiedBy;
    public static SaveTriggerConfigurationRequest create(TriggerConfiguration configuration, String modifiedBy)
    {
        return new SaveTriggerConfigurationRequest(configuration, modifiedBy);
    }
    public SaveTriggerConfigurationRequest(TriggerConfiguration configuration, String modifiedBy)
    {
        this.configuration = configuration;
        this.modifiedBy = modifiedBy;
    }
    public SaveTriggerConfigurationRequest()
    {
    }
    public TriggerConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveTriggerConfigurationRequest setConfiguration(TriggerConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    public SaveTriggerConfigurationRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
