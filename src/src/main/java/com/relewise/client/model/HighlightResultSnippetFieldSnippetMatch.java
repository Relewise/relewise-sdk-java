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
    property = "$type",
    defaultImpl = HighlightResultSnippetFieldSnippetMatch.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighlightResultSnippetFieldSnippetMatch extends HighlightResultSnippetSnippetMatch
{
    public String $type = "Relewise.Client.DataTypes.HighlightResult+Snippet+FieldSnippetMatch, Relewise.Client";
    public static HighlightResultSnippetFieldSnippetMatch create()
    {
        return new HighlightResultSnippetFieldSnippetMatch();
    }
    public HighlightResultSnippetFieldSnippetMatch()
    {
    }
    @Override
    public HighlightResultSnippetFieldSnippetMatch setText(String text)
    {
        this.text = text;
        return this;
    }
    @Override
    public HighlightResultSnippetFieldSnippetMatch setMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord... matchedWords)
    {
        this.matchedWords = matchedWords;
        return this;
    }
    public HighlightResultSnippetFieldSnippetMatch addToMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord matchedWord)
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
