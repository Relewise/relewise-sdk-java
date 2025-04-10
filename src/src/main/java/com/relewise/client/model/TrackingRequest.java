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
    
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = TrackOrderRequest.class, name = "Relewise.Client.Requests.Tracking.TrackOrderRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackCartRequest.class, name = "Relewise.Client.Requests.Tracking.TrackCartRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductViewRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductViewRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductAdministrativeActionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = BatchedTrackingRequest.class, name = "Relewise.Client.Requests.Tracking.BatchedTrackingRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentAdministrativeActionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentViewRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentViewRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackUserUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackUserUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackSearchTermRequest.class, name = "Relewise.Client.Requests.Tracking.TrackSearchTermRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductCategoryViewRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductCategoryViewRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackBrandViewRequest.class, name = "Relewise.Client.Requests.Tracking.TrackBrandViewRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackBrandUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackBrandUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackBrandAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackBrandAdministrativeActionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductCategoryUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductCategoryUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackProductCategoryAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackProductCategoryAdministrativeActionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentCategoryViewRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentCategoryViewRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentCategoryUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentCategoryUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackContentCategoryAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackContentCategoryAdministrativeActionRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackCompanyUpdateRequest.class, name = "Relewise.Client.Requests.Tracking.TrackCompanyUpdateRequest, Relewise.Client"),
    @JsonSubTypes.Type(value = TrackCompanyAdministrativeActionRequest.class, name = "Relewise.Client.Requests.Tracking.TrackCompanyAdministrativeActionRequest, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackingRequest extends LicensedRequest
{
    public String $type = "";
}
