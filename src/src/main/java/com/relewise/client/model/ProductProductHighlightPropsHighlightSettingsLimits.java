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
    
/** Limits for highlighting. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProductHighlightPropsHighlightSettingsLimits
{
    /** How many entries from search result to process? */
    public @Nullable Integer maxEntryLimit;
    /** How many snippets to return per matched search result across all fields? <seealso cref="P:Relewise.Client.Requests.Shared.Highlighting.HighlightSettings`2.Limits.MaxSnippetsPerField"> for field-level control.</seealso> */
    public @Nullable Short maxSnippetsPerEntry;
    /** How many snippets to return per matched search result single field? */
    public @Nullable Short maxSnippetsPerField;
    public static ProductProductHighlightPropsHighlightSettingsLimits create()
    {
        return new ProductProductHighlightPropsHighlightSettingsLimits();
    }
    public ProductProductHighlightPropsHighlightSettingsLimits()
    {
    }
    /** How many entries from search result to process? */
    public @Nullable Integer getMaxEntryLimit()
    {
        return this.maxEntryLimit;
    }
    /** How many snippets to return per matched search result across all fields? <seealso cref="P:Relewise.Client.Requests.Shared.Highlighting.HighlightSettings`2.Limits.MaxSnippetsPerField"> for field-level control.</seealso> */
    public @Nullable Short getMaxSnippetsPerEntry()
    {
        return this.maxSnippetsPerEntry;
    }
    /** How many snippets to return per matched search result single field? */
    public @Nullable Short getMaxSnippetsPerField()
    {
        return this.maxSnippetsPerField;
    }
    /** How many entries from search result to process? */
    public ProductProductHighlightPropsHighlightSettingsLimits setMaxEntryLimit(@Nullable Integer maxEntryLimit)
    {
        this.maxEntryLimit = maxEntryLimit;
        return this;
    }
    /** How many snippets to return per matched search result across all fields? <seealso cref="P:Relewise.Client.Requests.Shared.Highlighting.HighlightSettings`2.Limits.MaxSnippetsPerField"> for field-level control.</seealso> */
    public ProductProductHighlightPropsHighlightSettingsLimits setMaxSnippetsPerEntry(@Nullable Short maxSnippetsPerEntry)
    {
        this.maxSnippetsPerEntry = maxSnippetsPerEntry;
        return this;
    }
    /** How many snippets to return per matched search result single field? */
    public ProductProductHighlightPropsHighlightSettingsLimits setMaxSnippetsPerField(@Nullable Short maxSnippetsPerField)
    {
        this.maxSnippetsPerField = maxSnippetsPerField;
        return this;
    }
}
