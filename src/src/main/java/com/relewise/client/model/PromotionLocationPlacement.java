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
    
/** Represents a placement within a location in the system where promotions can be shown */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotionLocationPlacement
{
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public String key;
    public static PromotionLocationPlacement create(String key)
    {
        return new PromotionLocationPlacement(key);
    }
    public PromotionLocationPlacement(String key)
    {
        this.key = key;
    }
    public PromotionLocationPlacement()
    {
    }
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public String getKey()
    {
        return this.key;
    }
    /** A key which is automatically computed based on the name. This value gets created the first time the placement is saved and cannot be modified in the future. Manually assigning a value to this will have no effect. */
    public PromotionLocationPlacement setKey(String key)
    {
        this.key = key;
        return this;
    }
}
