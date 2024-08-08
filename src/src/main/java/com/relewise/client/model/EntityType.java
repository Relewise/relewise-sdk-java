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

public enum EntityType
{
    Product {
        public String toString() {
            return "Product";
        }
    },
    Variant {
        public String toString() {
            return "Variant";
        }
    },
    ProductCategory {
        public String toString() {
            return "ProductCategory";
        }
    },
    Brand {
        public String toString() {
            return "Brand";
        }
    },
    Content {
        public String toString() {
            return "Content";
        }
    },
    ContentCategory {
        public String toString() {
            return "ContentCategory";
        }
    },
}
