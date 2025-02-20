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
    
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel
{
    public String name;
    public @Nullable Channel subChannel;
    public static Channel create(String name, @Nullable Channel subChannel)
    {
        return new Channel(name, subChannel);
    }
    public Channel(String name, @Nullable Channel subChannel)
    {
        this.name = name;
        this.subChannel = subChannel;
    }
    public static Channel create(String name)
    {
        return new Channel(name);
    }
    public Channel(String name)
    {
        this.name = name;
    }
    public Channel()
    {
    }
    public String getName()
    {
        return this.name;
    }
    public @Nullable Channel getSubChannel()
    {
        return this.subChannel;
    }
    public Channel setName(String name)
    {
        this.name = name;
        return this;
    }
    public Channel setSubChannel(@Nullable Channel subChannel)
    {
        this.subChannel = subChannel;
        return this;
    }
}
