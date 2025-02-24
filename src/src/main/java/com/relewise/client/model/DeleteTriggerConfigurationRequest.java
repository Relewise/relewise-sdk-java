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
    defaultImpl = DeleteTriggerConfigurationRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteTriggerConfigurationRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Triggers.DeleteTriggerConfigurationRequest, Relewise.Client";
    public UUID id;
    public static DeleteTriggerConfigurationRequest create(UUID id)
    {
        return new DeleteTriggerConfigurationRequest(id);
    }
    public DeleteTriggerConfigurationRequest(UUID id)
    {
        this.id = id;
    }
    public DeleteTriggerConfigurationRequest()
    {
    }
    public UUID getId()
    {
        return this.id;
    }
    public DeleteTriggerConfigurationRequest setId(UUID id)
    {
        this.id = id;
        return this;
    }
}
