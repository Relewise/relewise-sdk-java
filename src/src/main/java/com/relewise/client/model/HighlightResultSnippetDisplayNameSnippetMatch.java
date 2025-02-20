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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type",
    defaultImpl = HighlightResultSnippetDisplayNameSnippetMatch.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultSnippetDisplayNameSnippetMatch extends HighlightResultSnippetSnippetMatch
{
    public String $type = "Relewise.Client.DataTypes.HighlightResult+Snippet+DisplayNameSnippetMatch, Relewise.Client";
    public static HighlightResultSnippetDisplayNameSnippetMatch create()
    {
        return new HighlightResultSnippetDisplayNameSnippetMatch();
    }
    public HighlightResultSnippetDisplayNameSnippetMatch()
    {
    }
    @Override
    public HighlightResultSnippetDisplayNameSnippetMatch setText(String text)
    {
        this.text = text;
        return this;
    }
    @Override
    public HighlightResultSnippetDisplayNameSnippetMatch setMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord... matchedWords)
    {
        this.matchedWords = matchedWords;
        return this;
    }
    public HighlightResultSnippetDisplayNameSnippetMatch addToMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord matchedWord)
    {
        if (this.matchedWords == null)
        {
            this.matchedWords = new HighlightResultSnippetSnippetMatchMatchedWord[] { matchedWord };
        }
        else
        {
            ArrayList<HighlightResultSnippetSnippetMatchMatchedWord> existingList = new ArrayList<>(Arrays.asList(this.matchedWords));
            existingList.add(matchedWord);
            this.matchedWords = existingList.toArray(new HighlightResultSnippetSnippetMatchMatchedWord[0]);
        }
        return this;
    }
}
