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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicableIndexes
{
    public String[] indexes;
    public static final ApplicableIndexes ALL = null;
    public static ApplicableIndexes create(String... indexes)
    {
        return new ApplicableIndexes(indexes);
    }
    public ApplicableIndexes(String... indexes)
    {
        this.indexes = indexes;
    }
    public ApplicableIndexes()
    {
    }
    public String[] getIndexes()
    {
        return this.indexes;
    }
    public ApplicableIndexes setIndexes(String... indexes)
    {
        this.indexes = indexes;
        return this;
    }
    public ApplicableIndexes addToIndexes(String indexe)
    {
        if (this.indexes == null)
        {
            this.indexes = new String[] { indexe };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.indexes));
            existingList.add(indexe);
            this.indexes = existingList.toArray(new String[0]);
        }
        return this;
    }
}
