package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
    defaultImpl = TrimStringTransformer.class)
public class TrimStringTransformer
{
    public String $type = "Relewise.Client.Requests.Transformers.TrimStringTransformer, Relewise.Client";
    public String[] valuesToTrim;
    public static TrimStringTransformer create(String... valuesToTrim)
    {
        return new TrimStringTransformer(valuesToTrim);
    }
    public TrimStringTransformer(String... valuesToTrim)
    {
        this.valuesToTrim = valuesToTrim;
    }
    public TrimStringTransformer()
    {
    }
    public String[] getValuesToTrim()
    {
        return this.valuesToTrim;
    }
    public TrimStringTransformer setValuesToTrim(String... valuesToTrim)
    {
        this.valuesToTrim = valuesToTrim;;
        return this;
    }
    public TrimStringTransformer addToValuesToTrim(String valuesToTrim)
    {
        if (this.valuesToTrim == null)
        {
            this.valuesToTrim = new String[] { valuesToTrim };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.valuesToTrim));
            existingList.add(valuesToTrim);
            this.valuesToTrim = existingList.toArray(new String[0]);
        }
        return this;
    }
}
