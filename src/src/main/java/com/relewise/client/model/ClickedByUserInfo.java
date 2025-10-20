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
public class ClickedByUserInfo
{
    public OffsetDateTime mostRecentlyClickedUtc;
    public Integer totalNumberOfTimesClicked;
    public static ClickedByUserInfo create(OffsetDateTime mostRecentlyClickedUtc, Integer totalNumberOfTimesClicked)
    {
        return new ClickedByUserInfo(mostRecentlyClickedUtc, totalNumberOfTimesClicked);
    }
    public ClickedByUserInfo(OffsetDateTime mostRecentlyClickedUtc, Integer totalNumberOfTimesClicked)
    {
        this.mostRecentlyClickedUtc = mostRecentlyClickedUtc;
        this.totalNumberOfTimesClicked = totalNumberOfTimesClicked;
    }
    public ClickedByUserInfo()
    {
    }
    public OffsetDateTime getMostRecentlyClickedUtc()
    {
        return this.mostRecentlyClickedUtc;
    }
    public Integer getTotalNumberOfTimesClicked()
    {
        return this.totalNumberOfTimesClicked;
    }
    public ClickedByUserInfo setMostRecentlyClickedUtc(OffsetDateTime mostRecentlyClickedUtc)
    {
        this.mostRecentlyClickedUtc = mostRecentlyClickedUtc;
        return this;
    }
    public ClickedByUserInfo setTotalNumberOfTimesClicked(Integer totalNumberOfTimesClicked)
    {
        this.totalNumberOfTimesClicked = totalNumberOfTimesClicked;
        return this;
    }
}
