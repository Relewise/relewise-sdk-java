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

/** Marks feed source for products. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductByPurchasePopularityFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductByPurchasePopularityFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductByViewPopularityFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductByViewPopularityFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductByProductIdFromContentDataFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductByProductIdFromContentDataFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsViewedAfterProductSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductsViewedAfterProductSeedFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsPurchasedWithProductSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductsPurchasedWithProductSeedFeedSource, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductsViewedAfterContentSeedFeedSource.class, name = "Relewise.Client.DataTypes.Feed.Sources.ProductsViewedAfterContentSeedFeedSource, Relewise.Client"),
})
public interface IProductFeedSource
{
}
