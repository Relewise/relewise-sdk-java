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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductCategoryInterestTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.ProductCategoryInterestTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductInterestTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.ProductInterestTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedCartTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.AbandonedCartTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = UserActivityTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.UserActivityTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryInterestTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.ContentCategoryInterestTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = AbandonedSearchTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.AbandonedSearchTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductChangeTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.ProductChangeTriggerResult, Relewise.Client"),
    @JsonSubTypes.Type(value = VariantChangeTriggerResult.class, name = "Relewise.Client.Responses.Triggers.Results.VariantChangeTriggerResult, Relewise.Client"),
})
public interface ITriggerResult
{
}
