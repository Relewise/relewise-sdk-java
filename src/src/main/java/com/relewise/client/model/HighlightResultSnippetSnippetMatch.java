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
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class HighlightResultSnippetSnippetMatch
{
    public String $type = "";
    public String text;
    public @Nullable HighlightResultSnippetSnippetMatchMatchedWord[] matchedWords;
    public String getText()
    {
        return this.text;
    }
    public @Nullable HighlightResultSnippetSnippetMatchMatchedWord[] getMatchedWords()
    {
        return this.matchedWords;
    }
    public HighlightResultSnippetSnippetMatch setText(String text)
    {
        this.text = text;
        return this;
    }
    public HighlightResultSnippetSnippetMatch setMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord... matchedWords)
    {
        this.matchedWords = matchedWords;
        return this;
    }
    public HighlightResultSnippetSnippetMatch addToMatchedWords(HighlightResultSnippetSnippetMatchMatchedWord matchedWord)
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
