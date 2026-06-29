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

public enum SemanticIndexBuildStatus
{
    Disabled {
        public String toString() {
            return "Disabled";
        }
    },
    Skipped {
        public String toString() {
            return "Skipped";
        }
    },
    Built {
        public String toString() {
            return "Built";
        }
    },
    Capped {
        public String toString() {
            return "Capped";
        }
    },
    Failed {
        public String toString() {
            return "Failed";
        }
    },
}
