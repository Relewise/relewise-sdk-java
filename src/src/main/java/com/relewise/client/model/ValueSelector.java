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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = DataDoubleSelector.class, name = "Relewise.Client.Requests.ValueSelectors.DataDoubleSelector, Relewise.Client"),
    @JsonSubTypes.Type(value = FixedDoubleValueSelector.class, name = "Relewise.Client.Requests.ValueSelectors.FixedDoubleValueSelector, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ValueSelector
{
    public String $type = "";
}
