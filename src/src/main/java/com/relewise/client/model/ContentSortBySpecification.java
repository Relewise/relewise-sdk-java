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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentSortBySpecification
{
    public ContentSorting value;
    public static ContentSortBySpecification create()
    {
        return new ContentSortBySpecification();
    }
    public ContentSortBySpecification()
    {
    }
    public ContentSorting getValue()
    {
        return this.value;
    }
    public ContentSortBySpecification setValue(ContentSorting value)
    {
        this.value = value;
        return this;
    }
}
