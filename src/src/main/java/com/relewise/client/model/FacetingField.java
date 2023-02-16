package com.relewise.client.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
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

public enum FacetingField
{
    Category {
        public String toString() {
            return "Category";
        }
    },
    Assortment {
        public String toString() {
            return "Assortment";
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
    Brand {
        public String toString() {
            return "Brand";
        }
    },
    Data {
        public String toString() {
            return "Data";
        }
    },
    VariantSpecification {
        public String toString() {
            return "VariantSpecification";
        }
    },
}
