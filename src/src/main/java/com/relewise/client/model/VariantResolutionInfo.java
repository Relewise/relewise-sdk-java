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
    
/** Explains why the selected <code>Variant</code> was returned for a product search result. */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VariantResolutionInfo
{
    /** Describes the selection path that caused the variant to be returned. */
    public VariantResolutionSource source;
    public static VariantResolutionInfo create()
    {
        return new VariantResolutionInfo();
    }
    public VariantResolutionInfo()
    {
    }
    /** Describes the selection path that caused the variant to be returned. */
    public VariantResolutionSource getSource()
    {
        return this.source;
    }
    /** Describes the selection path that caused the variant to be returned. */
    public VariantResolutionInfo setSource(VariantResolutionSource source)
    {
        this.source = source;
        return this;
    }
}
