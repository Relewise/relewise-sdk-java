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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductPerformanceRequest.class, name = "Relewise.Client.Requests.Analyzers.ProductPerformanceRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AnalyzerRequest extends LicensedRequest
{
    public String $type = "";
    public @Nullable Language language;
    public @Nullable Currency currency;
    public @Nullable Language getLanguage()
    {
        return this.language;
    }
    public @Nullable Currency getCurrency()
    {
        return this.currency;
    }
    public AnalyzerRequest setLanguage(Language language)
    {
        this.language = language;
        return this;
    }
    public AnalyzerRequest setCurrency(Currency currency)
    {
        this.currency = currency;
        return this;
    }
}
