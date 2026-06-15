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

/** Marks feed source for content. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ContentByPopularityFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ContentByPopularityFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentByProductPopularityOfProductIdFromContentDataFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ContentByProductPopularityOfProductIdFromContentDataFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterProductSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ContentsViewedAfterProductSeedFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentsViewedAfterContentSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ContentsViewedAfterContentSeedFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentByOverlappingDataValuesWithContentSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ContentByOverlappingDataValuesWithContentSeedFeedSource, Relewise.Client"),
})
public interface IContentFeedSource
{
}
