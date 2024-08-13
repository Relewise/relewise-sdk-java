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
public class SearchIndexSelector
{
    public String id;
    public static final SearchIndexSelector DEFAULT = null;
    public static SearchIndexSelector create(String id)
    {
        return new SearchIndexSelector(id);
    }
    public SearchIndexSelector(String id)
    {
        this.id = id;
    }
    public SearchIndexSelector()
    {
    }
    public String getId()
    {
        return this.id;
    }
    public SearchIndexSelector setId(String id)
    {
        this.id = id;
        return this;
    }
}
