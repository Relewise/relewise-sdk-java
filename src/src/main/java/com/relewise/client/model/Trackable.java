package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.annotation.Nullable;
import java.io.IOException;
import java.time.OffsetDateTime;
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
    property = "$type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ProductView.class, name = "Relewise.Client.DataTypes.ProductView, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductUpdate.class, name = "Relewise.Client.DataTypes.ProductUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductAdministrativeAction.class, name = "Relewise.Client.DataTypes.ProductAdministrativeAction, Relewise.Client"),
    @JsonSubTypes.Type(value = Order.class, name = "Relewise.Client.DataTypes.Order, Relewise.Client"),
    @JsonSubTypes.Type(value = Cart.class, name = "Relewise.Client.DataTypes.Cart, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentUpdate.class, name = "Relewise.Client.DataTypes.ContentUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentAdministrativeAction.class, name = "Relewise.Client.DataTypes.ContentAdministrativeAction, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentView.class, name = "Relewise.Client.DataTypes.ContentView, Relewise.Client"),
    @JsonSubTypes.Type(value = UserUpdate.class, name = "Relewise.Client.DataTypes.UserUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = SearchTerm.class, name = "Relewise.Client.DataTypes.SearchTerm, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryView.class, name = "Relewise.Client.DataTypes.ProductCategoryView, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandView.class, name = "Relewise.Client.DataTypes.BrandView, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandUpdate.class, name = "Relewise.Client.DataTypes.BrandUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryUpdate.class, name = "Relewise.Client.DataTypes.ProductCategoryUpdate, Relewise.Client"),
    @JsonSubTypes.Type(value = BrandAdministrativeAction.class, name = "Relewise.Client.DataTypes.BrandAdministrativeAction, Relewise.Client"),
    @JsonSubTypes.Type(value = ProductCategoryAdministrativeAction.class, name = "Relewise.Client.DataTypes.ProductCategoryAdministrativeAction, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryAdministrativeAction.class, name = "Relewise.Client.DataTypes.ContentCategoryAdministrativeAction, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryView.class, name = "Relewise.Client.DataTypes.ContentCategoryView, Relewise.Client"),
    @JsonSubTypes.Type(value = ContentCategoryUpdate.class, name = "Relewise.Client.DataTypes.ContentCategoryUpdate, Relewise.Client"),
})
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Trackable
{
    public String $type = "Relewise.Client.Requests.Trackable, Relewise.Client";
}
