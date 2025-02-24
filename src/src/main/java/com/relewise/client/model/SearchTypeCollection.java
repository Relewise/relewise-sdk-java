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
public class SearchTypeCollection
{
    public ArrayList<Short> unionCodes;
    public static SearchTypeCollection create()
    {
        return new SearchTypeCollection();
    }
    public SearchTypeCollection()
    {
    }
    public ArrayList<Short> getUnionCodes()
    {
        return this.unionCodes;
    }
    public SearchTypeCollection setUnionCodes(Short... unionCodes)
    {
        this.unionCodes = new ArrayList<>(Arrays.asList(unionCodes));;
        return this;
    }
    public SearchTypeCollection addToUnionCodes(Short unionCodes)
    {
        if (this.unionCodes == null)
        {
            this.unionCodes = new ArrayList<>();
        }
        this.unionCodes.add(unionCodes);
        return this;
    }
}
