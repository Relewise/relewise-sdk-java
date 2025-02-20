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
    
/** Indicates how the highlight result should be shaped or presented. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettingsResponseShape
{
    /** Whether to return match positions (offsets) within fields. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsOffsetSettings offsets;
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsSnippetsSettings snippets;
    public static ContentContentHighlightPropsHighlightSettingsResponseShape create()
    {
        return new ContentContentHighlightPropsHighlightSettingsResponseShape();
    }
    public ContentContentHighlightPropsHighlightSettingsResponseShape()
    {
    }
    /** Whether to return match positions (offsets) within fields. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsOffsetSettings getOffsets()
    {
        return this.offsets;
    }
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsSnippetsSettings getSnippets()
    {
        return this.snippets;
    }
    /** Whether to return match positions (offsets) within fields. */
    public ContentContentHighlightPropsHighlightSettingsResponseShape setOffsets(@Nullable ContentContentHighlightPropsHighlightSettingsOffsetSettings offsets)
    {
        this.offsets = offsets;
        return this;
    }
    /** Controls whether to return context-based text snippets; can include further snippet configuration. */
    public ContentContentHighlightPropsHighlightSettingsResponseShape setSnippets(@Nullable ContentContentHighlightPropsHighlightSettingsSnippetsSettings snippets)
    {
        this.snippets = snippets;
        return this;
    }
}
