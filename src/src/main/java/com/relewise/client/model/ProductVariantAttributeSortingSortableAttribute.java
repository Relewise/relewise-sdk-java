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

public enum ProductVariantAttributeSortingSortableAttribute
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
