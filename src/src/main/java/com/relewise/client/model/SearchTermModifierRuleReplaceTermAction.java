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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = SearchTermModifierRuleReplaceTermAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRuleReplaceTermAction extends SearchTermModifierRuleRuleAction
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+ReplaceTermAction, Relewise.Client";
    public @Nullable String replacement;
    public static SearchTermModifierRuleReplaceTermAction create(String replacement)
    {
        return new SearchTermModifierRuleReplaceTermAction(replacement);
    }
    public SearchTermModifierRuleReplaceTermAction(String replacement)
    {
        this.replacement = replacement;
    }
    public SearchTermModifierRuleReplaceTermAction()
    {
    }
    public @Nullable String getReplacement()
    {
        return this.replacement;
    }
    public SearchTermModifierRuleReplaceTermAction setReplacement(@Nullable String replacement)
    {
        this.replacement = replacement;
        return this;
    }
}
