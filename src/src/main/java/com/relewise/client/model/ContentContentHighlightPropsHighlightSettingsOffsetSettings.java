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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentContentHighlightPropsHighlightSettingsOffsetSettings
{
    /** Whether to return match positions (offsets) within fields. */
    public Boolean include;
    public static ContentContentHighlightPropsHighlightSettingsOffsetSettings create()
    {
        return new ContentContentHighlightPropsHighlightSettingsOffsetSettings();
    }
    public ContentContentHighlightPropsHighlightSettingsOffsetSettings()
    {
    }
    /** Whether to return match positions (offsets) within fields. */
    public Boolean getInclude()
    {
        return this.include;
    }
    /** Whether to return match positions (offsets) within fields. */
    public ContentContentHighlightPropsHighlightSettingsOffsetSettings setInclude(Boolean include)
    {
        this.include = include;
        return this;
    }
}
