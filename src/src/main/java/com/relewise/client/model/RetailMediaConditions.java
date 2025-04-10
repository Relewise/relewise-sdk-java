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
    
/** Conditions for Retail Media engine to be applied. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetailMediaConditions
{
    public @Nullable RetailMediaSearchTermCondition searchTerm;
    public static RetailMediaConditions create()
    {
        return new RetailMediaConditions();
    }
    public RetailMediaConditions()
    {
    }
    public @Nullable RetailMediaSearchTermCondition getSearchTerm()
    {
        return this.searchTerm;
    }
    public RetailMediaConditions setSearchTerm(@Nullable RetailMediaSearchTermCondition searchTerm)
    {
        this.searchTerm = searchTerm;
        return this;
    }
}
