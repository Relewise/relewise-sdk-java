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
    
/** Encapsulates how search highlighting is to work. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProductHighlightPropsHighlightSettings
{
    /** If highlighting is enabled for search query. */
    public Boolean enabled;
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ProductProductHighlightPropsHighlightSettingsLimits limit;
    /** The properties to include in highlight. */
    public ProductHighlightProps highlightable;
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ProductProductHighlightPropsHighlightSettingsResponseShape shape;
    public static ProductProductHighlightPropsHighlightSettings create()
    {
        return new ProductProductHighlightPropsHighlightSettings();
    }
    public ProductProductHighlightPropsHighlightSettings()
    {
    }
    /** If highlighting is enabled for search query. */
    public Boolean getEnabled()
    {
        return this.enabled;
    }
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ProductProductHighlightPropsHighlightSettingsLimits getLimit()
    {
        return this.limit;
    }
    /** The properties to include in highlight. */
    public ProductHighlightProps getHighlightable()
    {
        return this.highlightable;
    }
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ProductProductHighlightPropsHighlightSettingsResponseShape getShape()
    {
        return this.shape;
    }
    /** If highlighting is enabled for search query. */
    public ProductProductHighlightPropsHighlightSettings setEnabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
    /** The limits, f.e. how many result hits to process, how many 'snippets' to produce per-field/per-entry. */
    public ProductProductHighlightPropsHighlightSettings setLimit(ProductProductHighlightPropsHighlightSettingsLimits limit)
    {
        this.limit = limit;
        return this;
    }
    /** The properties to include in highlight. */
    public ProductProductHighlightPropsHighlightSettings setHighlightable(ProductHighlightProps highlightable)
    {
        this.highlightable = highlightable;
        return this;
    }
    /** The way highlights to be returned. Should it be indices of matches, or matched text with a few words around? */
    public ProductProductHighlightPropsHighlightSettings setShape(ProductProductHighlightPropsHighlightSettingsResponseShape shape)
    {
        this.shape = shape;
        return this;
    }
}
