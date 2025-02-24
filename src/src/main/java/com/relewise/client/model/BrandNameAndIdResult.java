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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class BrandNameAndIdResult
{
    public String id;
    public String displayName;
    public static BrandNameAndIdResult create(String id, String displayName)
    {
        return new BrandNameAndIdResult(id, displayName);
    }
    public BrandNameAndIdResult(String id, String displayName)
    {
        this.id = id;
        this.displayName = displayName;
    }
    public BrandNameAndIdResult()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public String getDisplayName()
    {
        return this.displayName;
    }
    public BrandNameAndIdResult setId(String id)
    {
        this.id = id;
        return this;
    }
    public BrandNameAndIdResult setDisplayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }
}
