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
public class Statistics
{
    public Double serverTimeInMs;
    public static Statistics create()
    {
        return new Statistics();
    }
    public Statistics()
    {
    }
    public Double getServerTimeInMs()
    {
        return this.serverTimeInMs;
    }
    public Statistics setServerTimeInMs(Double serverTimeInMs)
    {
        this.serverTimeInMs = serverTimeInMs;
        return this;
    }
}
