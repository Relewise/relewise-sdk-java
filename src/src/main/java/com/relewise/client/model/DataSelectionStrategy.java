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

public enum DataSelectionStrategy
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
    VariantWithFallbackToProduct {
        public String toString() {
            return "VariantWithFallbackToProduct";
        }
    },
    ProductWithFallbackToVariant {
        public String toString() {
            return "ProductWithFallbackToVariant";
        }
    },
}
