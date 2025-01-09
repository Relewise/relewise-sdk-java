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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductProductHighlightPropsHighlightSettingsTextSnippetsSettings
{
    /** If highlights should be presented as text fragment within inspected data values. */
    public Boolean includeTextSnippets;
    public static ProductProductHighlightPropsHighlightSettingsTextSnippetsSettings create()
    {
        return new ProductProductHighlightPropsHighlightSettingsTextSnippetsSettings();
    }
    public ProductProductHighlightPropsHighlightSettingsTextSnippetsSettings()
    {
    }
    /** If highlights should be presented as text fragment within inspected data values. */
    public Boolean getIncludeTextSnippets()
    {
        return this.includeTextSnippets;
    }
    /** If highlights should be presented as text fragment within inspected data values. */
    public ProductProductHighlightPropsHighlightSettingsTextSnippetsSettings setIncludeTextSnippets(Boolean includeTextSnippets)
    {
        this.includeTextSnippets = includeTextSnippets;
        return this;
    }
}
