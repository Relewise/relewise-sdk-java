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
public class RetailMediaQuerySettings
{
    public @Nullable SelectedDisplayAdPropertiesSettings selectedDisplayAdProperties;
    public static RetailMediaQuerySettings create()
    {
        return new RetailMediaQuerySettings();
    }
    public RetailMediaQuerySettings()
    {
    }
    public @Nullable SelectedDisplayAdPropertiesSettings getSelectedDisplayAdProperties()
    {
        return this.selectedDisplayAdProperties;
    }
    public RetailMediaQuerySettings setSelectedDisplayAdProperties(@Nullable SelectedDisplayAdPropertiesSettings selectedDisplayAdProperties)
    {
        this.selectedDisplayAdProperties = selectedDisplayAdProperties;
        return this;
    }
}
