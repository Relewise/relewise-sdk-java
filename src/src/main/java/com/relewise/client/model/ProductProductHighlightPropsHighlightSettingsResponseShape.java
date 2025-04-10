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
    
/** Indicates how the highlight result should be shaped or presented. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProductHighlightPropsHighlightSettingsResponseShape
{
    /** Whether to return match positions (offsets) within fields. */
    public @Nullable ProductProductHighlightPropsHighlightSettingsOffsetSettings offsets;
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public @Nullable ProductProductHighlightPropsHighlightSettingsSnippetsSettings snippets;
    public static ProductProductHighlightPropsHighlightSettingsResponseShape create()
    {
        return new ProductProductHighlightPropsHighlightSettingsResponseShape();
    }
    public ProductProductHighlightPropsHighlightSettingsResponseShape()
    {
    }
    /** Whether to return match positions (offsets) within fields. */
    public @Nullable ProductProductHighlightPropsHighlightSettingsOffsetSettings getOffsets()
    {
        return this.offsets;
    }
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public @Nullable ProductProductHighlightPropsHighlightSettingsSnippetsSettings getSnippets()
    {
        return this.snippets;
    }
    /** Whether to return match positions (offsets) within fields. */
    public ProductProductHighlightPropsHighlightSettingsResponseShape setOffsets(@Nullable ProductProductHighlightPropsHighlightSettingsOffsetSettings offsets)
    {
        this.offsets = offsets;
        return this;
    }
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public ProductProductHighlightPropsHighlightSettingsResponseShape setSnippets(@Nullable ProductProductHighlightPropsHighlightSettingsSnippetsSettings snippets)
    {
        this.snippets = snippets;
        return this;
    }
}
