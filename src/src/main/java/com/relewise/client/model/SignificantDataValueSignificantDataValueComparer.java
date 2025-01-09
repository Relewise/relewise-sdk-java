package com.relewise.client.model;

import com.fasterxml.jackson.annotation.*;
import javax.annotation.Nullable;
import java.io.IOException;
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

public enum SignificantDataValueSignificantDataValueComparer
{
    Equals {
        public String toString() {
            return "Equals";
        }
    },
    NumericPercentDifference {
        public String toString() {
            return "NumericPercentDifference";
        }
    },
    StringSimilarity {
        public String toString() {
            return "StringSimilarity";
        }
    },
    KeyExists {
        public String toString() {
            return "KeyExists";
        }
    },
    CollectionOverlap {
        public String toString() {
            return "CollectionOverlap";
        }
    },
}
