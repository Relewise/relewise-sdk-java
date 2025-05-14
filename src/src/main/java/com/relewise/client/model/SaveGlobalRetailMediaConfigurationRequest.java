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
    defaultImpl = SaveGlobalRetailMediaConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveGlobalRetailMediaConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.RetailMedia.SaveGlobalRetailMediaConfigurationRequest, Relewise.Client";
    public @Nullable GlobalRetailMediaConfiguration configuration;
    public @Nullable String modifiedBy;
    public static SaveGlobalRetailMediaConfigurationRequest create(GlobalRetailMediaConfiguration configuration, String modifiedBy)
    {
        return new SaveGlobalRetailMediaConfigurationRequest(configuration, modifiedBy);
    }
    public SaveGlobalRetailMediaConfigurationRequest(GlobalRetailMediaConfiguration configuration, String modifiedBy)
    {
        this.configuration = configuration;
        this.modifiedBy = modifiedBy;
    }
    public SaveGlobalRetailMediaConfigurationRequest()
    {
    }
    public @Nullable GlobalRetailMediaConfiguration getConfiguration()
    {
        return this.configuration;
    }
    public @Nullable String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveGlobalRetailMediaConfigurationRequest setConfiguration(@Nullable GlobalRetailMediaConfiguration configuration)
    {
        this.configuration = configuration;
        return this;
    }
    public SaveGlobalRetailMediaConfigurationRequest setModifiedBy(@Nullable String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
