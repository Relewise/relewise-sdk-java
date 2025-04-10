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
    
/** Limits for highlighting. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettingsLimits
{
    /** How many entries from search result to process? */
    public @Nullable Integer maxEntryLimit;
    /** How many snippets to return per matched search result across all fields? */
    public @Nullable Short maxSnippetsPerEntry;
    /** How many snippets to return per matched search result single field? */
    public @Nullable Short maxSnippetsPerField;
    /** How many words to include prior matched highlight? */
    public @Nullable Short maxWordsBeforeMatch;
    /** How many words to include after matched highlight? If <code>MaxSentencesToIncludeAfterMatch</code> is specified, both limitation shall be applied. Use-case: include 25 words (avg. sentence length), but not further than one sentence. For more broader contexts, few sentences can be desirable. */
    public @Nullable Short maxWordsAfterMatch;
    /** How many sentences to include prior matched highlight? If no value provided, the <code>MaxWordsBeforeMatch</code> will be solely used. */
    public @Nullable Short maxSentencesToIncludeBeforeMatch;
    /** How many sentences to include after matched highlight? If no value provided, the <code>MaxWordsAfterMatch</code> will be solely used. */
    public @Nullable Short maxSentencesToIncludeAfterMatch;
    public static ContentContentHighlightPropsHighlightSettingsLimits create()
    {
        return new ContentContentHighlightPropsHighlightSettingsLimits();
    }
    public ContentContentHighlightPropsHighlightSettingsLimits()
    {
    }
    /** How many entries from search result to process? */
    public @Nullable Integer getMaxEntryLimit()
    {
        return this.maxEntryLimit;
    }
    /** How many snippets to return per matched search result across all fields? */
    public @Nullable Short getMaxSnippetsPerEntry()
    {
        return this.maxSnippetsPerEntry;
    }
    /** How many snippets to return per matched search result single field? */
    public @Nullable Short getMaxSnippetsPerField()
    {
        return this.maxSnippetsPerField;
    }
    /** How many words to include prior matched highlight? */
    public @Nullable Short getMaxWordsBeforeMatch()
    {
        return this.maxWordsBeforeMatch;
    }
    /** How many words to include after matched highlight? If <code>MaxSentencesToIncludeAfterMatch</code> is specified, both limitation shall be applied. Use-case: include 25 words (avg. sentence length), but not further than one sentence. For more broader contexts, few sentences can be desirable. */
    public @Nullable Short getMaxWordsAfterMatch()
    {
        return this.maxWordsAfterMatch;
    }
    /** How many sentences to include prior matched highlight? If no value provided, the <code>MaxWordsBeforeMatch</code> will be solely used. */
    public @Nullable Short getMaxSentencesToIncludeBeforeMatch()
    {
        return this.maxSentencesToIncludeBeforeMatch;
    }
    /** How many sentences to include after matched highlight? If no value provided, the <code>MaxWordsAfterMatch</code> will be solely used. */
    public @Nullable Short getMaxSentencesToIncludeAfterMatch()
    {
        return this.maxSentencesToIncludeAfterMatch;
    }
    /** How many entries from search result to process? */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxEntryLimit(@Nullable Integer maxEntryLimit)
    {
        this.maxEntryLimit = maxEntryLimit;
        return this;
    }
    /** How many snippets to return per matched search result across all fields? */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxSnippetsPerEntry(@Nullable Short maxSnippetsPerEntry)
    {
        this.maxSnippetsPerEntry = maxSnippetsPerEntry;
        return this;
    }
    /** How many snippets to return per matched search result single field? */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxSnippetsPerField(@Nullable Short maxSnippetsPerField)
    {
        this.maxSnippetsPerField = maxSnippetsPerField;
        return this;
    }
    /** How many words to include prior matched highlight? */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxWordsBeforeMatch(@Nullable Short maxWordsBeforeMatch)
    {
        this.maxWordsBeforeMatch = maxWordsBeforeMatch;
        return this;
    }
    /** How many words to include after matched highlight? If <code>MaxSentencesToIncludeAfterMatch</code> is specified, both limitation shall be applied. Use-case: include 25 words (avg. sentence length), but not further than one sentence. For more broader contexts, few sentences can be desirable. */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxWordsAfterMatch(@Nullable Short maxWordsAfterMatch)
    {
        this.maxWordsAfterMatch = maxWordsAfterMatch;
        return this;
    }
    /** How many sentences to include prior matched highlight? If no value provided, the <code>MaxWordsBeforeMatch</code> will be solely used. */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxSentencesToIncludeBeforeMatch(@Nullable Short maxSentencesToIncludeBeforeMatch)
    {
        this.maxSentencesToIncludeBeforeMatch = maxSentencesToIncludeBeforeMatch;
        return this;
    }
    /** How many sentences to include after matched highlight? If no value provided, the <code>MaxWordsAfterMatch</code> will be solely used. */
    public ContentContentHighlightPropsHighlightSettingsLimits setMaxSentencesToIncludeAfterMatch(@Nullable Short maxSentencesToIncludeAfterMatch)
    {
        this.maxSentencesToIncludeAfterMatch = maxSentencesToIncludeAfterMatch;
        return this;
    }
}
