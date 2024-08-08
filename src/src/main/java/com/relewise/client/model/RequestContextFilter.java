package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    defaultImpl = RequestContextFilter.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestContextFilter
{
    public String $type = "Relewise.Client.DataTypes.Merchandising.RequestContextFilter, Relewise.Client";
    public RecommendationTypeCollection recommendations;
    public SearchTypeCollection searches;
    public ArrayList<String> locations;
    public ArrayList<Language> languages;
    public ArrayList<Currency> currencies;
    public static RequestContextFilter create()
    {
        return new RequestContextFilter();
    }
    public RequestContextFilter()
    {
    }
    public RecommendationTypeCollection getRecommendations()
    {
        return this.recommendations;
    }
    public SearchTypeCollection getSearches()
    {
        return this.searches;
    }
    public ArrayList<String> getLocations()
    {
        return this.locations;
    }
    public ArrayList<Language> getLanguages()
    {
        return this.languages;
    }
    public ArrayList<Currency> getCurrencies()
    {
        return this.currencies;
    }
    public RequestContextFilter setRecommendations(RecommendationTypeCollection recommendations)
    {
        this.recommendations = recommendations;;
        return this;
    }
    public RequestContextFilter setSearches(SearchTypeCollection searches)
    {
        this.searches = searches;;
        return this;
    }
    public RequestContextFilter setLocations(String... locations)
    {
        this.locations = new ArrayList<>(Arrays.asList(locations));;
        return this;
    }
    public RequestContextFilter addToLocations(String locations)
    {
        if (this.locations == null)
        {
            this.locations = new ArrayList<>();
        }
        this.locations.add(locations);
        return this;
    }
    public RequestContextFilter setLanguages(Language... languages)
    {
        this.languages = new ArrayList<>(Arrays.asList(languages));;
        return this;
    }
    public RequestContextFilter addToLanguages(Language languages)
    {
        if (this.languages == null)
        {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languages);
        return this;
    }
    public RequestContextFilter setCurrencies(Currency... currencies)
    {
        this.currencies = new ArrayList<>(Arrays.asList(currencies));;
        return this;
    }
    public RequestContextFilter addToCurrencies(Currency currencies)
    {
        if (this.currencies == null)
        {
            this.currencies = new ArrayList<>();
        }
        this.currencies.add(currencies);
        return this;
    }
}
