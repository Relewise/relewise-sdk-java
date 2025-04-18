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

public enum SearchTermConditionConditionKind
{
    Equals {
        public String toString() {
            return "Equals";
        }
    },
    StartsWith {
        public String toString() {
            return "StartsWith";
        }
    },
    EndsWith {
        public String toString() {
            return "EndsWith";
        }
    },
    Contains {
        public String toString() {
            return "Contains";
        }
    },
}
