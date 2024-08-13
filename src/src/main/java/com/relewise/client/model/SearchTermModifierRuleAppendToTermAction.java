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
    defaultImpl = SearchTermModifierRuleAppendToTermAction.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTermModifierRuleAppendToTermAction extends SearchTermModifierRuleRuleAction
{
    public String $type = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+AppendToTermAction, Relewise.Client";
    public String words;
    public static SearchTermModifierRuleAppendToTermAction create(String words)
    {
        return new SearchTermModifierRuleAppendToTermAction(words);
    }
    public SearchTermModifierRuleAppendToTermAction(String words)
    {
        this.words = words;
    }
    public SearchTermModifierRuleAppendToTermAction()
    {
    }
    public String getWords()
    {
        return this.words;
    }
    public SearchTermModifierRuleAppendToTermAction setWords(String words)
    {
        this.words = words;
        return this;
    }
}
