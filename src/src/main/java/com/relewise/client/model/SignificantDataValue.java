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
public class SignificantDataValue
{
    public String key;
    public SignificantDataValueSignificantDataValueComparer comparer;
    public Double significance;
    public @Nullable TrimStringTransformer transformer;
    public static SignificantDataValue create(String key, SignificantDataValueSignificantDataValueComparer comparer)
    {
        return new SignificantDataValue(key, comparer);
    }
    public SignificantDataValue(String key, SignificantDataValueSignificantDataValueComparer comparer)
    {
        this.key = key;
        this.comparer = comparer;
        this.significance = 1d;
        this.transformer = null;
    }
    public static SignificantDataValue create(String key, SignificantDataValueSignificantDataValueComparer comparer, Double significance, @Nullable TrimStringTransformer transformer)
    {
        return new SignificantDataValue(key, comparer, significance, transformer);
    }
    public SignificantDataValue(String key, SignificantDataValueSignificantDataValueComparer comparer, Double significance, @Nullable TrimStringTransformer transformer)
    {
        this.key = key;
        this.comparer = comparer;
        this.significance = significance;
        this.transformer = transformer;
    }
    public SignificantDataValue()
    {
        this.significance = 1d;
        this.transformer = null;
    }
    public String getKey()
    {
        return this.key;
    }
    public SignificantDataValueSignificantDataValueComparer getComparer()
    {
        return this.comparer;
    }
    public Double getSignificance()
    {
        return this.significance;
    }
    public @Nullable TrimStringTransformer getTransformer()
    {
        return this.transformer;
    }
    public SignificantDataValue setKey(String key)
    {
        this.key = key;
        return this;
    }
    public SignificantDataValue setComparer(SignificantDataValueSignificantDataValueComparer comparer)
    {
        this.comparer = comparer;
        return this;
    }
    public SignificantDataValue setSignificance(Double significance)
    {
        this.significance = significance;
        return this;
    }
    public SignificantDataValue setTransformer(@Nullable TrimStringTransformer transformer)
    {
        this.transformer = transformer;
        return this;
    }
}
