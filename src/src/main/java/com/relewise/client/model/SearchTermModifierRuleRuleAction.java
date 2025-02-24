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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SearchTermModifierRuleAppendToTermAction.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+AppendToTermAction, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermModifierRuleRemoveFromTermAction.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+RemoveFromTermAction, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermModifierRuleReplaceTermAction.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+ReplaceTermAction, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTermModifierRuleReplaceWordsInTermAction.class, name = "Relewise.Client.DataTypes.Search.Rules.SearchTermModifierRule+ReplaceWordsInTermAction, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SearchTermModifierRuleRuleAction
{
    public String $type = "";
}
