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
public class VariantSearchSettings
{
    /** @deprecated Use ProductSearchSettings.ResultConstraint instead */
    public Boolean excludeResultsWithoutVariant;
    public static VariantSearchSettings create()
    {
        return new VariantSearchSettings();
    }
    public VariantSearchSettings()
    {
    }
    /** @deprecated Use ProductSearchSettings.ResultConstraint instead */
    public Boolean getExcludeResultsWithoutVariant()
    {
        return this.excludeResultsWithoutVariant;
    }
    /** @deprecated Use ProductSearchSettings.ResultConstraint instead */
    public VariantSearchSettings setExcludeResultsWithoutVariant(Boolean excludeResultsWithoutVariant)
    {
        this.excludeResultsWithoutVariant = excludeResultsWithoutVariant;
        return this;
    }
}
