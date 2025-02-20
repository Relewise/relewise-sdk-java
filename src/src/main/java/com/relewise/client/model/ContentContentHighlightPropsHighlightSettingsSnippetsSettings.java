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
    
/** Settings controlling how text snippets are returned in highlight results. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettingsSnippetsSettings
{
    /** Whether to include text-based snippets. */
    public Boolean include;
    /** Whether to include ellipses (...) for snippets truncated in the middle of the text. */
    public Boolean useEllipses;
    /** Should indices (offsets) be included to power individual words highlight on client side. Useful for visually emphasizing the exact match among context-enriched snippets. */
    public Boolean includeMatchedWords;
    public static ContentContentHighlightPropsHighlightSettingsSnippetsSettings create()
    {
        return new ContentContentHighlightPropsHighlightSettingsSnippetsSettings();
    }
    public ContentContentHighlightPropsHighlightSettingsSnippetsSettings()
    {
    }
    /** Whether to include text-based snippets. */
    public Boolean getInclude()
    {
        return this.include;
    }
    /** Whether to include ellipses (...) for snippets truncated in the middle of the text. */
    public Boolean getUseEllipses()
    {
        return this.useEllipses;
    }
    /** Should indices (offsets) be included to power individual words highlight on client side. Useful for visually emphasizing the exact match among context-enriched snippets. */
    public Boolean getIncludeMatchedWords()
    {
        return this.includeMatchedWords;
    }
    /** Whether to include text-based snippets. */
    public ContentContentHighlightPropsHighlightSettingsSnippetsSettings setInclude(Boolean include)
    {
        this.include = include;
        return this;
    }
    /** Whether to include ellipses (...) for snippets truncated in the middle of the text. */
    public ContentContentHighlightPropsHighlightSettingsSnippetsSettings setUseEllipses(Boolean useEllipses)
    {
        this.useEllipses = useEllipses;
        return this;
    }
    /** Should indices (offsets) be included to power individual words highlight on client side. Useful for visually emphasizing the exact match among context-enriched snippets. */
    public ContentContentHighlightPropsHighlightSettingsSnippetsSettings setIncludeMatchedWords(Boolean includeMatchedWords)
    {
        this.includeMatchedWords = includeMatchedWords;
        return this;
    }
}
