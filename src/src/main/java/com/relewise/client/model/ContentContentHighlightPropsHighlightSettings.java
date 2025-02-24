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
    
/** Encapsulates how search highlighting is to work. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettings
{
    /** If highlighting is enabled for search query. */
    public Boolean enabled;
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ContentContentHighlightPropsHighlightSettingsLimits limit;
    /** The properties to include in highlight. */
    public ContentHighlightProps highlightable;
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ContentContentHighlightPropsHighlightSettingsResponseShape shape;
    public static ContentContentHighlightPropsHighlightSettings create()
    {
        return new ContentContentHighlightPropsHighlightSettings();
    }
    public ContentContentHighlightPropsHighlightSettings()
    {
    }
    /** If highlighting is enabled for search query. */
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ContentContentHighlightPropsHighlightSettingsLimits getLimit()
    {
        return this.limit;
    }
    /** The properties to include in highlight. */
    public ContentHighlightProps getHighlightable()
    {
        return this.highlightable;
    }
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ContentContentHighlightPropsHighlightSettingsResponseShape getShape()
    {
        return this.shape;
    }
    /** If highlighting is enabled for search query. */
    public ContentContentHighlightPropsHighlightSettings setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ContentContentHighlightPropsHighlightSettings setLimit(ContentContentHighlightPropsHighlightSettingsLimits limit)
    {
        this.limit = limit;
        return this;
    }
    /** The properties to include in highlight. */
    public ContentContentHighlightPropsHighlightSettings setHighlightable(ContentHighlightProps highlightable)
    {
        this.highlightable = highlightable;
        return this;
    }
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ContentContentHighlightPropsHighlightSettings setShape(ContentContentHighlightPropsHighlightSettingsResponseShape shape)
    {
        this.shape = shape;
        return this;
    }
}
