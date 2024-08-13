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
    defaultImpl = SearchTermModifierRuleReplaceWordsInTermAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRuleReplaceWordsInTermAction extends SearchTermModifierRuleRuleAction
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+ReplaceWordsInTermAction, Relewise.Client";
    public String words;
    public @Nullable String replacement;
    public static SearchTermModifierRuleReplaceWordsInTermAction create(String words, String replacement)
    {
        return new SearchTermModifierRuleReplaceWordsInTermAction(words, replacement);
    }
    public SearchTermModifierRuleReplaceWordsInTermAction(String words, String replacement)
    {
        this.words = words;
        this.replacement = replacement;
    }
    public SearchTermModifierRuleReplaceWordsInTermAction()
    {
    }
    public String getWords()
    {
        return this.words;
    }
    public @Nullable String getReplacement()
    {
        return this.replacement;
    }
    public SearchTermModifierRuleReplaceWordsInTermAction setWords(String words)
    {
        this.words = words;
        return this;
    }
    public SearchTermModifierRuleReplaceWordsInTermAction setReplacement(String replacement)
    {
        this.replacement = replacement;
        return this;
    }
}
