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

public enum ProductAttributeSortingSortableAttribute
{
    Id {
        public String toString() {
            return "Id";
        }
    },
    DisplayName {
        public String toString() {
            return "DisplayName";
        }
    },
    BrandId {
        public String toString() {
            return "BrandId";
        }
    },
    BrandName {
        public String toString() {
            return "BrandName";
        }
    },
    ListPrice {
        public String toString() {
            return "ListPrice";
        }
    },
    SalesPrice {
        public String toString() {
            return "SalesPrice";
        }
    },
}
