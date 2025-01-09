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
import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ContentSearchSettingsHighlightSettings.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentSearchSettingsHighlightSettings extends ContentContentHighlightPropsHighlightSettings
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ContentSearchSettings+HighlightSettings, Relewise.Client";
    public static ContentSearchSettingsHighlightSettings create()
    {
        return new ContentSearchSettingsHighlightSettings();
    }
    public ContentSearchSettingsHighlightSettings()
    {
    }
    @Override
    public ContentSearchSettingsHighlightSettings setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    @Override
    public ContentSearchSettingsHighlightSettings setLimit(ContentContentHighlightPropsHighlightSettingsLimits limit)
    {
        this.limit = limit;
        return this;
    }
    @Override
    public ContentSearchSettingsHighlightSettings setHighlightable(ContentHighlightProps highlightable)
    {
        this.highlightable = highlightable;
        return this;
    }
    @Override
    public ContentSearchSettingsHighlightSettings setShape(ContentContentHighlightPropsHighlightSettingsResponseShape shape)
    {
        this.shape = shape;
        return this;
    }
}
