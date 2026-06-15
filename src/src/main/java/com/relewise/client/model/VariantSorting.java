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

/** Controls how variants should be ordered when more than one variant per product can participate in the result. */
public enum VariantSorting
{
    GroupedByProduct {
        public String toString() {
            return "GroupedByProduct";
        }
    },
    ByRelevance {
        public String toString() {
            return "ByRelevance";
        }
    },
}
