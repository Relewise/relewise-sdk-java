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
    
/** Shapes 'highlighting' result, allows to present data in various shapes. <code>Offsets</code> hosts 'highlighted' data key, with indices matches associated. <code>Snippets</code> hosts 'highlighted' data key, with a few words around matched text. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResult
{
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeOffsets</code> be requested by client. */
    public @Nullable HighlightResultOffset offsets;
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeTextSnippets</code> be requested by client. */
    public @Nullable HighlightResultSnippet snippets;
    public static HighlightResult create()
    {
        return new HighlightResult();
    }
    public HighlightResult()
    {
    }
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeOffsets</code> be requested by client. */
    public @Nullable HighlightResultOffset getOffsets()
    {
        return this.offsets;
    }
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeTextSnippets</code> be requested by client. */
    public @Nullable HighlightResultSnippet getSnippets()
    {
        return this.snippets;
    }
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeOffsets</code> be requested by client. */
    public HighlightResult setOffsets(@Nullable HighlightResultOffset offsets)
    {
        this.offsets = offsets;
        return this;
    }
    /** Represents matches as offsets should <code>Shape</code>.<code>IncludeTextSnippets</code> be requested by client. */
    public HighlightResult setSnippets(@Nullable HighlightResultSnippet snippets)
    {
        this.snippets = snippets;
        return this;
    }
}
