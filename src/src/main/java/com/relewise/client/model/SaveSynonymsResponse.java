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
    defaultImpl = SaveSynonymsResponse.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSynonymsResponse extends TimedResponse
{
    public String $type = "Relewise.Client.Responses.Search.SaveSynonymsResponse, Relewise.Client";
    public Synonym[] values;
    public static SaveSynonymsResponse create(Synonym... values)
    {
        return new SaveSynonymsResponse(values);
    }
    public SaveSynonymsResponse(Synonym... values)
    {
        this.values = values;
    }
    public SaveSynonymsResponse()
    {
    }
    public Synonym[] getValues()
    {
        return this.values;
    }
    public SaveSynonymsResponse setValues(Synonym... values)
    {
        this.values = values;;
        return this;
    }
    public SaveSynonymsResponse addToValues(Synonym value)
    {
        if (this.values == null)
        {
            this.values = new Synonym[] { value };
        }
        else
        {
            ArrayList<Synonym> existingList = new ArrayList<>(Arrays.asList(this.values));
            existingList.add(value);
            this.values = existingList.toArray(new Synonym[0]);
        }
        return this;
    }
    @Override
    public SaveSynonymsResponse setStatistics(Statistics statistics)
    {
        this.statistics = statistics;;
        return this;
    }
}
