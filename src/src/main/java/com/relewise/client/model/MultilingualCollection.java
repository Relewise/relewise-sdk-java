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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultilingualCollection
{
    public ArrayList<MultilingualCollectionValue> values;
    public static MultilingualCollection create(MultilingualCollectionValue... collections)
    {
        return new MultilingualCollection(collections);
    }
    public MultilingualCollection(MultilingualCollectionValue... collections)
    {
        this.values = new ArrayList<>(Arrays.asList(collections));
    }
    public MultilingualCollection()
    {
    }
    public ArrayList<MultilingualCollectionValue> getValues()
    {
        return this.values;
    }
    public MultilingualCollection setValues(MultilingualCollectionValue... values)
    {
        this.values = new ArrayList<>(Arrays.asList(values));;
        return this;
    }
    public MultilingualCollection addToValues(MultilingualCollectionValue values)
    {
        if (this.values == null)
        {
            this.values = new ArrayList<>();
        }
        this.values.add(values);
        return this;
    }
}
