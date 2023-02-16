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
    defaultImpl = PredictionRulePromotion.class)
public class PredictionRulePromotion
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.SearchRules.PredictionRule+Promotion, Relewise.Client";
    public PromotionPosition to;
    public String[] values;
    public static PredictionRulePromotion create(PromotionPosition toPosition, String... values)
    {
        return new PredictionRulePromotion(toPosition, values);
    }
    public PredictionRulePromotion(PromotionPosition toPosition, String... values)
    {
        this.to = toPosition;
        this.values = values;
    }
    public PredictionRulePromotion()
    {
    }
    public PromotionPosition getTo()
    {
        return this.to;
    }
    public String[] getValues()
    {
        return this.values;
    }
    public PredictionRulePromotion setTo(PromotionPosition to)
    {
        this.to = to;;
        return this;
    }
    public PredictionRulePromotion setValues(String... values)
    {
        this.values = values;;
        return this;
    }
    public PredictionRulePromotion addToValues(String value)
    {
        if (this.values == null)
        {
            this.values = new String[] { value };
        }
        else
        {
            ArrayList<String> existingList = new ArrayList<>(Arrays.asList(this.values));
            existingList.add(value);
            this.values = existingList.toArray(new String[0]);
        }
        return this;
    }
}
