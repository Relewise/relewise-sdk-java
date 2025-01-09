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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionRulePromotion
{
    public PredictionRulePromotionPosition to;
    public String[] values;
    public static PredictionRulePromotion create(PredictionRulePromotionPosition toPosition, String... values)
    {
        return new PredictionRulePromotion(toPosition, values);
    }
    public PredictionRulePromotion(PredictionRulePromotionPosition toPosition, String... values)
    {
        this.to = toPosition;
        this.values = values;
    }
    public PredictionRulePromotion()
    {
    }
    public PredictionRulePromotionPosition getTo()
    {
        return this.to;
    }
    public String[] getValues()
    {
        return this.values;
    }
    public PredictionRulePromotion setTo(PredictionRulePromotionPosition to)
    {
        this.to = to;
        return this;
    }
    public PredictionRulePromotion setValues(String... values)
    {
        this.values = values;
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
