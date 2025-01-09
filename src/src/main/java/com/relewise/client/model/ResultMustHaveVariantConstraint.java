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
    
/** Used to instruct the search engine that results which does not have any variants, must not be returned. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = ResultMustHaveVariantConstraint.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultMustHaveVariantConstraint extends ProductSearchResultConstraint
{
    public String $type = "Relewise.Client.Requests.Search.Settings.ResultMustHaveVariantConstraint, Relewise.Client";
    /** Instructs the search engine that products that do not have any <b>enabled</b> variants, will be returned anyway. */
    public Boolean exceptWhenProductHasNoVariants;
    public static ResultMustHaveVariantConstraint create()
    {
        return new ResultMustHaveVariantConstraint();
    }
    public ResultMustHaveVariantConstraint()
    {
    }
    /** Instructs the search engine that products that do not have any <b>enabled</b> variants, will be returned anyway. */
    public Boolean getExceptWhenProductHasNoVariants()
    {
        return this.exceptWhenProductHasNoVariants;
    }
    /** Instructs the search engine that products that do not have any <b>enabled</b> variants, will be returned anyway. */
    public ResultMustHaveVariantConstraint setExceptWhenProductHasNoVariants(Boolean exceptWhenProductHasNoVariants)
    {
        this.exceptWhenProductHasNoVariants = exceptWhenProductHasNoVariants;
        return this;
    }
}
