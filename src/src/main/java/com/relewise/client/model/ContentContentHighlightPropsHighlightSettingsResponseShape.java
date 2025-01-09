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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettingsResponseShape
{
    /** If highlights should be presented as offsets/indices within inspected data values. */
    public Boolean includeOffsets;
    /** If highlights should be presented as text fragment within inspected data values; and if so, additional configuration on how to. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsTextSnippetsSettings textSnippets;
    public static ContentContentHighlightPropsHighlightSettingsResponseShape create()
    {
        return new ContentContentHighlightPropsHighlightSettingsResponseShape();
    }
    public ContentContentHighlightPropsHighlightSettingsResponseShape()
    {
    }
    /** If highlights should be presented as offsets/indices within inspected data values. */
    public Boolean getIncludeOffsets()
    {
        return this.includeOffsets;
    }
    /** If highlights should be presented as text fragment within inspected data values; and if so, additional configuration on how to. */
    public @Nullable ContentContentHighlightPropsHighlightSettingsTextSnippetsSettings getTextSnippets()
    {
        return this.textSnippets;
    }
    /** If highlights should be presented as offsets/indices within inspected data values. */
    public ContentContentHighlightPropsHighlightSettingsResponseShape setIncludeOffsets(Boolean includeOffsets)
    {
        this.includeOffsets = includeOffsets;
        return this;
    }
    /** If highlights should be presented as text fragment within inspected data values; and if so, additional configuration on how to. */
    public ContentContentHighlightPropsHighlightSettingsResponseShape setTextSnippets(@Nullable ContentContentHighlightPropsHighlightSettingsTextSnippetsSettings textSnippets)
    {
        this.textSnippets = textSnippets;
        return this;
    }
}
