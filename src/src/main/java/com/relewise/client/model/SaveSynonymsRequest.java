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
    defaultImpl = SaveSynonymsRequest.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveSynonymsRequest extends LicensedRequest
{
    public String $type = "Relewise.Client.Requests.Search.SaveSynonymsRequest, Relewise.Client";
    public Synonym[] synonyms;
    public String modifiedBy;
    public static SaveSynonymsRequest create(Synonym[] synonyms, String modifiedBy)
    {
        return new SaveSynonymsRequest(synonyms, modifiedBy);
    }
    public SaveSynonymsRequest(Synonym[] synonyms, String modifiedBy)
    {
        this.synonyms = synonyms;
        this.modifiedBy = modifiedBy;
    }
    public SaveSynonymsRequest()
    {
    }
    public Synonym[] getSynonyms()
    {
        return this.synonyms;
    }
    public String getModifiedBy()
    {
        return this.modifiedBy;
    }
    public SaveSynonymsRequest setSynonyms(Synonym... synonyms)
    {
        this.synonyms = synonyms;
        return this;
    }
    public SaveSynonymsRequest addToSynonyms(Synonym synonym)
    {
        if (this.synonyms == null)
        {
            this.synonyms = new Synonym[] { synonym };
        }
        else
        {
            ArrayList<Synonym> existingList = new ArrayList<>(Arrays.asList(this.synonyms));
            existingList.add(synonym);
            this.synonyms = existingList.toArray(new Synonym[0]);
        }
        return this;
    }
    public SaveSynonymsRequest setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
        return this;
    }
}
