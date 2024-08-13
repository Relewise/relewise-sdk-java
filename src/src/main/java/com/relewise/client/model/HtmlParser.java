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
    defaultImpl = HtmlParser.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HtmlParser extends Parser
{
    public String $type = "Relewise.Client.DataTypes.Search.Configuration.Parsers.HtmlParser, Relewise.Client";
    public static HtmlParser create()
    {
        return new HtmlParser();
    }
    public HtmlParser()
    {
    }
}
